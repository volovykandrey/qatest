package javacore;

public class OutOfParentChild extends Child {
    static Parent parent = new Parent();

    public static void main(String[] args) {
        String xy = parent.doSmthInParentClass("x=privet", "y=poka");
        System.out.println(xy);
    }
}
