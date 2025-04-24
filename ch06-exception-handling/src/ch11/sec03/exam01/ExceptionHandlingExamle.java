package ch11.sec03.exam01;

public class ExceptionHandlingExamle {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        try {
            for (int i=0; i<=array.length; i++){
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] " + value);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
