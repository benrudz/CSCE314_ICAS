import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// %%%%%%%%%%%%%%%%%%%% QUESTION 2 %%%%%%%%%%%%%%%%%%%%%%%
		
		int curve = -1;
		float grade = (float) -0.0;
		// Create the Scanner code to gather a float and an integer using the variables already created
		System.out.println("Please enter the grade you received: ");
		// code here
		grade = sc.nextFloat();
		System.out.println("Please enter the curve percentage you will receive: (example 5%) ");
		// code here
		curve = sc.nextInt();
		
		
		// just for a hint for the integer (Integer) portion, try below:
		// https://docs.oracle.com/javase/8/docs/api/?java/lang/Integer.html
		

		System.out.println("Here are the values collected");
		// Display both values collected using a System.out.println
		System.out.println(grade +" "+ curve);
		System.out.println(curvedGrade(grade, curve));
		// %%%%%%%%%%%%%%%%%%%% QUESTION 2 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 3 %%%%%%%%%%%%%%%%%%%%%%%
		
		// Using the variables and the new values recieved (curve and grade), call the curvedGrade  
		// (first one) function from here and display the results the function returns here
		// 1. call function
		// 2. display result
		
					
		// %%%%%%%%%%%%%%%%%%%% QUESTION 3 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 4 %%%%%%%%%%%%%%%%%%%%%%%
		
		// Create instance of a Student here
		// call and pass values to curvedGrade (second one) function
		// display the new results ONLY using the "get" Student class functions
		Student mystudent = new Student("Brian", "George", grade);
				// FIX: ADD function curvedGrade with parameters mystudent and curve. This will change the value of the grade within student to the curved value.
		float stuScore = mystudent.getscore();
		System.out.println(stuScore);
		
		// display the new results ONLY using the "toString" Student class functions
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 4 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 5 %%%%%%%%%%%%%%%%%%%%%%%
		
		int value1 = 23;
		float value2 = (float) 23.5;
		String value3 = "Lupoli";
		int [] value4 = {2,3,4,5};

		// using the values directly above, call the passingExercise function
		// notice the displays below. Which values were changed by the function??
		
		System.out.println("Here is the resulting value for value1->" + value1);
		System.out.println("Here is the resulting value for value2->" + value2);
		System.out.println("Here is the resulting value for value3->" + value3);
		System.out.println("Here is the resulting value for value4->" + value4);
		
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 5 %%%%%%%%%%%%%%%%%%%%%%%
		
		
		System.out.println("Program complete.");
		
		

	}
	
	public static float curvedGrade(float thisGrade, int percentCurve)
	{
		float result = 0; // default value
		float hundred = 100;
		result = thisGrade *(1 + percentCurve/hundred);
		
		
		return result;
	}

	public static void curvedGrade(Student thisStudent, int percentCurve)
	{
		// reset value in Student instance to new curved grade!!
		float grade = thisStudent.getscore();
		float hundred = 100;
		//float result = grade *(1 + percentCurve/);
				// FIX: Because this is a VOID function (returns nothing), you need to feed the new curved grade into the student so it can be retrieved later with the getscore() function.
				// FIX: Use the setscore function and pass the result as the parameter
	}
	
	public static void passingExercise(int x, float y, String z, int [] array)
	{
		x = x * 10;
		y = y * 10;
		z += 'Z';
		array[0] = -23;
	}

}
