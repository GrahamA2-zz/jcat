 package hypercat.cat;

import hypercat.demo.entries.WaterworxCatalogueEntry;
import hypercat.demo.items.DefaultHyperCatItem;
import hypercat.entries.ContentType;
import hypercat.entries.EmptyCatalogue;
import hypercat.items.HypercatItem;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hypercat {

	public Hypercat() {
		super();
		//TODO if items = null/size-0 return an empty description
	}
	
	@JsonProperty("item-metadata")
	public Object[] getIemMetadata(){
		return new Object[] {new ContentType(), new WaterworxCatalogueEntry()};
		
	}
	
	
	public Object[] getItems(){
		HypercatItem devices = new DefaultHyperCatItem("/cat/devices");
		HypercatItem organisations = new DefaultHyperCatItem("/cat/organisations");
		return new Object[]{ devices, organisations} ;
	}
}
