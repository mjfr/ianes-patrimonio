package br.senai.sp.info.pweb.ianespatrimonio.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("br.senai.sp.info.pweb.ianespatrimonio")
@Import(PersistenceConfig.class)
public class WebConfig {

}