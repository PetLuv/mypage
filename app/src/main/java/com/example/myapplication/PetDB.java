package com.example.myapplication;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class PetDB {
    String petName;
    String petAge;
    String petBreed;

    public PetDB(){
    }

    public PetDB(String petName, String petAge, String petBreed){
        this.petName = petName;
        this.petAge = petAge;
        this.petBreed = petBreed;
    }

    public String getPetName(){
        return petName;
    }
    public void setPetName(String petName){
        this.petName = petName;
    }
    public String getPetAge(){
        return petAge;
    }
    public void setPetAge(String petAge){
        this.petAge = petAge;
    }
    public String getPetBreed(){
        return petBreed;
    }
    public void setPetBreed(String petBreed){
        this.petBreed = petBreed;
    }
//    public String id;
//    public String name;
//    public String age;
//    public String gender;
//
//    public PetDB(){
//        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
//    }
//
//    public PetDB(String id, String name, String age, String gender) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    @Exclude
//    public Map<String, Object> toMap() {
//        HashMap<String, Object> result = new HashMap<>();
//        result.put("id", id);
//        result.put("name", name);
//        result.put("age", age);
//        result.put("gender", gender);
//        return result;
//    }
}
