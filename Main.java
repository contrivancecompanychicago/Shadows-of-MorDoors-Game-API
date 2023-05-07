import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the name of the game.
        System.out.println("What is the name of the game?");
        String gameName = scanner.nextLine();

        // Create a new instance of the ShadowsOfMorDoorsGameAPI class.
        ShadowsOfMorDoorsGameAPI gameAPI = new ShadowsOfMorDoorsGameAPI();

        // Print the game data to the console.
        System.out.println("Game data:");
        System.out.println(gameAPI.getGameData());

        // Print the game state to the console.
        System.out.println("Game state:");
        System.out.println(gameAPI.getGameState());

        // Prompt the user for a move.
        System.out.println("What is your move?");
        String move = scanner.nextLine();

        // Make the move.
        gameAPI.makeMove(1, 1, move);

        // Print the new game state to the console.
        System.out.println("New game state:");
        System.out.println(gameAPI.getGameState());
    }
}
