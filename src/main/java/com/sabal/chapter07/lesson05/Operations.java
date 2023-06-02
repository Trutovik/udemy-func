package com.sabal.chapter07.lesson05;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> empty = Optional.empty();

        //map
        String mapped = optional.map(val -> "Replaced").orElse("Empty");
        System.out.println(mapped);

        String emptyMapped = empty.map(val -> "Replaced").orElse("Empty");
        System.out.println(emptyMapped);

        //filter

        String filtered = optional.filter(val -> val.equalsIgnoreCase("Value")).orElse("Not Equal");
        System.out.println(filtered);

        String filteredEmpty = empty.filter(val -> val.equalsIgnoreCase("Value")).orElse("Not Equal");
        System.out.println(filteredEmpty);

        //flatMap
        String flatMapped = optional.flatMap(val -> Optional.of("Replaced by flatMap")).orElse("Not flatmapped");
        System.out.println(flatMapped);
        String emptyFlatMapped = empty.flatMap(val -> Optional.of("Replaced by flatMap")).orElse("Not flatmapped");
        System.out.println(emptyFlatMapped);
    }
}
