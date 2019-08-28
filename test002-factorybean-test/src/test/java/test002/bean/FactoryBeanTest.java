package test002.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

	public static void main(String[] args) {
		String url = "test002.xml";
		ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext(url);
		Student student=  (Student)cpxa.getBean("factoryBeanPojo");
		FactoryBeanPojo factoryBeanPojo= (FactoryBeanPojo) cpxa.getBean("&factoryBeanPojo");
		System.out.println(student.getClass().getName());
		System.out.println(student.getName());
		System.out.println(factoryBeanPojo.getClass().getName());
		System.out.println(factoryBeanPojo.getType());

		Student student2=  (Student)cpxa.getBean("student2");
		System.out.println(student2.getClass().getName());
		System.out.println(student2.getName());
	}
}
