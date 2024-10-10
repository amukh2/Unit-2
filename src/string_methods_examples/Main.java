package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String name = new String("Anshu");
        String myName = "Anshu";
        String anotherName = new String("Anshu");
        String myAnotherName = "Anshu";

        System.out.println(name == anotherName);
        System.out.println(myName == myAnotherName);

        //String length
        System.out.println(myName.length());
        //substring method
        System.out.println(myName.substring(0,4));
        //indexOf
        System.out.println(myName.indexOf("s"));
        //equals method
        // to compare two objects, use .equals not ==, == id only for primitives
        System.out.println(name.equals(anotherName));

        //compareTo
        System.out.println(myName.compareTo(name));
    }
}
