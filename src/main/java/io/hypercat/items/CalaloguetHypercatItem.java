package io.hypercat.items;


import io.hypercat.entries.TSBIOTHypercatEntry;

/**
 * Use to point to another instance of a hypercat.  Sets the content type  as catalogue+json
 * @author Graham Allan
 * @category HYPER/CAT Item
 */
public final class CalaloguetHypercatItem extends AbstractHypercatItem {
	
	/**
	 * Create a HYPER/CAT pointing to the supplied URL
	 * @param url URL of the HYPER/CAT
	 */
	public CalaloguetHypercatItem(String url){
		super(url);
		addEntry(new TSBIOTHypercatEntry("isContentType","application/vnd.tsbiot.catalogue+json"));
		
	}

}
