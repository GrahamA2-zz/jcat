package hypercat.cat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

	@RequestMapping(value="/devices", method=RequestMethod.GET)
	public HypercatDevices devices (){
		return new HypercatDevices();
		
		
		
	}
}
