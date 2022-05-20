import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
  public static void main(String[] args) {
    String fruitName;
    int n;
    Scanner scanner = new Scanner(System.in);

    HashSet<String> hashSetFruits = new HashSet<String>();

    System.out.println("Nhập vào số phần tử của hashSetFruits: ");
    n = Integer.parseInt(scanner.nextLine());  

    System.out.println("Nhập vào tên các loại trái cây: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập tên loại trái cây thứ " + i + ": ");
        fruitName = scanner.nextLine();
        hashSetFruits.add(fruitName);
    }

    System.out.println("Số phần tử của hashSetFruits = " + hashSetFruits.size());

    System.out.println("Nhập tên loại trái cây cần tìm: ");
    String fruitSearch = scanner.nextLine();
    if (hashSetFruits.contains(fruitSearch)) {
        System.out.println("Có trái cây " + fruitSearch + " trong hashSetFruits!");
    } else {
        System.out.println("Không tìm thấy " + fruitSearch);
    }

    System.out.println("Nhập vào tên loại trái cây cần xóa: ");
    String fruitDelete = scanner.nextLine();

    if (hashSetFruits.contains(fruitDelete)) {
        hashSetFruits.remove(fruitSearch);
        System.out.println("Xóa thành công!");
        System.out.println("Các phần tử còn lại trong hashSetFruits: " + hashSetFruits);
    } else {
        System.out.println("Xóa không thành công!");
    }

    List<String> listFruits = new ArrayList<>();
    listFruits.add("Buoi");
    listFruits.add("Le");
    listFruits.add("Xoai");
    listFruits.add("Mang cut");

    hashSetFruits.addAll(listFruits);
    System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
    Iterator<String> iterator = hashSetFruits.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }

    hashSetFruits.removeAll(listFruits);
    System.out.println("\nCác phần tử có trong hashSetFruits sau khi xóa: " + hashSetFruits);
}
}