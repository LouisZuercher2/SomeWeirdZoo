package DecoratorPatternGodzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MechaGodzillaTest {

    @Test
    public void attackPowerTest(){
        MechaGodzilla mechaGodzilla = new MechaGodzilla();
        assertEquals(20, mechaGodzilla.attackPower());
        Godzilla g = new ShoulderCannons(mechaGodzilla);
        assertEquals(25, g.attackPower());
        Godzilla ng = new GiganticNunchucks(g);
        assertEquals(225, ng.attackPower());
    }

}