package Q8;

public class WorkItem {
    private String itemID;
	private long workerID;
	private String message;
	
	public WorkItem(String id, long worker, String msg) {
		itemID = id;
		workerID = worker;
		message = msg;
	}
	
	public String getID() {return itemID;}
	public long getWorker() {return workerID;}
	public String getMsg() {return message;}
	public void setID(String id) {itemID = id;}

}