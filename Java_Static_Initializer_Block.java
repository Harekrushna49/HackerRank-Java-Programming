import java.io.*;
import java.util.*;
public class Java_Static_Initializer_Block {
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    public static void main(String[] args) throws Exception {
        try {
            if (B > 0 && H > 0) {
                int area = B * H;
                System.out.print(area);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }//end of main

}//end of class
