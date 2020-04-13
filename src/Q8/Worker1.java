package Q8;

public class Worker1 implements Worker {
    private long WorkerId = 1;
	public WorkItem notify(WorkItem we) {
		if (this.WorkerId == we.getWorker()){
			System.out.println("Worker " + this.WorkerId + " processed WorkItem " + we.getID() + " message: " + we.getMsg());
			we.setID(we.getID()+1);
			return we;
		}
		else {
			return null;
		}
	}

}