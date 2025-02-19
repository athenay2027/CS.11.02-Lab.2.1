/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME:
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(add(3,8));
        System.out.println(add(3,8,4,9));
        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));
        System.out.println(triple("ohhbaby"));
        System.out.println(half(8.0));
        System.out.print(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }
    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, "+name+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, "+name+"!";
    }

    // 5. triple
    public static String triple(String phrase){
        return phrase+phrase+phrase;
    }

    // 6. half
    public static double half(double c){
        return c/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double d){
        return (int)(d+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value){
        return (int) (value-0.5);
    }
}