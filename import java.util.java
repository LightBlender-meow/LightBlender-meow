import java.util.Scanner;

class SimpleCalculator
{
    public static void main (String[] args)
    
    {
        Scanner myObj = new Scanner (System.in);
        System.out.println("              Welcome to Simple Calculator!");
        System.out.println("Select one of four numbers for calculation");
        System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
        int x = myObj.nextInt(); 
        int calculation = x;
        switch (calculation)
        {
           case 1:
           System.out.println("Enter two numbers for Addition:");
           
            int a = myObj.nextInt();
            int b = myObj.nextInt();
           System.out.println("Additon = "+ (a+b));
               break;
            
               case 2:
            System.out.println("Enter two numbers for Substraction:");
           
            int c = myObj.nextInt();
            int d = myObj.nextInt();
           System.out.println("Substraction = "+ (c-d));
               break;
             
             case 3:
             System.out.println("Enter two numbers for Multiplication:");
           
            int e = myObj.nextInt();
            int f = myObj.nextInt();
           System.out.println("Multiplication = "+ (e*f));
               break;  
            
              case 4:
              System.out.println("Enter two numbers for Division:");
           
            int g = myObj.nextInt();
            int h = myObj.nextInt();
           System.out.println("Division = "+ (g/h));
               break; 
          
       }
        System.out.println("                  Thank You!");
    
    
    

    
    } 
}