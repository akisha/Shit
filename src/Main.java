package src;

public class Main {
    public static void main(String[] args) {
        SparseMatrix mS1 = new SparseMatrix("S1.txt");
        String t = mS1.Test();
        System.out.println(t);
    }
}
