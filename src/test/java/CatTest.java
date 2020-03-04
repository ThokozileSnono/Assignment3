import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat c = new Cat();

    @Test
    public void move() {
        Assert.assertEquals("Cats says Woof-Woof", c.move());
    }
}