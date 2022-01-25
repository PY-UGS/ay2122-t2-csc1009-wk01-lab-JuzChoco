import java.util.Scanner;

public class Main {

    public Scanner sc;
    public static void main(String[] args){
    System.out.println("Hello, I am Oliver");
    
    System.out.print("\n\n");

    String module = "CSC1008";   
        switch(module)   
        {   
            case "CSC1006":   
                System.out.println("CSC1006"); 
                break;   
            case "CSC1007":   
                System.out.println("CSC1007"); 
                break;   
            case "CSC1008":   
                System.out.println("CSC1008"); 
                break;   
            case "CSC1009":   
                System.out.println("CSC1009"); 
                break;   
            default:    
                System.out.println("Unknown Module"); 
                break;   
        }   
        System.out.println("After switch"); 


    System.out.print("\n\n\n");
    
    for (int x = 102; x >= 66; x--){

        if (x % 2 != 0){
        System.out.println("Value of x: " + x);
        }
    }

    sc = new Scanner(System.in);
    System.out.println("Please enter a byte value");
}

}