package com.company;

public class FPSVideoGame implements VideoGame{

    private String type;
    private String name;
    private double price;

    public FPSVideoGame(String type, String name, double price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FPSVideoGame{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void displayPlatform(String[] platform) {
        System.out.println("FPS game is mostly available on: " + platform[0] + " but also on " + platform[1] + " and " + platform[2]);
    }

    @Override
    public double calculateSize() {
        double size = 20.0d;
        double updatesSize = 0.75d;
        return size + updatesSize;
    }
}
