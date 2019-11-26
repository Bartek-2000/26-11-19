import java.util.Scanner;

public class CompanyApp {


    public static final int ADD_EMPLOYEE = 0;
    public static final int FIND_EMPLOYEE = 1;
    public static final int EXIT = 2;
    private static Company company = new Company();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int userOption;
            do {
                printOption();
                userOption = scanner.nextInt();
                scanner.nextLine();

                switch (userOption) {
                    case CompanyApp.ADD_EMPLOYEE:
                        addEmployee(scanner);
                        break;
                    case CompanyApp.FIND_EMPLOYEE:
                        findAdnPrintEmployee();
                        break;
                    case CompanyApp.EXIT:
                        break;

                }
            } while (userOption != CompanyApp.EXIT);


        }

    }
    public void addEmployee(){

    }
    public void findAdnPrintEmployee(){

    }
    public void printOption(){
        
    }

}
