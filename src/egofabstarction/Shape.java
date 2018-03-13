/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egofabstarction;

/**
 *
 * @author stuti
 */
abstract class Shape 
{
    int    x , y , z ;
    public abstract boolean isSimilar (Shape object);
    public abstract boolean isCongruent (Shape object);
    public void position (int x_coordinate , int y_coordinate , int z_coordinate )
    {
    this . x    =    x_coordinate ;
    this . y    =    y_coordinate ;
    this . z    =    z_coordinate ;
    System . out . println ( "The   position   are   updated   to   (" + x + "," + y + "," + z + ")" );
    }
}