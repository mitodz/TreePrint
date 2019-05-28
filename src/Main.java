import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner("3\n" +
                "2 1 2\n" +
                "1 -1 -1\n" +
                "2 -1 -1");
        int n = sc.nextInt();
        if (n==0 || n==1) {
            System.out.println("CORRECT");
        } else {
            Node[] a = new Node[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            a[0].checkTree(a, a[0]);
            a[0].checkPrint();
        }
    }
}
