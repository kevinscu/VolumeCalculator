abstract class Shape
{
    double radius;
    double height;
    Shape(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    abstract double calcVolume();
}
