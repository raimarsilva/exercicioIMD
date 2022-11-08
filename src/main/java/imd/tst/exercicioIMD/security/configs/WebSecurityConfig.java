package imd.tst.exercicioIMD.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import imd.tst.exercicioIMD.security.filter.JwtAuthFilter;
import imd.tst.exercicioIMD.security.services.JwtService;
import imd.tst.exercicioIMD.security.services.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {
	
	private final JwtService jwtService;

	private final UsuarioServiceImpl usuarioService;

    private static final String[] SWAGGER_LIST = {
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
                        .antMatchers(SWAGGER_LIST)
                            .permitAll()
                        .antMatchers(HttpMethod.POST, "/api/usuarios/**")
                            .permitAll()
                        .antMatchers(HttpMethod.POST)
                            .hasRole("ADMIN")
                        .antMatchers(HttpMethod.DELETE)
                            .hasRole("ADMIN")
                        .antMatchers(HttpMethod.PATCH)
                            .hasRole("ADMIN")
                        .anyRequest()
                            .authenticated()
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
