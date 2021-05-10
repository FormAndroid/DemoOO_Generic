package be.bxl.formation;

import be.bxl.formation.models.CustomList;
import be.bxl.formation.models_non_generic.CustomIntegerList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CustomList<Integer> cil = new CustomList<>();

        cil.add(42);
        cil.add(-5);
        cil.add(13);
        cil.add(2);

        System.out.print("Les éléments : ");
        for (int i = 0; i < cil.size(); i++) {
            System.out.print(cil.get(i) + " > ");
        }
        System.out.println();


    }
}
