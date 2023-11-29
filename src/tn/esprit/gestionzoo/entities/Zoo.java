package tn.esprit.gestionzoo.entities;

public class Zoo {

    public Animal[] animals;
    //instruction 25:
    public Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    public static final int NBRCAGES = 25;
    private int nbrAnimals;

    public Zoo() {
    }

    public String getName() {
        return name;
    }

    public String getNbrAnimals() {
        return name;
    }

    public void setNbrAnimals(int NbrAnimals) {
        this.nbrAnimals = NbrAnimals;
    }

    public void setName(String name) {
        if (!name.isBlank())
            this.name = name;
        else
            System.out.println("write something");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Zoo(String name, String city/*, int nbrCages*/) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;


        // this.nbrCages = nbrCages;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + NBRCAGES);
    }

    boolean addAnimal(Animal animal) {
        if (isZooFull())
            return false;
        else {
            if (searchAnimal(animal) != -1)
                return false;
            if (nbrAnimals == NBRCAGES)
                return false;
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }

    }

    /**
     * @param animal
     * @return
     */
    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + NBRCAGES;
    }


    public boolean isZooFull() {

        if (NBRCAGES == nbrAnimals)
            return true;
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        if (z1.nbrAnimals == z2.nbrAnimals)
            return null;
        return z2;
    }


    //instruction 26 :
    int NBR_aquatics = 0;

    public void addAquaticAnimal(Aquatic aquaticA) {
        aquaticAnimals[NBR_aquatics] = aquaticA;
        NBR_aquatics++;
    }

    //instruction 29
    public float maxPenguinSwimmingDepth() {
        float maxSwimDepth = 0f;
        for (Aquatic animal : aquaticAnimals) {
            if (animal instanceof Penguin) {
                if (((Penguin) animal).getSwimmingDepth() > maxSwimDepth)
                    maxSwimDepth = ((Penguin) animal).getSwimmingDepth();
            }}
        return maxSwimDepth;

    }

    //instruction 30
    public void displayNumberOfAquaticsByType() {
        int NBRDolphins = 0;
        int NBRPenguins = 0;

        for (Aquatic animal : aquaticAnimals) {
            if (animal instanceof Dolphin)
                NBRDolphins++;
            else if (animal instanceof Penguin)
                NBRPenguins++;
        }
        System.out.println("number of Dolphins is : "+NBRDolphins);
        System.out.println("number of Penguins is : "+NBRPenguins);
    }
}