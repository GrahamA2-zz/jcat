package hypercat.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hypercat.entries.ContentType;
import hypercat.entries.DefaultHypercatEntry;
import hypercat.entries.EmptyCatalogue;
import hypercat.entries.HypercatEntry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public abstract class AbstractHypercatItem implements HypercatItem {
	
	private ArrayList<HypercatEntry> items = new ArrayList<HypercatEntry>();
	private final String href;
	
	
	public String getHref() {
		return href;
	}

	public AbstractHypercatItem(String href){
		this.href = href;	
	}
	
	@JsonProperty("i-object-metadata")
	public Collection<? extends HypercatEntry> getIemMetadata(){
		return java.util.Collections.unmodifiableCollection(items);
	}
	
	public void addEntry(HypercatEntry entry){
		items.add(entry);
	}
	
	

}
