package web.model;

public class Car {
    public int id;
    public String nameCar;
    public String modelCar;
    public int yearCar;

    public Car(String nameCar, String modelCar, int yearCar) {
//        this.id = id;
        this.nameCar = nameCar;
        this.modelCar = modelCar;
        this.yearCar = yearCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

}
