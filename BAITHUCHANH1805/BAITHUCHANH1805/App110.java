import java.util.ArrayList;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Nhap so phan tu cua list: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            int x = scanner.nextInt();
            a.add(x);
        }
        int max = a.get(0);
        for (int i = 1; i < n; i++){
            if (a.get(i) > max){
                max = a.get(i);
            }
        }
        System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
        System.out.print("Xoa cac phan tu co gia tri bang: ");
        int x = scanner.nextInt();
        for (int i = 0; i < a.size(); i++){
            if(a.get(i) == x){
                a.remove(i);
            }
        }
        System.out.println("List sau khi xoa:");
        for (int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");
        System.out.print("List sau khi sap xep: ");
        for (int i = 0; i < a.size()-1; i++){
            for (int j = i+1; i < a.size(); j++){
                if (a.get(i) > a.get(j)){
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        System.out.print("List sau khi sap xep: ");
        for (int i = 0; i < a.size(); i ++){
            System.out.print(a.get(i) + " ");
        }
    }
} 
