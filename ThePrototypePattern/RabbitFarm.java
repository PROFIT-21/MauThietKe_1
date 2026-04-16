package ThePrototypePattern;

public class RabbitFarm {
    public static void main(String[] args) {
       
        Rabbit originalRabbit = new Rabbit();
        originalRabbit.setAge(2);
        originalRabbit.setBreed("Himalayan");
        Person owner = new Person("Alice");
        originalRabbit.setOwner(owner);

       
        Rabbit clonedRabbit = originalRabbit.clone();

       
        System.out.println("Original: " + originalRabbit);
        System.out.println("Clone:    " + clonedRabbit);
        System.out.println("Age is same: " + (originalRabbit.getAge() == clonedRabbit.getAge()));

        
        originalRabbit.getOwner().setName("Bob");

        System.out.println("\n--- After changing Original Owner's name to Bob ---");
        System.out.println("Original Owner: " + originalRabbit.getOwner().getName());
        System.out.println("Clone Owner:    " + clonedRabbit.getOwner().getName()); 
        
       
    }
}
