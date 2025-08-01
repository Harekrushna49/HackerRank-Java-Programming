import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial number of elements
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        // Read the space-separated integers
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Read number of queries
        int q = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int i = 0; i < q; i++) {
            String command = sc.nextLine();
            if (command.equals("Insert")) {
                String[] nextLine = sc.nextLine().split(" ");
                int index = Integer.parseInt(nextLine[0]);
                int value = Integer.parseInt(nextLine[1]);
                if (index >= 0 && index <= list.size()) {
                    list.add(index, value);
                }
            } else if (command.equals("Delete")) {
                int index = Integer.parseInt(sc.nextLine());
                if (index >= 0 && index < list.size()) {
                    list.remove(index);
                }
            }
        }

        // Print the final list
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
