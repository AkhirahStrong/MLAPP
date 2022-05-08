import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	
	private String title;
	private String category;
	
	
	
	public Movie(String title, String category) {
		
		this.category = category;
		this.title = title; 
	}
	
	public String getTitle() {
		return title; 
	}
	
	public  void setTitle( String title) {
		this.title = title; 
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String Category) {
		this.category = category;
		
	}
	

	
	

}
