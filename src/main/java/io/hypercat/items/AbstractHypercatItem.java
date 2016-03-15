package io.hypercat.items;

import io.hypercat.entries.HypercatEntry;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractHypercatItem implements HypercatItem {
	
	private ArrayList<HypercatEntry> items = new ArrayList<HypercatEntry>();
	private final String href;
	
	
	@Override
	public String getHref() {
		String prefix = System.getProperty("HypercatURL", "");
		return prefix + href;
	}

	public AbstractHypercatItem(String href){
		this.href = href;	
	}
	
	@Override
	public Collection<? extends HypercatEntry> getIemMetadata(){
		return java.util.Collections.unmodifiableCollection(items);
	}
	
	public final void addEntry(HypercatEntry entry){
		items.add(entry);
	}
	
	

}
