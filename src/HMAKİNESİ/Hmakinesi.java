package HMAKÝNESÝ;
import java.util.Scanner;
public class Hmakinesi {
	public static void main(String[] args) {
		double sayi1,sayi2,sonuc,toplama,cikarma,bolme,carpma;
	      int secim;
	      do{
	          Menu();
	          secim=MenuDegerAl();
	          switch (secim){
	              case 1:
	                  sayi1 = OndalikSayiAl();
	                  sayi2 = OndalikSayiAl();
	                  toplama = Topla(sayi1, sayi2);
	                  System.out.println("Sonuc : "+toplama);
	                  break;
	              case 2:
	                  sayi1 = OndalikSayiAl();
	                  sayi2 = OndalikSayiAl();
	                  cikarma = Cikar(sayi1, sayi2);
	                  System.out.println("Sonuc : "+cikarma);
	                  break;
	              case 3:
	                  sayi1 = OndalikSayiAl();
	                  sayi2 = OndalikSayiAl();
	                  carpma = Carp(sayi1, sayi2);
	                  System.out.println("Sonuc : "+carpma);
	                  break;
	              case 4:
	                  sayi1 = OndalikSayiAl();
	                  sayi2 = OndalikSayiAl();
	                  bolme = Bol(sayi1, sayi2);
	                  System.out.println("Sonuc : "+bolme);
	                  break;
	              case 5:
	            	  int sayi=IntDegerAl();
	            	  sonuc=FaktoriyelAl(sayi);
	            	  System.out.println("Sonuc : "+sonuc);
	            	  break;
	          }
	      }while(secim!=5);
	    }
	    public static void Menu(){
	        System.out.println("1-Toplama"+
	                "2-Cikarma"+
	                "3-Carpma"+
	                "4-Bolme"+
	                "5-Faktoriyel");
	    }
	    public static int MenuDegerAl(){
	        Scanner input = new Scanner(System.in);
	        int sayi;
	        System.out.println("Ýslemi girin :");
	        sayi=input.nextInt();
	        while(sayi<1 || sayi>7){
	            System.out.println("\nMenüden sayi giriniz...");
	        }
	        return sayi;
	    }
	    public static double OndalikSayiAl(){
	        Scanner veri = new Scanner(System.in);
	        double sayi;
	        System.out.println("Sayiyi giriniz :");
	        return sayi=veri.nextInt();
	        
	    }
	    public static double Topla(double num1,double num2){
	        return num1+num2;
	    }
	    public static double Cikar(double num1,double num2){
	        return num1-num2;
	    }
	    public static double Carp(double num1,double num2){
	        return num1*num2;
	    }
	    public static double Bol(double num1,double num2){
	        return num1/num2;
	    }
	    public static int IntDegerAl(){
	    	Scanner veri = new Scanner(System.in);
	    	int sayi;
	    	System.out.println("Faktoriyeli alýnacak olan sayiyi girin :");
	    	sayi=veri.nextInt();
	    	return sayi;
	    }
	    public static int FaktoriyelAl(int num){
	    	int faktoriyel = 1;
			for (int i=1;i<=num;i++)
	    		faktoriyel*=i;
	    	return faktoriyel;
	    	
	    	
	    }

}

