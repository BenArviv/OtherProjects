package Inheritence2;
/**
 * A class that represent an employee of type: Administrator
 * @author Ben Arviv
 * @version 18/12/2020
 */
public class Administrator extends Employee {
    
    /**
     * A constractor for administrator, using the super's constractor
     */
    public Administrator(String n, String id, double s){
        super(n, id, s);
    }

    /**
     * Computes the worker's salary
     * @param month The month to compute salary for
     * @return The computed salary
     */
    public double computeSalary(int month){
        if (month >= 0 && month <= 12)
            return _salary * _workHours[month];
        else
            return 0;
    }
}
