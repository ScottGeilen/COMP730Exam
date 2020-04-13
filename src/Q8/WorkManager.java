package Q8;

public class WorkManager extends PublisherInterface {
	public void notifyWorkers(WorkItem wi) {
        for (Worker w : workers) {
			WorkItem result = w.notify(wi);
			if (result != null) {
				System.out.println("Worker " + result.getWorker() + " Completed work on WorkItem: " + result.getID());
			}
		}
	}

	public WorkItem generateWork(String id, long worker, String msg) {
		WorkItem w = new WorkItem(id, worker, msg);
		return w;
	}
	
	public void runSimulation() {
		for (int i=1; i <=4; i++) {	
			WorkItem work = generateWork("Mine the cave " + i, i, "Mine the cave");
			notifyWorkers(work);
        }
    }
}