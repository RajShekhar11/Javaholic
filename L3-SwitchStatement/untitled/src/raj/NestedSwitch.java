package raj;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Raj Shekhar");
//                break;
//            case 2:
//                System.out.println("Raj");
//                break;
//            case 3:
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("no department entered");
//                }
//                    break;
//            default:
//                System.out.println("Enter correct employ ID");
//
//        }


        //BETTER WAY TO WRITE
        switch (empID) {
            case 1 -> System.out.println("Raj Shekhar");
            case 2 -> System.out.println("Raj");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("Enter correct employ ID");
        }
    }
}
