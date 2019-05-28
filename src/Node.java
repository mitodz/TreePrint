class Node {
    private int number;
    private int left;
    private int right;
    private static StringBuilder sb = new StringBuilder();
    private static int c = Integer.MIN_VALUE;//переменная для проверки

    public Node(int number, int left, int right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    public void checkTree(Node[] t, Node n) {
        if (n.getLeft() != -1) {
            checkTree(t, t[n.getLeft()]);
        }
        if (n.getNumber() < c || sb.length() != 0) {
            sb.append(1);
            return;
        } else c = n.getNumber();
        if (n.getRight() != -1) {
            checkTree(t, t[n.getRight()]);
        }
    }

    public void checkPrint() {
        if (sb.length() == 0) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
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