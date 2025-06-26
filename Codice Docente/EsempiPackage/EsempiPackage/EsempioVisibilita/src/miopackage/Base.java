package miopackage;

public class Base {
    private String privateField = "private";
    String defaultField = "default";
    protected String protectedField = "protected";
    public String publicField = "public";

    public void accessFromSameClass() {
        System.out.println(privateField);   // yes
        System.out.println(defaultField);   // yes
        System.out.println(protectedField); // yes
        System.out.println(publicField);    // yes
    }
}
