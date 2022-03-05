package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringSecurityConfigu extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource datasource;
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO Auto-generated method stub
        //super.configure(http);
          http.authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin()
          .loginPage("/login")
          .failureUrl("/login?error").permitAll().and().logout().logoutUrl("/logout")
          .logoutSuccessUrl("/login?logout").permitAll().and().csrf();
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO Auto-generated method stub
        //super.configure(auth);
        auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(getPasswordEncoder());
    }
    @Bean
    public BCryptPasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}