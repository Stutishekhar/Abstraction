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
public class EgOfAbstarction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(4,2);
        Rectangle s = new Rectangle(6,3);
        Rectangle a = new Rectangle(6,3);
        Rectangle t = new Rectangle(7,6);
        System.out.println(r.isSimilar(s));
        System.out.println(s.isCongruent(a));
        System.out.println(r.isSimilar(t));
        System.out.printf("Rectangle r(4,2) and s(6,3) are similar:%b\n",r.isSimilar(s));
        System.out.printf("Rectangle s(6,3) and a(6,3) are Congruent:%b\n", s.isCongruent(a));
        System.out.printf("Rectangle r(4,2) and t(7,6) are similar:%b\n", r.isSimilar(t));
        System.out.printf("Rectangle r(4,2) and t(7,6) are congruent:%b\n", r.isCongruent(t));
        
        Square y = new Square(4);
        System.out.printf("Rectangle r(4,2) and Square y(4) are similar:%b\n", r.isSimilar(y));
        Square e = new Square(10);
        Square w = new Square(4);
        System.out.printf("The squares y(4) and e(10) are congruent:%b\n", y.isCongruent(e));
        System.out.printf("The squares y(4) and w(4) are congruent:%b\n", y.isCongruent(w));
    }
    
}
