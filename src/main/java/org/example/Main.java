package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 20, 4, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom(
                "My Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        // Test tüm metodlar
        System.out.println("Bedroom: " + bedroom.getName());
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}