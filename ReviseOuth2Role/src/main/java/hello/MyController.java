package hello;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@Autowired
    private EmpDao userDetailRepository;
	
	@Autowired
	public OauthclientdetailsDao oauthclientdetailsDao;
	
	@PostConstruct
	public void add() {
		Emp emp =new Emp(1,"admin","admin","admin","role_admin");
		userDetailRepository.save(emp);
		
		Oauth_client_details oauthClientDetails =new Oauth_client_details("ci","sc",
				"http://localhost:8080/code", "read,write", 
				3600, 10000, 
				"inventory,payment", "authorization_code,password,refresh_token,implicit",
				" ","","");
		oauthclientdetailsDao.save(oauthClientDetails);

		
		}

}
