package com.vk.quasys;

public class QuadraticEquation {
	
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
	
    public static Roots findRoots(double a, double b, double c) {
    	
    	Roots roots;
    	    try {
    	    	
    	    	double x1 = -b + Math.sqrt(b*b - 4*a*c);
    	    	double x2 = -b - Math.sqrt(b*b - 4 *a *c);
    	    	
    	    	    roots = new Roots(x1, x2);
    	    	    return roots;
    	    } catch (Exception e) {
    	        throw new UnsupportedOperationException("Waiting to be implemented.");
    	    }
    }
    
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}


