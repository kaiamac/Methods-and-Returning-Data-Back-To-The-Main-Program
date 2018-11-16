/*
 * Kaia Mac
 * Methods and Returning Data Back To The Main Program
 * 2018-11-12
 */
package methodsandreturningdatabacktothemainprogram;
import java.util.Scanner;
/**
 * Performs many methods and returns data back to the main program.
 */
/**
 *
 * @author kaiat
 */
public class MethodsandReturningDataBackToTheMainProgram {
    // this needs JavaDoc comments
    // you need to return values from the methods you have written
    // i have added a return to the aveOfNums method below and modified the method call on line 246

    public static double aveOfNums (int ave1,int ave2,int ave3,int ave4,int ave5){
        double avetotal;
        avetotal = ave1 + ave2 + ave3 + ave4 + ave5;
        avetotal = avetotal/5;
        return avetotal;
//        System.out.println("the average of the numbers is: " + avetotal);
//        System.out.println("    ");   
    }
    
    public static double hypotOfTri (int hypot, int opp, int adj){
        opp = opp * opp;
        adj = adj * adj;
        hypot = opp + adj;
        return Math.sqrt(hypot);
//        System.out.println("The length of the hypotenuse is: " + Math.sqrt(hypot));
//        System.out.println("    ");
    }
    
    public static double sumOfNums (int sum1,int sum2,int sum3,int sum4,int sum5,int sumtotal){
        sumtotal = sum1 + sum2 + sum3 + sum4 + sum5;
        return sumtotal;
//        System.out.println("The sum of all numbers is: " + sumtotal);
//        System.out.println("    ");
    }
    
    public static double volOfPrism (int length,int width,int height,int volume){
        volume = length * width;
        volume = volume * height;
        return volume;
//        System.out.println("The volume of the prism is: " + volume);
//        System.out.println("    ");
    }
    
    public static void countOne (){
        for (int i = 0; i <= 10; i = i + 1)
            {
                System.out.println(i);
            }
    }
    
    public static void countTwo (){
        for (int i = 100; i >= 0; i = i - 10)
            {
                System.out.println(i);
            }
    }
    
    public static void countThree (){
        for (int i = 50; i <= 500; i = i + 50)
            {
                System.out.println(i);
            }      
    }
    
    public static void countFour (){
        for (int i = 6000; i >= 1000; i = i - 1000)
            {
                System.out.println(i);
            }      
    }
    
    public static double valOfNumSqrd (int sqrtnum){
        return Math.sqrt(sqrtnum);
//        System.out.println("The sqaure root of the number is: " + Math.sqrt(sqrtnum));
//        System.out.println("    ");
    }
    
    public static void valOfNumCbd (int cbdnum,int orignum){
        int i = 1;
        
            while(i <= 3){
                System.out.println(cbdnum);
                cbdnum = cbdnum * orignum;
                i = i + 1;
            }
    }
    
    public static void valofNumPow (int orignum,int pownum,int valnum){
        int i = 1;
            
                    while (i <= pownum)
                    {
                        System.out.println(valnum);
                        valnum = valnum*orignum;
                        i = i + 1;        
                    } 
    }
    
    public static double sinNum (int sinnum){
        return Math.sin(sinnum);
//        System.out.println("The sine of " + sinnum + " is: " + Math.sin(sinnum));
    }

    public static double cosNum (int cosnum){
        return Math.cos(cosnum);
//        System.out.println("The cosine of " + cosnum + " is: " + Math.cos(cosnum));    
    }

    public static double tanNum (int tannum){
        return Math.tan(tannum);
//        System.out.println("The tangant of " + tannum + " is: " + Math.tan(tannum));    
    }

    public static double degreesRadians (int degreenum){
        return Math.toRadians(degreenum);
//        System.out.println("The angle in degrees, in radians is: " + Math.toRadians(degreenum));    
    }

    public static double radiansDegrees (int radiannum){
        return Math.toDegrees(radiannum);
//        System.out.println("The angle in radians, in degrees is: " + Math.toDegrees(radiannum));    
    }
            
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        // initializing variables for each subroutine
        
        // choice on which subroutine to run
        int choice;
        
        //1… Find the average of five numbers.
        int ave1;
        int ave2;
        int ave3;
        int ave4;
        int ave5;
        int avetotal;
        
        //2… Find the hypotenuse of a right angle triangle.
        int adj;
        int opp;
        int hypot;
        
