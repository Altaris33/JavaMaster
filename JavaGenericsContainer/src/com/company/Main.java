package com.company;

public class Main {

    public static void main(String[] args) {

        Container<Box> boxContainer = new Container<>();
        boxContainer.setElement(new Box(1, "Cardboard"));
        System.out.println(boxContainer.getElement());

        Container<String> stringContainer = new Container<>();
        stringContainer.setElement("StringBox");
        System.out.println(stringContainer.getElement());
    }
}
