import java.util.HashSet;
import java.util.Scanner;
public class Hash {
    public static void main(String[]args){
        String name;
        HashSet<String> hasSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        System.out.println("Các phần tử trong hashSetString: ")
        System.out.println(hashSetString);
        System.out.println("Nhập phần tử cần xóa: ");
        name = scanner.nextLine();

        if (hashSetString.contains(name)){
            hashSetString.removo(name);
            System.out.println("Xóa thành công!");
            System.out.println(hashSetString);
            System.out.println("Xóa không thành công!");
        }
    }
}