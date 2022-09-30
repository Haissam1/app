import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankersTest {

    @Test
    void checkCargo() { // Returnere alle vores specfikationer om skibet.
    }

    @Test
    void loadingCargo() {
            Tankers b = new Tankers("DK", 100,400,20,10,10);
            b.loadingCargo(0); // Laster vores container på skibet
            assertEquals(0,b.loadCargo);//  her tjekker vi om vores tanker starter på 0

            b.loadingCargo(10); // Laster vores container på skibet
            assertEquals(10, b.checkLoad()); // her tjekker vi om vores tanker er ligmed 10
    }

    @Test
    void utilityLevelOfCapacity() { // her tjekker vi at om vores fraction er
        Tankers c =new Tankers("DK",100,400,20,10,10);
        c.loadingCargo(0); // Vi laster skibet med 0 container
        assertEquals(0,c.utilityLevelOfCapacity()); // Tjekker om vores fraction er ligmed vores expected værdi

        c.loadingCargo(10); // Vi laster skibet med 10 container
        assertEquals(10,c.utilityLevelOfCapacity()); // Tjekker om vores fraction er ligmed vores expected værdi
    }
}
