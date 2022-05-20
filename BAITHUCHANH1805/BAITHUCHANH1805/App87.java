import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App87 {
  public static void main(String[] args){
    HashMap<String, String> hashMapCity=new HashMap<> ();
    hashMapCity.put("QNg", "Quảng Ngãi");
   hashMapCity.put ("QN", "Quảng Nam");

   hashMapCity.put ("QN", "Quảng Ninh");
    hashMapCity.put("HCM", "Thành phố Hồ Chí Minh");
    System.out.println("Danh sách các thành phố trong hashMapCity: ");
    Set<Map. Entry<String, String>> setCity  = hashMapCity.entrySet();
    System.out.println(setCity);

    System.out.println("QNg:"+hashMapCity.get("QNg"));

    System.out.println("NT:"+hashMapCity.get("NT"));

    if (hashMapCity.containsValue("Thành phố Hồ Chí Minh")){
        System.out.println("Có Thành phố Hồ Chí Minh trong hashMapCity");
    }
  }
} 