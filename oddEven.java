class firstClass{
    void odeve(){
        int num=3;
        if (num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is not even");
        }
    }
}
public class oddEven {
    public static void main(String[] args) {
        firstClass od=new firstClass();
        od.odeve();
    }
}
