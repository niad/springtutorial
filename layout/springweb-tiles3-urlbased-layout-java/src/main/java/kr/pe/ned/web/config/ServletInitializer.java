package kr.pe.ned.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
//		return new Class[]{AppConfig.class};
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebMvcConfig.class};
	}

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

//        DelegatingFilterProxy filter = new DelegatingFilterProxy("springSecurityFilterChain");
//        filter.setContextAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcher");
//        servletContext.addFilter("springSecurityFilterChain", filter).addMappingForUrlPatterns(null, false, "/*");
        
    }

}
