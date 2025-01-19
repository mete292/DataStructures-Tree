package agacyapisiagac;

import java.io.FileOutputStream;

public class anasinif {
	int deger;
	anasinif(int deger) {
	}{
		this.deger=deger;
	}
	
	public static void main(String[] args) {
		dugum kok =new dugum(50);
		//dugum sag=new Dugum(200);
		kok.ekle(40);
		
		kok.ekle(45);
		kok.ekle(47);
		kok.ekle(60);
		kok.ekle(70);
		kok.ekle(80);
		kok.ekle(65);
		kok.ekle(77);
		kok.onceGezin();
		kok.silme(kok, 70);
		

		
	
		//System.out.println(kok.sol.sol.deger);
		kok.onceGezin();  
	
		
		

		
	}
}
//n e kadar olan sayıların toplamını rekürsif olarak bulun