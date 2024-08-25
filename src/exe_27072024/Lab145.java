package exe_27072024;

public class Lab145 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "Harshada";
        s1 = "Chaudhari";

        StringBuffer stringBuffer = new StringBuffer("Harshada");
        // change the value of string - Buffer
        stringBuffer.append("Chaudhari");
        stringBuffer.append("JI");

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}
