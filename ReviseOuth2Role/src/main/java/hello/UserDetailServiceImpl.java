package hello;

import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private EmpDao empDao;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {


    	Emp emp = empDao.findByName(name);
    	User user = new User(emp.name,emp.password, Arrays.asList(new SimpleGrantedAuthority(emp.password)));
        UserDetails ud= (UserDetails)user;
        return ud;

    }
}
