import java.util.Scanner;
public class YourNameIsMine {
    
    public static boolean isMarryable(String firstName, String secondName, int firstNameLength, int secondNameLength) {
        if(firstNameLength == 0) {
            return true;
        }
        if(secondNameLength == 0) {
            return false;
        }
        if(firstName.charAt(firstNameLength - 1) == secondName.charAt(secondNameLength - 1)) {
            return isMarryable(firstName, secondName, firstNameLength - 1, secondNameLength - 1);
        }else {
            return isMarryable(firstName, secondName, firstNameLength, secondNameLength - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            String[] resultArray = new String[x];
            for(int i = 0; i < x; i++) {
                String[] names = {scanner.next(), scanner.next()};

                int nameOneLength = names[0].length();
                int nameTwoLength = names[1].length();

                boolean isMarryable = isMarryable(names[0], names[1], nameOneLength, nameTwoLength);
                boolean isMarryableTwo = isMarryable(names[1], names[0], nameTwoLength, nameOneLength);

                if(isMarryable || isMarryableTwo) {
                    resultArray[i] = "YES";
                }else {
                    resultArray[i] = "NO";
                }
            }
            for(String element : resultArray){
                System.out.println(element);
            }
        }
    }
}
