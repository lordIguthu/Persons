/*The Program bellow is able to output three user details (Name, age and adress) by following the instructions below:
1. Create a class called person
2. create a constructor with three parameters (persons name, age and address). initialize the three feilds.
3. create a method to display the persons details.
4.create a method named myDetails that accepts person object as the parameter. the method should call the display details method.
5.pass the current instance of the persons object to a method called printCurrentInstance.
6 create an object in the main class by your name.
7.use the object to call the printCurrentInstance method.*/




class Person {
    private String name;
    private int age;
    private String address;

// Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

// Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

// Method to accept a person object and call displayDetails method
    public void myDetails(Person person) {
        person.displayDetails();
    }

// Method to pass the current instance to myDetails method
    public void printCurrentInstance() {
        myDetails(this);
    }

    public static void main(String[] args) {
        
// Creating an object with a sample name
        Person Mathiuu = new Person("Mathiuu Iguthu", 19, "Sabasaba, Kayole");
        
// Using the object to call the printCurrentInstance method
        Mathiuu.printCurrentInstance();
    }
}
