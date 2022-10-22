abstract class Shape
{
    double radius;
    double width;
    double edge;
    Shape(double radius, double width, double edge)
    {
        this.radius = radius;
        this.width = width;
        this.edge = edge;
    }

    abstract double calcVolume();
}
