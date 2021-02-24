package com.example.SpringHomeworkRentea;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringHomeworkRenteaApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SpringHomeworkRenteaApplication.class);

		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

}


@Data
@Component
@ConfigurationProperties(prefix="welcome")
class WelcomeConfig{
	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public List<String> getSupportUrls() {
		return supportUrls;
	}

	public Map<String, String> getLocalContactPhone() {
		return localContactPhone;
	}

	public HelpInfo getHelp() {
		return help;
	}

	private String welcomeMessage;
	private List<String> supportUrls;
	private Map<String, String> localContactPhone;
	private HelpInfo help;
	@Data
	static class HelpInfo{
		private URL helpUrl;
		private String bebe;
	}


}

@RestController
@RequiredArgsConstructor
class PrimuRest{
	private final WelcomeConfig config;

	@GetMapping("hello")
	public String method(){
		return config.getWelcomeMessage();
	}
}
