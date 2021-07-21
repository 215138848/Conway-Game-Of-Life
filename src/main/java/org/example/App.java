package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )    {
        System.out.println( "Hello World!" );
        String [] map = {"_#_", "_#_", "_#_"};
        int rows = 3;

        for(int i=0; i<rows; i++){
            System.out.println("Generation " + i + ":");
            System.out.println(Arrays.toString(map));
            map = life(map);
        }
    }

    public static String[] life(String [] map){
        String [] newMap = new String[map.length];

        for (int row =0; row< map.length; row++){
            newMap[row]="";
            for (int i=0; i<map.length; i++ ){
                String above = "";
                String same = "";
                String below = "";

                if(i ==0){

                }
            }
        }

        return newMap;
    }
}
