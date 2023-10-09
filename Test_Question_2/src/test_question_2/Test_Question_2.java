
package test_question_2;

import java.util.Scanner;




public class Test_Question_2 {

    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        // Asks for the estate agent's name
        System.out.print("Enter the estate agent's name: ");
        String agentName = scanner.nextLine(); 
        // Asks for the property price
        System.out.print("Enter the property price: ");
        double propertyPrice = scanner.nextDouble();       
        EstateAgentSales ea = new EstateAgentSales(agentName,propertyPrice);
        ea.printPropertyReport();
        scanner.close(); 
    } 
}
  

