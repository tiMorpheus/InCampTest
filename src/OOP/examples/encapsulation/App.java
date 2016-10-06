package OOP.examples.encapsulation;

public class App {

    public static void main(String[] args) {

        User user = new User();

        user.setFirstName("Tymur");
        user.setLastName("Tolochko");
        user.setAge(21);
        user.setUseProgLang("Java");

        // User.useProgLang = "PHP";         Nobody out of User class can't do this

        System.out.println("User ");
     }
}