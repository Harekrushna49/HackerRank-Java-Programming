import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of lines
        int n = sc.nextInt();
        List<List<Integer>> data = new ArrayList<>();

        // Read each line
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            data.add(line);
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process queries
        for (int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Check boundaries and print element or ERROR!
            if (x > 0 && x <= data.size()) {
                List<Integer> line = data.get(x - 1);
                if (y > 0 && y <= line.size()) {
                    System.out.println(line.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}

