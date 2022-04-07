package cmsc256;

/** 
  Determines if three doubles can be sides of triangle. 
*/
public class Triangle {
    /* *
     Determines if three doubles can be sides of triangle.
     */

   /** Length of side 1. */
   private final double sideA;

   /** Length of side 2. */
   private final double sideB;

   /** Length of side 3. */
   private final double sideC;

   /**
    * Creates a Triangle.
    *
    * @param aIn length of side 1.
    * @param bIn length of side 2.
    * @param cIn length of side 3.
    */
   public Triangle(double aIn, double bIn, double cIn) {

      if (aIn <= 0 || bIn <= 0 || cIn <= 0) {
         throw new IllegalArgumentException("Sides: " + aIn + " " + bIn + " " + cIn
                 + " -- are negative in value");       // add an explanation why this exception is being thrown.
      }

      if ((aIn >= bIn + cIn) || (bIn >= aIn + cIn) || (cIn >= aIn + bIn)) {
         throw new IllegalArgumentException("Sides: "
                 + aIn + " " + bIn + " " + cIn
                 + " -- does not form a shape");      // add an explanation why this exception is being thrown.
      }

      sideA = aIn;
      sideB = bIn;
      sideC = cIn;
   }

   /**
    *  Classifies a triangle based on the lengths of the three sides.
    *  The classifications are either: "equilateral", "scalene", "isosceles",
    *  or "not a triangle". The returned string must match one of these.Tri
    *
    * @return the triangle classification.
    */
   public String classify() {
      String result;
      //TODO:  implement this method according to the specification in the comment block
      if ((sideA == sideB) && (sideB == sideC)){
         result = "equilateral";
      }
      else if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC)){
         result = "scalene";
      }
      else if (((sideA == sideB) && (sideA != sideC)) || ((sideA == sideC) && (sideA != sideB)) || ((sideB == sideC) && (sideC != sideA))){
         result = "isosceles";
      }
      else {
         result = "not a triangle";
      }
      return result;
   }

}
