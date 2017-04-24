package kr.pe.ned.web.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter {

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
	
}
