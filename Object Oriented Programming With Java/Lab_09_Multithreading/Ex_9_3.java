// Write a complete multi-threaded program to meet following
// requirements:
// a. Read matrix [A] m x n
// b. Create m number of threads
// c. Each thread computes summation of elements of one row, i.e. 
// ith row of the matrix is processed by ith thread. Where 0 <= i< m.
// d. Print the results.
import java.util.Scanner;
class Matrix implements Runnable{
    static int [][] a;
    static int row,col,y=0;
    public void readArray(int m,int n,Scanner sc){
        row=n;
        col=m;
        a=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void run(){
        int sum=0;
        for(int i=0;i<col;i++){
            sum = sum + a[y][i];
        }
        y++;
        System.out.println("Thread : " +Thread.currentThread() + "sum : " +sum);
    }
}
public class Ex_9_3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Rows and Colums ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        Matrix m1 = new Matrix();
        m1.readArray(m, n, scan);

        Matrix[] a1;
        a1 = new Matrix[n];

        for(int i=0; i<n; i++){
            a1[i] = new Matrix();
            Thread t1 = new Thread(a1[i]);
            t1.start();
        }
    }
}
