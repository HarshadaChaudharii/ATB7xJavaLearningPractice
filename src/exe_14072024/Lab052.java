package exe_14072024;

public class Lab052 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC -

    }
}

