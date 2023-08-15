package com.epam.rd.autotasks.intersection;

public class Line {
    public int k;
    public int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
//  линии определяются линейными уравнениями:
//    x = (b2 - b1) / (m1 - m2)
//    y = m1*x + b1
    public Point intersection(Line other) {
        if (k == other.k){
            return null;
        } else {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        }
//        throw new UnsupportedOperationException();
    }
}