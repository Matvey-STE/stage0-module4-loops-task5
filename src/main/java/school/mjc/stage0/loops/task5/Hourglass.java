package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int counterZero = 0;
        int counterStar = 0;
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height; j++){
                if (i < height/2 + 2 && (i == j || i+j == height+1 || (j > i && j < height - counterZero + i))){
                    System.out.print("8");
                } else if (i > height/2+1 && ((i == j || i+j == height+1)
                        || (j < i && j < height + counterZero && j > counterStar+1))){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                    if (i == height/2 + 1){
                        counterStar++;
                    }
                }
            }
            counterStar --;
            System.out.println();
            counterZero += 2;
        }
    }
}
