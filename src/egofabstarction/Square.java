
package egofabstarction;

public class Square extends Shape     
{ 
    int side;
    
    public Square(int length)
    {
        this.side = length;
    }

@Override

public boolean isSimilar(Shape object)
{
    
    if(this.getClass() == object.getClass())
    {
        return true;
    }
    else 
    {
        return false;
    }
}

@Override

public boolean isCongruent(Shape object)
{
    if(this.getClass() == object.getClass())
    {
        Square sq2 = (Square) object ;
        if (this.side == sq2.side)
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
    

