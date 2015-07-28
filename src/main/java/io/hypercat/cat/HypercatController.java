package io.hypercat.cat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HypercatController {
	
	private Hypercat cat;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Hypercat cat(){
		return cat;
	}
	
	@Autowired
	public HypercatController(Hypercat cat){
		this.cat = cat; 
		
	}

}
