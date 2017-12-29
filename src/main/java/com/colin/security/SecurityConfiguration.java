package com.colin.security;

import com.sun.deploy.config.SecuritySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Colin on 2017/12/25.
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecuritySettings settings;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        //http.formLogin().loginPage("/login").permitAll().successHandler(loginSu)
    }
}
