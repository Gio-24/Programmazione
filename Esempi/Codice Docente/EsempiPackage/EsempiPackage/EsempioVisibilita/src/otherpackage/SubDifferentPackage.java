package otherpackage;

import miopackage.Base;

public class SubDifferentPackage extends Base {
    public void access() {
        // System.out.println(privateField);     // no
        // System.out.println(defaultField);     // no
        System.out.println(protectedField);     // yes
        System.out.println(publicField);        // yes
    }
}