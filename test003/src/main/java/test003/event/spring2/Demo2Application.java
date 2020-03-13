package test003.event.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 13:04
 */
public class Demo2Application {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(EventDemoListener.class, EventDemoPublish.class);
		applicationContext.refresh();
		applicationContext.publishEvent(new EventDemo("abc","v"));
		EventDemoPublish bean = applicationContext.getBean(EventDemoPublish.class);
		bean.publish("bean publish");
	}
}
