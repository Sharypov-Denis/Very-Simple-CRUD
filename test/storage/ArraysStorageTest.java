package storage;

import model.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysStorageTest {
    protected ArraysStorage arraysStorage = new ArraysStorage();
    private static final Dog DOG_1 = new Dog("Name 1" , 1);
    private static final Dog DOG_2 = new Dog("Name 1" , 1);
    private static final Dog DOG_3 = new Dog("Name 1" , 1);

    @Before
    public void setUp() {
        arraysStorage.clear();
        arraysStorage.create(DOG_1);
        arraysStorage.create(DOG_2);
        arraysStorage.create(DOG_3);
    }

    @Test
    public void create() {

    }

    @Test
    public void read() {
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
        assertEquals(1, 1);
    }

    @Test
    public void getAll() {

    }

    @Test
    public void clear() {
        arraysStorage.clear();
        assertEquals(0, arraysStorage.getSize());
    }

    @Test
    public void getSize() {
        assertEquals(2 ,2);
    }

}