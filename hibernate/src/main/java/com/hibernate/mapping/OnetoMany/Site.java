package com.hibernate.mapping.OnetoMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "site_table")
public class Site {
    @Id
    @Column(name = "site_id")
    private int sid;
    private String site_url;

    @OneToMany(mappedBy = "site" , cascade = CascadeType.ALL)
    private List<User> users;

    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSite_url() {
        return site_url;
    }
    public void setSite_url(String site_url) {
        this.site_url = site_url;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
