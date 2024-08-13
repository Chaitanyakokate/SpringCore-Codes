package in.pwskills.chaitanya.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "in.pwskills.chaitanya")
@ImportResource(locations = "in/pwskills/chaitanya/cfgs/applicationContext.xml")
public class AppConfig {

}
