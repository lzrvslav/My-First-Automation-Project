package Lecture6.Exercises;

public class Exercise2 {
    public static void main(String[] args){
        printElementsOf2DMatrix();
    }
    public static void printElementsOf2DMatrix(){
        int[][] multiArray = {
                {3,1, 15, 6},
                {20,60, 70, 9},
                {236,4, 18, 11},
                {1,2, 13, 11},
        };
        for (int row =0; row<multiArray.length; row++)
            for (int column=0; column< multiArray[row].length; column++){
                System.out.println("Value of row "+row+" and culm "+column+" is: "+multiArray[row][column]);
            }

    }
}
