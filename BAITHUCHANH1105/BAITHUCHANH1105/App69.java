import java.util.TreeSet;
import java.util.Scanner;


public class App69 {
    public static void main(String[] args) throws Exception {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();

        if (!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);

        } else {
            System.out.println("Phan tu" + number + " da ton tai!");

        }
    }
}

