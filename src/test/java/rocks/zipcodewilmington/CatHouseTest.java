package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    CatHouse catHouse = new CatHouse();
    Cat cat = new Cat(null, null, 2);

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null, 2);

        catHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(2);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeTest(){
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null,2);

        catHouse.add(cat);
        catHouse.remove(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(2);

    }
    @Test
    public void removeCatById(){
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null, 2);

        CatHouse.add(cat);
        CatHouse.remove(2);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(2);
    }

    @Test
    public void getCatById(){
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null, 2);

        CatHouse.add(cat);

        Cat expected = cat;
        Cat actual = catHouse.getCatById(2);
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null, 2);

        CatHouse.add(cat);

        int expected = 1;
        int actual = catHouse.getNumberOfCats();
    }

}
