package io.hypercat.items;

import static io.hypercat.cat.HypercatMatchers.relMatcher;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Collection;

import io.hypercat.entries.DefaultHypercatEntry;
import io.hypercat.entries.HypercatEntry;

import org.hamcrest.Matcher;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AbstractHypercatItemTest {

	AbstractHypercatItem item;
	@Before
	public void setUp() throws Exception {
		item = new AbstractHypercatItem("test") {
			//No additional functionality to implement
		};
	}

	@Test
	public void testGetHref() {
		assertThat("Herf must match constructor", item.getHref(), is("test"));
	}

	@Test
	public void testGetIemMetadataIsEmpty() {
		assertThat(item.getIemMetadata(), IsCollectionWithSize.hasSize(0));
	}

	@Ignore
	public void testAddEntry() {
		assertThat(item.getIemMetadata(), IsCollectionWithSize.hasSize(0));
		HypercatEntry entry = new DefaultHypercatEntry("a","b");
		item.addEntry( entry );
		assertThat(item.getIemMetadata(), IsCollectionWithSize.hasSize(1));
		//assertThat(item.getIemMetadata(), hasItem(is(anything())));
		fail("Need to check the contence of the collection");
	}



}
