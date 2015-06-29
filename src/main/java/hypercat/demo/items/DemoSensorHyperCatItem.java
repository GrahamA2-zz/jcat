package hypercat.demo.items;

import hypercat.entries.DefaultHypercatEntry;
import hypercat.entries.TSBIOTHypercatEntry;
import hypercat.items.AbstractHypercatItem;

public class DemoSensorHyperCatItem extends AbstractHypercatItem {
	
	public DemoSensorHyperCatItem(String id){

		
		super("http://waterworx.io/Thingworx/Things/" + id);
		
		addEntry(new DefaultHypercatEntry("http://purl.oclc.org/NET/ssnx/ssn#SensingDevice","Sensor"));
		
		String description = "http://waterworx.io/Thingworx/Things/" + id + "/Properties/purpose";
		addEntry(new DefaultHypercatEntry("hasDescription:en",description));
		String currentReading = "http://waterworx.io/Thingworx/Things/" + id + "/Properties/currentReading";
		addEntry(new DefaultHypercatEntry("urn:X-swim:level",currentReading));
		String temp = "http://waterworx.io/Thingworx/Things/" + id + "/Properties/temperature";
		addEntry(new DefaultHypercatEntry("urn:X-swim:temperature",temp));
	}
	


}
