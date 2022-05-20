import java.util.TreeSet;
import java.util.Scanner;
public class App68{
    public static void main(String[] args){
        TreeSet<Integer> treeSetInteger=new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Các phần tử trong treesetInteger: ");
        System.out.println(treeSetInteger);
        int arr[]={7,1,6,9,3,10};
        System.out.println("Nhung phan tu can them vao " );
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
          if (!treeSetInteger.contains (arr[i])){
            treeSetInteger.add(arr[i]);
            System.out.println("Phan tu " + arr[i] + " hêm thành công!");
          }else{
            System.out.println("Phan tu "+ arr[i] +" da ton tai!");
            }
        }
        System.out.println("Các phần tử trong treeSetInteger sau khi thêm: ");
        System.out.println(treeSetInteger);
    }
} 