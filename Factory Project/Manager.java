package Inheritence2;
/**
 * A class that represent an employee of type: Manager
 * @author Ben Arviv
 * @version 18/12/2020
 */
public class Manager extends Employee{
    private int _numOfWorkers;

    private final double FIRST_BONUS = 1.05; //if has more than 5 workers
    private final double SECOND_BONUS = 1.1; //if has more than 10 workers
    
    /**
     * Construct a manager
     * @param n The manager's name
     * @param id The manager's ID
     * @param s The manager's salary
     * @param num The amount of workers the manager has
     */
    public Manager(String n, String id, double s, int num){
        super(n, id, s);
        _numOfWorkers = num;
    }

    public double computeSalary(int month){
        if (month >= 0 && month <= 12){
            if (_numOfWorkers > 5){
                if (_numOfWorkers > 10){
                    return _salary * _workHours[month] * SECOND_BONUS; //has more than 10 workers
                }
                return _salary * _workHours[month] * FIRST_BONUS; //has 5 to 10 workers
            }
            return _salary * _workHours[month]; //has less than 5 workers
        }
        return 0;
    }
}
