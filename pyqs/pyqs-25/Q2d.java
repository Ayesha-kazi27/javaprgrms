// Write a program to calculate area of triangle, circle and rectangle. Make use of abstract class.
abstract class Shape {
 abstract double area();
}

class Triangle extends Shape {
 double base, height;
 Triangle(double base, double height) {
 this.base = base;
 this.height = height;
 }
 double area() {
 return 0.5 * base * height;
 }
}

class Circle extends Shape {
 double radius;
 Circle(double radius) {
 this.radius = radius;
 }
 double area() {
 return 3.14 * radius * radius;
 }
}

class Rectangle extends Shape {
 double length, width;
 Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 double area() {
 return length * width;
 }
}

class Q2d {
 public static void main(String args[]) {
 Triangle t = new Triangle(10, 5);
 Circle c = new Circle(7);
 Rectangle r = new Rectangle(8, 6);

 System.out.println("Area of Triangle: " + t.area());
 System.out.println("Area of Circle: " + c.area());
 System.out.println("Area of Rectangle: " + r.area());
 }
}