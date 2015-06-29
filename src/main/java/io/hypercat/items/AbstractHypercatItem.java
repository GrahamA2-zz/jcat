package io.hypercat.items;

import io.hypercat.entries.HypercatEntry;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

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
