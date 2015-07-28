package io.hypercat.cat;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.hypercat.entries.HypercatEntry;
import io.hypercat.items.HypercatItem;

public interface Hypercat {

	
	public abstract Collection<? extends HypercatItem> getItems();
	
	@JsonProperty("item-metadata")
	public abstract Collection<? extends HypercatEntry> getIemMetadata();

	void addItem(HypercatItem item);
	void addMeatadata(HypercatEntry item);
	

}
