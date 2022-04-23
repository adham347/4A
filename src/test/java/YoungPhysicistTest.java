import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class YoungPhysicistTest {

    @Test
    public void equilibrium(){
        int[][] array={{0,0,0},{0,0,0},{0,0,0}};
        YoungPhysicist coordinates= new YoungPhysicist(3,array);
        assertEquals("yes",coordinates.IsEquilibrium());
    }
    @Test
    public void notEquilibrium(){
        int[][] array={{1,0,0},{1,0,0},{0,2,0}};
        YoungPhysicist coordinates= new YoungPhysicist(3,array);
        assertEquals("no",coordinates.IsEquilibrium());
    }
    @Test
    public void NoForces(){
        int[][] array={{0,0,0},{0,0,0},{0,0,0}};
        YoungPhysicist coordinates= new YoungPhysicist(0,array);
        assertEquals("not enough forces",coordinates.IsEquilibrium());
    }
    @Test
    public void OneForceOnlyEquilibrium(){
        int[][] array={{0,0,0}};
        YoungPhysicist coordinates= new YoungPhysicist(1,array);
        assertEquals("yes",coordinates.IsEquilibrium());
    }
    @Test
    public void OneForceOnlyNoTEquilibrium(){
        int[][] array={{1,0,0}};
        YoungPhysicist coordinates= new YoungPhysicist(1,array);
        assertEquals("no",coordinates.IsEquilibrium());
    }
}