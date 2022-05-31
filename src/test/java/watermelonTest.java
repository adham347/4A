
    import org.junit.Test;
    import static org.junit.jupiter.api.Assertions.*;

public class watermelonTest {
    watermelon melon1 = new watermelon();
    @Test
    public void wLessThan2(){
        assertEquals(false,melon1.CanBeDivided(1));
    }
    @Test
    public void wEquals2(){
        assertEquals(false,melon1.CanBeDivided(2));
    }
    @Test
    public void wBelowRange(){
        assertEquals(false,melon1.CanBeDivided(-1));
    }
    @Test
    public void wAboveRange(){
        assertEquals(false,melon1.CanBeDivided(101));
    }
    @Test
    public void wIsEven20(){
        assertEquals(true,melon1.CanBeDivided(20));
    }
    @Test
    public void wIsEven50(){
        assertEquals(true,melon1.CanBeDivided(50));
    }
    @Test
    public void wIsUpperRange(){
        assertEquals(true,melon1.CanBeDivided(100));
    }
    @Test
    public void wIsOdd11(){
        assertEquals(false,melon1.CanBeDivided(11));
    }
    @Test
    public void wIsOdd55(){
        assertEquals(false,melon1.CanBeDivided(55));
    }
}