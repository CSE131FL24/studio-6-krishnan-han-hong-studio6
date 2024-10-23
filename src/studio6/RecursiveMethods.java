package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		
			if (n == 0) {
				return 0;
			}
			return  geometricSum(n-1) + 1.0/ Math.pow(2,n) ;
		
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
				StdDraw.circle(xCenter, yCenter, radius);
				double xCenter1 = xCenter - radius;
				double xCenter2 = xCenter + radius;
				double yCenter1 = yCenter - radius;
				double yCenter2 = yCenter + radius;
				radius = radius / 3;
				if(radius>=radiusMinimumDrawingThreshold) {
				circlesUponCircles(xCenter1, yCenter, radius, radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter2, yCenter, radius, radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter, yCenter1, radius, radiusMinimumDrawingThreshold);
				circlesUponCircles(xCenter, yCenter2, radius, radiusMinimumDrawingThreshold);
				}
				// FIXME
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			int i=0;
			reverse(i,array.length,array);
			return new int[0];
		
	}
	
	public static void reverse(int i, int length, int[] array) {
		int j=length-1;
		int save = 0;
		if(i>j) {
			save = array[i];
			array[i] = array[j];
			array[j] = save;
			i++;
			j--;
		}
		reverse(i, j+1,array);
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
