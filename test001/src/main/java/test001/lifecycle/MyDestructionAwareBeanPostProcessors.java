package test001.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-28 15:44
 */
public class MyDestructionAwareBeanPostProcessors implements DestructionAwareBeanPostProcessor {

	public MyDestructionAwareBeanPostProcessors() {
		super();
		System.out.println("MyDestructionAwareBeanPostProcessors()");
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		System.out.println("MyDestructionAwareBeanPostProcessors.postProcessBeforeDestruction");
	}
}
