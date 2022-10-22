class Cube extends Shape
{
    Cube (double width)
    {
        super(0,width,0);
    }

    @Override
    double calcVolume() {

        double cubeVolume = (width*width*width);
        cubeVolume = Math.round(cubeVolume * 100);
        return (cubeVolume / 100);
    }
}

