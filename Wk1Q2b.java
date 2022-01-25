import java.util.Scanner;

public class Wk1Q2b {
    public static void main(String[] args){

        System.out.println("Please enter a module: ");
        Scanner sc = new Scanner(System.in);

        String module1 = sc.nextLine();

        //String module = "CSC1008";   
        switch(module1)   
        {   
            case "CSC1006":   
                System.out.println("CSC1006 - Mathematics 2"); 
                break;   
            case "CSC1007":   
                System.out.println("CSC1007 - Operaeting Systems"); 
                break;   
            case "CSC1008":   
                System.out.println("CSC1008 - Data Structures and Algorithms"); 
                break;   
            case "CSC1009":   
                System.out.println("CSC1009 - Object Oriented Programming"); 
                break;   
            default:    
                System.out.println("Unknown Module"); 
                break;   
        }   
        System.out.println("After switch"); 

        sc.close();
    }
}
