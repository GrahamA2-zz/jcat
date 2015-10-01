package io.hypercat.items;


import io.hypercat.entries.XHypercatEntry;

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
	public CalaloguetHypercatItem(String url, String description){
		super(url);
		addEntry(new XHypercatEntry("isContentType","application/vnd.hypercat.catalogue+json"));
		addEntry(new XHypercatEntry("hasDescription:en",description) );
	}
	
	public CalaloguetHypercatItem(String url){
		super(url);
		addEntry(new XHypercatEntry("isContentType","application/vnd.hypercat.catalogue+json"));
		addEntry(new XHypercatEntry("hasDescription:en","Hyper/CAT entry"));
	}

}
