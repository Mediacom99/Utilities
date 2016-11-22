package functionality;

/**This method output the distance between two Points described as A(x,y) B(x2,y2) [method name: distance]
 * 
 * @param x,y,x2,y2
 * @return Distance as a DOUBLE
 * @author edoardo
 *
 */




public class DistancePoints {
	public static void main(String[] args) { //plug in the number you want to use [x,y,x2,y2]
	    
	    }
	    public static double distance(double x, double y, double x2, double y2) { /*METHOD THAT CALCULATE DISTANCE
	                                                                              BETWEEN TWO POINTS*/
	        double step1 = Math.pow((x2 - x), 2);
	        double step2 = Math.pow((y2 - y), 2);
	        double distance = Math.sqrt(step2 - step1);
	        return distance;
	    }
	    
}

