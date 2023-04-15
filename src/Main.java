import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,basamakSayisi =0,numberCounter=0,total = 0, result =0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        a= input.nextInt();

        while (a!=0){
            int basValue = a%10;
            result += basValue;
            a = a/10;
            numberCounter++;
        }
        System.out.print("Basamak Sayıları Toplamı :" + result);
        //System.out.println("Basamak Sayısı :" + numberCounter);


    }
}