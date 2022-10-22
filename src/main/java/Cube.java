class Cube extends Shape
{
    Cube (double height)
    {
        super(0,height);
    }
    double calcVolume()
    {
        return height*height;
    }
}

