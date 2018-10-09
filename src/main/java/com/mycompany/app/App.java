package com.mycompany.app;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean search(ArrayList<Integer> array,ArrayList<Integer> array1,int k, int e) {
      System.out.println("inside search");
      if (array == null) return false;
      if (array1 == null) return false;
      if(array.size()==0 || array1.size()==0) return false;

      boolean sonuc1=false;
      boolean sonuc2=false;
      
      for (int elt : array) {
        if (elt == (k+e)) sonuc1=true;
      }
      for (int elt1 : array1) {
          if (elt1 == (k-e)) sonuc2=true;
        }
      return sonuc1&&sonuc2;
    }
}
