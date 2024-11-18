import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;



public class Chapter1Test {

    static Chapter1 tester;

    @BeforeClass
    public static void setUp(){
        tester = new Chapter1();
    }

    @Test
    @DisplayName("DooBee test")
    public void dooBeeTest(){
        Assert.assertEquals("DooBeeDooBeeDo",tester.dooBee());
    }

    @Test
    @DisplayName("ABCD magnets")
    public void abcdMagnetsTest(){
        Assert.assertEquals("a-b c-d",tester.abcdMagnets());
    }

    @Test
    @DisplayName("Pool Puzzle")
    public void poolPuzzleOneTest(){
        Assert.assertEquals("a noise annoys an oyster",tester.poolPuzzleOne());
    }

}