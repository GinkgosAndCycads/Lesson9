import TurtleGraphics.Pen;

public class Wheel extends Circle {
    // The number of spokes in the wheel 
    // xPos, yPos, and radius are inherited from Circle
   private int spokes; 

   public Wheel() {
      super();           
      spokes = 0;
   }

   public Wheel (double xLoc, double yLoc, double r, int s) {
      super (xLoc, yLoc, r); 
      // Activate the constructor
      // Circle (double xLoc, double yLoc, double r)
      // to initialize xPos, yPos, and radius.
      // Now initialize spokes.
      spokes = s;             
   }
 
   public void draw (Pen p) {
      // Draw the wheel's rim by calling the draw method in the superclass.
      super.draw (p);
      
      // Draw the spokes
      for (int i = 1; i <= spokes; i++){
         p.up();
         p.move (xPos, yPos);
         p.setDirection (i * 360.0 / spokes);
         p.down();
         p.move (radius);
      }      
   }
   
   public void setSpokes (int s) {
      spokes = s;
   }

   public String toString() {
      String str = "Wheel\n";
             str += "Radius: " + radius + "\n";
             str += "Spokes: " + spokes + "\n";
             str += "(X,Y) Position: (" + xPos + "," + yPos + ")\n";
             str += "Area: " + area() + "\n";
             str += "Perimeter: " + perimeter();
      return str;
   }
}
