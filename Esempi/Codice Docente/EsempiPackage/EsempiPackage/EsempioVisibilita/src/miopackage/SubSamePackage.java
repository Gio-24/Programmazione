package miopackage;

public class SubSamePackage extends Base {
    public void access() {
        // System.out.println(privateField); // no
        System.out.println(defaultField);   // yes
        System.out.println(protectedField); // yes
        System.out.println(publicField);    // yes
    }
}
