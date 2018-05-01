package accountService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAccountController {

	MyAccount acc = new MyAccount();
	
	@RequestMapping(value="/login")
	public ResponseEntity<MyAccount> login() {
		//MyAccount acc = new MyAccount();
		acc.setMemberId(123);
		acc.setFirstName("David");
		acc.setLastName("Choo");
		
		return new ResponseEntity<MyAccount>(acc, HttpStatus.OK);
	}
	
	@RequestMapping(value="/getName")
	public String getName(@RequestParam("id") long id){
		String fullName = acc.getFirstName() + " " + acc.getLastName(); 
		return fullName;
	}	
}
