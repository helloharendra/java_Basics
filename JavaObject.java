class Display{ // creating the class 
    void Print(){ //creating funtion/method that is none parameterised 
        System.out.println("hello guys, this is first object Example"); //print message
    }
    
}
public class JavaObject { //creating public class
   public static void main(String[] args) { // creating main method
    Display dis=new Display(); //creating object of the Display class
    dis.Print(); //calling the print function
   }
}
