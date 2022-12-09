import java.util.Scanner;

 class Student {
    String USN;
    String name;
    int size;
    int credits[];
    int marks[];
    double result;

    Student (){}

    Scanner s = new Scanner(System.in);
    
    void input (){

        System.out.println("Enter USN and name");
        USN = s.next();
        name = s.next();

        System.out.println("Enter the number of subjects:");
        size=s.nextInt();
        credits = new int[size];
        marks = new int[size];

        System.out.println("Enter credits of "+size+"subjects:");

        for (int i=0; i<size; i++){
            credits[i] = s.nextInt();
        }
        System.out.println("Enter marks for the "+size+"subjects:");
        for (int i=0; i<size; i++){
            marks[i] = s.nextInt();
        }

    }
    void display (){

        System.out.println("USN: "+USN+" Name: "+name);
        System.out.println("Credits: ");

        for (int i=0; i<size; i++){
            System.out.printf("%d\t",credits[i]);
        }

        System.out.printf("\nMarks: ");

        for (int i=0; i<size; i++){
            System.out.printf("%d\t",marks[i]);
        }
    }
    double sgpa (){

        int grade[] = new int[size];

        for (int i=0; i<size; i++){
            
            if (marks[i]>=90){
                grade[i]=10;
            }
            else if (marks[i]>=80){
                grade[i]=9;
            }
            else if (marks[i]>=70){
                grade[i]=8;
            }
            else if (marks[i]>=60){
                grade[i]=7;
            }
            else if (marks[i]>=50){
                grade[i]=6;
            }
            else if (marks[i]>=40){
                grade[i]=5;
            }
            else{
                System.out.println(marks[i]+" is invalid!");
            }
        }
        result=0;
        int credit_sum = 0;

        for (int i=0; i<size; i++){

            result += grade[i]*credits[i];
            credit_sum += credits[i];
        }
        result = (result/credit_sum);

        return result;
    }
}

class person {
    public static void main(String[] args) {
      
        Student s1 = new Student();
	s1.input();
	s1.display();
	System.out.println("SGPA="+s1.sgpa());
  
    }
}