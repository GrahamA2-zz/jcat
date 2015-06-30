package io.hypercat.items;

import io.hypercat.entries.HypercatEntry;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface HypercatItem {
	
	@JsonProperty("i-object-metadata")
	public abstract Collection<? extends HypercatEntry> getIemMetadata();

	public abstract String getHref();

}
