import java.io.*;
class CalculateVolume
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shape shape = null;
        double radius = 0;
        double height = 0;
        int choose;
        {
            do {

                System.out.print("\n1.Sphere" + "\n2.Cube" + "\n3.Exit " + "\nEnter your choice : ");
                choose = Integer.parseInt(br.readLine());
                switch (choose) {
                    case 1:
                        System.out.print("Enter radius of sphere:");
                        radius = Double.parseDouble(br.readLine());
                        shape = new Sphere(radius);
                        break;
                    case 2:
                        System.out.print("Enter height of cube:");
                        height = Double.parseDouble(br.readLine());
                        shape = new Cube(height, radius);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
                if (shape != null)
                    System.out.println("Volume = " + shape.calcVolume());

            }
            while (choose != 3);

        }
    }

}
