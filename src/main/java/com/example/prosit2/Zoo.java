package com.example.prosit2;

import static java.lang.System.out;

public class Zoo {
   private Animal[] animals;
    private String name;
    private String city;
   private int nbrCages;
    int nbrAnimal=0;
    public Zoo (String name, String city, int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        this.animals=new Animal[nbrCages];

    }
    public void displayZoo(){
      out.println("My Zoo name is :"+ name+",city is :"+city+"N"+nbrCages);
    }


    @Override
    public String toString(){
        return "My Zoo name is"+ name +",city is"+ city+ "N de cages" + nbrCages;
    }
    public boolean addAnimal(Animal animal){
    if(nbrAnimal>nbrCages){
        return false;
    }
    if (isZooFull(this)){
        return false;
        }
        animals[nbrAnimal]=animal;
        nbrAnimal++;
        return true;
    }



    public void afficherZoo(){System.out.println("Animals in the zoo:");
    for (int i = 0; i < nbrAnimal; i++) {
        out.println("Animal " + (i + 1) + ":");
        out.println("Name: " + animals[i].getName());
        out.println("Age: " + animals[i].getAge());
        out.println("Family: " + animals[i].getFamily());
        out.println("Is Mammal: " + animals[i].getisMammal());
        out.println("-----------------------------");
    }
}
//chercher un animal si il existe ou non
    public int searchAnimal(String animalName) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].getName().equals(animalName)) {
                return i; // L'animal a été trouvé, renvoie l'indice
            }
        }
        return -1 ; // L'animal n'a pas été trouvé, renvoie -1
    }

    public boolean removeAnimal(String animalName)
    {for (int i=0 ; i<nbrAnimal;i++){
        if (animals[i].getName().equals(animalName)){
            for (int j = i; j < nbrAnimal - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[nbrAnimal - 1] = null; 
            nbrAnimal--; 
            return true; 
        }
    }
        return false;
        }
        public static boolean isZooFull(Zoo zoo)
        {return zoo.nbrAnimal >= zoo.nbrCages ;}

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
        this.name = name;
        else System.out.println("le mot ne peux etre vide");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

}


