package test001.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public class BeanObj implements ApplicationContextAware ,MessageSourceAware, ApplicationEventPublisherAware,  ResourceLoaderAware, EmbeddedValueResolverAware,EnvironmentAware, BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean ,BeanClassLoaderAware {

	private String attr1;

	private String attr2;

	public BeanObj() {
		super();
		System.out.println("BeanObj()");
	}

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanObj.beanFactory");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanObj.setBeanName");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BeanObj.destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanObj.afterPropertiesSet");
	}

	public void myInit(){
		System.out.println("BeanObj.myInit");
	}

	public void myDestroy(){
		System.out.println("BeanObj.myDestroy");
	}

	@Override
	public String toString() {
		return "BeanObj{" +
				"attr1='" + attr1 + '\'' +
				", attr2='" + attr2 + '\'' +
				'}';
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanObj.setBeanClassLoader");
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("BeanObj.setEnvironment");
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("BeanObj.setEmbeddedValueResolver");
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("BeanObj.setResourceLoader");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("BeanObj.setApplicationEventPublisher");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("BeanObj.setMessageSource");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("BeanObj.setApplicationContext");
	}

}
