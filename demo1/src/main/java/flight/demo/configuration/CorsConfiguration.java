package flight.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry){
        //que direccion son admitidas
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")

            //que metodos son admitidos
            .allowedMethods("GET","POST","DELETE","UPDATE")
            .allowedHeaders("*");
    }

}
