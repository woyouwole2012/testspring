package com.woyou;

import com.woyou.config.UserConfig;
import com.woyou.service.UserService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.woyou")
@PropertySource("classpath:app.properties")
@Import(UserConfig.class)
@EnableAspectJAutoProxy
public class Config {

    @Bean(name = "userService1")
    public UserService getUserService(){
        return new UserService();
    }
}
