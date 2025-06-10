import java.util.*;

import static java.lang.Math.sqrt;

abstract public class Pentagon extends GeometricObject implements Comparable<Pentagon> {
    double side = 1.0;
    private void Pentagon(){
        side = 1.0;
    }
    public void Pentagon (double x){
        side = x;
    }
    public double getArea () {
        double area = (sqrt(5 * (5 + 2 * (sqrt(5)))) * side * side) / 4;
        return area;
    }
    public double getPerimeter(){
        double perimeter = side*5;
        return perimeter;
    }
    public Pentagon max(Pentagon a, Pentagon b) {
        double pa = a.getPerimeter();
        double pb = b.getPerimeter();
        if (pa>pb)
            return a;
        else if (pb>pa)
            return b;
        else {
            System.out.println("Both pentagons have equal perimeter.");
            return null;
        }
    }
    public boolean equals(Object O){
        Pentagon other = (Pentagon) O;
        return other.getArea()==this.getArea();
    }
    public int compareTo(Pentagon h){
        if (this.getArea()>h.getArea())
                return 1;
        else if (this.getArea()<h.getArea())
            return -1;
        else return 0;
    }
}
