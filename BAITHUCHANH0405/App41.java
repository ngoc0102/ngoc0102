import java.util.LinkedList;
import java.util.Scanner;

public class App41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("Thang 1");
        LinkedList.add("Thang 2");
        LinkedList.add("Thang 3");
        LinkedList.add("Thang 4");
        LinkedList.add("Thang 5");
        LinkedList.add("Thang 6");
        LinkedList.add("Thang 7");
        LinkedList.add("Thang 8");
        LinkedList.add("Thang 9");
        LinkedList.add("Thang 10");
        LinkedList.add("Thang 11");
        LinkedList.add("Thang 12");

        System.out.println("Nhap chi so cua phan tu can lay" );
        int i = scanner.nextInt();

        if(i < 0 || i > LinkedList.size()-1){
            System.out.println("Chỉ số cần lấy phải lớn hơn 0 và nhỏ hơn " + (LinkedList.size()-1));
        } else{
            String node = LinkedList.get(i);
            System.out.println("Phần tử có chỉ số = " + i + " trong  Linkedlist là: " + node);

        }
        String firstNode =  LinkedList.getFirst();
        String lastNode = LinkedList.getLast();
        System.out.println("Phần tử đầu tiên trong linkList là: " + firstNode + "; Phần tử cuối cùng trong danh sách là: " + lastNode);
    }
} 
    
