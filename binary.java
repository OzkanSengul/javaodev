package Odev2;



class Binary {
	public String s;
	
	public Binary s1;
	public String s3;
	
	
	public Binary (String s) {
		this.s=s;		
		}


	public Binary add(Binary d2) {
		
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
			if (toplam>=2) {
				elde=1;
				toplam = toplam - 2;
			}
			else {
				elde=0;
			}
			resultString = toplam + resultString;
		}
		
		if (elde>0) {
			
			resultString = elde + resultString;
		}
		Binary result = new Binary(resultString);
		
		return result;
	}
}

