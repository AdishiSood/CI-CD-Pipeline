public class ECalculator
{
    public static void add(int a, int b)
    {
        int result = a + b;
        println("After adding a and b : " + result);
    }
    public static void sub(int a, int b)
    {
        int result = a - b;
        println("After substracting a and b : " + result);
    }
    public static void mul(int a, int b)
    {
        int result = a * b;
        println("After multiplying a and b : " + result);
    }
    public static void div(int a, int b)
    {
        int result = a / b;
        println("After dividing a and b : " + result);
    }
    public static void main(String[] args)
    {
        int a = 20;
        int b = 10;
        println("The value of a and b: " + a + "," + b);
        ECalculator.add(a, b);
        ECalculator.sub(a, b);
        ECalculator.mul(a, b);
        ECalculator.div(a, b);
    }
}
