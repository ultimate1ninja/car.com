import java.util.Scanner;

public class CarChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Car Enthusiast Chatbot!");
        System.out.println("Ask me anything about cars.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // Exit condition
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            // Get bot response
            String response = getBotResponse(userInput);
            System.out.println("Bot: " + response);
        }

        scanner.close();
    }

    private static String getBotResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("bmw")) {
            return "BMW is a German car manufacturer known for its performance vehicles.";
        } else if (input.contains("audi")) {
            return "Audi is renowned for its Quattro all-wheel-drive technology.";
        } else if (input.contains("toyota")) {
            return "Toyota is famous for its reliable and fuel-efficient cars.";
        } else if (input.contains("honda")) {
            return "Honda is known for its efficient engines and reliable vehicles.";
        } else {
            return "I'm still learning about cars. Ask me about BMW, Audi, Toyota, or Honda!";
        }
    }
}
