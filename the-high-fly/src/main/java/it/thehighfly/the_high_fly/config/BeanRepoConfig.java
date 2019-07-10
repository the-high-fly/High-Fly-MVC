package it.thehighfly.the_high_fly.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;



@Configuration
@PropertySources({@PropertySource("classpath:db.properties")})
public class BeanRepoConfig {
	
	/** Parametri connessione database. */
	@Value("${dbhost}")
	private String dbhost;
	@Value("${dbname}")
	private String dbname;
	@Value("${dbuser}")
	private String dbuser;
	@Value("${dbpass}")
	private String dbpass;
	
	@Bean
	public ConfigBean getConfigBean() {
		ConfigBean cb = new ConfigBean();
		cb.setDbhost(dbhost);
		cb.setDbname(dbname);
		cb.setDbuser(dbuser);
		cb.setDbpass(dbpass);
		return cb;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
