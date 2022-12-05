public class Player {

    private String name;
    private Integer score;

    public Player(String nome) {
        this.name = nome;
        this.score = 0;
    }

    public void incrementScore(){
        setScore(getScore() +1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
