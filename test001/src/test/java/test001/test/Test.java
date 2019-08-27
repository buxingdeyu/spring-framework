package test001.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import test001.bean.MyTestBean;

import static org.junit.Assert.assertEquals;

public class Test {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test001\\test001.xml"));
		MyTestBean bean =(MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		assertEquals("testStr",bean.getTestStr());
	}
}
