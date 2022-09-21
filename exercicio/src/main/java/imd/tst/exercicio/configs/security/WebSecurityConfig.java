package imd.tst.exercicio.configs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//aqui vão as configurações de segurança:
		http
		.httpBasic()
		.and()
		.authorizeHttpRequests().anyRequest().authenticated()
		.and().csrf().disable();
		
		return http.build();
	}
	
	
	@Bean
	public PasswordEncoder passEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User
            .withUsername("grupo1")
            .password(passEncoder().encode("qwepoi"))
            .roles("USER")
            .build();
        
        return new InMemoryUserDetailsManager(user);
    }
	
	
	
	

}
