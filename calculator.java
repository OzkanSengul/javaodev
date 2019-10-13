import java.util.Scanner;
public class calculator{

public static void main(String[] args) {
Scanner k= new Scanner (System.in);
System.out.println("Hesaplamami istedigin ifadeyi giriniz");
String Girdi=k.nextLine();
int num1=0;
/*int carpma =0;
int bolme =0;
int mod = 0;
int toplama=0;
int cikarma=0;
int num1=0;
int num2=0;
int ascii = (int) '0';
	carpma = (int) Girdi.indexOf('*');
	bolme = (int) Girdi.indexOf('/');
	mod = (int) Girdi.indexOf('%');
	toplama = (int) Girdi.indexOf('+');
	cikarma = (int) Girdi.indexOf('-');
	acma =(int)	Girdi.indexof('(');
	kapama=(int)Girdi.indexof(')');

	for (int i=0;i<Girdi.length();i++ ){
		Girdi.substring(Girdi.indexOf('*')*/


		
		int i = 0;
        while (i < Girdi.length()) { // calculate without sign
            char c = Girdi.charAt(i);
            if (c >= '0' && c <= '9') {
                num1 = num1 * 10 + (c - '0');
            } else break; // break when not a digit
			i++;
		System.out.println(num1);	

		//char a =Girdi.charAt(i);
	

 		//	if (carpma !=0){
 				
 		//		while (i<Girdi.substring(Girdi.indexOf('*'),Girdi.indexOf('*')).length()){
		//		num1*=10;
		//		num1+=Girdi.charAt(i++) - ascii; 				}
		//		while(){


				}
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






 
	
	
	




	} }

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
