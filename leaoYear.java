import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class leaoYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year that you want to check");
        int year = sc.nextInt();
        if( year%4==0 ){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.print("not a leap year");
                }
            }else{
                System.out.println("Leap year");


            }

        }else{
            System.out.println(" Not Leap year");

        }sc.close();
    }
    
}
