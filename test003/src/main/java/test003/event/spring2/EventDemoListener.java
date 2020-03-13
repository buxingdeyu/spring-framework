package test003.event.spring2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 19:20
 */
// 定义一个事件监听者
@Component
public class EventDemoListener implements ApplicationListener<EventDemo> {
	@Override
	public void onApplicationEvent(EventDemo event) {
		System.out.println("receiver " + event.getMessage());
	}
}
