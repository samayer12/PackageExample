package myPackage;

public class ClassA {
    boolean initialized = false;
    int calls =0;

    ClassA()
    {
        initialized = true;
    }

    public String status(int val){
        System.out.println("Received " + val);
        beenCalled();
        System.out.println("Calls: " + calls);
        return "I'm a class A object. My current state is " + initialized;
    }

    private void beenCalled()
    {
        calls++;
    }
}
