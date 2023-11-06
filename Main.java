import java.util.Scanner;
import java.lang.Math;
public class Main {
static double l=-1.0;
static double w=-1.0;

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Please choose a shape:\n(1)Square\n(2)Rectangle\n(3)Equilateral Triangle\n(4)Circle");
int option=input.nextInt();


//Clear Console
System.out.print("\033[H\033[2J");
System.out.flush();

switch (option) {
   case 1://Square
	System.out.println("You selected Square\nPlease Enter Length:");
	l=dimension();
	System.out.println("Please enter Width");
	w=dimension();
	Square square = new Square(l,w);
	System.out.println("Perimeter: " + square.calculatePerimeter() + "\nArea: " + square.calculateArea());
   	   break;
   case 2://Rectangle
	System.out.println("You selected Rectangle\nPlease Enter Length:");
	l=dimension();
	System.out.println("Please enter Width");
	w=dimension();
	Rectangle rectangle = new Rectangle(l,w);
	System.out.println("Perimeter: " + rectangle.calculatePerimeter() + "\nArea: "+ rectangle.calculateArea());
	   break;
   case 3://Triangle
	double s;
	System.out.println("You selected Triangle\nPlease Enter Side Length:");
	s=dimension();
	Triangle triangle = new Triangle(s);
	System.out.println("Perimeter: " + triangle.calculatePerimeter() + "\nArea: " + triangle.calculateArea());
   	   break;
   case 4://Circle
	double r;
	System.out.println("You selected Circle\nPlease Enter Radius:");
	r=dimension();
	Circle circle = new Circle(r);
	System.out.println("Circumference: " + circle.calculateCircumference() + "\nArea: " + circle.calculateArea());
	   break;
}

}
static double dimension(){
//System.out.println("You selected "+shape+"\nPlease Enter Length:");
Scanner input1= new Scanner(System.in);
double i=-1.0;
while (i==-1.0){
  try  {
     i=Math.abs(Double.parseDouble(input1.nextLine()));
  }catch (NumberFormatException ex){
     System.out.println("Enter a valid number:");
   }
  }
  return i;
 }

/*System.out.println("Please Enter Width:")
while(w==-1.0){
  try  {
     w=Math.abs(Double.parseDouble(input1.nextLine()));
  }catch (NumberFormatException ex){
     System.out.println("Enter a valid number:"+ex);
   }
  }
 }  */

}//Main Class
