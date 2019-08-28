package test002.bean;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanPojo implements FactoryBean<Student> {
	private String type;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		if(null != name){
			student.setName(name);
		}
		return student;
	}

	@Override
	public Class<Student> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
