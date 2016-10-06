package OOP.examples.polymorphism;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter programmer type");
        String programmerType = scanner.nextLine();

        Programmer programmer = new Programmer();

        switch (programmerType){
            case "Java":
                        programmer.programming = new JavaProgramming();
                        break;
            case "C#":
                        programmer.programming = new CSharpProgramming();
                        break;
            case "Python":
                        programmer.programming = new PythonProgramming();
                        break;
            default:
                        programmer.programming = new SqlProgramming();

        }

        programmer.makeCode();

    }
}
