import java.util.HashMap;
import java.util.Map;

public class ShadowsOfMorDoorsGameAPI {

    private Map<String, Object> gameData = new HashMap<>();
    private Map<String, Object> gameState = new HashMap<>();

    public ShadowsOfMorDoorsGameAPI() {
        gameData.put("gameName", "Shadows of MorDoors");
        gameData.put("gameVersion", "1.0.0");
        gameData.put("gameRules", new HashMap<>());
        gameData.put("gameElements", new HashMap<>());

        gameState.put("currentPlayer", 1);
        gameState.put("board", new HashMap<>());
        gameState.put("players", new ArrayList<>());
        gameState.put("pieces", new ArrayList<>());
    }

    public Map<String, Object> getGameData() {
        return gameData;
    }

    public Map<String, Object> getGameState() {
        return gameState;
    }

    public void makeMove(int playerId, int pieceId, String toLocation) {
        if (playerId > gameState.get("players").size()) {
            throw new IllegalArgumentException("Invalid player ID");
        }
        if (pieceId > gameState.get("pieces").size()) {
            throw new IllegalArgumentException("Invalid piece ID");
        }
        if (toLocation.length() != 2) {
            throw new IllegalArgumentException("Invalid location");
        }

        int toX = Integer.parseInt(toLocation.substring(0, 1));
        int toY = Integer.parseInt(toLocation.substring(1));

        gameState.get("pieces").set(pieceId - 1, toX, toY);
    }

    public void endGame() {
        // TODO: Implement this method.
    }
}
