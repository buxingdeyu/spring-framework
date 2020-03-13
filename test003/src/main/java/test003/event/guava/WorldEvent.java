package test003.event.guava;

/**
 * @author bcc
 * @Description:
 * @date 2019-08-31 12:08
 */
public class WorldEvent extends HelloEvent {

	private int eventNo;

	public int getEventNo() {
		return eventNo;
	}

	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}

	public WorldEvent(String name, int no) {
		setEventName(name);
		setEventNo(no);
	}
}
