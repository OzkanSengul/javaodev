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
	
		for(int i=0;i <= this.s.length();i++) {
			if (this.s.charAt(0) == '0') {
				this.s = this.s.substring(i+1);
			}
			else {
				break;
			}			
		}
		
		for(int i=0;i <= d2.s.length();i++) {
			if (d2.s.charAt(0) == '0') {
				d2.s = d2.s.substring(i+1);
			}
			else {
				break;
			}			
		}
		
		
		if (this.s.length() == d2.s.length() && ((this.s.charAt(0)-'0')<(d2.s.charAt(0)-'0'))) {
			length = d2.s.length();
			String t = this.s; 
	        this.s = d2.s; 
	        d2.s = t; 
			flag=1;
		}else if (this.s.length() >= d2.s.length()) {
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
		
		String tmpstr = ""; 
		tmpstr = this.s;
		
		for(int i=1;i <= length;i++) {
			int s1 = 0;
			int s2 = 0;
			
			if(tmpstr.length()-i >= 0) {
				s1=tmpstr.charAt(tmpstr.length()-i)-'0';
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
			
			
			//tmpstr=resultString;
			
		}
		
		if (flag==1) {
			resultString="-"+resultString;
		}
	
		Decimal result = new Decimal(resultString);


return result;}
	
	
	
	public Decimal multiply(Decimal d2) {
		
		String resultString ="";
		
		Decimal result22 = new Decimal("");
		
		int len1 = this.s.length(); 
	    int len2 = d2.s.length(); 
	    
	    
	   
		String sifir="";
		
	    
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
		if (len1>=len2) {
			int s1 = 0;
			int s2 = 0;
			
			
			
			Decimal result1=new Decimal ("");
			
			
			
			for(int i=1;i <= len2;i++) {
				
				String resultString0 ="";
				
				for (int j = 1; j <= len1; j++) {
					
					
					if(this.s.length()-i >= 0) {
						s1=this.s.charAt(this.s.length()-j)-'0';
						}
					
						
						s2=d2.s.charAt(d2.s.length()-i)-'0';
					
					
					int carpma=s1*s2+elde;
					elde=carpma/10;
					
			
					resultString0 = carpma%10 + resultString0;
					
				
				
				}
					
				
				
				resultString0 = resultString0 +sifir;
				
				
				sifir=sifir+"0";
				
				
				result1.s=resultString0;
				
				result22=result22.add(result1);
				
				
			}
			
				
			
			
			
			}
		
		
		return result22;}




	public Decimal divide (Decimal d2) {
		

		int length = 0;
		int count=0;
		boolean kontrol=true;
		String resultString ="";
		
		while ( (this.s.length()>=d2.s.length()) ) {
			
			Decimal bolunen = new Decimal(this.s);
			Decimal bolen=new Decimal(d2.s);
			Decimal result=new Decimal ((bolunen.subtract(bolen)).s);
			
			if (result.s.charAt(0) == '-') {
				break;
			}
			
			this.s=result.s;
			length=this.s.length();
			count++;
			
			//if (result.s.charAt(0) == '0') {
				
				//break;
			//}
		}
	
		Decimal count1 =new Decimal (""+count);	
		return count1;
		}
	
	public void Display() {
		System.out.println(this.s);
	}
}

