public class SumOfNumbers {
    public static void main(String[] args) {
        Sum(1,7);
        Sum(4,7,9);
    }

    public static int Sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static int Sum(int a, int b,int c){
        int sum = a + b + c;
        System.out.println(sum);
        return sum;
    }

}
