package io.hypercat.entries;

public class TSBIOTHypercatEntry extends AbstractHypercatEntry {

	public TSBIOTHypercatEntry(String rel, String val) {
		super( "urn:X-tsbiot:rels:" + rel, val);	
	}

}
