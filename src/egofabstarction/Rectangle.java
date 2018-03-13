
package egofabstarction;

public class Rectangle extends Shape
{ 
    int length ,breadth;

    public Rectangle (int length ,int breadth)    
    {
        this . length    =    length;
        this . breadth    =    breadth;
    }
    
    
    @Override

    public boolean isSimilar(Shape object)    
    {
        if (this.getClass() == object.getClass())    
        {
            Rectangle rect2 = (Rectangle)object;
            if ((this.length/this.breadth) == (rect2.length/rect2.breadth ))
            {
                return true;
            } 
             
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }    

    @Override
    public boolean isCongruent(Shape object)
    {
        if (this.getClass() == object.getClass ())
        {
            Rectangle rect2 = (Rectangle) object;
            if (this.length == rect2.length && this.breadth == rect2.breadth)
            {
            return true;
            }
            else
            {
            return false;
            }
        }    
        else
        {
            return false;
        }
   
    }
}