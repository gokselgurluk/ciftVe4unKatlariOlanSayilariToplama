import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int number ,sum=0 ;// sum genel toplam için tanımlana degişken
                            //number kullanıcıdan alınacak olan girdi için tanımlanan değişken
            Scanner userInput =new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz");// kulanıcıdan bir degişken alıyoruz
            number=userInput.nextInt();

            if(number % 2 == 0 && number % 4 == 0){// bu sayının çift ve 4 un katı mı kontrol edıyoruz
                sum += number;                     //   şart saglanıyorsa gırılen sayıyı sum degişkenine topalyıp atıyoruz
               }
        }while (number % 2 == 0);// sayı tek girilene kadar döngunun donmesını istiyoruz

            System.out.println("çift ve 4'ün katları olan sayıların toplamı \n"+sum);
            //sayi tek girildigin de toplamı ekrana bastırıp kullanıcıyı bilgilendirmiş oluyorz


    }
}