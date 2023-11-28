package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++) {
            if(i==1||i==sideLength){
                for (int j = 1; j < sideLength; j++) {
                    System.out.print("8");
                }
                System.out.println("8");
            }else{
                System.out.print("8");
                for (int j = 1; j < sideLength-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("8");
        }
        }
    }

    public static void main(String[] args) {
        printSquareFrom8s(10);
    }
}
