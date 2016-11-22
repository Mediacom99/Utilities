package functionality;

/** class [with the method printRange] which outputs all the numbers from A to B: 
 * for example from 1 to 5 is "1 2 3 4 5"  from 5 to 1 is "5 4 3 2 1"
 * @param from  number to start
 * @param to  last number of the series
 * @return no return value --> print method
 * @author edoardo
 *
 */


public class AllnumbersfromAtoB extends HOME {
   public static void main(String[] args){
	  printRange(0, 110);
   }
   public static void printRange(int a, int b){
	   final int test1 = (a - b) + 1;
	   final int test2 = (b-a) + 1;
	    if(a>b){
	    	
	        for(int i = 1; i <= test1; i++){
	         System.out.print(a);
	            System.out.print(" ");
	            a--;
	         
	        }
	        
	    }else if(a<b){
	        for (int i=1; i <= test2; i++){
	            System.out.print(a);
	            System.out.print(" ");
	            a++;
	        }
	        
	    }else{
	        System.out.print(a);
	    }
	}

}
