/**
 * Person class
 */
class Person {
    // The name of the person
    String name

    // Empty constructor
    Person() {
    }

    // Constructor with params
    Person(String name) {
        this.name = name
    }

    /**
     * Creates a greeting method for Person class.
     *
     * @return a greeting message
     */
    void greetPerson() {
        println("Hello " + name)
    }

    static void main(String[] args) {
        Person person = new Person("Bondo")
        person.greetPerson()
    }
}


