/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 import java.util.Scanner;
public class ProgramBmi {
    
   public static void main (String [] args){
       // defenisikan variabel
       Scanner alim = new Scanner (System.in);
       int Beratbadan;
       double Tinggibadan;
       double BMI;
       
       // 
       System.out.println("menghitung berat badan");
        System.out.println("*******");
        
         System.out.println("menambahkan berat badan");
         Beratbadan = alim.nextInt();
         
          System.out.println("menambahkan tinggi badan");
        Tinggibadan = alim.nextDouble();
        Tinggibadan/=100;
        BMI = Beratbadan/(Tinggibadan*Tinggibadan);
        System.out.println( "hasil bmi" + BMI);
        
        
        if (BMI > 30){
            System.out.println(" gemuk");
        }
         if (BMI > 25){
            System.out.println("bohay");
        }
         if (BMI > 18){
            System.out.println(" normal");
        }
         if (BMI <18){
            System.out.println(" kurus");
        }
             
        }
            
            
        
   }
   

