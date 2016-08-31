package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static java.util.Comparator.comparing;

/**
 * Created by Kiran on 8/30/2016.
 */
public class PetHotel {

    public static int MAXIMUM_CAPACITY=20;
    private Collection<Pet> pets = new TreeSet<>(comparing(Pet::getName));

    public Collection<Pet> getPets() {

        return new ArrayList<>(pets);
    }

    public Collection<Pet> checkIn(Pet... somePets) {
        pets.addAll(Arrays.asList(somePets));
       // pets.add(somePet);
        return pets;
      //  return getPets();
    }


}
