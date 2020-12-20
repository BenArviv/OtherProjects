package Inheritence2;
import java.util.Scanner;
/**
 * A class that represents a factory full of workers
 * @author Ben Arviv
 * @version 18/12/2020
 */
public class Factory {
    private Employee[] employees;
    private final int MAX_EMPLOYEES = 100;

    /**
     * Constructs a factory
     */
    public Factory(){
        employees = new Employee[MAX_EMPLOYEES];
    }

    /**
     * Hires an employee to the factory
     */
    public void hire(){
        Scanner scan = new Scanner(System.in);
        String name, id;
        double salary;
        int type;
        System.out.println("Enter worker type, name, ID and salary:");
        type = scan.nextInt();
        scan.nextLine();
        name = scan.nextLine();
        id = scan.next();
        salary = scan.nextDouble();
        if (type != 1){
            switch (type){
                case 2:
                    System.out.println("Enter working shift:");
                    int shift = scan.nextInt();
                    for (int i = 0; i < MAX_EMPLOYEES; i++){
                        if (employees[i] == null){
                            employees[i] = new Worker(name, id, salary, shift);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter number of workers on behalf you:");
                    int numOfWorkers = scan.nextInt();
                    for (int i = 0; i < MAX_EMPLOYEES; i++){
                        if (employees[i] == null){
                            employees[i] = new Manager(name, id, salary, numOfWorkers);
                            break;
                        }
                    }
                    break;
            } 
        }
        else{
            for (int i = 0; i < MAX_EMPLOYEES; i++){
                if (employees[i] == null){
                    employees[i] = new Administrator(name, id, salary);
                    break;
                }
            }
        }
    }

    /**
     * Updates the working hours of the employees
     * @param hours An array including all the updated working hours
     * @param month The month to update its working hours
     */
    public void updateHours(int[] hours, int month){
        for (int i = 0; i < MAX_EMPLOYEES; i++){
            if (employees[i] == null)
                continue;
            employees[i].setWorkingHours(month, hours[i]);
        }
    }

    public void printSalaries(int month){
        for (int i = 0; i < MAX_EMPLOYEES; i++){
            if (employees[i] == null)
                continue;
            System.out.println(employees[i].getName() + ", " + employees[i].computeSalary(month));
        }
    }
}
