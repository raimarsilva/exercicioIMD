package imd.tst.exercicio.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import imd.tst.exercicio.security.filter.JwtAuthFilter;
import imd.tst.exercicio.security.services.JwtService;
import imd.tst.exercicio.security.services.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
	
	private final JwtService jwtService;

	private final UsuarioServiceImpl usuarioService;

    private static final String[] AUTH_WHITE_LIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/v2/api-docs/**",
            "/swagger-resources/**"
    };

	@Bean
    public OncePerRequestFilter jwtFilter(){
        return new JwtAuthFilter(jwtService, usuarioService);
    }

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
            .csrf().disable()
            .authorizeHttpRequests((authz) -> {
                try {
                    authz
                        .antMatchers(AUTH_WHITE_LIST)
                            .permitAll()
                        .antMatchers(HttpMethod.POST, "/api/usuarios/**")
                            .permitAll()
                        .anyRequest().authenticated()
                    .and() 
                        .sessionManagement()
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                        .addFilterBefore( jwtFilter(), UsernamePasswordAuthenticationFilter.class);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });

        return http.build();
	}
}
