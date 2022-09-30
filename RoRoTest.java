import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoRoTest {

    @Test
    void checkCargo() { // intet behov for unittest, da det er en String.

    }

    @Test
    void checkLoad() {
        RoRo d =new RoRo("DK", 100,400,20);
        d.loadingCargo(27,6);// vi har 27 biler 27*8 giver 216, trucks 6*30 =180 ialt 396
        double a = 396.0/400.0*100.0; // her udregner vi procentdelen.
        assertEquals(a,d.utilityLevelOfCapacity());

       // assertEquals(b,);
    }

    @Test
    void loadingCargo() {
        RoRo c = new RoRo("DK", 100,400,20);
        assertEquals(true, c.loadingCargo(27,6)); // cars in total is 216 and trucks in total is 180 =396 under 400 length
        assertEquals(false , c.loadingCargo(1,0));// vi prøver at tilføje en eksta bil.
        assertEquals(false,c.loadingCargo(0,1));// en ekstra truk.
        assertEquals(false,c.loadingCargo(-1,0)); // her tjekker vi om cars kan gå i minus
        assertEquals(false,c.loadingCargo(0,1));// her tjekker vi om truks kan gå i minus
    }

    @Test
    void utilityLevelOfCapacity() {
        RoRo b = new RoRo("DK", 100,400,20);
        b.loadingCargo(0,0);
        assertEquals(0,b.utilityLevelOfCapacity());// her tjekker vi om den starter på 0


    }
    @Test
    void utilityLevelOfCapacitymax() {
        RoRo b = new RoRo("DK", 100,400,20);
        b.loadingCargo(27, 6);
        System.out.println(b.utilityLevelOfCapacity());
        assertEquals(99,b.utilityLevelOfCapacity());// her tester vi om alt plads brugt i procent.
        assertEquals(false,b.loadingCargo(-10,0));// her tjekker om cars kan gå i minus
        assertEquals(false,b.loadingCargo(0,-10)); // her tjekker vi om trucks kan gå i minus

    }
}