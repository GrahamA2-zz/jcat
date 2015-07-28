 package io.hypercat.cat;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import io.hypercat.entries.ContentType;
import io.hypercat.entries.DefaultHypercatEntry;
import io.hypercat.entries.EmptyCatalogue;
import io.hypercat.entries.HypercatEntry;
import io.hypercat.items.CalaloguetHypercatItem;
import io.hypercat.items.HypercatItem;

import com.fasterxml.jackson.annotation.JsonProperty;

@Resource
public final class HypercatImpl implements Hypercat {

	private final List<HypercatItem> catItems;
	private final List<HypercatEntry> metadata;
	
	public HypercatImpl() {
		super();
		catItems = new ArrayList<HypercatItem>();
		metadata = new ArrayList<HypercatEntry>();
		addMeatadata(new ContentType());
		addMeatadata(new EmptyCatalogue());
	}
	
	@Override
	public Collection<? extends HypercatEntry> getIemMetadata(){
		return Collections.unmodifiableCollection(metadata);
		
	}
	
	@Override
	public Collection<? extends HypercatItem> getItems(){	
		return Collections.unmodifiableCollection(catItems);
	}

	@Override
	public void addItem(HypercatItem item) {
		catItems.add(item);
	}

	@Override
	public void addMeatadata(HypercatEntry item) {
		metadata.add(item);
		
	}
}
