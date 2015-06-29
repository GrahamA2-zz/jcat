 package io.hypercat.cat;


import io.hypercat.entries.ContentType;
import io.hypercat.entries.EmptyCatalogue;
import io.hypercat.items.CalaloguetHypercatItem;
import io.hypercat.items.HypercatItem;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hypercat {

	public Hypercat() {
		super();
		//TODO if items = null/size-0 return an empty description
	}
	
	@JsonProperty("item-metadata")
	public Object[] getIemMetadata(){
		return new Object[] {new ContentType(), new EmptyCatalogue()};
		
	}
	
	
	public Object[] getItems(){
		HypercatItem devices = new CalaloguetHypercatItem("/cat/devices");
		HypercatItem organisations = new CalaloguetHypercatItem("/cat/organisations");
		return new Object[]{ devices, organisations} ;
	}
}
