import java.util.Scanner;

public class BMI {
    private  double weight; // in pounds
    private  double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237; 
    public static final double METERS_PER_INCH = 0.0254;  
    

    public BMI() {
      this(50, 180);
    }

    //Constructor 
    public BMI(double weight, double height) {
      this.weight = weight;
      this.height = height;
    }
    
   
    //Computing the BMI
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND / 
        ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return bmi;
    }

    //getter for BMI status
    public String getStatus() {
      double bmi = getBMI();
      if (bmi < 18.5)
        return "Underweight";
      else if (bmi < 25)
        return "Normal";
      else if (bmi < 30)
        return "Overweight";
      else
        return "Obese";
    }


    //getter and setter for weight
    public double getWeight() {
      return weight;
    }

    public void setWeight(Scanner scan) {
      System.out.print("Enter weight in pounds: ");
      this.weight = scan.nextDouble();
    }
    
    //getter and setter for height
    public double getHeight() {
      return height;
    }

    public void setHeight(Scanner scan) {
      System.out.print("Enter height in inches: ");
      this.height = scan.nextDouble();
    }


}