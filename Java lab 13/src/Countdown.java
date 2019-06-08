import java.util.Random;

public class Countdown implements Runnable {
	private String name;
	private int limit;
	public Countdown(String name, int limit)
	{
		this.name=name;
		this.limit=limit;
		
	}
	
	public void run()
	{
		Random r = new Random();
		int a=r.nextInt(990)+10;
		for(int i=limit;i>0;i--)
		{

			Thread t= Thread.currentThread();
			System.out.println(name+": "+ i);
			try
			{
				
				Thread.sleep(a);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}
	}

}

