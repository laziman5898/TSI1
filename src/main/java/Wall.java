import java.util.Scanner;

public class Wall {
    private int height;
    private int width ;
    private int incompleteWall ;
    private int completeWall ;

    private int holes ;
    Scanner intScan = new Scanner(System.in);

    public Wall () {
    }

    public void setWall(int currentWall) {
        System.out.println("What is the width of wall Number "+ currentWall + " in cm");
         width= intScan.nextInt();
        System.out.println("What is the height of wall  Number "+ currentWall + " in cm");
         height= intScan.nextInt();
         incompleteWall = width*height ;


    }



    public int getIncompleteWall () {
        return incompleteWall;
    }

    public int calcCompleteWall (int holes){
        completeWall = incompleteWall - holes ;
        return completeWall ;
    }


}
