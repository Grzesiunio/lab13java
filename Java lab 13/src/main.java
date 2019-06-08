
public class main {

	public static void main(String[] args) {
		Thread t1=new Thread((java.lang.Runnable) new Countdown("racer 1",20));
		Thread t2=new Thread((java.lang.Runnable) new Countdown("racer 2",20));
		//zaobserwowalem odliczanie od 10 do 1
	//	try
	//	{
	//		t1.join();
	//	}
	//	catch(Exception e)
	//	{
	//		System.out.println(e);
	//	}
		//metoda join jest wydajniejsza, poniewa¿ za kazdym razem czeka na dokonczenie danego watku i wtedy wykonuje sie kolejny
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Race is over");
		//Wynik nie jest caly czas taki sam. Spowodowane jest to wystapieniem funkcji Random ktory sprawia ze szybkosc ukonczenia run zalezy od wylosowanje liczby
		//Nie jestem w stanie przewidziec
		
	}

}
