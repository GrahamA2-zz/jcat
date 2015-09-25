package io.hypercat.items;

import static io.hypercat.cat.HypercatMatchers.*;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;
import io.hypercat.entries.HypercatEntry;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class CalaloguetHypercatItemTest {

	HypercatItem item;
	@Before
	public void setUp() throws Exception {
		item = new CalaloguetHypercatItem("fred");
	}

	@Test
	public void testThatCalaloguetHypercatItemHasCorrectContentType() {
		assertThat(item.getIemMetadata(),hasItem(valMatcher("application/vnd.hypercat.catalogue+json")));
	}
	
	@Test
	public void testThatCalaloguetHypercatItemHasDescriptione() {
		assertThat(item.getIemMetadata(),hasItem(relMatcher("urn:X-hypercat:rels:hasDescription:en")));
	}

}
