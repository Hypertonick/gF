/*
 * Write your program inside the main method to compute the 
 * Gravitational Force according to the assignment description.
 * 
 * To compile:
 *        javac GravitationalForce.java
 * To execute:
 *        java GravitationalForce 36000.0 1080.0 50.0
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class GravitationalForce {

    public static void main(String[] args) {
       
        double mass1 = Double.parseDouble(args[0]);
        double mass2 = Double.parseDouble(args[1]);
        double distance = Double.parseDouble(args[2]);
        double gravitationalConstant = 6.67 * Math.pow(10, -11);
        double gravitationalForce = (gravitationalConstant * mass1 * mass2)/(distance * distance);
        System.out.println(gravitationalForce);
    }
}
