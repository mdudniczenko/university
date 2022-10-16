
public class NWD{
	public static void main(String[] args) {

		int M = 27, N = 99; //przypisanie wartości

		if (M<0) {M*=-1;}
		if (N<0) {N*=-1;}

		if (M!=0 && N!=0)
		{
			while (M!=N)
			{
				if (M>N) {M-=N;}
				else {N-=M;}
			}
			System.out.print("NWD liczb:\n"+M);
		}
		else {System.out.print("Błędne dane!");}
		
	}
}