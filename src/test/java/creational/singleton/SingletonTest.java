package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {


    @Test
    void shouldCreateJustOneInstance() {
        MySingletonClass first = MySingletonClass.getInstance();
        MySingletonClass second = MySingletonClass.getInstance();

        assertSame(first, second);

        first.setSomeValue(first.getSomeValue() + 1);
        assertEquals(first.getSomeValue(), second.getSomeValue());

        second.setSomeValue(second.getSomeValue() + 1);
        assertEquals(first.getSomeValue(), second.getSomeValue());
    }

    @Test
    void shouldCreateJustOneInstanceOfSimpleSingleton() {
        MySimplerSingletonClass first = MySimplerSingletonClass.getInstance();
        MySimplerSingletonClass second = MySimplerSingletonClass.getInstance();

        assertSame(first, second);

        first.setSomeValue(first.getSomeValue() + 1);
        assertEquals(first.getSomeValue(), second.getSomeValue());

        second.setSomeValue(second.getSomeValue() + 1);
        assertEquals(first.getSomeValue(), second.getSomeValue());
    }
}
