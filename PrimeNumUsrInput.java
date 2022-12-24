import java.util.Scanner;

public class PrimeNumUsrInput {
    PrimeNumUsrInput(){
       Scanner sc=new Scanner(System.in);
       System.out.println("please Enter a number");
       int num=sc.nextInt();
       int temp=0;
       for(int i=2; i<=num-1;i++){
        if(num%i==0){
            temp=temp+1;
        }
       } if(temp>0){
        System.out.println("not prime");
       }else{
        System.out.println(" prime");
       }
    }
    public static void main(String[] args) {
        new PrimeNumUsrInput();
        
    }
}
