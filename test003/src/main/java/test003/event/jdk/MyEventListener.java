package test003.event.jdk;

import java.util.EventListener;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 11:10
 */
public interface  MyEventListener extends EventListener {
	void handleEvent (MyEvent me);
}
