package com.example.SecureApp;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
	
	/*
	 * @Autowired private UserDetailsService userDetailsService;
	 * 
	 * @Bean public AuthenticationProvider authProvider() {
	 * DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	 * 
	 * provider.setUserDetailsService(userDetailsService);
	 * //provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
	 * provider.setPasswordEncoder(new BCryptPasswordEncoder()); return provider; }
	 */

	// For customize login page
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated();
		//.and().httpBasic();
		/*.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/logout-success").permitAll();*/
	                                                           }
	
	

	//@Bean
	//@Override
	//protected UserDetailsService userDetailsService() {
		
		//List<UserDetails> user = new ArrayList<UserDetails>();
		//user.add(User.withDefaultPasswordEncoder().username("Shefali").password("1234").roles("USER").build());
		//return new InMemoryUserDetailsManager(user);
		
	//}
	
	

}
