package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Transaction {
    private Date txDate;
    private int txIduser;
    private String host;
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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
                ", host='" + host + '\'' +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
