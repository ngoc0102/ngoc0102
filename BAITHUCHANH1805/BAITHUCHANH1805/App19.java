import java.util.ListIterator;
import java.util.ArrayList;

public class App19 {
  public static void main(String[] args){
    ArrayList<Character> arrListChar = new ArrayList<>();

    arrListChar.add('a');
    arrListChar.add('b');
    arrListChar.add('c');
    arrListChar.add('d');
    ListIterator<Character> listIterator = arrListChar.listIterator();

    System.out.println("Cac phan tu co trong arrListFloat la: ");
    while(listIterator.hasNext()){
      System.out.print(listIterator.next() + "\t");
    }

    if(arrListChar.contains('e')==false){
      System.out.println("Phan tu e khong co trong danh sach");
    }
    else System.out.println("Phan tu e co trong danh sach");
  }
} 