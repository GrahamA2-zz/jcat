package io.hypercat.entries;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

 
public class AbstractHypercatEntryTest {
	
	HypercatEntry entry;

	@Before
	public void setUp() throws Exception {
		entry = new DefaultHypercatEntry("A", "B");
	}

	@Test
	public void testGetRel() {
		assertThat(entry.getRel(), is("A"));
	}

	@Test
	public void testGetVal() {
		assertThat(entry.getVal(), is("B"));
	}

}
