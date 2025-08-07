package inc.sims.hustles;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String brand;
    private String Model;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
