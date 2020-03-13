package test003.event.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test003.event.spring.biz.CustomerEvent;
import test003.event.spring.biz.HelloEvent;

/**
 * 有问题的
 * @author bcc
 * @Description:
 * @date 2019-08-31 13:04
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] names = context.getBeanDefinitionNames();
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("++++++++++");
		context.publishEvent(new HelloEvent("helloEvent"));
		context.publishEvent(new CustomerEvent("customer", true));
		context.publishEvent(new CustomerEvent("miaomiao", false));
	}
}
