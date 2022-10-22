class Cube extends Shape
{
    Cube(double height)
    {
        super(height, 0);
    }
    double calcArea()
    {
        return (height*height);
    }
    double calcVolume()
    {
        return height/3;
    }
}

