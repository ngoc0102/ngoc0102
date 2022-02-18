public class App55 {
    public static void main (String [] args){
        System.out.println("Cac so chia het cho 5 la:");
        for (int i = 0; i <= 20; i++){
            //neu i khong chia het cho 5 thi quay lai vong lap for
            if (i % 5 != 0){
                continue;
            }
            System.out.println(i);
        }
    }

}