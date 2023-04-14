package методи;

public class Main {
    public static void main(String[] args) {

        int sum=sum(20,30);
        System.out.println(sum);
        int multy=multy(20,30);
        System.out.println(multy);
        int subt=subt(20,30);
        System.out.println(subt);
        float div=div(100,30);
        System.out.println(div);
        float dollar=convert(100);
        System.out.println(dollar);
        int percent=percent(100);
        System.out.println(percent);
        print("zeleboba");


    
    }
    private static int sum(int number1, int number2)
    {
    return number1+number2;
    }
    private static int multy(int number1, int number2)
    {
        return number1*number2;
    }
    private static int subt(int number1, int number2)
    {
        return number1-number2;
    }
    private static float div(float number1, float number2)
    {
        return number1/number2;
    }

    private static float convert(float number1)
    {
        return (float) (number1*1.10);
    }

    private static int percent(int number1)
    {
        return (int) (number1+number1*0.1);
    }
    private static void print(String text)
    {
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }



}