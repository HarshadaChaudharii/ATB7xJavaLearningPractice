package exe_27072024;

public class Lab144 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String( "Harshada"); // Heap Area
        String s2 = "Harshada"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());




    }

}