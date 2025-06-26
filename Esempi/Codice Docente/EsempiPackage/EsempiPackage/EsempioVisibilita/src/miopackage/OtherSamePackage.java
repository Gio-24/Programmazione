package miopackage;

public class OtherSamePackage {
    public void access(Base base) {
        // System.out.println(base.privateField); // no
        System.out.println(base.defaultField);   // yes
        System.out.println(base.protectedField); // yes
        System.out.println(base.publicField);    // yes
    }
}