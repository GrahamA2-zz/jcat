package hypercat.entries;

public class DefaultHypercatEntry extends AbstractHypercatEntry {

	public DefaultHypercatEntry(String rel, String val) {
		super( "urn:X-tsbiot:rels:" + rel, val);	
	}

}
