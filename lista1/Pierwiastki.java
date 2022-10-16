
public class Pierwiastki {
	public static void main(String[] args) {

		double a=3, b=2, c=-5; //przypisanie wartości

		if (a==0)
		{
			if (b==0)
			{
				if (c==0) {System.out.print("tożsamość");}
				else {System.out.print("sprzeczne");}
			}
			else {System.out.print("Pierwiastek równania:\n"+(-c/b));}

		}
		else
		{
			double delta = b*b - 4*a*c;
			if (delta < 0) {System.out.print("brak rozwiązań");}
			else if (delta==0) {System.out.print(-b/(2*a));}
			else
			{
				double x1=(-b + Math.sqrt(delta))/(2*a);
				double x2=(-b - Math.sqrt(delta))/(2*a);
				System.out.print("Pierwiastki równania:\n"+x1+"\n"+x2);
				
			}
		}
	}

}
