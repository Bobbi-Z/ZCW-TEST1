package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part2.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner{

        private String name;

        private Pet [] pets;
    ArrayList<Pet>  petList = new ArrayList<>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

    this.name = name;
    //this is setting the name of the PetOwner
    this.pets = pets;
    //this is saying the array pets is the array of the owners pets
    if ( pets != null){
        //if array is NOT empty
        for (Pet pet : pets){
           //for every pet at each index of the array
            pet.setOwner(this);
            //set the owner as this owner
        }
    }
    }
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (this.pets != null){
           //if the pet array is not empty
            Pet [] petsNew = Arrays.copyOf(this.pets, this.pets.length+1);
            //take the pet array and copy it adding 1 to its length
            petsNew [this.pets.length] = pet;
            //add the new pet into the array at the last index
        }else{ //if the pet array is empty
            this.pets = new Pet [1];
            //create a new array with a length of 1
            this.pets[0] = pet;
            //add pet to the array at the last index
        }
    }


    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if (this.pets != null && this.pets.length > 0) {
            for (int i = 0; i < this.pets.length; i++) {
                if (this.pets[i].equals(pet)){
                    this.pets[i] = null;
                }
            }

        } else {
            this.pets = null;
        }
//        if (pets != null && pets.length > 0) {
//            for (Pet element : pets) {
//                if (element == pet) {
//                    element = null;
//
//
//                }
//
//                }
//
//            }else {
//            pets = null;
//        }
    }


    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet element : pets) {
            if (element == pet) {
                return true;
            }
        } return false;

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for (Pet pet : pets) {
            int petAge = pet.getAge();
            if (petAge < youngestAge) {
                youngestAge = petAge;
            }

        }
        return youngestAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge(){
            Integer oldestPet = Integer.MIN_VALUE;
            for (Pet pet : pets) {
                int petAge = pet.getAge();
                if (petAge > oldestPet) {
                    oldestPet = petAge;
                }

            }
        return oldestPet;
        }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
       float total = 0;
        for (Pet pet : pets){

       total += pet.getAge().floatValue();
       }
        return total / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
