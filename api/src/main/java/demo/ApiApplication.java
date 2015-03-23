package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Resource
public class ApiApplication {

	@RequestMapping("/")
	public Map<String, String> home() {
		Map<String, String> result = new HashMap<>();
		result.put("id", UUID.randomUUID().toString());
		result.put("content", "Hello World");
	    return result;
	  }
	
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
