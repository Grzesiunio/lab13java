import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class main4 {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector
				<Integer>();
		Thread a1 = new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				numbers.add(i);
			}
			System.out.println("a1 stop");
		});
		Thread a2= new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				numbers.add(i);
			}
			System.out.println("a2 stop");
		});
		Thread a3= new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				numbers.add(i);
			}
			System.out.println("a2 stop");
		});
		Thread a4= new Thread(()->
		{
			for(int i=0;i<100;i++)
			{
				numbers.add(i);
			}
			System.out.println("a2 stop");
		});
		a1.start();
		a2.start();
		try {
			a1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(numbers.size());
		//z ArrayList wartosci sa rozne
		//z Vector wartosci sa takie same caly czas i zlicza dobrze ich ilosc
		
		
		
	

	}


}