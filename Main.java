import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz:");
        int number=input.nextInt();
        int tempNumber=number,basNumber=0,basValue,total=0;

        // basamak sayısı;
        while( tempNumber !=0 ){
            tempNumber /=10;
            basNumber++;
        }

        //number'ı tekrardan kullanacağımız için tempNumber geçici değişkenine atadık.
        tempNumber=number;

        //basamak değeri;
        while( tempNumber !=0){
            basValue= tempNumber % 10;
            total += basValue;
            tempNumber /=10;
        }
        System.out.println(number + " sayısının basamak sayıları toplamı " + total + "'dır.");
    }

}