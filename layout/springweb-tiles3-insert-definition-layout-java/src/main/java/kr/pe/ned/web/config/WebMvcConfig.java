package kr.pe.ned.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = {
                "kr.pe.ned.web.controller"
        },
        includeFilters = @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION)
)
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    	registry.addResourceHandler("/img/**").addResourceLocations("/img/");
    	registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}

	@Bean
    public ViewResolver viewResolver() throws Exception {

        // jsp view resolver
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(2);

        return viewResolver;
    }
    
    @Bean
    public TilesConfigurer tielsConfigurer() {
    	TilesConfigurer tilesConfigurer = new TilesConfigurer();
    	tilesConfigurer.setDefinitions(new String[]{"/WEB-INF/tiles-layout.xml"});
//    	tilesConfigurer.setCheckRefresh(true);	// runtime 시에 tiles-layout.xml 변경여부 체크
    	return tilesConfigurer;
    }

}

