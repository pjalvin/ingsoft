package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Transaction {
    private Date txDate;
    private int txIduser;
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

    public int getTxIduser() {
        return txIduser;
    }

    public void setTxIduser(int txIduser) {
        this.txIduser = txIduser;
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
                ", txIduser=" + txIduser +
                ", host='" + txHost + '\'' +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
