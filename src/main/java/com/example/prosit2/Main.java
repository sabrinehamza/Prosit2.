package com.example.prosit2;

public class Main {
    public static void main (String []args){
        Animal lion= new Animal();
        lion.age= 5;
        lion.family="cats";
        lion.name="lion";
        lion.isMammal=true;
        System.out.println(lion.name);
        System.out.println(lion.age);

        Animal dog= new Animal("camine","snoopy",2, true);
        System.out.println(dog.name);
        Zoo myZoo= new Zoo("wildlife","ariana",25);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal((dog)));
        // Ajout d'un animal au zoo
        Animal cat = new Animal("clutter", "caty", 2, true);
        myZoo.addAnimal(cat);
        // si on ajoute un animal avec les même informations il affiche just le premier animal trouvé
        // avec ces informations

        Animal cat2 = new Animal("clutter", "caty", 2, true);
        myZoo.addAnimal(cat2);
        //affciher les animaux de zoo
        myZoo.afficherZoo();
//chercher un animal
        String searchName = "caty";
        int searchAnimal = myZoo.searchAnimal(searchName);

        if (searchAnimal != -1) {
            System.out.println("Animal " + searchName + " found at index " + searchAnimal);
        } else {
            System.out.println("Animal " + searchName + " not found in the zoo.");
        }
        String suppAnimal="caty";
        boolean remove=myZoo.removeAnimal(suppAnimal);
        if (remove ){System.out.println("animal "+suppAnimal+"supprimé avec succées");}
        else {System.out.println("animal"+suppAnimal+"animal inexistant");}

        myZoo.displayZoo();
    }


}
