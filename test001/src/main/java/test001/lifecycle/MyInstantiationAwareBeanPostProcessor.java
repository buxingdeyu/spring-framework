package test001.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-28 14:58
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {


	public MyInstantiationAwareBeanPostProcessor() {
		super();
		System.out.println("MyInstantiationAwareBeanPostProcessor()");
	}

	/**
	 * 实例化Bean之前调用
	 * @param beanClass
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation beanName:"+beanName);
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	/**
	 * 实例化bean之后调用
	 * @param bean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation beanName:"+beanName);
		return super.postProcessAfterInstantiation(bean, beanName);
	}


	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessProperties beanName:"+beanName+ " pvs: "+pvs);
		return null;
	}

//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		System.out.println("MyInstantiationAwareBeanPostProcessor.postProcessPropertyValues beanName："+beanName);
//		return pvs;
//	}
}
