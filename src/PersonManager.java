import java.util.Scanner;
public class PersonManager {

    public static String Menu(){
        System.out.println("Create customer or employee? (c/e): ");

        Scanner sc=new Scanner(System.in);

        String choice=sc.nextLine();

        return choice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Person Manager");
        while (true){
             String choice =Menu();
            if (choice.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
                continue;
        }
         else if (choice.equals("c")) {
            System.out.print("First Name:");
            String first = sc.nextLine();
            System.out.print("Last Name:");
            String last = sc.nextLine();
            System.out.print("Customer Number:");
            String cn = sc.nextLine();
            System.out.println("You entered a new customer");
            Person p = new Customer (first,last,cn);
            System.out.println(p);
         }
        else if (choice.equals("e")){
            System.out.print("First Name:");
            String first = sc.nextLine();
            System.out.print("Last Name:");
            String last = sc.nextLine();
            System.out.print("4 digits of SSN:");
            String ssn = sc.nextLine();
            Person p1 = new Employee (first,last,ssn);
            System.out.println("You entered a new employee");
            System.out.println(p1);
        }
        else  {
            System.out.println("Error! Entry must be 'c' or 'e'. Try again.");
            continue;

        }
            System.out.println("Continue? (y/n): ");
            String continue1=sc.nextLine();
            while (true){
                if(continue1.equals("y") || continue1.equals("n"))
                    break;
                    System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
                    continue1 = sc.nextLine();
                }
                if (continue1.equals("n"))
                    break;
           }

            }
   }



