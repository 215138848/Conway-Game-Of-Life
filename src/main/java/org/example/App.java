package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )    {
        System.out.println( "Welcome to Conway's Game of Life." );
        Scanner scan = new Scanner(System.in);
        System.out.println( "Please enter the size of the board?" );
        int size = scan.nextInt();
        System.out.println( "Ready?" );
        String [][] board = GenNewBoard(size);
        System.out.println( "Set?" );
        
        //String [][] board = {{"_","#","#","_","_"}, {"_","#","_","#","_"}, {"_","#","#","_","#"} };

        for(int i=0; i<size; i++){
            System.out.println( "Go!!!" );
            System.out.println("Generation " + i + ":");
            //printing board
            for (int rows =0; rows<size; rows++){
                for (int columns=0; columns<size; columns++){
                    System.out.print(board[rows][columns] + " ");
                }
                System.out.println("");
            }
            board = life(board);
        }
    }

    public static String[][] life(String [][] board){
        int rows = board.length;
        int columns = board.length;

        String [][] newBoard = new String[rows][columns];

        for (int row =0; row< board.length; row++){

            for (int i=0; i<board.length; i++ ){ /*i = columns*/

                if(board[row][i] =="#"){
                    //if space is populated
                    int neighbourCount = neighbourCounter(board, row, i);
                    if(neighbourCount<=1){
                        newBoard[row][i] = "_"; //is dead
                    }
                    if(neighbourCount==2 || neighbourCount==3 ){
                        newBoard[row][i] = "#"; //is alive
                    }
                    if(neighbourCount>=4 ){
                        newBoard[row][i] = "_"; //is dead
                    }
                }
                if(board[row][i] =="_"){
                    //if space is unpopulated
                    int neighbourCount = neighbourCounter(board, row, i);
                    if(neighbourCount==3 ){
                        newBoard[row][i] = "#"; //is alive
                    }
                    else {
                        newBoard[row][i] = "_"; //is dead
                    }

                }

            }
        }

        return newBoard;
    }

    public static String [][] GenNewBoard(int size){
        String [][] newBoard;

        newBoard = new String [][] {{"_","#","#","_","_"}, {"_","#","_","#","_"}, {"_","#","_","#","_"}, {"_","#","_","#","_"}, {"_","#","#","_","#"} };

        return newBoard;
    }

    public static int neighbourCounter(String [][] board, int x, int y){
        int neighbourCount = 0;
        if(y!=0){
            if(x!=0){
                if(board[x-1][y-1] == "#"){neighbourCount++;}           //Start at bottom left
            }
            if(board[x][y-1] == "#"){neighbourCount++;}
            if(x!=board.length-1){
                if(board[x+1][y-1] == "#"){neighbourCount++;}
                            }
        }
        if(x!=0){
            if(board[x-1][y] == "#"){neighbourCount++;}
        }
        //if(board[x][y] == "#"){neighbourCount++;}     must not count the original
        if(x!=board.length-1){
            if(board[x+1][y] == "#"){neighbourCount++;}
        }
        if(y!=board.length-1){
            if(x!=0){
                if(board[x-1][y+1] == "#"){neighbourCount++;}
            }
            if(board[x][y+1] == "#"){neighbourCount++;}
            if(x!=board.length-1){
                if(board[x+1][y+1] == "#"){neighbourCount++;}           //End at top right
            }
        }

        return neighbourCount;
    }
}
