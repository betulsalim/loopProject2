import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    int sayi,i,sum=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Sayı giriniz: ");
    sayi = input.nextInt();

    for(i=0;i<=sayi;i++){
        if(i%4==0){
            sum=sum+i;
        }

        }
    System.out.println("Toplam: "+sum);
    }

}
