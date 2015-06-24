package hypercat.cat;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HypercatController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Hypercat greeting(@RequestParam(value="name", defaultValue="World") String name){
		return new Hypercat(counter.incrementAndGet(), String.format(template, name));
		
		
		
	}

}
