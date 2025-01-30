import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        float weight;
        boolean smoker;
        
        System.out.print("Enter name: ");
        name = input.nextLine();
        
        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Enter weight: ");
        weight = input.nextFloat();

        System.out.print("Do you smoke? Y or N: ");
        smoker = input.next().equals("Y");
        
        System.out.println("Your data");
        System.out.println("- Name: " + name);
        System.out.println("- Age: " + age);
        System.out.println("- Weight: " + weight);
        System.out.println("- Smoker: " + (smoker ? "Yes" : "No"));
        
        input.close();
    }
}