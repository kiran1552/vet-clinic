package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static java.util.Comparator.comparing;

/**
 * Created by Kiran on 8/30/2016.
 */
public class PetHotel {

    private Collection<Pet> pets = new TreeSet<>(comparing(Pet::getName));

    public Collection<Pet> getPets() {

        return new ArrayList<>(pets);
    }

    public Collection<Pet> checkIn(Pet somePet) {
        pets.add(somePet);
        return pets;
      //  return getPets();
    }
}
