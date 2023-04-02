package DataStructures;

class Car {
    static volatile Car car;
    static String companyName;
    private static int year;
    String modelName;
    String variantName;

    static {
        companyName = "Audi";
        year = 1990;
        System.out.println("Static Block Called");
    }

    {
        System.out.println("Instance Block Called");
        companyName = "Audi_Updated";
    }

    private Car(String modelName, String variantName, int year) {
        this.modelName = modelName;
        this.variantName = variantName;
        this.year = year;
        System.out.println("Constructor Called");
    }

    public static Car GetInstance(String modelName, String variantName, int year) {
        if (car == null) {
            car = new Car(modelName, variantName, year);
        }
        return car;
    }

   public void display() {
        System.out.println("Car Company Name - " + companyName);
        System.out.println("Car Model Name - " + modelName);
        System.out.println("Car Variant Name - " + variantName);
        System.out.println("Car Year - " + year);
    }

}

public class Main91 {
    public static void main(String[] args) {
        Car car = Car.GetInstance("Q7", "G311", 2022);
        car.display();

        Car.companyName = "Audi2";
        car.display();

    }
}
