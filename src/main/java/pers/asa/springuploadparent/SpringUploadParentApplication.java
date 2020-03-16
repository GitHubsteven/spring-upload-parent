package pers.asa.springuploadparent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import pers.asa.springuploadparent.bean.StorageProperties;
import pers.asa.springuploadparent.service.StorageService;

/**
 * @author rongbin.xie
 */
@SpringBootApplication
@EnableConfigurationProperties({StorageProperties.class})
public class SpringUploadParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUploadParentApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (arg) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
