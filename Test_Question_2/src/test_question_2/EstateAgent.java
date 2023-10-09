/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_question_2;


public abstract class EstateAgent implements iEstateAgent{
   
    private String sAgentName;
    private double dbPropertySale;
    
    public EstateAgent(String sName, double price){
        sAgentName = sName;
        dbPropertySale = price;
    }
   
    //Method to get Agents Name
    public String getAgentName(){
        return sAgentName;
    }
    
    //Method to get the price of the property
    public double getPropertyPrice(){
        return dbPropertySale;
    }
    
    //Method to calculate agents commssion
    public double getAgentCommission(){
        return dbPropertySale * 0.20;
    }
}

    

