package com.example.ecommerce.security;

import com.example.ecommerce.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /** Attributes **/
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /** Methods **/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Disable navigator login screen (only uses the Spring Boot's one)
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/user").permitAll()
                .antMatchers(HttpMethod.GET, "/product").hasAnyRole("USER", "ADMIN")
                .antMatchers("/product", "/category").hasRole("ADMIN")
                .anyRequest()
                .authenticated().and()
//                .formLogin();
                .httpBasic();
    }

    // Manages the AuthenticationBuilder settings
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    // Providing the Dao for AuthenticationProvider
    // Executes first
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(bCryptPasswordEncoder);
        provider.setUserDetailsService(userService);

        return provider;
    }

}
