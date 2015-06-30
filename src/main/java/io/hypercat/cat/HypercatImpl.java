 package io.hypercat.cat;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.hypercat.entries.ContentType;
import io.hypercat.entries.EmptyCatalogue;
import io.hypercat.entries.HypercatEntry;
import io.hypercat.items.CalaloguetHypercatItem;
import io.hypercat.items.HypercatItem;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class HypercatImpl implements Hypercat {

	List<HypercatItem> catItems;
	
	public HypercatImpl() {
		super();
		catItems = new ArrayList<HypercatItem>();
	}
	
	@Override
	public Collection<? extends HypercatEntry> getIemMetadata(){
		List<HypercatEntry> l = new ArrayList<HypercatEntry>();
		l.add(new ContentType());
		l.add(new EmptyCatalogue());
		return l;
		
	}
	
	@Override
	public Collection<? extends HypercatItem> getItems(){	
		
	
		return catItems;
	}

	@Override
	public void addItem(HypercatItem item) {
		catItems.add(item);
	}
}
