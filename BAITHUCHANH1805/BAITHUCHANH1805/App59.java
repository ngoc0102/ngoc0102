import java.util.LinkedHashSet;
import java.util.Set;

public class App59{
  public static void main(String[] args){
    // init set object
     Set<String> linkedHashSet=new LinkedHashSet<String>();
     linkedHashSet.add("Java");
     linkedHashSet.add("C++");
     linkedHashSet.add("Java");
     linkedHashSet.add("PHP");
    // show set
     for (String str:linkedHashSet){
         System.out.println(str);
     }
  }
}
