import org.junit.Assert;
import org.junit.Test;


public class ShapeTests {

    Cube cubeTest;
    Sphere sphereTest;
    RegularTetrahedron RegularTetrahedronTest;
    
    @Test
    public void testSphereVolumeWithRadiusOne()  {
        sphereTest = new Sphere(1);
        Assert.assertEquals(4.19, sphereTest.calcVolume(), 0.01);
    }

    @Test
    public void testSphereVolumeWithRadiusFive()  {
        sphereTest = new Sphere(5);
        Assert.assertEquals(523.6, sphereTest.calcVolume(), 0.3);
    }

    @Test
    public void testCubeVolumeWithHeightOne() {
        cubeTest = new Cube(1);
        Assert.assertEquals(1, cubeTest.calcVolume(), 0.01);
    }

    @Test
    public void testCubeVolumeWithHeightFive() {
        cubeTest = new Cube(5);
        Assert.assertEquals(125, cubeTest.calcVolume(), 0.01);
    }

    @Test
    public void testRegularTetrahedronVolumeWithEdgeOne() {
        RegularTetrahedronTest = new RegularTetrahedron(1);
        Assert.assertEquals(0.12, RegularTetrahedronTest.calcVolume(), 0.01);
    }

    @Test
    public void testRegularTetrahedronVolumeWithEdgeFive() {
        RegularTetrahedronTest = new RegularTetrahedron(5);
        Assert.assertEquals(14.73, RegularTetrahedronTest.calcVolume(), 0.01);
    }

    //End Of Tests
}



