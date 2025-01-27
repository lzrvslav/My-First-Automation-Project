package Lecture9;

public class Cars { // Defines the public class "Cars".

    // Default constructor WITHOUT parameter:
    // Constructor overloading - Body with parameters
    // This constructor creates Object 'Cars' with the following parameters
    public Cars() {
        // Body of the constructor:
        // 'this keyword' allows us to say specifically and clearly what is our property from Object.
        // ~ Specifies property from the Class.
//        this.color = "black";
//        this.transmission = "auto";
//        this.isElectric = false;

        // We set the default values with this
        // We always refer to the last constructor on 62-th row
        this("Black","Auto",false);

    }
    // Constructor WITH parameter:
    // Constructor overloading - Body with parameters
    // ~  allows a class to have multiple constructors with different parameter lists.
    public Cars(String color) {

//        this.color = color;
//        this.transmission = "auto";
//        this.isElectric = false;
        this("Black","Auto",false);
    }
    public Cars(String color, String transmission) {

//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = false;
        this("Black","Auto",false);
    }
    public Cars(String color, String transmission, boolean isElectric) {

        this.color = color;
        this.transmission = transmission;
        this.isElectric = isElectric;
    }
    public Cars(String color, String transmission, boolean isElectric, String brand) {

//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
//        this.brand = brand;
        this("Black","Auto",false);
    }
    public Cars(String color, String transmission, boolean isElectric, String brand, int year) {

//        this.color = color;
//        this.transmission = transmission;
//        this.isElectric = isElectric;
//        this.brand = brand;
//        this.year = year;
        this("Black","Auto",false);
    }
    // This constructor creates Object with the following parameters + print System.out.println
    public Cars(String color, String transmission, boolean isElectric, String brand, int year, boolean isEco) {

        this.color = color;
        this.transmission = transmission;
        this.isElectric = isElectric;
        this.brand = brand;
        this.year = year;
        this.isEco = isEco;
        System.out.println("Object is defined with color: " +color);
    }

    // The default constructor is empty
    // The constructor has NO RETURN TYPE
    private String brand; // Private field to store the brand of the car.
    private int year;
    private String color;
    private String transmission;
    private boolean isElectric;
    public boolean isEco;

    // Another way to access variables is through these methods:
    // The methods HAS RETURN TYPE

    public void setBrand(String brand){ // Method with parameter.
        this.brand = brand; //Assigns the value of the method parameter brand to the instance variable brand
    }

    public void setYear(int year) { // Method with parameter.
        this.year = year; // Assigns the value of the method parameter year to the instance variable brand
    }
    public String getBrand() { // Method with NO parameter.
        return this.brand; // Method with return type
    }

    public int getYear() { // Method with NO parameter.
        return this.year; // Method with return type
    }

    public String getColor() { // Method with NO parameter.
        return this.color; // Method with return type
    }

    public String getTransmission() { // Method with NO parameter.
        return this.transmission; // Method with return type
    }

    public boolean getIsElectric() { // Method with NO parameter.
        return this.isElectric; // Method with return type
    }
}