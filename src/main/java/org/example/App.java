package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )    {
        System.out.println( "Hello World!" );
        String [][] board = {{"_","#","#","_","_"}, {"_","#","_","#","_"}, {"_","#","#","_","#"} };
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
            for (int i=0; i<map.length; i++ ){ /*i = colum*/
                String above = "";
                String same = "";
                String below = "";

                if(i ==0){
                    above = (map[row].substring(i));

                }
                System.out.println(above);

            }
        }

        return newMap;
    }

    public static String [][] GenNewBoard(String [][] board){
        String [][] newBoard;

        newBoard = new String [][] {{"_","#","#","_","_"}, {"_","#","_","#","_"}, {"_","#","#","_","#"} };

        return newBoard;
    }
}
