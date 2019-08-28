package test001.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author bcc
 * @Description: 自定义工厂后处理器
 * @date 2019-08-28 14:48
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public MyBeanFactoryPostProcessor() {
		super();
		System.out.println("MyBeanFactoryPostProcessor()");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory");
		BeanDefinition beanObj = beanFactory.getBeanDefinition("beanObj");
		beanObj.getPropertyValues().addPropertyValue("attr2","valuechange");
	}
}
