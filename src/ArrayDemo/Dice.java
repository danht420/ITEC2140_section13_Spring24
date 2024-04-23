public class Dice {

    public static void main(String[] args) {

        int times = 5, sides = 6, dice = 2;           // initialize variables
        int[] rolls = new int[times], occurrences = new int[dice * sides];

        for (int i = 0; i < times; i++) {             // perform the rolls and update tallies
            for (int j = 0; j < dice; j++)
                rolls[i] += roll(1, sides);
            occurrences[rolls[i]-1]++;
        }

        for (int i = 0; i < occurrences.length; i++)   // print histogram of results
            System.out.printf("%2s  %-20s%n", i+1, barify(occurrences[i]));

        System.out.println(roll(1,6));
    }

    public static int roll(int min, int max) {
        int range = max - min;
        return (int)(Math.random() * range + 1) + min;
    }

    public static String barify(int value) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < value; i++)
            bar.append('*');
        return bar.toString();
    }

}
//
//         1
//         2
//         3
//         4
//         5
//         6
//         7  *
//         8  **
//         9  *
//         10
//         11  *
//         12
//         6