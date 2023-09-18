import java.util.Scanner;

public class StdGradeCalculate
{
    public static void main(String args[])
    {
    	
        Scanner scanner = new Scanner(System.in);
        int i;
	int n;
	System.out.print("Enter the number of subjects:");
	n = scanner.nextInt();
	int marks[] = new int[n];
        float total=0, avg;
        for(i=0; i<n; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
      
        avg = total/n;
        System.out.println("The total marks are " + total);
	System.out.println("The average percentage " + avg);
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}