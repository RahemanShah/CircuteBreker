package in.micro.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String M1() {
		System.out.println("************M1() Executed******");
		String msg = "This mi M1() meth Response";
		
		try {
			int i = 10/0;
		}
		catch(Exception e) {
			e.printStackTrace();    //if u want execute then comment the e.printstarcttrace 
			msg = M2();
		}
		
		return msg;
	}
	
	public String M2() {
		System.out.println("************M2() Executed******");
		String msg = "This mi M2() meth Response";
		return msg;
	}

}
