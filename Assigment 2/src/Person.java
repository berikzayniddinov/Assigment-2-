class Person implements Payable, Comparable<Person> {
    private static int counter = 0;
    public int id;
    private String name;
    private String surname;

    // Default constructor
    public Person() {
        this.id = ++counter;
    }

    // Parametrized constructor
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // toString method
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // getPosition method
    public String getPosition() {
        return "Person";
    }

    // Implementation of Payable interface
    public double getPaymentAmount() {
        return 0.0;
    }
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
interface Payable {
    double getPaymentAmount();
}