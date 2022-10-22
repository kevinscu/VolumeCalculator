class RegularTetrahedron extends Shape
{
    RegularTetrahedron (double edge)

    {
        super(0,0, edge);
    }

    @Override
    double calcVolume() {
        double result = (Math.pow(edge, 3) / (6 * Math.sqrt(2)));
        result = Math.round(result * 100);
        return (result / 100);
    }

}

