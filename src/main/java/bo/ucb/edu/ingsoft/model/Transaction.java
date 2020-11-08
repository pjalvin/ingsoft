package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Transaction {
    private Date txDate;
    private int txIdUser;
    private String txHost;
    private Date txUpdate;

    public Transaction() {
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public int getTxIdUser() {
        return txIdUser;
    }

    public void setTxIdUser(int txIdUser) {
        this.txIdUser = txIdUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxUpdate() {
        return txUpdate;
    }

    public void setTxUpdate(Date txUpdate) {
        this.txUpdate = txUpdate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "tx_date=" + txDate +
                ", txIduser=" + txIdUser +
                ", host='" + txHost + '\'' +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
