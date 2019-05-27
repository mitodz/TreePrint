import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner("10\n" +
            "0 7 2\n" +
            "10 -1 -1\n" +
            "20 -1 6\n" +
            "30 8 9\n" +
            "40 3 -1\n" +
            "50 -1 -1\n" +
            "60 1 -1\n" +
            "70 5 4\n" +
            "80 -1 -1\n" +
            "90 -1 -1");
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
