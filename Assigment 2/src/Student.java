class Student extends Person {
    private static int counter = 0;
    private double gpa;

    // Default constructor
    public Student() {
        this.id = ++counter;
    }

    // Parametrized constructor
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // Getters and setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method
    public String toString() {
        return "Student: " + super.toString();
    }

    // Implementation of Payable interface
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }
}