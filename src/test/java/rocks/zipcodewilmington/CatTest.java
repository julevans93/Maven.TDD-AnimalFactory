package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Misty";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat(null, null, null);
        String speak = "meow!";

        cat.speak();

        String catSpeak = cat.speak();
        Assert.assertEquals(speak, catSpeak);
    }
    @Test
    public void setBirthDateTest(){
        Date birthDate = new Date();
        Cat cat = new Cat(null, birthDate, null);

        cat.setBirthDate(birthDate);

        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(birthDate, catBirthDate);
    }

    @Test
    public void eatFoodTest(){
        Cat cat = new Cat(null, null, null);

        Integer numberOfMealsExpected = 1;

        cat.eat(null);

        Integer numberOfMealsActual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(numberOfMealsExpected, numberOfMealsActual);

    }

    @Test
    public void getIDTest(){
        Cat cat = new Cat(null, null, 4);
        CatHouse cathouse = new CatHouse();

        cathouse.add(cat);

        Integer expectedID = 4;
        Integer actualID = cat.getId();

        Assert.assertEquals(expectedID,actualID);

    }

    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat(null, null, null);

        Boolean expected = true;

        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

}
