import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ShapeTests {

    Cube cube;
    //RegularTetrahedron regularTetrahedron;
    //Sphere sphere;

    @Before
    public void setUpTests() {
        cube = new Cube(1);
    }






    @Test

    public void testCubeVolume(){

        Assert.assertEquals(1, cube.calcVolume(), 0.01);
    }


}



