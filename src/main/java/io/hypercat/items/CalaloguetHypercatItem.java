package io.hypercat.items;


import io.hypercat.entries.TSBIOTHypercatEntry;

public class CalaloguetHypercatItem extends AbstractHypercatItem {
	
	public CalaloguetHypercatItem(String href){
		super(href);
		addEntry(new TSBIOTHypercatEntry("isContentType","application/vnd.tsbiot.catalogue+json"));
		
	}

}
