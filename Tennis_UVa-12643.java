import java.util.Scanner;
/**
 * UVA 12643 - Tennis Rounds
 * @author Juancholasso
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0;
		int i =0;
		int j =0;
		while(sc.hasNextInt()){
			n = sc.nextInt();
			i = sc.nextInt();
			j = sc.nextInt();
			int round = 1;
			int[] lista = new int[(int) Math.pow(2,n)];
			int[] lista2 = new int[lista.length/2];
			if(i>j){
				int temp = j;
				j = i;
				i = temp;
			}
			for(int k = 1; k<=lista.length; ++k){
				lista[k-1]=k;
			}
			z:
			while(true){
				for (int k = 0; k < lista.length-1; k=k+2) {
					int p1 = lista[k];
					int p2 = lista[k+1];
					if(p1 == i && p2 == j){
						break z;
					}
					else{
						if(p1 == i || p1 == j){
							lista2[k/2]=p1;
						}
						else if(p2 == i || p2 == j){
							lista2[k/2]=p2;
						}
						else{
							lista2[k/2]=p1;;
						}
					}
				}
				lista = lista2;
				lista2 = new int[lista.length/2];
				round++;
			}
			System.out.println(round);
		}
	}
}
