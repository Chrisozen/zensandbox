package org.zen.sandbox.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 * Tiles configuration.
 * 
 * References: http://docs.spring.io/spring/docs/4.0.6.RELEASE/spring-framework-reference/html/view.html#view-tiles-integrate
 * 
 * @author Mark Meany
 */
@Configuration
public class TilesConfig {

	@Bean 
	 public UrlBasedViewResolver tilesViewResolver(){

	    UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
	    tilesViewResolver.setViewClass(TilesView.class);
	    return tilesViewResolver;
	}
	 @Bean
	 public TilesConfigurer tilesConfigurer(){ 

//	    String[] definitions = new String[] {
//	            "/WEB-INF/layouts/layouts.xml",
//	            "/WEB-INF/views/**/views.xml" /*Scans directories for Tiles configurations */
//	            };
		 
		 String[] definitions = new String[] {
		            "classpath:tiles/tiles.xml" /*Scans directories for Tiles configurations */
		            };

	    TilesConfigurer tilesConfigurer = new TilesConfigurer();
	    tilesConfigurer.setDefinitions(definitions);
	    return tilesConfigurer;

	 }
}
