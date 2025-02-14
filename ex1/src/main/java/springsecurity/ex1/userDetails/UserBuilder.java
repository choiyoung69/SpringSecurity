package springsecurity.ex1.userDetails;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


public class UserBuilder {
    UserDetails u = User.withUsername("bill")
            .password("12345")
            .authorities("read", "write")
            .accountExpired(false)
            .disabled(true)
            .build();


}
