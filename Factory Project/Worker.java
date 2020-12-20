package Inheritence2;
/**
 * A class that represent an employee of type: Worker
 * @author Ben Arviv
 * @version 18/12/2020
 */
public class Worker extends Employee{
    private int _shift;//1 - morning, 2 - noon, 3 - night

    private final double NIGHT_BONUS = 1.1;
    private final int MORNING_BONUS = 0;

    /**
     * Construct a worker using the super's constructor
     * @param n The worker's name
     * @param id The worker's ID
     * @param s The worker's salary
     * @param shift In which shift the worker works
     */
    public Worker(String n, String id, double s, int shift){
        super(n, id, s);
        _shift = shift;
    }

    /**
     * Computes the salary of the worker, depends on his working shift
     * @param month The month to compute salary for
     * @return the computed salary for the month
     */
    public double computeSalary(int month){
        double toReturn = 0;
        if (month >= 0 && month <= 12){
            switch (_shift){
                case 1:
                    toReturn = _salary * _workHours[month] + MORNING_BONUS;
                    break;
                case 2:
                    toReturn = _salary * _workHours[month];
                    break;
                case 3:
                    toReturn = (_salary * _workHours[month]) * NIGHT_BONUS;
                    break;
            }
            return toReturn;
        }
        return 0;
    }
}
