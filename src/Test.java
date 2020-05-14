
public class Test {

    static final int ASCII_REF = 64;

    static void printWhiteSpace(int nSpace) {
        for (int i = 1; i <= nSpace; i++)
        {
            System.out.print(" ");
        }
    }

    static void printCharacter(int nChar, char charToPrint) {
        System.out.print(charToPrint);
        printWhiteSpace(nChar - 1);
        if (nChar > 1) {
            System.out.print(charToPrint);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int nRows = args.length > 0 ? args[0].charAt(0) - ASCII_REF : 0;
        int whiteSpace = nRows - 1;

        for (int row = 1; row <= nRows; row++)
        {
            printWhiteSpace(whiteSpace);
            whiteSpace--;
            printCharacter(2 * row - 1, (char) (ASCII_REF + row));

        }

        whiteSpace = 1;

        for (int row = 1; row < nRows; row++)
        {
            printWhiteSpace(whiteSpace);
            whiteSpace++;
            printCharacter(2 * (nRows - row) - 1, (char)(ASCII_REF + nRows - row));
        }

    }

}
