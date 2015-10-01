package io.hypercat.entries;

public class XHypercatEntry extends AbstractHypercatEntry {

	public XHypercatEntry(String rel, String val) {
		super( "urn:X-hypercat:rels:" + rel, val);	
	}

}
