package edu.pjatk.jgorny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MojitoTest {

    private Mojito mojito;


    @Test
    public void testMojitoAmount() {
        mojito = mock(Mojito.class);
        when(mojito.getQuantity()).thenReturn(100);
        assertNotEquals(20, mojito.getQuantity());
    }

    @Test
    public void testMojitoInfinity() {
        mojito = mock(Mojito.class);
        when(mojito.getQuantity()).thenReturn(900);
        try {
            mojito.buy(100);
        } catch (NotEnoughMojito ex) {
            ex.printStackTrace();
        }
        assertEquals(900, mojito.getQuantity());
    }

    @Test
    public void quantityTest() {
        final Mojito drink = new Mojito(100);
        try {
            drink.buy(10);
        } catch (NotEnoughMojito ex) {
            ex.printStackTrace();
        }
        assertEquals(90, drink.getQuantity());
    }

    @Test
    public void drinkingTest() {
        final Mojito drink = new Mojito(100);
        assertThrows(NotEnoughMojito.class, () -> drink.buy(333));
    }



}
