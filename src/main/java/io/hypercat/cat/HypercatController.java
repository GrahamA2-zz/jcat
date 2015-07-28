package io.hypercat.cat;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HypercatController {
	
	public static Hypercat cat;
	
	{
		cat = new HypercatImpl();
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Hypercat cat(){
		return cat;
	}

}
