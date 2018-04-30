package jupiterpa.midgard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MidgardHelper
{
	public static void main(String[] args) {
		SpringApplication.run(MidgardHelper.class, args);
		System.out.println ("---");
		System.out.println("MidgardHelper");
		System.out.println ("---");
		Wuerfel wuerfeln = new Wuerfel();
		
		System.out.println ("Würfel: W2 (Münze)");
		for (int i = 0; i < 10; i++)
		{
			System.out.println (wuerfeln.wuerfel(2));
		}
		
		System.out.println ("");

		System.out.println ("Würfel: W3 (abwandlung W6)");
		for (int i = 0; i < 10; i++)
		{
			System.out.println (wuerfeln.wuerfel(3));
		}
		
		System.out.println ("");
		
		System.out.println ("Würfel: W6");
		for (int i = 0; i < 10; i++)
		{
			System.out.println (wuerfeln.wuerfel(6));
		}
		
		System.out.println ("");
		
		System.out.println ("Würfel: W20");
		for (int i = 0; i < 10; i++)
		{
			System.out.println (wuerfeln.wuerfel(20));
		}
		
		System.out.println ("");
		
		System.out.println ("Würfel: W% (auch W100)");
		for (int i = 0; i < 10; i++)
		{
			System.out.println (wuerfeln.wuerfel(100));
		}
		
		System.out.println ("");

		System.out.println ("4W3+4: " + wuerfeln.extended (4, 3, +4));

		System.out.println ("");

		System.out.println ("3W2-5: " + wuerfeln.extended (3, 2, -5));
		
		System.out.println ("Fertig!");
	} 
}
