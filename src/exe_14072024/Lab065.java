package exe_14072024;

public class Lab065 {
    public static void main(String[] args) {
        String s1 = new String("Harshada");
        String s2 = new String("Harshada");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Pramod
    }
}
