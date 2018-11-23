//Program public class CondoSales2, Lab 6
//Written by Alec Narkizian
//created on 7.4,2017
//Tells you the price of the condo you want
//You can add a garage or a parking sot for an additional fee
//Invalid input will give error 
import java.util.Scanner;
public class CondoSales2 {
   public void Condo(int number, int numberAsk)
   {
   //switch ststement for all senarios
      switch(number)
      {
      //the plan for park view
         case 1:
               if (numberAsk == 1)
                  System.out.println("You chose the Park view with the garage for $155,000, enjoy ;)");
               else if(numberAsk == 2)
                  System.out.println("You chose the Park view with the parking space for $155,000, enjoy ;)");
               else if (numberAsk == 3)
                  System.out.println("You chose the Park view for $150,000, enjoy ;)");
               else
                  System.out.println("Invalid reply, the price of your Park view is $150,000 ");
               break; 
                 
         case 2:
         //the plan for golf view
               if (numberAsk == 1)                  
                System.out.println("You chose the golf view with the garge for $175,000, enjoy ;)");
               else if (numberAsk == 2)
                  System.out.println(" You chose the golf view with the parking space for $175,000, enjoy ;)");
               else if (numberAsk == 3)
                  System.out.println(" You chose the golf view for $170,000, enjoy ;)");
               else
                  System.out.println(" Invalid input the price of your golf view is $170,000");
                break;
         case 3:
         //the plan for lake view
               if (numberAsk == 1)    
                  System.out.println(" You chose the lake view with which has no parking space, your total is $210,000, enjoy ;)");
               else if ( numberAsk == 2)
                  System.out.println(" You chose the lake view which has no garage your price is $210,000, enjoy ;)");
               else if ( numberAsk == 3)
                  System.out.println(" You chose the lake view for $210,000, enjoy ;)");
               else
                  System.out.println(" Invalid reply, the price of your lake view condo is $210,000");
                break;
         default:
                 //if the input is invalid 
                  System.out.println(" Invalid reply, the price is $0"); 
                  break;     
               } 
        }        
}