        //3… Find the sum of five numbers.
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        int sum5;
        int sumtotal;

        //4… Find the volume of a rectangular prism.
        int length;
        int width;
        int height;
        int volume;

        //9… Find the value of a number squared.
        int sqrtnum;
        
        //10… Find the value of a number cubed.
        int cbdnum;
        
        //orignum for valOfNumPow and valOfNumCbd
        int orignum;

        //11… Find the value of a number, to any power.
        int valnum;
        int pownum;
        
        //12… Find the trigonometric sine for an angle.
        int sinnum;

        //13… Find the trigonometric cosine for an angle.
        int cosnum;
        
        //14… Find the trigonometric tangent for an angle.
        int tannum;
        
        //15… Convert an angle in degrees to an angle in radians.
        int degreenum;
        
        //16… Convert an angle in radians to an angle in degrees.
        int radiannum;
        
        while (true){    
            System.out.println("---Methods and Returning Data Back To The Main Program---");
            System.out.println("    ");
        
            System.out.println("1… Find the average of five numbers.");
            System.out.println("2… Find the hypotenuse of a right angle triangle.");
            System.out.println("3… Find the sum of five numbers.");
            System.out.println("4… Find the volume of a rectangular prism.");
            System.out.println("5… Count from 0 to 10 by 1.");
            System.out.println("6… Count from 100 to 0 by 10.");
            System.out.println("7… Count from 50 to 500 by 50.");
            System.out.println("8… Count from 6000 to 1000 by 1000.");
            System.out.println("9… Find the value of a number squared.");
            System.out.println("10… Find the value of a number cubed.");
            System.out.println("11… Find the value of a number, to any power.");
            System.out.println("12… Find the trigonometric sine for an angle.");
            System.out.println("13… Find the trigonometric cosine for an angle.");
            System.out.println("14… Find the trigonometric tangent for an angle.");
            System.out.println("15… Convert an angle in degrees to an angle in radians.");
            System.out.println("16… Convert an angle in radians to an angle in degrees.");
            System.out.println("17… Exit.");
            
            System.out.println("Please enter your choice:");
        
            choice = keyedInput.nextInt();
        
            System.out.println("    ");
            System.out.println("----------------------------------------");
            
            
                if (choice==1){
                    
                    System.out.println("You have chosen to find the average of five numbers:");
                    System.out.println("    ");
                    
                    // get value of each variable    
                    System.out.println("Please input the first number:");
                    ave1 = keyedInput.nextInt();
            
                    System.out.println("Please input the second number:");
                    ave2 = keyedInput.nextInt();
            
                    System.out.println("Please input the third number:");
                    ave3 = keyedInput.nextInt();
                    
                    System.out.println("Please input the fourth number:");
                    ave4 = keyedInput.nextInt();
                    
                    System.out.println("Please input the fifth number:");
                    ave5 = keyedInput.nextInt();
                    
                    //calling variable for subroutine
                    avetotal = 0;
                    System.out.println(aveOfNums(ave1, ave2, ave3, ave4, ave5)); // this is the method call with the return
                }
                
                if (choice==2){
                    
                    System.out.println("You have chosen to find the hypotenuse of a right angle triangle:");
                    System.out.println("    ");
                    
                    // get value of each variable      
                    System.out.println("Please input the length of one of the sides of the triangle:");
                    opp = keyedInput.nextInt();
            
                    System.out.println("Please input the length of the other side of the triangle:");
                    adj = keyedInput.nextInt();
                    
                    //calling variable for subroutine
                    hypot = 0;
                
                    System.out.println(hypotOfTri( opp, adj, hypot));// this is the method call with the return
                }    
                
                if (choice==3){
                    
                    System.out.println("You have chosen to find the sum of five numbers:");
                    System.out.println("    ");
                    
                    // get value of each variable  
                    System.out.println("Please input the first number:");
                    sum1 = keyedInput.nextInt();
            
                    System.out.println("Please input the second number:");
                    sum2 = keyedInput.nextInt();
            
                    System.out.println("Please input the third number:");
                    sum3 = keyedInput.nextInt();
                    
                    System.out.println("Please input the fourth number:");
                    sum4 = keyedInput.nextInt();
                    
                    System.out.println("Please input the fifth number:");
                    sum5 = keyedInput.nextInt();
                    
                    //calling variable for subroutine
                    sumtotal = 0;
                    
                    System.out.println(sumOfNums(sum1, sum2, sum3, sum4, sum5, sumtotal));// this is the method call with the return
                }
                
                if (choice==4){
                    
                    System.out.println("You have chosen to find the volume of a rectangular prism:");
                    System.out.println("    ");
                    
                    // get value of each variable  
                    System.out.println("Please input the length of the prism:");
                    length = keyedInput.nextInt();
            
                    System.out.println("Please input the width of the prism:");
                    width = keyedInput.nextInt();
            
                    System.out.println("Please input the height of the prism:");
                    height = keyedInput.nextInt();
            
                    //calling variable for subroutine
                    volume = 0;
                    
                    System.out.println(volOfPrism(length, width, height, volume));// this is the method call with the return    
                }
                
                if (choice==5){
                    
                    System.out.println("You have chosen to count from 0 to 10 by 1:");
                    System.out.println("    ");
                    
                    countOne();
                }
                
                if (choice==6){
                    
                    System.out.println("You have chosen to count from 100 to 0 by 10:");
                    System.out.println("    ");
                    
                    countTwo();
                }
                
                if (choice==7){
                    
                    System.out.println("You have chosen to count from 50 to 500 by 50:");
                    System.out.println("    ");
                    
                    countThree();
                }
                
                if (choice==8){
                    
                    System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
                    System.out.println("    ");
                    
                    countFour();
                }
                
                if (choice==9){
                    
                    System.out.println("You have chosen to find the square root of a number:");
                    System.out.println("    ");
                    
                    // get value of each variable  
                    System.out.println("Please input a number to be square rooted:");
                    sqrtnum = keyedInput.nextInt();
                    
                    System.out.println(valOfNumSqrd (sqrtnum));// this is the method call with the return
                }
                
                if (choice==10){
                    
                    System.out.println("You have chosen to find the value of a number cubed:");
                    System.out.println("    ");
                    
                    // get value of each variable  
                    System.out.println("Please input a number to be cubed:");
                    cbdnum = keyedInput.nextInt();
                    
                    //calling variable for subroutine
                    orignum = cbdnum;
                    
                    valOfNumCbd(cbdnum, orignum);
                }
                
                if (choice==11){

                    System.out.println("You have chosen to find the value of a number, to any power");
                    System.out.println("    ");

                    // get value of each variable  
                    System.out.println("Please input a number:");
                    valnum = keyedInput.nextInt();
                
                    System.out.println("Please enter a number as the power:");
                    pownum = keyedInput.nextInt();
                    
                    //calling variable for subroutine
                    orignum = valnum;
                    
                    valofNumPow(orignum, pownum, valnum);
                }
                
                if (choice==12){
                   
                   System.out.println("You have chosen to find the trigonometric sine for an angle.");
                   System.out.println(" ");

                   // get value of each variable  
                   System.out.println("Please input an angle:");
                   sinnum = keyedInput.nextInt();
                
                   System.out.println(sinNum (sinnum));// this is the method call with the return
                }
                
                if (choice==13){
                    
                    System.out.println("You have chosen to find the trigonometric cosine for an angle.");
                    System.out.println(" ");

                    // get value of each variable  
                    System.out.println("Please input an angle:");
                    cosnum = keyedInput.nextInt();
                
                    System.out.println(cosNum (cosnum));// this is the method call with the return
                }
                
                if (choice==14){
                    
                    System.out.println("You have chosen to find the trigonometric tangent for an angle.");
                    System.out.println(" ");    

                    // get value of each variable  
                    System.out.println("Please input an angle:");
                    tannum = keyedInput.nextInt();
                
                    System.out.println(tanNum (tannum));// this is the method call with the return
                }
                
                if (choice==15){
                    
                    System.out.println("You have chosen to convert an angle in degrees to an angle in radians.");
                    System.out.println(" ");

                    // get value of each variable  
                    System.out.println("Please input an angle in degrees:");
                    degreenum = keyedInput.nextInt();
                
                    System.out.println(degreesRadians (degreenum));// this is the method call with the return
                }    
                
                if (choice==16){
                    
                    System.out.println("You have chosen to convert an angle in radians to an angle in degrees.");
                    System.out.println(" ");
                    
                    // get value of each variable  
                    System.out.println("Please input an angle is radians:");
                    radiannum = keyedInput.nextInt();
                    
                    System.out.println(radiansDegrees (radiannum));// this is the method call with the return
                }    
                
                if (choice==17){
                    System.out.println("Goodbye!");
                    break;
                }   
            
        }
        
    }
    
}
