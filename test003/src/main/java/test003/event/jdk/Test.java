package test003.event.jdk;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 11:14
 */
public class Test {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		MyListener mylistener = new MyListener(map);
	}
}
