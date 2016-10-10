package no.regnskap.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID", nullable = false)
    private long categoryId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_TYPE", nullable = false)
    private CategoryType categoryType;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED", nullable = false)
    private Date created;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    public Category() {

    }

    public Category(String name, CategoryType categoryType, Date created, User user) {
        setName(name);
        setCategoryType(categoryType);
        setCreated(created);
        setUser(user);
    }

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

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
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
}
