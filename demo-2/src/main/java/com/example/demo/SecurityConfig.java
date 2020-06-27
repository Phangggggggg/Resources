package com.example.demo;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity //have the class take effect
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception { //don't use your default login.jsp, i want to create my own login.jsp page
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/login")  //expect us to do the login.jsp page
                    .permitAll();//allow everyone to get to the login.jsp page
//                    .defaultSuccessUrl("/home.html",true)

    }
}

//        http
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();
//    }
//} before override , this is the default
