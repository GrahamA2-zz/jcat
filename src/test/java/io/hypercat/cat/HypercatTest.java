package io.hypercat.cat;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;
import static io.hypercat.cat.HypercatMatchers.*;
import io.hypercat.items.CalaloguetHypercatItem;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Before;
import org.junit.Test;

public class HypercatTest {

	private final static String DEFAULT_REL = "urn:X-hypercat:rels:";
	HypercatImpl cat = new HypercatImpl();

	public static String makeRel(String rel) {
		return DEFAULT_REL + rel;
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testThatGetIemMetadataHasTwoItems() {
		assertThat("A mininal catalog should contain two entries",
				cat.getIemMetadata(), IsCollectionWithSize.hasSize(2));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testThatGetIemMetadataHasAContentType() {
		assertThat("Hypercat requires a content type in the metadata",
				cat.getIemMetadata(),
				hasItem(relMatcher(makeRel("isContentType"))));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testThatGetIemMetadataHasADescription() {
		assertThat("Hypercat requires a description in the metadata",
				cat.getIemMetadata(),
				hasItem(relMatcher(makeRel("hasDescription:en"))));
	}

	@Test
	public void testThatGetItemsHasNoItems() {
		assertThat("A mininal catalog shold contain no items", cat.getItems(),
				IsCollectionWithSize.hasSize(0));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAddItemToCatalog() {
		String deviecs = "/cat/devices";
		cat.add( new CalaloguetHypercatItem(deviecs) );
		assertThat(cat.getItems(),IsCollectionWithSize.hasSize(1));
		assertThat(cat.getItems(),hasItem(hrefMatcher(deviecs)));
		String authors = "/cat/authors";
		cat.add( new CalaloguetHypercatItem(authors) );
		assertThat(cat.getItems(),IsCollectionWithSize.hasSize(2));
		assertThat(cat.getItems(),hasItem(hrefMatcher(authors)));
	}
}
