import java.util.Scanner;

public class crush{
    crush(){
        Scanner sc=new Scanner(System.in);
    System.out.println("\n\t\t Praposal");
     System.out.println("hey.. I like you");
     System.out.println("Do you like me,If yes press y else press n");
     String ans=sc.next();
    if(ans.equals("y")){
       for(int i=0;i<=1000;i++){
         System.out.println(" \t I ❤️ You ");
       }
    }else{
        System.out.println("I will try again  😍 still you will fall in love with me\n");
    }
    }
public static void main(String[] args) {
    new crush();
}
}