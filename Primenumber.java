public class Primenumber{
    Primenumber(){
        int num=17;
     int temp=0;
     for(int i=2;i<=num-1;i++){
        if(num%i==0){
            temp=temp+1;
        }
     }if(temp >0){
        System.out.println("number is not prime");
     }else{
        System.out.println("number is  prime");
     }
    }

    public static void main(String[] args) {
        new Primenumber();
    }

     
}
