package test003.event.spring.biz;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 13:03
 */
public class CustomerEvent {
	private String name;
	private Boolean isCustomer;

	public CustomerEvent() {
	}

	public CustomerEvent(String name, Boolean isCustomer) {
		this.name = name;
		this.isCustomer = isCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCustomer() {
		return isCustomer;
	}

	public void setCustomer(Boolean customer) {
		isCustomer = customer;
	}
}
