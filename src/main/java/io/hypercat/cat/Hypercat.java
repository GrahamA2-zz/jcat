package io.hypercat.cat;

import io.hypercat.entries.ContentType;
import io.hypercat.entries.EmptyCatalogue;
import io.hypercat.entries.HypercatEntry;
import io.hypercat.items.CalaloguetHypercatItem;
import io.hypercat.items.HypercatItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Hypercat {

	
	public abstract Collection<? extends HypercatItem> getItems();
	
	@JsonProperty("item-metadata")
	public abstract Collection<? extends HypercatEntry> getIemMetadata();

	

}
