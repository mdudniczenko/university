
public class Sortowanie {
	public static void main(String[] args) {

		double A=100, B=0.4236, C=3; //przypisanie wartości

		if (A>B)
		{
			double pom = A;
			A = B;
			B = pom;
		}
		if (B>C)
		{
			double pom = B;
			B = C;
			C = pom;
		}
		if (A>B)
		{
			double pom = A;
			A = B;
			B = pom;
		}
		System.out.print("Niemalejący ciąg:\n"+A+" "+B+" "+C);
	}
}