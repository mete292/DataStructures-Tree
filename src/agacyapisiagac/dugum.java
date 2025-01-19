package agacyapisiagac;


public class dugum {
	

	

		dugum sag;
		dugum sol;
		int deger;
		dugum(int deger){
			sag=null;
			sol=null;
			this.deger=deger;
			
			
		}

			
		
		void onceGezin() {
			System.out.println(this.deger);
			if(sol!=null) {
				sol.onceGezin();
			}
			if (sag!=null) {
				sag.onceGezin();
			}
			
		}

		
		dugum min(dugum dg) {
			dugum temp=dg;
			while(temp.sol!=null) {
				temp=temp.sol;
				}
			return temp;	
		}
		void ekle(int yeni) {
			if (deger<yeni) {
				//sağa ekleme yapılacak
				if(sag==null) {
					//eklenecek yer bulundu
					sag=new dugum(yeni);
					
				}else {
					//dugum soluna ekleyemez eklemeyi sol elemanına devretmeli
					sag.ekle(yeni);
				}
				
			}else {
				//sola ekleme yapılacak 
				if(sol==null) {
					//eklenecek yer bulundu
					sol=new dugum(yeni);
					
				}else {
					//dugum soluna ekleyemez eklemeyi sol elemanına devretmeli
					sol.ekle(yeni);
					
					
				}
			}
		}
		dugum ara(int aranan) {
			if (deger==aranan) {
				return this;
			}
			if (aranan>deger) {
				if (sag!=null) {
					return sag.ara(aranan);
				}else;
				return null;
				
			}
			else {
				if (sol!=null) {
					return sol.ara(aranan);
				}else;
				return null;
			}
		}

	
	void silme(dugum ebeveyn,int sildeger) {
		if (deger==sildeger) {
	
			System.out.println("silinecek degerin ebeveyni"+ebeveyn.deger);
			System.out.println("silinecek deger bulundu"+deger);
			if ((sag==null)&&(sol==null)) {
				System.out.println("silinecek eleman yaprak elemandır");
				if (this==ebeveyn.sag) {
					ebeveyn.sag=null;
					return;
					
				}
				else {
					ebeveyn.sol=null;
					return;
				}
				
			}
			
			
			else if ((sag==null)&&(sol!=null)) {
			System.out.println("silinecek eleman tek sol cocuklu");
			if (ebeveyn.sol==this) {
				ebeveyn.sol=this.sol;
				}
			else {
				ebeveyn.sag=this.sol;
			}
				
			}
			
			
		
		else if ((sag!=null)&&(sol==null)) {
			System.out.println("silinecek eleman tek sag cocuklu");
			if (ebeveyn.sag==this) {
				ebeveyn.sag=this.sag;
			}else {
				ebeveyn.sol=this.sag;
			}
		}
		else if ((sag!=null)&&sol!=null) {
			System.out.println("2 cocuklu bi dugum");
			dugum silinecekyaprakdugum=min(sag);
			System.out.println("silinecek yaprak dugumun degeri: "+silinecekyaprakdugum.deger);
			deger=silinecekyaprakdugum.deger;
			sag.silme(this,deger);
			
			
		}
			}
		 else if (deger>sildeger) {
			 if (sol==null) {
				 System.out.println("son aranan deger"+this.deger);
				 System.out.println("silinecek deger bulunamadi");
				 return ;
				}else {
					
				
			 sol.silme(this,sildeger);
				}
			
		}
		 else if (deger<sildeger) {
			 if (sag==null) {
				 System.out.println("silinecek deger bulunamamistir");
				 return;
			}else {
				
			
			sag.silme(this,sildeger);
			} 
			
		}
		
	}


	public static void main(String[] args) {

	}

}
