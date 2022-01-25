import java.util.Scanner;

public class Person {
    public static void main(String[] args) {   
        
        Scanner input = new Scanner(System.in);

        BMI bodyMass = new BMI();
        bodyMass.setWeight(input);
        bodyMass.setHeight(input);

        System.out.println("BMI is " + bodyMass.getBMI());
        System.out.println(bodyMass.getStatus());
        


    
    }
}
