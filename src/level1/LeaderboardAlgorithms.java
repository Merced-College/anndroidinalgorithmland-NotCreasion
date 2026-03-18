package level1;

import java.util.ArrayList;

/**
 * 
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * 
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */

    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                // Compare numeric scores
                if (list.get(j).getScore() > list.get(maxIdx).getScore()) {
                    maxIdx = j;
                }
            }
            // Swap
            ScoreEntry temp = list.get(maxIdx);
            list.set(maxIdx, list.get(i));
            list.set(i, temp);
        }
        }

    /**
     * 
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        
        int n = list.size();
        for (int i = 1; i < n; i++) {
            ScoreEntry key = list.get(i);
            int j = i - 1;

            // compareTo returns > 0 if the string is alphabetically "greater"
            while (j >= 0 && list.get(j).getUsername().compareToIgnoreCase(key.getUsername()) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    /**
     * 
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
   public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
    int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midUser = list.get(mid).getUsername();
            
            int comparison = midUser.compareToIgnoreCase(username);

            if (comparison == 0) {
                return mid; // Found it!
            } else if (comparison < 0) {
                low = mid + 1; // Look in the right half
            } else {
                high = mid - 1; // Look in the left half
            }
        }
        return -1; // Not found
   }
public static void sortScores(ArrayList<ScoreEntry> scores) {
    int n = scores.size();
    for (int i = 0; i < n - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < n; j++) {
            // Descending order: j > maxIdx
            if (scores.get(j).getScore() > scores.get(maxIdx).getScore()) {
                maxIdx = j;
            }
        }
        // Swap
        ScoreEntry temp = scores.get(maxIdx);
        scores.set(maxIdx, scores.get(i));
        scores.set(i, temp);
    }
}
    public static void sortScoreByDescending(ArrayList<ScoreEntry> scores) {
        // Sort from highest to lowest
        int n = scores.size();

        for (int i = 0; i < n - 1; i++) {
            // Assume the current position has the largest value
            int maxIdx = i;

            // Check the rest of the list for a higher score
            for (int j = i + 1; j < n; j++) {
                // Compare scores: if j's score is > maxIdx's score, update maxIdx
                if (scores.get(j).getScore() > scores.get(maxIdx).getScore()) {
                    maxIdx = j;
                }
            }

            // SWAP: Move the highest found score to the current position 'i'
            ScoreEntry temp = scores.get(maxIdx);
            scores.set(maxIdx, scores.get(i));
            scores.set(i, temp);
        }
}
}
