package com.company;

public class RPGVideoGame implements VideoGame{

    private String type;
    private String name;
    private double price;
    private String heroName;

    public RPGVideoGame(String type, String name, double price, String heroName) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.heroName = heroName;
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

    public String getHeroName() {
        return heroName;
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

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public String toString() {
        return "RPGVideoGame{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", heroName='" + heroName + '\'' +
                '}';
    }

    @Override
    public void displayPlatform(String[] platform) {
        System.out.println("RPG game is available on : " + platform[0] + " and on " + platform[1]);
    }

    @Override
    public double calculateSize() {
        double RPGsize = 12.0d;
        return RPGsize;
    }
}
