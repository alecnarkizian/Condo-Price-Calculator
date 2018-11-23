//Program public Test, Lab 6
//Written by Alec Narkizian
//created on 7.4,2017
//Tests the methods of CondoSales 2  class
import java.util.Scanner;
public class Test{
      public static void main(String[] args){
      //scanner that asks what the user wants
               Scanner num = new Scanner(System.in);
               System.out.println("What kind of condominium would you like to purchase, Press 1 if you would like a Park view for $150,000, press 2 for a Golf course view for $170,000 or press 3 for a Lake view for $210,000"); 
               int number = num.nextInt();
               Scanner num2 = new Scanner(System.in);
               //consition to verifuy valid input
               if(number > 0 && number < 4)
                 { System.out.println("If you want a garage or a parking space for an additional $5,000 each then press 1 for the garage and 2 for the parking spot and 3 for neither.");
                  int numberAsk = num2.nextInt();
                  //calling the class 
                  CondoSales2 number2 = new CondoSales2();
                  //calling the method 
                  number2.Condo(number, numberAsk);}
                else
                  System.out.println("Invalid input, the price of your condo is $0");          
               }
               
            }