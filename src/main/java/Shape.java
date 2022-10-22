abstract class Shape
{
    double radius;
    double height;
    double edge;
    Shape(double radius, double height, double edge)
    {
        this.radius = radius;
        this.height = height;
        this.edge = edge;

    }
    abstract double calcVolume();
}
