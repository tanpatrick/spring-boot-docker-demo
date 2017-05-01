package tanpatrick.apps.spring.boot.docker.demo;

import java.util.Arrays;
import java.util.List;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author patricktan
 */
@SpringBootApplication
@RestController
@RequestMapping("/api/")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/names")
    public List<Person> getNames() {
        System.out.println("GET NAMES ....");
        
        return Arrays.asList(
                new Person("John", "Auckland"),
                new Person("Emma", "Bay of Blenty"),
                new Person("Morgan", "Waikato"),
                new Person("Andrew", "Cantebury"),
                new Person("Karen", "Otago"));
    }

    @Data
    static class Person {

        private String name;
        private String region;

        public Person(String name, String region) {
            this.name = name;
            this.region = region;
        }
    }
}
