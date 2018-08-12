import java.util.Scanner;

public class Sretan {
	
	/**
	 * @author Juan Pablo Camargo Lasso (juancholasso)
	 * 
	 * Lucky Number - CodeChef 
	 * Problem Code FP06
	 * 
	 * All submissions for this problem are available.
	 * Digits 4 and 7 are lucky, while all others are unlucky. An integer is lucky if
	 * it contains only lucky digits
	 * in decimal notation. We would like to know the K-th lucky positive integer.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int ceros = 0;
		int limite = 0;
		String res = "";
		String temp = "";
		while(sc.hasNextInt()){
			k = sc.nextInt();
			if(k < 7){
				switch(k){
					case 1: System.out.println("4");
							break;
					case 2: System.out.println("7");
							break;
					case 3: System.out.println("44");
							break;
					case 4: System.out.println("47");
							break;
					case 5: System.out.println("74");
							break;
					case 6: System.out.println("77");
							break;
				}
			}
			else{
				ceros = 3;
				limite = 7;
				while(k >= (limite*2)+1){
					limite = limite*2+1;
					ceros++;
				}
				res = Integer.toBinaryString(k-limite);
				if(limite == k){
					res = "";
					for(int i = 0; i<ceros; i++)
						res+="4";
					System.out.println(res);
				}
				else{
					temp = "";
					for(int j = 0; j<(ceros-(int)res.length()); j++)
						temp+="4";
					res = res.replace('0', '4');
					res = res.replace('1', '7');
					System.out.println(temp+res);
				}
			}
		}
	}
}
