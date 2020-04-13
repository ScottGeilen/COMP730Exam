package Q8;

public class ExamQ8 {
    public static void main(String[] args) {
		WorkManager publish = new WorkManager();
		Worker one = new Worker1();
		Worker two = new Worker2();
		Worker three = new Worker3();
		Worker four = new Worker4();
		publish.registerWorker(one);
		publish.registerWorker(two);
		publish.registerWorker(three);
		publish.registerWorker(four);
		publish.runSimulation();
	}

}