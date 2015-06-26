 package hypercat.cat;

import hypercat.demoItems.DefaultHyperCatItem;
import hypercat.demoItems.WaterworxCatalogue;
import hypercat.entries.ContentType;
import hypercat.entries.EmptyCatalogue;
import hypercat.items.HypercatItem;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hypercat {

	public Hypercat() {
		super();
	}
	
	@JsonProperty("item-metadata")
	public Object[] getIemMetadata(){
		return new Object[] {new ContentType(), new WaterworxCatalogue()};
		
		
	}
	
	
	public Object[] getItems(){
		HypercatItem devices = new DefaultHyperCatItem("/cat/devic"
				+ "es");
		HypercatItem organisations = new DefaultHyperCatItem("/cat/organisations");
		return new Object[]{ devices, organisations} ;
	}
}
