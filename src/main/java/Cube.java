class Cube extends Shape
{
    Cube (double height)
    {
        super(0,height,0);
    }

    @Override
    double calcVolume() {


        double cubeVolume = (height*height*height);
        cubeVolume = Math.round(cubeVolume * 100);
        return (cubeVolume / 100);
    }
}



//    double calcVolume()
//    {
//        return height*height;
//    }
//}