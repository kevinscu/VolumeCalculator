class Cube extends Shape
{
    Cube(double h)
    {
        super(h, 0);
    }
    double calcArea()
    {
        return (h*h);
    }
    double calcVolume()
    {
        return h/3;
    }
}

