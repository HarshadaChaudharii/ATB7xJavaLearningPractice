package exe_20072024;

public class Lab093 {
    public static void main(String[] args) {
        // JDK > 13
       // then we can use -> except :
        // also a,b,c:  except single a:
        int itemCode = 001;

        switch (itemCode) {
            case 001 : System.out.println("It's a laptop!");
            break;
            case 002 : System.out.println("It's a desktop!");
            break;
            case 003 : System.out.println("It's a mobile phone!");
            break;
            default : System.out.println("Heloo!");
            break;
        }

    }

}
