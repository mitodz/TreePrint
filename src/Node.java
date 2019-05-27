class Node {
    private int number;
    private int left;
    private int right;
    private static StringBuilder res;

    public Node(int number, int left, int right) {
        this.number = number;
        this.left = left;
        this.right = right;
        res = new StringBuilder();
    }

    public String printTree (Node[] t, Node n) {
        if (n.getLeft()==-1 && n.getRight()==-1) return res.toString();
        if (n.getLeft()!=-1) {
            res.append(n.getNumber()).append(" ");
            return printTree(t, t[n.getLeft()]);
        }
        if (n.getRight()!=-1) {
            res.append(n.getNumber()).append(" ");
            return printTree(t, t[n.getRight()]);
        }
        return res.toString();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}