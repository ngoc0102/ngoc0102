public class App11 {
    public static void main(String[] args) {
        int tong = 200000;
        int a = 50000;
        int b = 20000;
        int c = 10000;

        for (int i = 0; i <= tong / a; i++) {
            for (int j = 0; (j*b + i*a) <= tong; j++) {
                for (int k = 0; (k*c + j*b + i*a) <= tong; k++) {
                    if ((k*c + j*b + i*a) == tong){
                        System.out.println(i + " to 50000, " + j + " to 20000, " + k + " to 10000");
                    }
                }
            }
        }
    }
}