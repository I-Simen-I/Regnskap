package no.regnskap.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRANSACTION_ID", nullable = false)
    private long transactionId;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category category;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUM", nullable = false)
    private double sum;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED")
    private Date created;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    public Transaction() {

    }

    public Transaction(long transactionId, Category category, String description, double sum, Date created, User user) {
        this.transactionId = transactionId;
        this.category = category;
        this.description = description;
        this.sum = sum;
        this.created = created;
        this.user = user;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;

        if (other instanceof Transaction) {
            Transaction otherTransaction = (Transaction) other;
            result = (this.transactionId == otherTransaction.transactionId);
        }

        return result;
    }

    @Override
    public int hashCode() {
        return (int) (transactionId ^ (transactionId >>> 32));
    }
}
