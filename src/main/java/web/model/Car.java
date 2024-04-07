package web.model;

public class Car {

    private String model;
    private int series;
    private int cost;

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Car(int count) {
        this.count = count;
    }

    public Car() {
    }

    public Car(String model, int series, int cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
