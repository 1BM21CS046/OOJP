import java.util.Scanner;

abstract class Calculate{
	double x,y,result;
	abstract void calc();
}

class Addition extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for addition : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x + y;
		System.out.println("Addition of " + x + " and "+ y + " is : " + result);
		}
	Addition(){}
}

class Subtraction extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for subtraction : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x - y;
		System.out.println("Subtraction of " + x + " and "+ y +  " is : " + result);
		}
	Subtraction(){}
}

class Multiplication extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for multiplication : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x * y;
		System.out.println("Multiplication of " + x + " and "+ y +  " is : " + result);
		}
	Multiplication(){}
}

class Division extends Calculate{
	void calc(){
		System.out.println("Enter two numbers x and y for dividion : ");
		Scanner SS = new Scanner(System.in);
		x = SS.nextDouble();
		y = SS.nextDouble();
		result = x / y;
		System.out.println("Division of " + x + " and "+ y + " is : " + result);
		}
	Division(){}
}

class Three{
	public static void main(String XX[]){
		Addition A = new Addition();
		A.calc();
		Subtraction S = new Subtraction();
		S.calc();
		Multiplication M = new Multiplication();
		M.calc();
		Division D = new Division();
		D.calc();
		}
}
		