package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Transaction {
    private Date tx_date;
    private int txIduser;
    private String host;
    private Date txUpdate;

    public Transaction() {
    }

    public Date getTx_date() {
        return tx_date;
    }

    public void setTx_date(Date tx_date) {
        this.tx_date = tx_date;
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
                "tx_date=" + tx_date +
                ", txIduser=" + txIduser +
                ", host='" + host + '\'' +
                ", txUpdate=" + txUpdate +
                '}';
    }
}
