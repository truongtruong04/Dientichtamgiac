import java.util.Scanner;
public class Dientichtamgiac {
 public static void main ( String[] args)    {
     Scanner scanner = new Scanner(System.in) ;
     System.out.println("nhập vào cac cạnh tam giác ");
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     int c = scanner.nextInt();
     int d = (a + b + c) /2;
     int x = ( a + b + c ) ;

     System.out.println("diẹn tich tam giác là" +d);
     System.out.println(" chu vi tam giác :" +x);


 }
}