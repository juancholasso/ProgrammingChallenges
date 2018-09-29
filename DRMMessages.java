import java.util.Scanner;

public class DRMMessages {
	/**
	 * CCPL 2018 Round 7
	 * UVA ICPC Live Archive # 8069
	 * juancholasso
	 */
	public static final char[] alf = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] args) {
		char[] arr1;
		char[] arr2;
		int sumleft = 0;
		int sumright = 0;
		Scanner sc = new Scanner(System.in);
		String text ="";
		while(sc.hasNext()){
			text = sc.next();
			arr1 = text.substring(0, text.length()/2).toCharArray();
			arr2 = text.substring(text.length()/2, text.length()).toCharArray();
			for(int i = 0; i<arr1.length; i++){
				sumleft+=(int)arr1[i]-65;
				sumright+=(int)arr2[i]-65;
			}
			for(int i = 0; i<arr1.length; i++){
				arr1[i]=alf[(((int)arr1[i]-65)+sumleft)%26];
				arr2[i]=alf[(((int)arr2[i]-65)+sumright)%26];
			}
			text="";
			for(int i = 0; i<arr1.length; i++){
				text+=alf[(((int)arr1[i]-65)+((int)arr2[i]-65))%26];
			}
			sumleft = 0;
			sumright = 0;
			System.out.println(text);
		}
	}
}
