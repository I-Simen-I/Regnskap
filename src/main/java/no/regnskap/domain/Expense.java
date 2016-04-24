package no.regnskap.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EXPENSE")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EXPENSE_ID", nullable = false)
    private long expenceId;

    @Column(name = "MONTH", nullable = false)
    private String month;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category category;

    @Column(name = "SUM", nullable = false)
    private double sum;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED", nullable = false)
    private Date created;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    public long getExpenceId() {
        return expenceId;
    }

    public void setExpenceId(long expenceId) {
        this.expenceId = expenceId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
