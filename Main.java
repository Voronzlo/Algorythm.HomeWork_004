package Algorythm.HomeWork_004;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(5);
        tree.add(14);
        tree.add(4);
        tree.add(7);

        System.out.println(tree.contains(5));

    }

}