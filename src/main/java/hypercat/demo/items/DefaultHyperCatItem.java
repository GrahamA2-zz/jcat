package hypercat.demo.items;


import hypercat.entries.TSBIOTHypercatEntry;
import hypercat.items.AbstractHypercatItem;

public class DefaultHyperCatItem extends AbstractHypercatItem {
	
	public DefaultHyperCatItem(String href){
		super(href);
		addEntry(new TSBIOTHypercatEntry("isContentType","application/vnd.tsbiot.catalogue+json"));
		
	}

}
