package OOP.examples.polymorphism;

public class SqlProgramming implements Programming {
    @Override
    public void makeCode() {
        System.out.println("SELECT * FROM programmers;");
    }
}
