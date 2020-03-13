package test003.event.spring.biz;

import org.springframework.context.ApplicationEvent;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 13:02
 */
public class HelloEvent extends ApplicationEvent {

	private static final long serialVersionUID = 8592357208554126084L;
	private String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public HelloEvent(String eventName) {
		super(eventName);
		setEventName(eventName);
	}
}
