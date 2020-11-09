package bo.ucb.edu.ingsoft.dto;

public class QualifyMechanicRequest {
    private Integer idUser;
    private Integer idMechanic;
    private Integer score;

    public QualifyMechanicRequest() {
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

    @Override
    public String toString() {
        return "QualifyMechanicRequest{" +
                "idUser=" + idUser +
                ", idMechanic=" + idMechanic +
                ", score=" + score +
                '}';
    }
}
