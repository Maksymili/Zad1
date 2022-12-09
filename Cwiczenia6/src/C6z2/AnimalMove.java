package C6z2;

public interface AnimalMove {
    default void move(){
        System.out.println("The animal is moving");
    }

}