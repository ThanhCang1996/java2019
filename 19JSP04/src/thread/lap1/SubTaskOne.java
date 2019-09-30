package thread.lap1;

public class SubTaskOne implements Runnable{
	private Thread t;
	public void start()
	{
		System.out.println("Starting sub task 1");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run()
	{
		System.out.println("HR database");
	}
}
