package kr.pe.ned.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletInitializer extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebMvcConfig.class);
        return context;
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(AppConfig.class);
        return context;
    }


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

        
        
        // filter 추가
//        CustomSiteMeshFilter filter = new CustomSiteMeshFilter();
//        servletContext.addFilter("sitemesh", filter).addMappingForUrlPatterns(null, true, "/*");
        
        // 자가구현
        ConfigurableSiteMeshFilter filter = new ConfigurableSiteMeshFilter(){
        	@Override
        	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        		 builder
        		 	.addDecoratorPath("/", "/WEB-INF/views/layout/layout_no.jsp")
        		 	.addDecoratorPath("/*", "/WEB-INF/views/layout/layout_default.jsp")
        		 	.addDecoratorPath("**popup", "/WEB-INF/views/layout/layout_popup.jsp")
        		 	
        		 	.addExcludedPath("/js/*")
        		 	.addExcludedPath("/css/*")
        		 	.addExcludedPath("/img/*")
        		 	.addExcludedPath("/login*");
        	}
        };
        servletContext.addFilter("sitemesh", filter).addMappingForUrlPatterns(null, false, "/*");
        
        
        
//        DelegatingFilterProxy filter = new DelegatingFilterProxy("springSecurityFilterChain");
//        filter.setContextAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcher");
//        servletContext.addFilter("springSecurityFilterChain", filter).addMappingForUrlPatterns(null, false, "/*");
        


    }

}
