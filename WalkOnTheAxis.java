import java.util.Scanner;

public class WalkOnTheAxis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
                int tests = scanner.nextInt();
                for(int x = 0; x < tests; x++) {
                    int lights = scanner.nextInt();
                    int lightsTwo = scanner.nextInt();
                    int steps = 0;
                    int stepsTwo = 0;
                    while(lights > 0) {
                        steps += lights + 1;
                        lights--;
                    }
                    while(lightsTwo > 0){
                        stepsTwo += lightsTwo + 1;
                        lightsTwo --; 
                    }
                    System.out.println(steps);
                    System.out.println(stepsTwo);
                }
            }
        }
}