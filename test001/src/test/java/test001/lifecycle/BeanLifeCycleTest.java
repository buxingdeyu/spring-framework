package test001.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-28 15:10
 */
public class BeanLifeCycleTest {
	public static void main(String[] args) {
		System.out.println("start ");

		ApplicationContext factory = new ClassPathXmlApplicationContext("lifecycle/beans.xml");
		System.out.println("ApplicationContext  init finish");
		BeanObj beanObj = factory.getBean("beanObj",BeanObj.class);
		System.out.println("beanObj:"+beanObj);

		System.out.println("prepare close applicationContext ");
		((ClassPathXmlApplicationContext)factory).registerShutdownHook();
	}
}
