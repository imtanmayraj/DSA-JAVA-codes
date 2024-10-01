public class Practice26 {
    
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int N = 8;
    public static void main(String[] args) {
        int maze[][]={{1,0,0,0},
        {1,1,0,1},
        {0,1,0,0},
        {1,1,1,1}};

        // solveMaze(maze);
        String str="23";
        String combination="";
        // keypadcombination(str,0,combination);

        // Function Call for knight tour
        System.out.println("the path followed by knight to travel all cells is :");
        solveKT();
    }

   
    // Question 1 :
    // Rat in a Maze
    // You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the
    // maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
    // square matrix of order N * N where the cells with value 0 represent the maze’s blocked
    // locations while value 1 is the open/available path that the rat can take to reach its destination.
    // The rat's destination is at (N - 1, N - 1).
    // Your task is to find all the possible paths that the rat can take to reach from source to
    // destination in the maze.
    // The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down)
    // i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y)

    
        public static void printSolution(int sol[][]) {
        for (int i = 0; i<sol.length; i++) {
        for (int j = 0; j<sol.length; j++) {
        System.out.print(" " + sol[i][j] + " ");
        }
        System.out.println();
        }
        }


        public static boolean isSafe(int maze[][], int x, int y) {

        // if (x, y outside maze) return false
        if(x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1){
            return true;
        }else{
            return false;
        }
        }


        public static boolean solveMaze(int maze[][]) {

        int N = maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
        System.out.print("Solution doesn't exist");
        return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {

    if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
    sol[x][y] = 1;
    return true;
    }

    // Check if maze[x][y] is valid
    if (isSafe(maze, x, y) == true) {
    if (sol[x][y] == 1)
    return false;

    sol[x][y] = 1;

    if (solveMazeUtil(maze, x + 1, y, sol))
    return true;

    if (solveMazeUtil(maze, x, y + 1, sol))
    return true;

    sol[x][y] = 0;

    return false;
    }
    return false;
    }
    

    // Question 2 :
    // Keypad Combinations
    // Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
    // the number could represent. You can print the answer in any order.
    // A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
    // does not map to any letters.

    public static void keypadcombination(String str,int idx,String combination){
        
        //base case
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        //recursion
        char currchar=str.charAt(idx);
        
        String mapping=keypad[currchar-'0'];

        for(int i=0;i<mapping.length();i++){
            keypadcombination(str, idx+1, combination+mapping.charAt(i));
            

        }
    }




//     Question 3 :
// Knight’s Tour
// Given a N*N board with the Knight placed on the first block of an empty board. Moving
// according to the rules of chess, knights must visit each square exactly once. Print the order of
// each cell in which they are visited.
// Sample Input 1 : N = 8
// Sample Output 1 :
// 0 59 38 33 30 17 8 63
// 37 34 31 60 9 62 29 16
// 58 1 36 39 32 27 18 7
// 35 48 41 26 61 10 15 28
// 42 57 2 49 40 23 6 19
// 47 50 45 54 25 20 11 14
// 56 43 52 3 22 13 24 5
// 51 46 55 44 53 4 21 12


// Java program for Knight Tour problem

    

    /* A utility function to check if i,j are
       valid indexes for N*N chessboard */
    static boolean isSafe(int x, int y, int sol[][])
    {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == -1);
    }

    /* A utility function to print solution
       matrix sol[N][N] */
    static void printSolution(int sol[][])
    {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

    /* This function solves the Knight Tour problem
       using Backtracking.  This  function mainly
       uses solveKTUtil() to solve the problem. It
       returns false if no complete tour is possible,
       otherwise return true and prints the tour.
       Please note that there may be more than one
       solutions, this function prints one of the
       feasible solutions.  */
    static boolean solveKT()
    {
        int sol[][] = new int[8][8];

        /* Initialization of solution matrix */
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        /* xMove[] and yMove[] define next move of Knight.
           xMove[] is for next value of x coordinate
           yMove[] is for next value of y coordinate */
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        // Since the Knight is initially at the first block
        sol[0][0] = 0;

        /* Start from 0,0 and explore all tours using
           solveKTUtil() */
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        }
        else
            printSolution(sol);

        return true;
    }

    /* A recursive utility function to solve Knight
       Tour problem */
    static boolean solveKTUtil(int x, int y, int movei,
                               int sol[][], int xMove[],
                               int yMove[])
    {
        int k, next_x, next_y;
        if (movei == N * N)
            return true;

        /* Try all next moves from the current coordinate
            x, y */
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1,
                                sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y]
                        = -1; // backtracking
            }
        }

        return false;
    }

   
   


}//for class
