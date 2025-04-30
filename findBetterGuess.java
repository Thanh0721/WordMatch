public String findBetterGuess(String guess1, String guess2)
{
    int score1 = scoreGuess(guess1);
    int score2 = scoreGuess(guess2);

    if(score1 > score2)
        return guess1;
    else if(score2 > score1)
        return guess2;
    else
    {
        if(guess1.compareTo(guess2) > 0)
            return guess1;
        else
            return guess2;
    }
}