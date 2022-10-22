class Cube extends Shape
{
    Cube (double radius, double height)
    {
        super(height, radius);
    }
    double calcVolume()
    {
        return height*height;
    }
}

