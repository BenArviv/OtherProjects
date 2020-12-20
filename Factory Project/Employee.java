package Inheritence2;

/**
 * A class that represents an employee
 * @author Ben Arviv
 * @version 18/12/2020
 */
public abstract class Employee{
    protected String _name;
    protected String _ID;
    protected double _salary;
    protected int[] _workHours;
    protected final int YEAR = 12;
    
    /**
     * A constructor for employee
     * @param n The name of the employee
     * @param id The ID of the employee
     * @param s The salary of the employee
     */
    public Employee(String n, String id, double s){
        _name = n;
        _ID = id;
        if (s < 0)
            s = 0;
        _salary = s;
        _workHours = new int[YEAR];
    }

    /**
     * Sets the working hours of an employee
     * @param month The month to set the hours
     * @param hours Amount of working hours
     */
    public void setWorkingHours(int month, int hours){
        if (month >= 1 && month <= 12 && hours >= 0)
            _workHours[month] = hours;
    }

    /**
     * Returns a string representation of the employee
     * @return String representation of an employee
     */
    public String toString(){
        String str = "Name: " + _name + ", ID: " + _ID + ", Pay per hour: " + _salary + " shekels \n";
        str += "Jan -" + _workHours[0];
        for (int i = 1; i < YEAR; i++){
            str += this.toMonth(i) + _workHours[i];
        }
        return str;
    }

    /**
     * an abstract method, will be implemented later
     * @param month The month to compute the salary
     * @return The actual salary of an employee
     */
    public abstract double computeSalary(int month);

    /**
     * Returns the name of the employee
     * @return The name of an employee
     */
    public String getName(){
        return _name;
    }

    /**
     * Returns the salary per hour of an employee
     * @return Salary per hour of an employee
     */
    public double getPerHourSalaery(){
        return _salary;
    }

    /*
     * A private method to print the current month in the toString() method
     */
    private String toMonth(int index){
        switch (index){
            case 1:
                return ", Feb -";
            case 2:
                return ", Mar -";
            case 3:
                return ", Apr -";
            case 4:
                return ", May -";
            case 5:
                return ", Jun -";
            case 6:
                return ", Jul -";
            case 7:
                return ", Aug -";
            case 8:
                return ", Sep -";
            case 9:
                return ", Oct -";
            case 10:
                return ", Nov -";
            case 11:
                return ", Dec -";
        }
        return "";
    }
}
