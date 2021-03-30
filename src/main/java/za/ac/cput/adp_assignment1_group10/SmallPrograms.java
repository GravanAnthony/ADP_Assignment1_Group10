/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_assignment1_group10;

/**
 *
 * @author Nawaaz Amien 219099839
 */
public class SmallPrograms {
    
    private String name;
    private int A, B;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "SmallPrograms{" + "name=" + name + ", A=" + A + ", B=" + B + '}';
    }

   
    
    
}
