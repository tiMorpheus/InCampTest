package OOP.examples.encapsulation;

public class App {

    public static void main(String[] args) {

        User user = new User();

        user.setFirstName("Tymur");
        user.setLastName("Tolochko");
        user.setAge(21);
        user.setUseProgLang("Java");

        // user.useProgLang = "PHP";         Nobody out of User class can't do this!

        System.out.println("User name is " + user.getFirstName() + ", he is study " + user.getUseProgLang());
     }
}
