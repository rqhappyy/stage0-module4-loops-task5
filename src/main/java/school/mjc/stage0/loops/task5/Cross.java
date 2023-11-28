package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        int center = sideLength/2;
        for (int i = 0; i < sideLength; i++) {
            if (i == center) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
                System.out.print("\n");
            } else {
                for (int j = 1; j < sideLength; j++) {
                    System.out.print(" ");
                    if(j==center){
                        System.out.print("8");
                    }
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        printCross(5);
    }
}
