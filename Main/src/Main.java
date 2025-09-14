import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantsAgain = true;
        String answer;
        while (wantsAgain) {
            CalculateAvg(scanner);
            System.out.print("Do you want to calculate again? y/n \n> ");
            answer = scanner.next();
            if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Wrong input, try again. Do you want to calculate again? y/n");
                    answer = scanner.next();
                }
            }
            if (answer.equalsIgnoreCase("n")) {
                wantsAgain = false;
            }
        }


    }

    public static void CalculateAvg(Scanner scanner) {
        System.out.print("How many grades?\n> ");
        int gradesCount;
        if(!scanner.hasNextInt()) {
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong input. Try again.");
                System.out.print("> ");
                scanner.next();
            }
        }

        gradesCount = scanner.nextInt();
        int count = gradesCount;
        int[] array = new int[gradesCount];
        System.out.print("Enter your grades: ");
        int grade;
        int sum = 0;
        int i = 0;
        while (gradesCount > 0) {
            if (!scanner.hasNextInt()) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input. Try again.");
                    System.out.print("> ");
                    scanner.next();
                }
            }

            grade = scanner.nextInt();
            array[i] = grade;
            sum+= array[i];
            i++;

            gradesCount--;
        }
        int averageNum;
        averageNum =  sum / count;
        /*
        - A: ≥90
        - B: ≥80
        - C: ≥70
        - D: ≥60
        - F: <60
         */
        if (averageNum >= 90) {
            System.out.println("Your grade is A");
        }
        else if (averageNum >= 80) {
            System.out.println("Your grade is B");
        }
        else if (averageNum >= 70) {
            System.out.println("Your grade is C");
        }
        else if (averageNum >= 60) {
            System.out.println("Your grade is D");
        }
        else System.out.println("Your grade is F");

    }
}
