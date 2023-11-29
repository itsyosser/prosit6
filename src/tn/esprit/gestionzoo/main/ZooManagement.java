package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;



public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
       // Animal lion = new Animal();
        /*lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;*/

        Zoo myZoo = new Zoo();
//        Animal Anim = new Animal();
//        Aquatic aqua = new Aquatic();
//        Terrestrial terr = new Terrestrial();
//        Dolphin dol = new Dolphin();
//        Penguin pen = new Penguin();

//        Animal Anim = new Animal("aa","ee",11,false);
//        Aquatic aqua = new Aquatic("aa","ee",11,false,"zz");
//        Terrestrial terr = new Terrestrial("aa","ee",11,false,4);
//        Dolphin dol = new Dolphin("aa","ee",11,false,"zz",12.5f);
//        Penguin pen = new Penguin("aa","ee",11,false,"zz",14.1f);
//        System.out.println(Anim.toString());
//        System.out.println(aqua.toString());
//        System.out.println(terr.toString());
//        System.out.println(dol.toString());
//        System.out.println(pen.toString());
       //aqua.swim();
       //dol.swim();
       // pen.swim();

//        myZoo.city = "Ariana";
        //myZoo.nbrCages = 25;
       // myZoo.animals = new Animal[25];

   /* Zoo z1= new Zoo("zp", "zzzzzzzzz1");
    z1.setNbrAnimals(6);
        Zoo z2= new Zoo("zpp", "zzzzzzzzz2");
       z2.setNbrAnimals(4);*/
      //  Animal dog = new Animal("Canine", "Snoopy", 2, true);

       /* System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));*/

       // myZoo.displayAnimals();

      /*  System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();*/

       // System.out.println(myZoo.isZooFull());
        //System.out.println(z1.nbrAnimals);
       // System.out.println(Zoo.comparerZoo(z1,z2));

//INSTRUCTION 26
        Aquatic A1 = new Aquatic("aaa","bb",16,true,"eee");
        myZoo.addAquaticAnimal(A1);
        Aquatic A2 = new Dolphin("dd","vv",1,false,"eee",12.1f);
        myZoo.addAquaticAnimal(A2);
       Aquatic A3 = new Penguin("aaa","bb",16,true,"eee",14.5f);
        myZoo.addAquaticAnimal(A3);
 //INSTRUCTION 27
        A1.swim();
        A2.swim();
        A3.swim();
        System.out.println(A1.equals(A3));
//instruction 28
//        Aquatic A1 = (Aquatic) new Penguin();
//        myZoo.addAquaticAnimal(A1);
//        Aquatic A2 = new Dolphin();
//        myZoo.addAquaticAnimal(A2);
//        Aquatic A3 = new Penguin();
//        myZoo.addAquaticAnimal(A3);
//        A1.swim();
//        A2.swim();
//        A3.swim();


    }

}
