package app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

//@ApplicationPath("/rent")
//@Path("/rent")


public class Car {

    private String Name;
    private String model;
    private Long year;


    public Car(String name, String model, long year){
        this.Name=name;
        this.model=model;
        this.year=  year;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Car{name='%s', model='%s'}", Name, model);
    }
}
