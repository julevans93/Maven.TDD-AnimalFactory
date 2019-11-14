package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private Dog dog;

    @Before
    public void setUp(){
        dog = new Dog(null, null, 1);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest(){
        String givenName = "Rufus";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        String speak = "bark!";

        dog.speak();

        String dogSpeak = dog.speak();
        Assert.assertEquals(speak, dogSpeak);
    }

    @Test
    public void eatTest(){
        dog.eat(new Food());

        Integer expected =1;
        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setBirthdateTest(){
        Date birthDate = new Date();
        birthDate.setYear(2019);
        dog.setBirthDate(birthDate);

        Integer expected = 2019;
        Integer actual = dog.getBirthDate().getYear();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getID(){

        Integer expected = 1;
        Integer actual = dog.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfAnimal(){
        Boolean actual = dog instanceof Animal;

        Boolean expected = true;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceOfMammal(){
        Boolean actual = dog instanceof Mammal;

        Boolean expected = true;

        Assert.assertEquals(expected,actual);
    }


}
