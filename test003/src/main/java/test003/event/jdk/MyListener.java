package test003.event.jdk;

import java.util.Map;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 11:12
 */
public class MyListener implements MyEventListener {
	public Map<Integer, String> map =null;
	public int i=0;

	public MyListener(Map<Integer, String>  map)
	{
		this.map = map;
		MyEventSource mes = new MyEventSource();
		mes.addMyEventListener(this);
		mes.setName("niu");
	}

	//实现接口中的方法
	@Override
	public void handleEvent(MyEvent me)
	{
		System.out.println("me.getSource()  "+me.getSource());
		System.out.println("me.getsName()  "+me.getsName());
		//此处可以将写，将监听到的对象存入map中
		map.put(++i, me.getsName());
	}
}
