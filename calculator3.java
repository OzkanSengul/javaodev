import java.util.Scanner;
public class calculator3{

public static int integerDondur(String terim) {
		int factor = 1;
		int sayi = 0;
		for (int a = terim.length() - 1; a >= 0; a--) {
			sayi += ((int) terim.charAt(a) - '0') * factor;
			factor *= 10;

		}
		return sayi;}

 public static int mod(String terim1) {
			int s=0;
			int z=0;
			int count=0;
			String sayi3="";
			String sayi6="";
			String sayi4="";
			int sayi7=0;
			int sayi10=0;
			String sayi99="";
			String kalanlar="";
			//System.out.println(terim1.substring(3, 4));
			
			for (z=0;z<terim1.length();z++) {		
				sayi3+=terim1.substring(z,z+1);
				s=z;
				

				if (terim1.substring(s, s+1).equals("%")) {
					count=sayi3.length();
					sayi6=terim1.substring(0,s);
					//System.out.println(terim1.substring(s, s+1));
						
					}
					//System.out.println("kalanlaaaarrr")		;
					
					//System.out.println("asassa"+ sayi3.length());
				}
				System.out.println("zzaazzzzzz"+z);
			System.out.println("bbbbbb"+ sayi3.length());

			for (int y=count;y<terim1.length();y++) {		
				System.out.println("burda5");
				sayi4+=terim1.substring(y,y+1);
				int b=count;
				
				System.out.println("yapacam  "  +sayi4);
				if (!terim1.substring(b, b+1).equals("*")|| !terim1.substring(b, b+1).equals("+")||
					!terim1.substring(b, b+1).equals("-")||!terim1.substring(b, b+1).equals("/") || !terim1.substring(b, b+1).equals("%")) {
					
					System.out.println("adana"+terim1.substring(b, b+1));

					sayi99=sayi4.substring(0,sayi4.length()-1);

						for(int m=s;m>0;m--) {	

							System.out.println("burdayizz"+ "sayi6.  " + sayi6);
							sayi10=integerDondur(sayi6);


						 System.out.println("vvv"+sayi99);
						 
						 
						}
					}
					if (sayi99.length()>0){
					sayi99=sayi99.substring(0,sayi99.length()-1);}
					
					sayi7=integerDondur(sayi99);
					System.out.println("sayi7.  " +sayi7);
					System.out.println("sayi7.  " +sayi7);
					System.out.println("hhhh"+sayi99.length());
					System.out.println("zzzz"+sayi99);
					System.out.println("sayi10.  " +sayi10);


				

			}System.out.println("zzzasxassszzzzz"+sayi99.length());
			System.out.println("zzzzzzzz123434"+z+ "   "+sayi6.length()+"  "  + sayi4.length());
			System.out.println("heaa"+terim1.substring (sayi6.length()+sayi4.length()-1,z));
			System.out.println("sonnn"+sayi7);

			//String cikarilacak=terim1.substring(sayi6.length()+sayi4.length()-2,z);
			return sayi10%sayi7;}
 public static void main(String[] args) {


	int sayi3=mod("1309%10+278");
	String f=sayi3+"";
	int sayi5=integerDondur(f);
	System.out.println(sayi3);

	
}
}
