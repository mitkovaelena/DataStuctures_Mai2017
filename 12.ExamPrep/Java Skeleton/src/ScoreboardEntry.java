public class ScoreboardEntry implements Comparable<ScoreboardEntry>
{
    private int score;
    private String userName;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUserName() {
        return  this.userName;
    }

    public void setUsername (String userName) {
        this.userName = userName;
    }

    public int compareTo(ScoreboardEntry other)
    {
        throw new UnsupportedOperationException();
    }
}