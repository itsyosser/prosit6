package tn.esprit.gestionzoo.entities;

public non-sealed /*abstract*/ class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
        System.out.println("hiii aquatic");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

//    public String getHabitat() {
//        return habitat;
//    }

//    public void setHabitat(String habitat) {
//        this.habitat = habitat;
//    }
    @Override
    public String toString() {
        return super.toString()+ "habitat:" + this.habitat;
    }
    //instruction 28
   // public /*abstract*/ void swim();
public void swim(){
    System.out.println("the auqtic animal is swimming");
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() == Aquatic.class){
            Aquatic aqua=(Aquatic) obj;
            return name.equals(aqua.name) && age == aqua.age && habitat.equals(aqua.habitat);
        }

        return false;
    }


}

