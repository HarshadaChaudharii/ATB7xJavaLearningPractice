package exe_14072024;

public class Lab069 {
    public static void main(String[] args) {
        String name = "Harshada"; // SCP
        String name1 = "Harshada"; // SCP

        String name2 = new String("Harshada"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content



    }
}
