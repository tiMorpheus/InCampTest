package OOP.examples.encapsulation;

public class User {

    //all variable has to be hidden from other classes,
    //and can be accessed only through the methods of their current class
    private String firstName;
    private String lastName;
    private int age;
    private String useProgLang;

    // Constructors
    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //getters and setters methods are the access points of the
    // instance variables of the User class
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUseProgLang() {
        return useProgLang;
    }

    public void setUseProgLang(String useProgLang) {
        this.useProgLang = useProgLang;
    }
    // toString, hashCode, equals methods

}
