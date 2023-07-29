package atm_project;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.w3c.dom.ls.LSOutput;

public class atm_project {

public static void main(String[] args) {
String islemSecenekleri = "Bakiye Görüntüleme-->1 " + " Para çekme-->2 " + " Transfer-->3 " + " çıkış-->q";
String tarikIban = "34343334223232323";
String kullaniciTarik = "tarik6161";
String kullaniciSifreTarik = "trk232534";
int tarikBakiye = 2750;
//System.out.println("bakiyeniz :" + tarikBakiye);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ATM ye Hosş Geldiniz...");
		System.out.print("Kullanıcı adınızı ve şifrenizi giriniz...");
		String kullaniciAdi = scanner.nextLine();
		System.out.print("Şifrenizi Giriniz...");
		String kullanicisifre = scanner.nextLine();
		if (kullaniciAdi.equals("tarik6161") && kullanicisifre.equals("trk232534")) { 
				System.out.println("Sayın "+ kullaniciAdi + " Hoş Geldiniz ");
				System.out.println(islemSecenekleri);
				System.out.print("lütfen yapmak istediğiniz işlemi Giriniz...!");
				String komut = scanner.nextLine();
				
				switch (komut)
				{
					case "1": 
						System.out.println("Bakiyeniz 2750 TL dir");
				        break;
					case "2": 
						System.out.println("lütfen Para çekmek istediğiniz tutarı Giriniz");
						int cekilenTutar = scanner.nextInt();
						int kalanBakiye=tarikBakiye-cekilenTutar;
						if (cekilenTutar>=tarikBakiye)
						{
							System.out.println("Yetersiz Bakiye..! ");
							break;
						}
						else {
								System.out.println("para çekme işleminiz başarıyla gerçekleştirildi");
							}
						
				
						System.out.println("Kalan Bakiyeniz " + kalanBakiye + " TL dir");
						break;
						
					case "3": 
						System.out.println("lütfen Iban numarasını girin");
						 String iban = scanner.nextLine();
						 if (iban.equals(tarikIban))
							 {
							 System.out.println("tarık şentürk hesabına");
							 }
						 else{
							 System.out.println("hesap numarasını yanlış girdiniz..!");
						   }
						System.out.println("lütfen gönderim miktarını giriniz");
						int gonderi = scanner.nextInt();
						
						     if (gonderi>=tarikBakiye)
						   {
							System.out.println("Yetersiz Bakiye..! ");
							break;
						   }
						     else {
								System.out.println("para gönderme işleminiz başarıyla gerçekleştirildi");
							}			
									
						int GerikalanBakiye = tarikBakiye-gonderi;
						System.out.println("Kalan Bakiyeniz " + GerikalanBakiye + " TL dir");
					
				}
			
		}
		else {
			System.out.println("Kullanıcı Adınız veya Şifreniz hatalıdır...! ");
		}
				
	}

}
