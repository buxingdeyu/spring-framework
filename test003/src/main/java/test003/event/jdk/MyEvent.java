package test003.event.jdk;

import java.util.EventObject;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 11:09
 */
public class MyEvent extends EventObject {

	private static final long serialVersionUID = -6739208761708838521L;

	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public MyEvent(Object source) {
		super(source);
	}

	private Object obj;
	//此监听对象可以是自定义对象
	private String sName;
	public MyEvent(Object source,String sName)
	{
		super(source);
		this.obj=source;
		this.sName=sName;  }
	public Object getObj()
	{
		return obj;
	}
	public String getsName()
	{
		return sName;
	}
}
