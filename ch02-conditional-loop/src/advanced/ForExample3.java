package advanced;

public class ForExample3 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++){
            for(int z = 1; z <= 10; z++){
                if ((4*i)+(5*z)==60){
                    System.out.println("x: " + i + " y: " + z);
                }
            }
        }
    }
}
