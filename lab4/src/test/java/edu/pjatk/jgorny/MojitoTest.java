package edu.pjatk.jgorny;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MojitoTest {

       private Mojito mojito;


    @Test
    public void testMojitoAmount(){
        mojito = mock(Mojito.class);
        when(mojito.getQuantity()).thenReturn(100);
        assertNotEquals(20, mojito.getQuantity());
    }

    @Test


}
