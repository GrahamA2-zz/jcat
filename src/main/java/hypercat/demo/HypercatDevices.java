package hypercat.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import hypercat.demo.items.DemoSensorHyperCatItem;
import hypercat.entries.ContentType;
import hypercat.entries.TSBIOTHypercatEntry;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HypercatDevices {

	private List l  = new ArrayList();
	@SuppressWarnings("unchecked")
	public HypercatDevices() {
		super();
		for (int i = 0 ; i < sensors.length ; i++){
			DemoSensorHyperCatItem item = new DemoSensorHyperCatItem(sensors[i]);
			l.add(item);
		}
	}
	
	@JsonProperty("item-metadata")
	public Object[] getIemMetadata(){
		return new Object[] {new ContentType(), new TSBIOTHypercatEntry("hasDescription:en","all catalogues" ) };
		
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public Collection getItems(){
		return Collections.unmodifiableCollection(l);
	}
	
	private String[] sensors = {"WWX-WaterwaySensor-0019",
			"WWX-WaterwaySensor-0020",
			"WWX-WaterwaySensor-0024",
			"WWX-WaterwaySensor-0025",
			"WWX-WaterwaySensor-0026",
			"WWX-WaterwaySensor-0028",
			"WWX-WaterwaySensor-0031",
			"WWX-WaterwaySensor-0034",
			"WWX-WaterwaySensor-0035",
			"WWX-WaterwaySensor-0036",
			"WWX-WaterwaySensor-0037",
			"WWX-WaterwaySensor-0038",
			"WWX-WaterwaySensor-0039",
			"WWX-WaterwaySensor-0040",
			"WWX-WaterwaySensor-0041",
			"WWX-WaterwaySensor-0042",
			"WWX-WaterwaySensor-0043",
			"WWX-WaterwaySensor-0046",
			"WWX-WaterwaySensor-0056",
			"WWX-WaterwaySensor-0057",
			"WWX-WaterwaySensor-0065",
			"WWX-WaterwaySensor-0066",
			"WWX-WaterwaySensor-0067",
			"WWX-WaterwaySensor-0068",
			"WWX-WaterwaySensor-0069",
			"WWX-WaterwaySensor-0070",
			"WWX-WaterwaySensor-0071",
			"WWX-WaterwaySensor-0072",
			"WWX-WaterwaySensor-0073",
			"WWX-WaterwaySensor-0074",
			"WWX-WaterwaySensor-0075",
			"WWX-WaterwaySensor-0076",
			"WWX-WaterwaySensor-0077",
			"WWX-WaterwaySensor-0078",
			"WWX-WaterwaySensor-0079",
			"WWX-WaterwaySensor-0080",
			"WWX-WaterwaySensor-0081",
			"WWX-WaterwaySensor-0082",
			"WWX-WaterwaySensor-0083",
			"WWX-WaterwaySensor-0084",
			"WWX-WaterwaySensor-0085",
			"WWX-WaterwaySensor-0086",
			"WWX-WaterwaySensor-0087",
			"WWX-WaterwaySensor-0088",
			"WWX-WaterwaySensor-0089",
			"WWX-WaterwaySensor-0090",
			"WWX-WaterwaySensor-0091",
			"WWX-WaterwaySensor-0092",
			"WWX-WaterwaySensor-0093",
			"WWX-WaterwaySensor-0094",
			"WWX-WaterwaySensor-0095",
			"WWX-WaterwaySensor-0096",
			"WWX-WaterwaySensor-0097",
			"WWX-WaterwaySensor-0098",
			"WWX-WaterwaySensor-0099",
			"WWX-WaterwaySensor-0100",
			"WWX-WaterwaySensor-0101"};
}
