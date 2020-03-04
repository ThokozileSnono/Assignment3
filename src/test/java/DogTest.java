import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog g = new Dog();
    //Pet p = new Pet();

    @Test
    public void speak() {
        Assert.assertEquals("Cat says Woof-Woof", g.speak());
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );

    }

    @Test(timeout = 10000)
    public void getDangerLevel()
    {
        Assert.assertEquals("3","3");
        while (true);
    }
}