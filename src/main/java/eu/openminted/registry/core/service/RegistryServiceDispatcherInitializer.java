package eu.openminted.registry.core.service;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

public class RegistryServiceDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] { RegistryServiceConfiguration.class };
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
        }

        @Override
        protected Filter[] getServletFilters() {
            return new Filter[]{ new CORSFilter()};
        }

}
