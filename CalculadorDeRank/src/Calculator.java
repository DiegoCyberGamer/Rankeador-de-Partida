import java.util.Scanner;

public class Calculator {
	
	public static int rank(int v1 , int v2) {	
		int Rank = v1 - v2;
		if(Rank < 0) {
			return Rank = 0;
		} else {
		return Rank;	
		}
	}
public static String CalculoDeRank(int v1, int v2) {
String nivel = "";

if(rank(v1, v2) < 10) {
	 nivel = "Ferro";
} else if(rank(v1, v2) > 10 && rank(v1, v2) <= 20 ) {
	nivel = "Bronze";
}
else if(rank(v1, v2) > 20 && rank(v1, v2) <= 50 ) {
	nivel = "Prata";
}
else if(rank(v1, v2) > 50 && rank(v1, v2) <= 80 ) {
	nivel = "Ouro";
}
else if(rank(v1, v2) > 80 && rank(v1, v2) <= 90 ) {
	nivel = "Diamante";
}
else if(rank(v1, v2) > 90 && rank(v1, v2) <= 100 ) {
	nivel = "Lendário";
}
else if(rank(v1, v2) >= 101 ) {
	nivel = "Imortal";
}

return nivel;
}
public static void main(String[] args) {
	
	int v1 = 0;
	int v2 = 0;
	
	Scanner Player = new Scanner(System.in);
	
	System.out.println("Qual o número de Vitórias do guerreiro?");
	 v1 = Player.nextInt();
	System.out.println("Qual o número de derrotas do guerreiro?");
	 v2 = Player.nextInt();
	 Player.close();
	 
	 System.out.println( "O herói tem de saldo " + rank(v1, v2) + " e está no nivel " + CalculoDeRank(v1 , v2)); 
	 
} }