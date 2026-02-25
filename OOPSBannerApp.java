import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Final OOPS Banner App
 * Uses HashMap for O(1) retrieval and a dynamic rendering function.
 * @author Sourin
 * @version 8.0
 */
public class OOPSBannerApp {
    private static final Map<Character, String[]> PATTERN_MAP = new HashMap<>();

    static {
        PATTERN_MAP.put('O', new String[]{
            " *******  ",
            " **   **  ",
            " **   **  ",
            " **   **  ",
            " **   **  ",
            " **   **  ",
            " *******  "
        });
        PATTERN_MAP.put('P', new String[]{
            " ******** ",
            " **   **  ",
            " **   **  ",
            " ******** ",
            " **       ",
            " **       ",
            " **       "
        });
        PATTERN_MAP.put('S', new String[]{
            " *******  ",
            " **       ",
            " **       ",
            " *******  ",
            "       ** ",
            "       ** ",
            " *******  "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    public static void renderBanner(String word) {
        word = word.toUpperCase();
        for (int i = 0; i < 7; i++) {
            StringBuilder lineResult = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (PATTERN_MAP.containsKey(c)) {
                    lineResult.append(PATTERN_MAP.get(c)[i]);
                } else {
                    lineResult.append("          ");
                }
            }
            System.out.println(lineResult.toString());
        }
    }
}