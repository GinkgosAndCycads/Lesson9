
import TurtleGraphics.Pen;

public class Triangle extends AbstractShape {
private double x2, y2, x3, y3, area;
    public Triangle(){ 
    super(); 
    x2=100; 
    y2=100; 
    x3=50; 
    y3=0;
} 
    
    public double area() {
       area = Math.abs(xPos*(y2-y3) + x2*(y3-yPos) + x3*(yPos - y2))/2;
    return area;
    }
    
    public void draw(Pen p) {
        p.up(); 
        p.move(xPos,yPos); 
        p.down(); 
        p.move(x2,y2); 
        p.move(x3,y3); 
        p.move(xPos,yPos);
        
    }
    
    public void stretchBy(double factor) {
        xPos*=factor; 
        yPos*=factor; 
        x2= (x2-xPos) * factor + xPos; 
        y2*=(y2-yPos) * factor + yPos; 
        x3*=(x3-xPos) * factor + xPos; 
        y3*=(y3-xPos) * factor + xPos;
        
    } 
    
    public double perimeter(){ 
        double x, y, z;
        x = Math.sqrt((xPos-x2)* (xPos-x2) + (yPos-y2) * (yPos-y2)); 
        y = Math.sqrt((x2-x3)* (x2-x3) + (y2-y3) * (y2-y3)); 
        z = Math.sqrt((xPos-x3)* (xPos-x3) + (yPos-y3) * (yPos-y3)); 
        return x + y + z;
    }
    
    public String toString(){ 
        String str="This is a Triangle\n";
        str += "x1: " + xPos + "\ty1: " + yPos; 
        str += "\nx2: " + x2 + "\ty2: " + y2; 
        str += "\nx3: " + x3 + "\ty3: " + y3;
        str += "\n" + super.toString();
        return str;
    } 
    public void move(double xLoc, double yLoc){
        xPos-=xLoc;
        x2-=xLoc;
        x3-=xLoc;
        yPos-=yLoc;
        y2-=yLoc;
        y3-=yLoc;
    }
}
