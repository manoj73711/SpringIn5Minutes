package com.geeks.spring.basics.SpringIn5Minutes.propertyFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:url.properties")
public class PropertyLoader {
@Value("${url.home.website.page}")
private String homeURL;

public String getHomeURL() {
	return homeURL;
}

}
