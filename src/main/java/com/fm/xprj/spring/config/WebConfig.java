package com.fm.xprj.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author fuwu
 * 
 * 
 * Done List:
 * 1.config view resolver,the location of jsp files
 * 2.config resource handler,for static resources like css,js,img...
 * 3.config message resources,the location for properties files
 * 
 * 
 * TODO List:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.fm.xprj")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		registry.viewResolver(viewResolver);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/static/**").addResourceLocations("/resources/");
	}
   @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
       // resource.setBasename("/resources/messages/messages");  the location is webroot/resources/messages/messages
		//String[] resources= {"classpath:messages/messages","classpath:messages/validation"};
		//messageSource.setBasenames(resources);
        resource.setBasename("classpath:messages/messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
   
   /**
    * 
    * use it to load some configuration from properties file ,like jdbc configuration
    * we can get property value user annotation like :@Value("${db.driver}") 
    * 
    * 
    */
   @Bean
   public static PropertySourcesPlaceholderConfigurer myPropertySourcesPlaceholderConfigurer() {
       PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();
       Resource[] resourceLocations = new Resource[] {new ClassPathResource("config/jdbc.properties")};
       p.setLocations(resourceLocations);
       return p;
   }
   
   

}
