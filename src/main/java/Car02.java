class Car {
    String make, model, year;

    public Car() {
    }

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Make : " + this.make + " , Model : " + this.model + " , Year : " + this.year;

    }
}
public class Car02 {
        public static void main(String args[]){
            Car c = new Car("Nissan", "GTR", "2020");
            System.out.println(c.toString());
        }
}
