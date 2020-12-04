package LockedMe;

import java.util.Scanner;

public class LockedMeClass extends LockedMeOperations {
    public void applicationDetails(){
        System.out.println("The name of this application is LockedMe!!!");
        System.out.println("Developed by : Abinaya\n");
    }

    public void displayingOptions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any option listed to perform your requirement");
        System.out.print(" 1. Retrieve files\n 2. Add a file\n 3. Delete a file\n 4. Search a file\n 5. Close the application\n");
        int a = sc.nextInt();
        String b = sc.nextLine();
        System.out.println("You have chosen option " +a + " wish to continue? yes/no : ");
        String b1 = sc.nextLine();
        if (b1.equalsIgnoreCase("yes")) {
            switch (a){
                case 1:
                    System.out.println("-----File Names in Ascending Order-----");
                    retrieveFile();
                    System.out.println("\n");
                    displayingOptions();
                    break;
                case 2:
                    addFile();
                    System.out.println("\n");
                    displayingOptions();
                    break;

                case 3:
                    deleteFile();
                    System.out.println("\n");
                    displayingOptions();
                    break;

                case 4:
                    searchFile();
                    System.out.println("\n");
                    displayingOptions();
                    break;

                case 5:
                    closeApp();
                    break;

                default:
                    System.out.println("!!!!Option you have entered is not valid, please enter a valid option!!!!\n");
                    displayingOptions();
                    break;
        }

        }
    }
}
