package com.vitalii.spring_security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//        //тут прописали логін і пароль і роль юзерів, в памяты програми
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("zaur").password("zaur").roles("EMPLOYEE"))
//                .withUser(userBuilder.username("elena").password("elena").roles("HR"))
//                .withUser(userBuilder.username("ivan").password("ivan").roles("MANAGER", "HR"));


        // тут вказали шо інфа про наших юзерів зберігається в ДБ, передаємо сюди підключення до БД
        auth.jdbcAuthentication().dataSource(dataSource);


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //тут прописали приватність, хто має яку роль той і бачить ту інфу
        // тобто hr_info може бачити тыльки HR
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("EMPLOYEE","HR", "MANAGER")
                .antMatchers("/hr_info").hasAnyRole("HR")
                .antMatchers("/manager_info").hasAnyRole("MANAGER")
                .and().formLogin().permitAll();

    }
}
