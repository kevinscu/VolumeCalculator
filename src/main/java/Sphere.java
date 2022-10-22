class Sphere extends Shape
{
    Sphere(double radius)
    {
        super(radius, 0, 0);
    }

    double calcVolume()
    {
        //double sphereVolume = (4*3.14*Math.pow(radius,3)/3);
        double sphereVolume = ((4.0/3.0)*3.14285714286*(radius*radius*radius));
        sphereVolume = (Math.round(sphereVolume * 100));
        return (sphereVolume / 100);
    }
}
