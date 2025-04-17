package advanced;

public class ForExample5 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2,};

        int max = array[0];

        for (int i : array){
            if (max<i){
                max = i;
            }
        }
        System.out.println(max);
    }
}
