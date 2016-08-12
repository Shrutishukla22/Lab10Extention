package moviesExtensionByCategory;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie {
       private String title;
       private String category;
  
    public Movie(String title,String category){
    	setTitle(title);
    	setCategory(category);
    	
    }
  

	 public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public static Comparator<Movie>titleComparator=new Comparator<Movie>(){
		public int compare(Movie m1,Movie m2){
			String title1=m1.getTitle();
			String title2=m2.getTitle();
			return title1.compareToIgnoreCase(title2);
		}
	};
       
}
