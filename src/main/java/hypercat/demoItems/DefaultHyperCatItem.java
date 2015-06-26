package hypercat.demoItems;

import hypercat.entries.DefaultHypercatEntry;
import hypercat.items.AbstractHypercatItem;

public class DefaultHyperCatItem extends AbstractHypercatItem {
	
	public DefaultHyperCatItem(String href){
		super(href);
		addEntry(new DefaultHypercatEntry("isContentType","application/vnd.tsbiot.catalogue+json"));
	}

}
