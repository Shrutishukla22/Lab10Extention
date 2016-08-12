package moviesExtensionByCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab10ExtensionMain {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to the movie List Application");
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("What catagory you interested in?");
			System.out.println("Enter 1 : drama");
			System.out.println("Enter 2 : horror");
			System.out.println("Enter 3 : scifi");
			System.out.println("Enter 4 : comedy");
			System.out.println("Enter 5 : animated");
			System.out.println("Enter 6 : musical");
			String input1;
			int index = scan1.nextInt();
			//scan1.nextLine();
			switch (index)
	        {
	            case 1:
	                input1= "drama";
	                break;
	            case 2:
	            	input1= "horror";
	            	break;
	            case 3:
	            	input1= "scifi";
	            	break;
	            case 4:
	            	input1= "comedy";
	            	break;
	           case 5:
	            	input1= "animated";
	            	break;
	            case 6:
	            	input1= "musical";
	            	break;
	            default :
	            	input1="none";
	        }			
			
			ArrayList<Movie> list = new ArrayList<Movie>();
			for(int i=1;i<=100;i++){
			list.add(MovieIO.getMovie(i));
			}
			boolean found=false;
			//TreeSet ts = new TreeSet();
			for(int i=0;i<list.size();i++){
		    	   if(input1.equalsIgnoreCase(list.get(i).getCategory())){
		    		   //printing unsorted list
		    		  System.out.println(list.get(i).getTitle());
		    		   //ts.add(list.get(i).getTitle());
		    		    found=true;
		    	   }	
			}
			System.out.println("-------------------------------------------------------------");
			if(!found){
				System.out.println("this category does not exist");
			}else{
				//System.out.println(ts);
				Collections.sort(list,Movie.titleComparator);
				for(Movie mov:list){
					if(input1.equalsIgnoreCase(mov.getCategory()))
						//printing sorted list
					System.out.println(mov.getTitle());
				}
			}
			System.out.println("do you want to enter another catagory?");
			scan1.nextLine();
			choice = scan1.nextLine();
		}
	}

}
