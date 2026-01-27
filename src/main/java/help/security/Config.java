package help.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http
                .csrf(crsf -> crsf.disable())
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/commands/", "/commands/info").permitAll()
                        .anyRequest().authenticated());
        return http.build();
    }
}
