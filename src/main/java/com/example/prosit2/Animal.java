package com.example.prosit2;

public class Animal {
    private String family;
    private String name;

    private int age;
    private boolean isMammal;
    public Animal(){

    }
    public Animal(String family ,String name, int age , boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
      this.isMammal=isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getisMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
