class Node {
    private int number;
    private int left;
    private int right;

    public Node(int number, int left, int right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    public void printTree(Node[] t, Node n) {
        if (n.getLeft() != -1) {
            printTree(t, t[n.getLeft()]);
        }
        System.out.print(n.getNumber() + " ");
        if (n.getRight() != -1) {
            printTree(t, t[n.getRight()]);
        }
    }

    public void prePrintTree(Node[] t, Node n) {
        System.out.print(n.getNumber() + " ");
        if (n.getLeft() != -1) {
            prePrintTree(t, t[n.getLeft()]);
        }
        if (n.getRight() != -1) {
            prePrintTree(t, t[n.getRight()]);
        }
    }

    public void postPrintTree(Node[] t, Node n) {
        if (n.getLeft() != -1) {
            postPrintTree(t, t[n.getLeft()]);
        }
        if (n.getRight() != -1) {
            postPrintTree(t, t[n.getRight()]);
        }
        System.out.print(n.getNumber() + " ");

    }


    public int getNumber() {
        return number;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

}