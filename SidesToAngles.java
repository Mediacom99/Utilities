package functionality;



/**
 * class [method name: printAngles] which output the angles of the triangle 
 * which sides are long as the number you type as parameter 
 * [open declaration for more Info]
 * rule for parameters: **THEY MUST BE FROM THE BIGGEST (A) TO THE SMALLEST (C)**
 * @param A first side, IT MUST BE THE BIGGEST NUMBER 
 * @param B second side IT MUST BE SMALLER THAN A and BIGGER THAN C
 * @param C third side IT MUST BE THE SMALLEST NUMBER
 * @return no value --> print method
 * @author edoardo
	 */








public class SidesToAngles extends HOME {
	/* first method --> equilateral triangle  
	 * second method --> isosceles triangle
	 * third method --> rectangular triangle
	 * fourth method --> scalene triangle
	 * 
	 * HOW IT WORKS: 1) INPUT = length of three sides of a triangle (or x,y coordinates and calculate distance)
	 *               2) java recognizes what type of triangle it is
	 *               3) find the angles in that type of triangles
	 *               4) output: a) what kind of triangle
	 *                          b) all three angles 
	 *                          
	 ****** IMPROVEMENT OF THE PROGRAM = how to understand the position of those angles (of what sides are they adjacent?)******
	 *
	 * MADE BY = Edoardo Bertoli  [10/25/16]
	 *
	 */             // [][][][] IF YOU USE SIN COS ASIN ACOS REMEMBER TO CHANGE THE RESULT IN DEGREES (Math.toDegrees(<value>);) [][][][]
	
	
	
	
	/*           ********************************************************************
	 *           *WRITE SIDES OF THE TRIANGLE FROM THE BIGGEST(a) TO THE SMALLEST(c)*
	 *           ********************************************************************
	 */
	
	
    public static void printAngles(double A, double B, double C) {
    	
    	 
    	
    	if (A < B+C && B< A+C && C< A+B && A> Math.abs(B-C) && B > Math.abs(A-C) && C> Math.abs(A-B) ) {   // A must be the greatest side, this is the existing condition of a triangle
    	double a = A;                                           
    	double b = B;                                           
    	double c = C;
    	
    	
    	
    	if (a==b && b==c && a==c) {
    		equilateralTriangle();
    	}else if((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
    		isoscelesTriangle(a,b,c);
    	}else if(Math.pow(a,  2) == Math.pow(b, 2) + Math.pow(c, 2)) {
    		rectangularTriangle(a,b,c);
    	}else{
    		scaleneTriangle(a,b,c);
    	
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	}else{ //HERE BIG IF CLOSES
    		System.out.println("***ERROR*** This triangle doesn't exist");
    	}
    	
    	
    	
   } //HERE MAIN METHODS CLOSE
    
    
    
    public static void equilateralTriangle() {
    	
    	System.out.println("This is an equilateral triangle: ");
		System.out.println("All the three angles are: 60.0 degrees");
    	System.out.println("Sum of all angles: 180.0 degrees");
		
    }
    
    public static void  rectangularTriangle(double a, double b, double c){    //I always know that a is the bigger number 
       
       
    	  //condition of recognition of rectangular triangle
    		
    		System.out.println("This is a rectangular triangle:");
    		System.out.println();
    		System.out.println("first angle is: 90.00000000000000 degrees");
    		
    		double betaAngle = Math.toDegrees(Math.asin(c/a));
    		
    		
    		System.out.println("second angle is: " + betaAngle +" degrees");
    		double alfaAngle = 180 -(90 + betaAngle);
    		System.out.println("third angle is: " + alfaAngle +" degrees");
    		System.out.println("Sum of all angles is: " + (betaAngle+alfaAngle+90.0));
    	
      
    }
    
    public static void isoscelesTriangle(double a, double b, double c) {
        	
        	 double firstAngle = (Math.toDegrees(Math.asin((c / 2) / a)))*2;
        	 double secondAndThirdAngles = (180-firstAngle)/2;
        	 System.out.println("This is an isosceles triangle :");
        	 System.out.println();
        	 System.out.println("first angle is: " + (2.0 * firstAngle) + " degrees");
        	 System.out.println("second and third angles are both equal to: " + secondAndThirdAngles + " degrees");
        	 System.out.println("Sum of all angles is: " + (firstAngle+(secondAndThirdAngles*2)));
        	 
        	 
         }

         
    public static void scaleneTriangle(double a, double b, double c) {
        	
        		 double firstDivisionNumeratore = Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2);
        		 
        		 
        		 
        		 double firstDivisionDenominatore = 2*b*c;
        		 
        		 double firstDivision = firstDivisionNumeratore / firstDivisionDenominatore;
        		 
        		 
        		 
        		 double firstAngle = Math.toDegrees(Math.acos(firstDivision));
        		 
        		double secondAngle = Math.abs(Math.toDegrees(Math.asin(c / (a / (Math.sin(firstAngle)) )  )  ) );  //I TAKE THE ABSOLUTE VALUE
        		//CHECK IF IT'S WRONG TO TAKE THE ABSOLUTE VALUE SO WHEN YOU FIND THE THIRD ANGLE THE ONLY SUBSTRACTION IS 180 - (FIRSTANGLE+SECONDANGLE)
        		
        		double thirdAngle = 180 - (firstAngle + secondAngle);
        		System.out.println("This is a scalene triangle: ");
        		System.out.println();
        		System.out.println("first angle is: " +  firstAngle + " degrees");
        		System.out.println("second angle is: " + secondAngle + " degrees");
        		System.out.println("third angle is: " + thirdAngle + " degrees");
        		System.out.println("Sum of all angles is: " + (firstAngle+secondAngle+thirdAngle));
        	 }
    
        		 
        
} 
     



