import model.Dog;
import storage.ArraysStorage;

public class MainTest {

    static final ArraysStorage ARRAYS_STORAGE = new ArraysStorage();

    public static void main(String[] args) {
        Dog one = new Dog("Name 1", 1);
        Dog two = new Dog("Name 2", 2);
        Dog three = new Dog("Name 3", 3);

        ARRAYS_STORAGE.create(one);
        ARRAYS_STORAGE.create(two);
        ARRAYS_STORAGE.create(three);

        ARRAYS_STORAGE.read(0);
        ARRAYS_STORAGE.read(1);
        ARRAYS_STORAGE.read(2);

        ARRAYS_STORAGE.update(1, three);
        ARRAYS_STORAGE.read(1);
        ARRAYS_STORAGE.delete(2);
        three.setName("Marfa");
        ARRAYS_STORAGE.getAll();

        System.out.println(ARRAYS_STORAGE.getSize());
        ARRAYS_STORAGE.clear();
        System.out.println(ARRAYS_STORAGE.getSize());

    }
}
