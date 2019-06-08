
public class main2 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread a1 = new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				counter.add(1);
			}
			System.out.println("a1 stop");
		});
		Thread a2 = new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				counter.add(1);
			}
			System.out.println("a2 stop");
		});
		Thread a3 = new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				counter.add(1);
			}
			System.out.println("a3 stop");
		});
		a1.start();
		a2.start();
		a3.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(counter.getCount());
		
		

	}

}
