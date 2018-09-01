package com.eintrusty.ui.utiity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;

public class JsonUtility {

	
	public static List<HttpMessageConverter<?>> getMessageConvertersApplicationJson() {
	    List<HttpMessageConverter<?>> converters = 
	      new ArrayList<HttpMessageConverter<?>>();
	    converters.add(new MappingJackson2HttpMessageConverter());
	    return converters;
	}
	public static List<HttpMessageConverter<?>> getMessageConverterApplicationXML(){
		 XStreamMarshaller marshaller = new XStreamMarshaller();
		 MarshallingHttpMessageConverter marshallingConverter = 
		      new MarshallingHttpMessageConverter(marshaller);
		     
		    List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		    converters.add(marshallingConverter);
		    return converters; 
	}
}
