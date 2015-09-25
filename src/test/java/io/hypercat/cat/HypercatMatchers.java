package io.hypercat.cat;

import io.hypercat.entries.HypercatEntry;
import io.hypercat.items.HypercatItem;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class HypercatMatchers {
	
	public static Matcher relMatcher(final Object expected){

	    return new BaseMatcher() {

	        protected Object theExpected = expected;

	        public boolean matches(Object o) {
	        	return theExpected.equals(((HypercatEntry) o ).getRel());
	        }

	        public void describeTo(Description description) {
	            description.appendText(theExpected.toString());
	        }
	    };
	}
	
	public static Matcher valMatcher(final Object expected){

	    return new BaseMatcher() {

	        protected Object theExpected = expected;

	        public boolean matches(Object o) {
	        	return theExpected.equals(((HypercatEntry) o ).getVal());
	        }

	        public void describeTo(Description description) {
	            description.appendText(theExpected.toString());
	        }
	    };
	}

	
	public static Matcher hrefMatcher(final Object expected){

	    return new BaseMatcher() {

	        protected Object theExpected = expected;

	        public boolean matches(Object o) {
	        	return theExpected.equals(((HypercatItem) o ).getHref());
	        }

	        public void describeTo(Description description) {
	            description.appendText(theExpected.toString());
	        }
	    };
	}
}
