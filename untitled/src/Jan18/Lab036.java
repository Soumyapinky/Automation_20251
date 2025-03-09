package Jan18;

public class Lab036 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");
        }
        int code = 005;
                switch(code)
                {
                    case 001 -> System.out.println("its a laptop");
                    case 002 ,005,007-> System.out.println("its a desktop");
                    default -> System.out.println("bye");
                }
        System.out.println((10 - 4) + 3 *4);

    }
}

