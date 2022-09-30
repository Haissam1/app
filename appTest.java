

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class appTest {

    @Test
    void loadingCargo() {
        RoRo c = new RoRo("DK", 100,400,20);
       assertEquals(true, c.loadingCargo(1,1));


    }

    }

