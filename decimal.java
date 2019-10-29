package Odev2;

public class Decimal {
	
	String s = "";
	
	public Decimal(String decimalString) {
		this.s = decimalString;
	}
	
	public Decimal add(Decimal d2) {
		
		int length = 0;
		
		if (this.s.length() > d2.s.length()) {
			length = this.s.length();
		}
		else {
			length = d2.s.length();
		}
		
		String resultString ="";
		int elde=0;
		
		for(int i=1;i <= length;i++) {
			int s1 = 0;
			int s2 = 0;
			if(this.s.length()-i >= 0) {
				s1=this.s.charAt(this.s.length()-i)-'0';
			}
			if(d2.s.length()-i >= 0) {
				s2=d2.s.charAt(d2.s.length()-i)-'0';
			}
			int toplam=s1+s2+elde;
			if (toplam>=10) {
				elde=1;
				toplam = toplam - 10;
			}
			else {
				elde=0;
			}
			resultString = toplam + resultString;
		}
		
		if (elde>0) {
			
			resultString = elde + resultString;
		}
		Decimal result = new Decimal(resultString);
		
		return result;
	}
		
	public Decimal subtract (Decimal d2) {
		

		int length = 0;
		int flag=0;
	
		if (this.s.length() == d2.s.length() && ((this.s.charAt(0)-'0')<(d2.s.charAt(0)-'0'))) {
			length = d2.s.length();
			String t = this.s; 
	        this.s = d2.s; 
	        d2.s = t; 
			flag=1;
		}else if (this.s.length() > d2.s.length()) {
			length = this.s.length();
			
		}else {
			length = d2.s.length();
			String t = this.s; 
	        this.s = d2.s; 
	        d2.s = t; 
			flag=1;
		}
		
		String resultString ="";
		int elde=0;
		
		for(int i=1;i <= length;i++) {
			int s1 = 0;
			int s2 = 0;
			if(this.s.length()-i >= 0) {
				s1=this.s.charAt(this.s.length()-i)-'0';
			}
			if(d2.s.length()-i >= 0) {
				s2=d2.s.charAt(d2.s.length()-i)-'0';
			}
			
			int cikarma=s1-s2-elde;
			
			if (cikarma<0) {
				
				
				cikarma=cikarma+10;
				elde=1;
				resultString=cikarma+resultString;
			}
			else {elde=0;
			resultString=cikarma+resultString;
				
			}
			
			
		
			
			}
		
		if (flag==1) {
			resultString="-"+resultString;
		}
	
		Decimal result = new Decimal(resultString);


return result;}
	
	
	
	
	
	
	
	
	
	
	
	public Decimal multiply(Decimal d2) {
		
		String resultString ="";
		//String resultString1="";
		
		int len1 = this.s.length(); 
	    int len2 = d2.s.length(); 
	    
		if (len1 == 0 || len2 == 0) { 
			
			Decimal result = new Decimal(resultString);
			
			resultString="0";
			
	        return result; }
		
		int length = 0;
		
		
		int elde=0;
		
		if (len2 > len1) {
			String t = this.s; 
	        this.s = d2.s; 
	        d2.s = t;
			length = len1;
		}
		else {
			length = len2;
		}
		if (len1>len2) {
			int s1 = 0;
			int s2 = 0;
			
			String resultString1="";
			String sifir="";
			
			for(int i=1;i <= len2;i++) {
				
				String resultString0 ="";
				
				for (int j = 1; j <= len1; j++) {
					
					if(this.s.length()-j >= 0) {
						s1=this.s.charAt(this.s.length()-j)-'0';
						}
					
						
						s2=d2.s.charAt(d2.s.length()-i)-'0';
					
					
					int carpma=s1*s2+elde;
					elde=carpma/10;
					
				//	for (int k = 0; k < j; k++) {
						
					//}
					resultString0 = carpma%10 + resultString0;
					}
					
				
				
				resultString1 = resultString0 +sifir;
				sifir=sifir+"0";

				
					}
			
					}
		
Decimal result = new Decimal(resultString);
		
		return result;}

}

			







