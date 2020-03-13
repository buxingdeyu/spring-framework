package test003.event.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 12:10
 */
public class GuavaTest {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus();
		GeventListener listener = new GeventListener();
		eventBus.register(listener);

		eventBus.post(new HelloEvent("hello"));
		eventBus.post(new WorldEvent("world", 23333));
	}
}
