/*
Metotların Aşırı Yüklenmesi Kutu Alan ve Hacmini Hesaplama Uygulaması 
en,boy,kalınlık gibi değerlerin verildiği  iki metot içerisinde alan ve hacminin hesaplanıp 
ekrana yazdırıldığı  bir overloading uygulamasıdır.
*/

package finaluyg3;

/**
 *
 * @author Bora
 */
public class FinalUyg3 {

   public void kutu(int en ,int boy)//kutu adında 2 parametreli metot oluşturdum.
   {
       System.out.println("En: "+en);//Ekrana en değerini yazdırdım.
       System.out.println("Boy: "+boy);//Ekrana boy değerini yazdırdım.
       System.out.println("Alan: "+(en*boy));//Ekrana alan değerini hesaplatıp değerini yazdırdım.
   }
   public void kutu(int en ,int boy,int kalinlik)//kutu adında 3 parametreli metot oluşturdum.
   {
       System.out.println("En: "+en);//Ekrana en değerini yazdırdım.
       System.out.println("Boy: "+boy);//Ekrana boy değerini yazdırdım.
       System.out.println("Kalınlık: "+kalinlik);//Ekrana kalınlık değerini yazdırdım.
       System.out.println("Hacim: "+(en*boy*kalinlik));//Ekrana hacim değerini hesaplatıp yazdırdım.
   }
    public static void main(String[] args) {
        FinalUyg3 nesne =new FinalUyg3();//nesne adında nesne oluşturduk.
        nesne.kutu(5,10);//1. metouma parametre değerlerini verdim.
        System.out.println("-----------------");
        nesne.kutu(5, 10,5);//2. metouma parametre değerlerini verdim.
    }
    
}
