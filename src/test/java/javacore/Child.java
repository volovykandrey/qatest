package javacore;

public class Child extends Parent {

    public static void main(String[] args) {
        System.out.println(doSmthInParentClass("tttt", "hhhh"));
        int sum = sumOfTwoNumbers(1, 6);
        System.out.println(sum);
        System.out.println(text);
    }

    public static int sumOfTwoNumbers(int i, int j) {
        return i + j;
    }
}
