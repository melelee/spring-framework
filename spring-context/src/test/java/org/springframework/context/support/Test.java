package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Test implements BeanFactoryPostProcessor, BeanPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition test = beanFactory.getBeanDefinition("test");
		test.setBeanClassName("org.springframework.context.support.MyClassPathXmlApplicationContext");
		test.setScope("prototype");
		test.setLazyInit(true);
		test.setAutowireCandidate(true);
		test.setPrimary(true);
		test.setFactoryBeanName("test");
		test.setFactoryMethodName("main");
	}


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}
}
