import java.io.*;
import java.util.*;
public class Java_End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        for(int i=1; sc.hasNext(); i++){
            String s = sc.nextLine();
            System.out.println(i + " " + s);
        }
    }
}