package Printable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino>, Printable{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public void printAllFields() {
        System.out.println(this);
    }

    @Override
    public int compareTo(Domino d) {
        if (left > d.left) {
        }else if (left == d.left) {
            if (right > d.right) {
            }
        }
        return -1;
    }
}