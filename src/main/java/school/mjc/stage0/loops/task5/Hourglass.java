package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        int center = 0;
        if(height%2==0){
            center = height/2;
        }else{
            center = height/2+1;
        }
        for (int i = 0; i < height; i++) {
                if(i!=0&&i!=height-1&&i<center-1){
                    for (int j = 1; j <= height; j++) {
                        if(j>i&&j<=height-i){
                            System.out.print("8");
                        }else{
                            System.out.print(" ");
                        }
                }
                }else if(i!=0&&i!=height-1&&i>center-1){
                    for (int j = 1; j <= height; j++) {
                        if (j >= height - i && j <= i + 1) {
                            System.out.print("8");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }else if(i==center-1){
                    if(height%2==0){
                        for (int j = 1; j <= height; j++) {
                            if (j == center||j==center+1) {
                                System.out.print("8");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }else {
                        for (int j = 1; j <= height; j++) {
                            if (j == center) {
                                System.out.print("8");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                else{
                    for (int j = 0; j < height; j++) {
                        System.out.print("8");
                    }
                }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(7);
    }
}
