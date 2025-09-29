package com.davi.auth.auth_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilita o CSRF para simplificar o teste da API
                .authorizeHttpRequests(authorize -> authorize
                        // Adiciona a rota de login à lista de acesso público
                        .requestMatchers(
                                new AntPathRequestMatcher("/api/auth/register"),
                                new AntPathRequestMatcher("/api/auth/login"))
                        .permitAll()
                        .anyRequest().authenticated() // Protege todas as outras rotas
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}