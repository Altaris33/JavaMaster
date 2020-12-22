package com.company;

public class Main {

    public static void main(String[] args) {

        RPGVideoGame rpg = new RPGVideoGame("RPG", "Tales of Symphonia", 19.99d, "Lloyd Irving");
        rpg.displayPlatform(new String[]{"PS3", "Gamecube"});
        System.out.println("RPG size in GB: " + rpg.calculateSize());

        FPSVideoGame fps = new FPSVideoGame("FPS", "Call of Duty: Black Ops Cold War", 59.99d);
        fps.displayPlatform(new String[]{"PC", "PS4", "XBOX One"});
        System.out.println("FPS size in GB: " + fps.calculateSize());


    }
}
