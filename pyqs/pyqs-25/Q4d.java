//Write a program to demonstrate method overloading by overloading the methods for calculating volume of cylinder, cube and cuboid

public class Q4d {
    double vol(double side){
        //cube
        return side*side*side;
    }
    double vol(double r,double h){
        //cylinder
        return 3.14*r*r*h;
    }
    double vol(double l,double w, double h){
        //cuboid
        return l*w*h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4d obj = new Q4d();
        System.out.println("Enter the choice to find its volume \n1.cube \n2.cuboid \n3.cylinder");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the side to find volume of cube");
                double s = sc.nextDouble();
                double area = obj.vol(s);
                System.out.println("The volume of cube is "+area);
                break;
            case 2:
                System.out.println("Enter the length,width,height to find volume of cuboid");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                area = obj.vol(l,w,h);
                System.out.println("The volume of cuboid is "+area);
                break;
            case 3:
                System.out.println("Enter the radius and height to find volume of cylinder");
                double r = sc.nextDouble();
                h = sc.nextDouble();
                area = obj.vol(r,h);
                System.out.println("The volume of cylinder is "+area);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}