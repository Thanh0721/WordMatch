public class WordMatch {
    private String secret;

    public WordMatch(String word) 
    {
        secret = word;
    }

    public int scoreGuess(String guess) 
    {
        int count = 0;
        int guessLength = guess.length();
        
        for (int i = 0; i <= secret.length() - guessLength; i++) 
        {
            if (secret.substring(i, i + guessLength).equals(guess)) 
            {
                count++;
            }
        }
        
        return count * guessLength * guessLength;
    }

    public String findBetterGuess(String guess1, String guess2) 
    {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        
        if (score1 > score2) 
        {
            return guess1;
        } 
        
        else if (score2 > score1) 
        {
            return guess2;
        } 
        
        else 
        {
            return guess1.compareTo(guess2) > 0 ? guess1 : guess2;
        }
    }

    public static void main(String[] args) 
    {
        WordMatch game1 = new WordMatch("mississippi");
        System.out.println(game1.scoreGuess("i"));
        System.out.println(game1.scoreGuess("iss"));
        System.out.println(game1.scoreGuess("issipp"));
        System.out.println(game1.scoreGuess("mississippi"));

        WordMatch game2 = new WordMatch("concatenation");
        System.out.println(game2.scoreGuess("ten"));
        System.out.println(game2.scoreGuess("nation"));
        System.out.println(game2.findBetterGuess("ten", "nation"));
        System.out.println(game2.scoreGuess("con"));
        System.out.println(game2.scoreGuess("cat"));
        System.out.println(game2.findBetterGuess("con", "cat"));

        WordMatch game3 = new WordMatch("aaaabb");
        System.out.println(game3.scoreGuess("a"));
        System.out.println(game3.scoreGuess("aa"));
        System.out.println(game3.scoreGuess("aaa"));
        System.out.println(game3.scoreGuess("aabb"));
        System.out.println(game3.scoreGuess("c"));
    }
}