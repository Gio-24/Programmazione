package otherpackage;

import miopackage.Base;

public class OtherDifferentPackage {
    public void access(Base base) {
        // System.out.println(base.privateField);   // no
        // System.out.println(base.defaultField);   // no
        // System.out.println(base.protectedField); // no
        System.out.println(base.publicField);      // yes
    }
}

