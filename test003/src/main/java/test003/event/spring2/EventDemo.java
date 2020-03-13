package test003.event.spring2;

import org.springframework.context.ApplicationEvent;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 19:19
 */
// 定义一个事件
public class EventDemo extends ApplicationEvent {
	private static final long serialVersionUID = -6761922966312698083L;
	private String message;


	public EventDemo(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
