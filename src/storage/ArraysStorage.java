package storage;

import model.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArraysStorage {
    protected List<Dog> storage = new ArrayList<>();

    public void create(Dog dog) {
        storage.add(dog);
    }

    public void read(int index) {
        String one = storage.get(index).toString();
        System.out.println(one);
    }

    public void update(int index, Dog newDog) {
        storage.set(index, newDog);
    }

    public void delete(int index) {
        storage.remove(index);
    }

    //additional methods
    public void getAll() {
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.get(i));
        }
    }

    public void clear() {
        storage.clear();
    }

    public int getSize() {
        return storage.size();
    }
}
