package inc.sims.hustles;

import jakarta.persistence.*;

@Entity
public class Laptop {

    @Id
    @Column(name = "laptop_id")
    private int laptopId;
    private String brand;
    private String Model;
    private int ram;
    @ManyToOne
    private Club club;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

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

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
