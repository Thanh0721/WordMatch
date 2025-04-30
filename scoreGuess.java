public int scoreGuess(String guess)
{
    int count = 0;

    for(int i = 0; i < secret.length(); i++)
    {
        int j = i + guess.length();

        if(j <= secret.length() && secret.substring(i, j).equals(guess))
            count++;
    }

    return count * (guess.length() * guess.length());
}