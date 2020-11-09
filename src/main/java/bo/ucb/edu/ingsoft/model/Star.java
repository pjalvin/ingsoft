package bo.ucb.edu.ingsoft.model;

public class Star {
    private Integer idStar;
    private Integer idUser;
    private Integer idMechanic;
    private Integer score;
    private Transaction transaction;

    public Star() {
    }

    public Integer getIdStar() {
        return idStar;
    }

    public void setIdStar(Integer idStar) {
        this.idStar = idStar;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Integer idMechanic) {
        this.idMechanic = idMechanic;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Star{" +
                "idStar=" + idStar +
                ", idUser=" + idUser +
                ", idMechanic=" + idMechanic +
                ", score=" + score +
                ", transaction=" + transaction +
                '}';
    }
}
