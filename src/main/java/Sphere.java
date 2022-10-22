class Sphere extends Shape
{
    Sphere(double radius)
    {
        super(radius, 0);
    }
    double calcArea()
    {
        return 4*3.14*radius*radius;
    }
    double calcVolume()
    {
        return 4*3.14*Math.pow(radius,3)/3;
    }
}
