abstract class Shape
{
    double radius, height;
    Shape(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    abstract double calcArea();
    abstract double calcVolume();
}
