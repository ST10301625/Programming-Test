/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_question_2;

/**
 *
 * @author totca
 */
public class EstateAgentSales extends EstateAgent{

    public EstateAgentSales(String sName, double price) {
        
        super(sName,price);
    }
    public void printPropertyReport(){
        
        // Generating the Agent Report
        System.out.println("\n*************************************");
        System.out.println("Estate Agent Report: ");
        System.out.println("*************************************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R" + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R" + getAgentCommission()); 
    }
}

    

