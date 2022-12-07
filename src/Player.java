public class Player {

    private String name;
    private Integer score;

    public Player(String nome) {
        this.name = nome;
        this.score = 0;
    }
    public void incrementScore() {
        this.score += 1;
    }
    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
