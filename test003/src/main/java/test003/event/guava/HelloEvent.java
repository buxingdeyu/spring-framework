package test003.event.guava;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 12:05
 */
public class HelloEvent {
	private String eventName;

	public HelloEvent() {
	}

	public HelloEvent(String eventName) {
		this.eventName = eventName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
