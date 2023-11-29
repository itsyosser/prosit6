package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic{

    private float SwimmingDepth;

    public Penguin() {
        System.out.println("hiii penguin");
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        SwimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return SwimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        SwimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString()+ "SwimmingDepth:" + this.SwimmingDepth;
    }


    public void swim(){
        System.out.println("This aquatic Penguin is swimming.");
    }
}
