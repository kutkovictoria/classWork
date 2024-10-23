public class Util {

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    //перегрузка метода
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateSum(int a, int... numbers) {
        int sum = a;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void changeString(String myStr){
        myStr = "New String";
    }
}
