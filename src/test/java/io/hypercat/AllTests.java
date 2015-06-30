package io.hypercat;

import io.hypercat.cat.HypercatControllerTest;
import io.hypercat.cat.HypercatTest;
import io.hypercat.entries.AbstractHypercatEntryTest;
import io.hypercat.items.AbstractHypercatItemTest;
import io.hypercat.items.CalaloguetHypercatItemTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HypercatTest.class,
	            AbstractHypercatItemTest.class,
	            AbstractHypercatEntryTest.class,
	            CalaloguetHypercatItemTest.class,
	            HypercatControllerTest.class
	            })
public class AllTests {

}
