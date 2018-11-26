//package com.cursospring.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//		.antMatchers(HttpMethod.GET, "/").permitAll() // PERMITE QUE QUALQUER UM ACESSE O INDEX DA PAGINA
//		.anyRequest().authenticated()
//		.and()
//		.formLogin().permitAll() // TODOS TEREM ACESSO A PAGINA DE LOGIN
//		.and()
//		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")); // DESLOGAR AO ACESSAR '/LOGOUT'
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin@123").roles("admin");
//	
//	}
//	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/style/**"); // NÃO BLOQUEAR PAGINAS CSS
//	}
//}
