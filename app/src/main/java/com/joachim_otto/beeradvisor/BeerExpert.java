package com.joachim_otto.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jojo on 23.02.2017.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Amber")) {
            brands.add("Amsterdam Big Wheel");
            brands.add("Faxe");
            brands.add("Saint Andre");
        } else if (color.equals("Golden")) {
            brands.add("Beck's");
            brands.add("Harp");
            brands.add("Birra Castelo");
        } else if (color.equals("Fruit")) {
            brands.add("Lolita Flirty Daiquiri");
            brands.add("Poppers Hard Ice");
            brands.add("Poppers Cran Ice");
        } else if (color.equals("Dark")) {
            brands.add("Country Brown Ale");
            brands.add("Amsterdam Downtown Brown");
            brands.add("Guinness Draught Bottle");

        } else if (color.equals("Blond")) {
            brands.add("Leffe Blonde");
            brands.add("Molson Stock Ale");
            brands.add("Griffon Pale Ale");
        } else if (color.equals("Cream")){
            brands.add("True North Cream Ale");
            brands.add("Sleeman Cream Ale");
            brands.add("Kilkenny Cream Ale");
        }else{
            brands.add("Cool Beer Larger");
            brands.add("Coors Banquet");
            brands.add("Coors Light");
        }
        return brands;
    }
}
