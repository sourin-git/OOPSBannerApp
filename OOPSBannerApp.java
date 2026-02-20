/**
 * UC7: Print OOPS Banner using a dedicated Pattern Class
 * Encapsulates character-to-pattern mapping for high scalability.
 * @author Sourin
 * @version 7.0
 */
public class OOPSBannerApp {

    // Inner Class to handle character patterns
    static class CharacterPattern {
        private char character;

        public CharacterPattern(char character) {
            this.character = Character.toUpperCase(character);
        }

        // Each pattern is exactly 9 characters wide
        public String getLine(int line) {
            switch (character) {
                case 'O':
                    return (line == 1 || line == 7)
                            ? "  *****  "
                            : " **   ** ";

                case 'P':
                    if (line == 1 || line == 4)
                        return " ********";
                    if (line == 2 || line == 3)
                        return " **   ** ";
                    return " **      ";

                case 'S':
                    if (line == 1 || line == 4 || line == 7)
                        return " ********";
                    if (line == 2 || line == 3)
                        return " **      ";
                    return "      ** ";

                default:
                    return "         ";
            }
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O');
        CharacterPattern p = new CharacterPattern('P');
        CharacterPattern s = new CharacterPattern('S');

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            int line = i + 1;
            banner[i] =
                    o.getLine(line) +
                    o.getLine(line) +
                    p.getLine(line) +
                    s.getLine(line);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}