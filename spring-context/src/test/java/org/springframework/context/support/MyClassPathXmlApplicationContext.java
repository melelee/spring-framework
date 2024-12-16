package org.springframework.context.support;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.testfixture.env.MockPropertySource;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext{
	private static final String PATH = "/org/springframework/context/support/";

	private static final String FQ_SIMPLE_CONTEXT = PATH + "simpleContext.xml";



	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}


	@Override
	public void initPropertySources(){
		System.out.println("MyClassPathXmlApplicationContext initPropertySources");
		super.initPropertySources();
//		getEnvironment().setRequiredProperties("孟理理");
//		getEnvironment().getPropertySources().addLast(new MockPropertySource());

	}
	@Override
	public void customizeBeanFactory(DefaultListableBeanFactory beanFactory){
//		super.setAllowBeanDefinitionOverriding(false);
//		super.setAllowCircularReferences(false);
//		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader){
//		reader.setValidating(false);
	}

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new MyClassPathXmlApplicationContext(FQ_SIMPLE_CONTEXT);
	}
}
