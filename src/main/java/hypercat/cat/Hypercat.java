 package hypercat.cat;

import hypercat.entries.ContentType;
import hypercat.entries.EmptyCatalogue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hypercat {

	public Hypercat(long id, String content) {
		super();
	}
	
	@JsonProperty("item-metadata")
	public Object[] getIemMetadata(){
		return new Object[] {new ContentType(), new EmptyCatalogue()};
		
		
	}
	
	
	public Object[] getItems(){
		return new Object[0] ;
	}
}
