package org.example.clasesGenericas;

public class Point2Dv2 <T extends Number>{
    T a;
    T b;
    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public Number suma()
    {
        if(a instanceof Double)
        {
            return a.doubleValue() + this.b.doubleValue();
        } else if (a instanceof Integer) {
            return a.intValue() + b.intValue();
        }
        return 0;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}
