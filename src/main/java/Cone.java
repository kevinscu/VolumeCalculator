class Cone extends Shape
{
    Cone(double radius, double height)
    {
        super(radius, height);
    }
    double calcVolume()
    {
        return 3.14*height/3;
    }
}
