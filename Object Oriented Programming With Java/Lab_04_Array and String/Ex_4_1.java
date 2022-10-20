// Write a program to accept a line and check how many consonants and 
// vowels are there in line.
import java.util.Scanner;
public class Ex_4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line = ");
        String str = sc.nextLine();
        int vowels=0,consonant=0,digits=0,space=0;
        String line = str.toLowerCase();
        
        for(int i=0; i<line.length();i++){
            char ch = line.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else if((ch>='a' && ch<='z')){
                consonant++;
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else if(ch==' '){
                space++;
            }
        }
        System.out.println("vowels = " + vowels);
        System.out.println("Consonanat = " + consonant);
        System.out.println("Digit = " + digits);
        System.out.println("White Space = " + space);
    }
}