package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    private DogHouse dogHouse;
    private Dog dog;

    @Before
    public void setUp(){
    dogHouse = new DogHouse();
    dog = new Dog(null, null, 2);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest(){
        dogHouse.add(dog);

        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest(){
        dogHouse.add(dog);

        dogHouse.remove(2);

        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        dogHouse.add(dog);

        dogHouse.remove(dog);

        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){
        dogHouse.add(dog);

        Dog expected = dog;
        Dog actual = dogHouse.getDogById(2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfDogs(){
        dogHouse.add(dog);

        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }

}
