package otherPackage;

public class ClassB {
    boolean initialized = false;
    int calls =0;

    //Public to access from outside of package
    public ClassB()
    {
        initialized = true;

    }

    public String status(int val){
        System.out.println("Received " + val);
        beenCalled();
        System.out.println("Calls: " + calls);
        return "I'm a class B object. My current state is " + initialized;
    }

    private void beenCalled()
    {
        calls++;
    }
}
