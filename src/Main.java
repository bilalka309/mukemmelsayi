import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n= in.nextInt();
        int x=0;
        for(int i=1;n>i;i++){
            if(n%i==0){
               x+=i;
            }
        }
        if(n==x){
            System.out.println(n+" Mükemmel sayıdır.");
        }else {
            System.out.println(n+" Mükemmel sayı değildir. ");
        }
    }
}