import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainersTest {

    @Test
    void checkLoad() { // Returnere vores lastet container
    }

    @Test
    void checkCargo() { // Returnere alle vores specfikationer om skibet.
    }

    @Test
    void loadingCargo() {
        Containers d =new Containers("DK",100,200,400,10);
        d.loadingCargo(0); // Vi laster skibet med 0 container
        assertEquals(0, d.checkLoad()); // Tjekker om vores expteced værdi er ligmed vores checkload som returnere vores lastet container

        d.loadingCargo(10); // Vi laster skibet med 10 container
        assertEquals(10, d.checkLoad()); // Tjekker om vores expteced værdi er ligmed vores checkload som returnere vores lastet container
    }

    @Test
    void utilityLevelOfCapacity() {
        Containers e=new Containers("DK",100,200,20,100);
        e.loadingCargo(0); // Vi laster skibet med 0 container
        assertEquals(e.checkLoad(), e.utilityLevelOfCapacity()); // Tjekker om vores fraction er ligmed vores lastet cargo
        System.out.println(e.checkLoad());

        e.loadingCargo(10); // Vi laster skibet med 10 container
        assertEquals(e.checkLoad(),e.utilityLevelOfCapacity()); // Tjekker om vores fraction er ligmed vores lastet cargo
        System.out.println(e.checkLoad());
    }
}