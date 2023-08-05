
package week.pkg1.lab;

/**
 *
 * @author deleryharrison
 */
public class HealthProfile {
    // attributes
    private String name;
    private int age;
    private double weight;
    private double height;
       
    
    // constructors
    public HealthProfile() {
        name = "unknown";
        age = 0;
        weight = 0.0;  // double result = 9 / 10; // common error
        height = 0.0;       
    }
    
    public HealthProfile(String name, int age, double weight, double height) {
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }
    
    public HealthProfile(String name, int age, double weight, int feet, double height) {
        this.setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(feet,height);
    }
    
    
    // behaviors
    public double calculateBMI () {
        double bmi = ( weight * 703 ) / ( Math.pow(height, 2 ));
                
                return bmi;
    }
    
    public String calculateCategory () {
        double bmi = calculateBMI();
        
        if (bmi < 18.5) 
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else 
            return "Obese";
    }
    
    public double calculateMaxHR() {
        return 220 - age;
    }
    
    
    // getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        if (newName.length() > 0)
            this.name = newName;
        else 
            this.name = "unknown";
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) 
            this.age = age;
        else 
            this.age = 0;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else 
            this.weight = 0.0;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double inches) {
        if (inches > 0)
            this.height = inches;
        else 
            this.height = 0.0;
    }
    
    public void setHeight(int feet, double inches) {
        double total = (feet * 12) + inches;
        
        if (total > 0.0)
            this.height = total;
        else 
            this.height = 0.0;
                   
    }
}
