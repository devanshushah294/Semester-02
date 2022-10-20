.// Write a program to find maximum no from given 3 no
import java.util.Scanner;
public class Ex_3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double number_01 = sc.nextDouble();
        System.out.println("Enter the number :");
        double number_02 = sc.nextDouble();
        System.out.println("Enter the number :");
        double number_03 = sc.nextDouble();
        if (number_01>number_02){
            if(number_01>number_03){
                System.out.println(number_01+" is the largest number");
            }
            else if(number_03>number_01){
                System.out.println(number_03+" is the largest number");
            }
            else{
                System.out.println(number_01+"="+number_03+">"+number_02);
            }
        }
        else if(number_02>number_01){
                if(number_02>number_03){
                    System.out.println(number_02+" is the largest number");
                }
                else if(number_03>number_02){
                    System.out.println(number_01+" is the largest number");
                }
                else{
                    System.out.println(number_03+"="+number_02+">"+number_01);
                }
        }
        else{
            if(number_01>number_03){
                System.out.println(number_01+"="+number_02+">"+number_03);
            }
            else if(number_03>number_02){
                System.out.println(number_03+">"+number_02+"="+number_01);
            }
            else{
                System.out.println(number_01+"="+number_02+"="+number_03);
            }
        }
    }
}