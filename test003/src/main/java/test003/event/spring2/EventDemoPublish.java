package test003.event.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 19:20
 */
// 事件发布
@Component
public class EventDemoPublish {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void publish(String message) {
		EventDemo demo = new EventDemo(this, message);
		applicationEventPublisher.publishEvent(demo);
	}
}