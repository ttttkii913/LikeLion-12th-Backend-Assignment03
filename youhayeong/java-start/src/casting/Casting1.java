package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long     // (long) 생략 가능
        System.out.println("longValue = " + longValue);     // 10 출력

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue); // 10.0 출력

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue); // 20.0 출력
    }
}
