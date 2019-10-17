import java.util.Scanner;
public class calculator{

		public double integerDondur(String terim){

					for(int a=1;a<terim.length();a++){
						double sayi=((int)terim.charAt(a)-'0') * Math.pow(10,((int)terim.length()-a-1));
		





		}






}



public static void main(String[] args) {
Scanner k= new Scanner (System.in);
System.out.println("Hesaplamami istedigin ifadeyi giriniz");
String Girdi=k.nextLine();
	
int toplama=(int) '+';
int cikarma=(int) '-';
int carpma =(int) '*';
int bolme =(int) '/';
int mod = (int) '%';
int solparantez=(int) '(';
int sagparantez=(int) ')';
int num1=0;
int num2=0;
int ascii = (int) '0';
//System.out.println(toplama );
//System.out.println(cikarma );
//System.out.println(carpma);
//System.out.println(bolme);
//System.out.println(mod);
//System.out.println(solparantez);
//System.out.println(sagparantez);
//System.out.println(ascii);


//int tmp=0
//	carpma = (int) Girdi.indexOf('*');
//	bolme = (int) Girdi.indexOf('/');
//	mod = (int) Girdi.indexOf('%');
//	toplama = (int) Girdi.indexOf('+');
//	cikarma = (int) Girdi.indexOf('-');
//	acma =(int)	Girdi.indexof('(');
//	kapama=(int)Girdi.indexof(')');*/

	for (int i=0;i<Girdi.length();i++ ){
		//System.out.println((int)Girdi.charAt(i));
		//System.out.println(Girdi.substring(i+2,i+3));

		if ((int)Girdi.charAt(i) == solparantez) {
			for (int j=1;j<5;j++){
				

				if (Girdi.charAt(i+j)!='+' && Girdi.charAt(i+j)!='*')
					{
			
					String str = ""+Girdi.charAt(i+j);
					double str1 =integerDondur(str);

					System.out.print(str1);
					
					//sayi1 +=(((int)Girdi.charAt(i+j+1)-'0')* Math.pow(10,j));
					//System.out.println(sayi1);
					//double str1 =integerDondur(str);
				}
					//for (int l=0;l<10;l++) {
					 //	if((int)Girdi.charAt(i+j+l)!=(int) '+' && (int)Girdi.charAt(i+j)!=(int) '-' && (int)Girdi.charAt(i+j)!=(int) '*' && (int)Girdi.charAt(i+j)!=(int) '/' && (int)Girdi.charAt(i+j)!=(int) '%' && (int)Girdi.charAt(i+j)!=(int) ')') {
							
					
					
				}
			
		//		}
		//		}

		//		}
	

		 //&& Girdi.indexOf('+')==i+2){

			//System.out.println(Girdi.substring(i+2,i+3));

		//	System.out.println(((int)Girdi.charAt(i+1)+(int)Girdi.charAt(i+3))-2*ascii);}

		//	else if ((int)Girdi.charAt(i) == solparantez && Girdi.indexOf('-')==i+2){

		//	System.out.println(((int)Girdi.charAt(i+1)-ascii)-((int)Girdi.charAt(i+3)-ascii));
		//	System.out.println(Girdi.charAt(i+1));
		//	System.out.println(Girdi.charAt(i+1));

			//}
				

		//	System.out.println(Girdi.substring(i,i+1));
				
	
		//int b=(int) Girdi.charAt(i);
			
				 		
				 



//				  else if ((int)Girdi.charAt(i) == solparantez&&Girdi.charAt(i+2)=='-')
				// System.out.println((int)Girdi.charAt(i+1));
				 //System.out.println((int)Girdi.charAt(i+3));
//				 	System.out.println((int)Girdi.charAt(i+1)-ascii - (int)Girdi.charAt(i+2)-ascii);
				 	//System.out.println((int)Girdi.charAt(i+2));



				//System.out.println(d+f);//Girdi.indexof(i)



		}

		//Girdi.substring(Girdi.indexOf('*');
	//int ascii = (int) '0';
	//int b;
    //calculate without sign
	//char c = Girdi.charAt(i);
		//	if (c==(int)'-'){
		//		for(int j=0;j<i;j++ ){
		//		b=(int)Girdi.charAt(i);
		//		int sag


}
		
	}
}
		//System.out.println(b-ascii);
            //if (c >= '0' && c <= '9') {
              //  num1 = num1 * 10 + (c - '0');
           // } else break; // break when not a digit
			//i++;
		//System.out.println(num1);	

		//char a =Girdi.charAt(i);
	

 		//	if (carpma !=0){
 				
 		//		while (i<Girdi.substring(Girdi.indexOf('*'),Girdi.indexOf('*')).length()){
		//		num1*=10;
		//		num1+=Girdi.charAt(i++) - ascii; 				}
		//		while(){


				//}
				//return num;



 				//	for(i =Girdi.substring(0,Girdi.indexOf('*')).length() -1;i>= 0;i--){
 				//int carpmasayi1=Girdi.charAt(((int) Girdi.indexOf('*') - 1));

 				//carpmasayi1 =(carpmasayi1 -ascii)*num;

 		//	System.out.println(num1);
 			//int carpmasayi2=Girdi.charAt(((int) Girdi.indexOf('*') + 1));
 			//carpmasayi2 =(carpmasayi2 - ascii) *num;
 			//num*=10;
 			//System.out.println(carpmasayi2);
 		 //System.out.println(carpma =carpmasayi1 * carpmasayi2);
 		// System.out.println(carpmasayi2);






 
	
	
	




	 

	//System.out.println( carpma ); 
	//System.out.println( bolme );
	//System.out.println( mod );
	//System.out.println( toplama );   
	//System.out.println( cikarma ); 

	

//System.out.println (Girdi.length());





/*if (Girdi.charAt(i)=='+'){

		


		cas
		Girdi.substring(0,i)+Girdi.substring(i+1,st.length);
String st = "10+3";
int result;
for(int i=0;i<st.length();i++)
{
  if(st.charAt(i)=='+')
  {
    result=Integer.parseInt(st.substring(0, i))+Integer.parseInt(st.substring(i+1, st.length()));
    System.out.print(result);
  }         
}

}
	

}*/
