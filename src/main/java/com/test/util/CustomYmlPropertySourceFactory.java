package com.test.util;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

public class CustomYmlPropertySourceFactory extends DefaultPropertySourceFactory{

	@Override
	public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {

		if(resource != null){
			List<PropertySource<?>> propertySourceList = new YamlPropertySourceLoader()
					.load(resource.getResource().getFilename(), resource.getResource());
			if(!propertySourceList.isEmpty())
				return propertySourceList.iterator().next();
		}
		return super.createPropertySource(name, resource);

	}
	

}
