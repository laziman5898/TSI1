import org.w3c.dom.html.HTMLOptGroupElement;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        int wall, h, w, doorAmount = 0, socketAmount=0, windowAmount=0, paintNeeded, litrePerArea = 16900, customDoorSize = 0;
        String color;


        System.out.println("They say the colour you are painting the wall indicates your personality , From the options below which colour are you going to paint the wall ? \n Black \n Green \n Red \n Blue \n Orange \n Other ");
        color = stringScanner.nextLine();
        switch (color) {
            case "Red":
                System.out.println("Good choice Bro ");
                break;
            case "Green":
                System.out.println("Your painting a wall the same colour as vomit");
                break;

            default:
                System.out.println("bad choice");
                break;
        }
        System.out.println("How many walls do you wish to paint");
        int amountOfWalls = scan.nextInt() ;
        int[] totalPaint = new int[(amountOfWalls+1)];

        for (int currentWall = 1 ; currentWall <= amountOfWalls ; currentWall++) {
            boolean doorsPresent, socketsPresent, windowsPresent;
            System.out.println("What is the width of wall Number " + currentWall + "in cm");
            w = scan.nextInt();
            System.out.println("What is the height of wall Number " + currentWall + "in cm");
            h = scan.nextInt();
            wall = w * h;
            int avgWindow = 5575, avgDoor = 15096, avgSocket = 126;
            System.out.println("Are there any doors in the Wall (Please Answer Yes or No)");
            String answer = stringScanner.nextLine();
            System.out.println(answer);
            if (answer.equals("Yes")) {
                System.out.println("How many doors are in the wall");
                doorAmount = stringScanner.nextInt();
                System.out.print("Do you know the size of the doors? (Please answer Yes or No)");
                answer = stringScanner.next();
                System.out.println(answer);
                if (answer.equals("Yes")) {
                    System.out.println("Are the doors the same height?");
                    answer = stringScanner.next();
                    if (answer.equals("No")) {
                        for (int i = 0; i < doorAmount; i++) {
                            System.out.println("What is the height of door number :" + i);
                            int customDoorHeight = scan.nextInt();
                            System.out.println("What is the width of door number :" + i);
                            int customDoorWidth = scan.nextInt();
                            customDoorSize += customDoorWidth * customDoorWidth;
                        }
                        doorAmount = customDoorSize;
                    } else if (answer.equals("Yes")) {
                        System.out.println("What is the width of the doors ?");
                        int doorWidth = scan.nextInt();
                        System.out.println("What is the height of the door ?");
                        int doorHeight = scan.nextInt();
                        doorAmount = doorAmount * (doorWidth * doorHeight);
                    } else {
                        doorAmount = doorAmount * avgDoor;
                    }
                }
            } else if (answer.equals("No")) {
                System.out.println("How many Windows");
                windowAmount = scan.nextInt() * avgWindow;
                System.out.println("How many Sockets");
                socketAmount = scan.nextInt() * avgSocket;
            }

            wall -= doorAmount + windowAmount + socketAmount;
            paintNeeded = wall / litrePerArea;
            totalPaint[currentWall] = paintNeeded;
        }


                System.out.println("How much is a Liter of paint");
                double paintCost = scan.nextDouble();
               // paintCost = paintCost ;
            int paintCostForRoom = 0;
            int area = 0 ;
            for(int i = 0 ; i<totalPaint.length ; i++){

                area += totalPaint[i];
                paintCostForRoom +=totalPaint[i]*paintCost ;
            }

            int completePaintNeeded = area/ litrePerArea ;

        System.out.println("The area of the room :" + area + "\n The amount of paint  \n The amount of paint needed is : " + completePaintNeeded + "\n The total cost would be : " + paintCostForRoom);
                //System.out.println(" The wall size is : " + wall + " cm \n The amount of paint needed is :  litres \n The cost of the paint will be : " + paintCost + " pounds");



/*



        /*



        System.out.println("Hello Word");

        //Experiments whilst waiting
        Calc calculator = new Calc() ;

        Person james = new Person("James", 21) ;

        james.depositMoney(200);
        james.transaction((float) 49.99,"Playstation Game");
        james.transaction( 7,"Food Shoppping");
        System.out.println(james.transactionHistory());

*/

    }
}
