/*
Design a class called Rectangle. It contains two data members as length(L) and breadth(B): and a member function getArea(). The member function computes the area of the given rectangle and returns it to the caller.

Note:
Area of a rectangle  = length x breadth
*/

import java.util.* ;
import java.io.*; 
public class Rectangle { 
  long length;
  long breadth;

  long getArea() {
     long area = length*breadth;
     return area; 
  }
}