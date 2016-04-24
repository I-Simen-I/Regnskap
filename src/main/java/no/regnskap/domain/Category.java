package no.regnskap.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CATEGORY")
public class Category {

    public Category() {

    }

    public Category(String name, Date created, String createdBy) {
        setName(name);
        setCreated(created);
        setCreatedBy(createdBy);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID", nullable = false)
    private long categoryId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED", nullable = false)
    private Date created;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
