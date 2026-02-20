/**
 * UC5: Print OOPS Banner with Inline Array Initialization
 * Combines declaration and population for more concise code.
 * @author Sourin
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] banner = {
            "  *****    *****    ********   ******** ",
            " **   **  **   **   **         **        ",
            " **   **  **   **   **         **        ",
            " **   **  **   **   ********   ******** ",
            " **   **  **   **        **         **  ",
            " **   **  **   **        **         **  ",
            "  *****    *****    ********   ******** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}