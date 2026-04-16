package ThePrototypePattern;

public class Rabbit implements Cloneable {
    private int age;
    private String breed;
    private Person owner; //

    public Rabbit() {}

    // Getter & Setter
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
    public void setBreed(String breed) { this.breed = breed; }
    public void setOwner(Person owner) { this.owner = owner; }
    public Person getOwner() { return owner; }

    
    @Override
    public Rabbit clone() {
        try {
            
            Rabbit clonedRabbit = (Rabbit) super.clone();
            
            
            if (this.owner != null) {
                clonedRabbit.owner = new Person(this.owner.getName());
            }
            
            return clonedRabbit;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Rabbit [Age=" + age + ", Breed=" + breed + ", Owner=" + owner.getName() + "]";
    }
}
