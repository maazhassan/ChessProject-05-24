package Game;

public class PieceValues {
    static final double[][] pawnWhiteEval = 
    {
        {0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0},
        {5.0,  5.0,  5.0,  5.0,  5.0,  5.0,  5.0,  5.0},
        {1.0,  1.0,  2.0,  3.0,  3.0,  2.0,  1.0,  1.0},
        {0.5,  0.5,  1.0,  2.5,  2.5,  1.0,  0.5,  0.5},
        {0.0,  0.0,  0.0,  2.0,  2.0,  0.0,  0.0,  0.0},
        {0.5, -0.5, -1.0,  0.0,  0.0, -1.0, -0.5,  0.5},
        {0.5,  1.0, 1.0,  -2.0, -2.0,  1.0,  1.0,  0.5},
        {0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0}
    };

    static final double[][] pawnBlackEval = reverseArray(pawnWhiteEval);

    static final double[][] knightEval =
    {
        {-5.0, -4.0, -3.0, -3.0, -3.0, -3.0, -4.0, -5.0},
        {-4.0, -2.0,  0.0,  0.0,  0.0,  0.0, -2.0, -4.0},
        {-3.0,  0.0,  1.0,  1.5,  1.5,  1.0,  0.0, -3.0},
        {-3.0,  0.5,  1.5,  2.0,  2.0,  1.5,  0.5, -3.0},
        {-3.0,  0.0,  1.5,  2.0,  2.0,  1.5,  0.0, -3.0},
        {-3.0,  0.5,  1.0,  1.5,  1.5,  1.0,  0.5, -3.0},
        {-4.0, -2.0,  0.0,  0.5,  0.5,  0.0, -2.0, -4.0},
        {-5.0, -4.0, -3.0, -3.0, -3.0, -3.0, -4.0, -5.0}
    };
    
    static final double[][] bishopWhiteEval = 
    {
        {-2.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -2.0},
        {-1.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -1.0},
        {-1.0,  0.0,  0.5,  1.0,  1.0,  0.5,  0.0, -1.0},
        {-1.0,  0.5,  0.5,  1.0,  1.0,  0.5,  0.5, -1.0},
        {-1.0,  0.0,  1.0,  1.0,  1.0,  1.0,  0.0, -1.0},
        {-1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0, -1.0},
        {-1.0,  0.5,  0.0,  0.0,  0.0,  0.0,  0.5, -1.0},
        {-2.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -2.0}
    };

    static final double[][] bishopBlackEval = reverseArray(bishopWhiteEval);

    static final double[][] rookWhiteEval = 
    {
        { 0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0},
        { 0.5,  1.0,  1.0,  1.0,  1.0,  1.0,  1.0,  0.5},
        {-0.5,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -0.5},
        {-0.5,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -0.5},
        {-0.5,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -0.5},
        {-0.5,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -0.5},
        {-0.5,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -0.5},
        { 0.0,   0.0, 0.0,  0.5,  0.5,  0.0,  0.0,  0.0}
    };

    static final double[][] rookBlackEval = reverseArray(rookWhiteEval);

    static final double[][] queenEval =
    {
        {-2.0, -1.0, -1.0, -0.5, -0.5, -1.0, -1.0, -2.0},
        {-1.0,  0.0,  0.0,  0.0,  0.0,  0.0,  0.0, -1.0},
        {-1.0,  0.0,  0.5,  0.5,  0.5,  0.5,  0.0, -1.0},
        {-0.5,  0.0,  0.5,  0.5,  0.5,  0.5,  0.0, -0.5},
        { 0.0,  0.0,  0.5,  0.5,  0.5,  0.5,  0.0, -0.5},
        {-1.0,  0.5,  0.5,  0.5,  0.5,  0.5,  0.0, -1.0},
        {-1.0,  0.0,  0.5,  0.0,  0.0,  0.0,  0.0, -1.0},
        {-2.0, -1.0, -1.0, -0.5, -0.5, -1.0, -1.0, -2.0}
    };

    static final double[][] kingWhiteEval =
    {
        {-3.0, -4.0, -4.0, -5.0, -5.0, -4.0, -4.0, -3.0},
        {-3.0, -4.0, -4.0, -5.0, -5.0, -4.0, -4.0, -3.0},
        {-3.0, -4.0, -4.0, -5.0, -5.0, -4.0, -4.0, -3.0},
        {-3.0, -4.0, -4.0, -5.0, -5.0, -4.0, -4.0, -3.0},
        {-2.0, -3.0, -3.0, -4.0, -4.0, -3.0, -3.0, -2.0},
        {-1.0, -2.0, -2.0, -2.0, -2.0, -2.0, -2.0, -1.0},
        { 2.0,  2.0,  0.0,  0.0,  0.0,  0.0,  2.0,  2.0},
        { 2.0,  3.0,  1.0,  0.0,  0.0,  1.0,  3.0,  2.0}
    };

    static final double[][] kingBlackEval = reverseArray(kingWhiteEval);

    public static double[][] reverseArray(double[][] array) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                array[x][y] = array[7-x][7-y];
            }
        }
        return array;
    }
}