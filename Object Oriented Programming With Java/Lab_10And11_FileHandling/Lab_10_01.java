/*
Write a program that counts number of characters, words, and lines in a file. Use 
exceptions to check whether the file that is read exists or not
*/
import java.io.FileInputStream;

public class Lab_10_01{
    public static void main (String[] args) throws Exception{
            FileInputStream f1 = new FileInputStream("CountDemo.txt");
            int a = f1.read();
            int noOfCharacters = 0;
            int noOfWords = 1;
            int noOfLines = 1;
            for(int i=0 ;a != -1;a=f1.read()){
                if (a==13){
                    continue;
                }
                else if (a == 32) {
                    noOfWords++;
                    noOfCharacters--;
                }
                else if (a == 10) {
                    noOfWords++;
                    noOfLines++;
                    noOfCharacters--;
                }
                noOfCharacters++;
                /* for counting only characters
                if(a==10||a==32||a==13){
                    continue;
                }else{
                    noOfCharacters++;
                    System.out.print((char)a);
                    System.out.println(a);
                }
                // noOfCharacters++;
                */
            }
            f1.close();
            System.out.println("the number of characters are : "+noOfCharacters);
            System.out.println("the no of words are : "+noOfWords);
            System.out.println("the no of lines are :"+noOfLines);
        } 
}