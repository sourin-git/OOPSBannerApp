/**
 * UC4: Print OOPS Banner using Arrays and Loops
 * Organizes banner data into a String array for modularity.
 * @author Sourin
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
    String.join("  ", "  *****  ", "  *****  ", " ******** ", "  ******* "),
    String.join("  ", " **   ** ", " **   ** ", " **       ", " **       "),
    String.join("  ", " **   ** ", " **   ** ", " **       ", " **       "),
    String.join("  ", " **   ** ", " **   ** ", " ******** ", "  ******* "),
    String.join("  ", " **   ** ", " **   ** ", " **              **"),
    String.join("  ", " **   ** ", " **   ** ", " **        ", "       ** "),
    String.join("  ", "  *****  ", "  *****  ", " ******** ", "  ******* ")
};
        for (String line : banner) {
            System.out.println(line);
        }
    }
}