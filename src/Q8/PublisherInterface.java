package Q8;
import java.util.ArrayList;

public class PublisherInterface {
    ArrayList <Worker> workers = new ArrayList <Worker>();
    public void registerWorker(Worker w) {
		workers.add(w);
	}
}