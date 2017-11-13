package myPackage;
import otherPackage.ClassB;

public class Main {

    public static void main(String[] args)
    {
        int val = 42;
        System.out.println("Starting call with val: " + val);
        ClassA instanceA = new ClassA();
        String result = instanceA.status(val);
        System.out.println(result);

        val = 350;
        System.out.println("Starting call with val: " + val);
        ClassB instanceB = new ClassB();
        result = instanceB.status(val);
        System.out.println(result);
    }
}
