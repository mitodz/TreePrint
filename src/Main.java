import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] a = new Node[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        a[0].printTree(a, a[0]);
        System.out.println();
        a[0].prePrintTree(a, a[0]);
        System.out.println();
        a[0].postPrintTree(a, a[0]);
    }
}
