import java.util.Scanner;

public class Stalls
{ 
     /**
		This method will find which stall should be occupied next.
		@param boolean[] stalls This is the array that contains which stalls are occupied.
		@return stall This is the index of which stall that should be occupied next.
	 */
    public static int nextStall(boolean[] stalls)
	{ 
        int longestIndex = -1; 
        int longestRun = 0; 
        int currentIndex = -1; 
        int currentRun = 0; 
        boolean chain = false;
		//This for loop will find that largest chain of unoccupied stalls
        for (int i = 0; i < stalls.length; i++)
		{ 
			//This will end the chain
            if (chain && stalls[i])
			{ 
                chain = false; 
                if (currentRun >= longestRun)
				{ 
                    longestRun = currentRun; 
                    longestIndex = currentIndex; 
                } 
                 
            } 
			//This will start the chain
            else if (!chain && !stalls[i])
			{ 
                chain = true; 
                currentIndex = i; 
                currentRun = 1; 
            } 
			//This will add 1 to the chain length
            else if (chain && !stalls[i])
			{ 
                currentRun += 1; 
            } 
        } 
		//If the current run is the largest run it will be stored
        if (chain)
		{ 
            if (currentRun >= longestRun)
			{ 
                longestRun = currentRun; 
                longestIndex = currentIndex;
            } 
        } 
		//Returns which stall should be occupied
        return (longestRun - 1) / 2 + longestIndex; 
    } 
     /**
		This method displays with Xs and _s which stalls are occupied and empty.
		@param boolean[] stalls This is the array that contains which stalls are occupied.
	 */
    public static void printStalls(boolean[] stalls)
	{ 
		//If a stall is occupied X will print otherwise _ will print.
        for (int i = 0; i < stalls.length; i++)
		{ 
            if (stalls[i])
			{ 
                System.out.print("X "); 
            } 
            else
			{ 
                System.out.print("_ "); 
            } 
        } 
        System.out.println(); 
    } 
     /**
		The main method will ask the user how many stalls the program will start with.
	 */
    public static void main(String[] args)
	{ 
		Scanner in = new Scanner(System.in);
		System.out.println("How many stalls? ");
		int STALL_NUMBER = in.nextInt();
        boolean[] stalls = new boolean[STALL_NUMBER];
		printStalls(stalls);
        for (int i = 0; i < stalls.length; i++)
		{ 
            stalls[nextStall(stalls)] = true; 
            printStalls(stalls); 
        } 
    } 
}