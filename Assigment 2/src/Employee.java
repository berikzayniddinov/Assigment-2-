class Employee extends Person {
    private static int counter = 0;
    private String position;
    private double salary;

    // Default constructor
    public Employee() {
        this.id = ++counter;
    }

    // Parametrized constructor
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Implementation of Payable interface
    public double getPaymentAmount() {
        return salary;
    }
}