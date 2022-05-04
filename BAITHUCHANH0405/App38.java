import java.util.LinkedList;
public class App38 {

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Ví dụ sử dụng phương thức addAll()");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nVí dụ sử dụng phương thức retainAll()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.print("list:");
        showList(list);   
    }

 public static void showList(LinkedList<String> list) {
     for (String obj : list) {
         System.out.print("\t" + obj + ",");
        }
     System.out.println();
    }
} 
    
