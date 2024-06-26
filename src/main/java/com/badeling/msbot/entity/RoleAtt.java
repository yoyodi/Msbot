package com.badeling.msbot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoleAtt {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String user_id;
    private String name;
    private String group_id;
    private Integer att;
    private Integer attPer;
    private Long maxAtt;

    public RoleAtt() {

    }

    @Override
    public String toString() {
        return "RoleAtt [id=" + id + ", user_id=" + user_id + ", name=" + name + ", group_id=" + group_id + ", att="
                + att + ", attPer=" + attPer + ", maxAtt=" + maxAtt + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public Integer getAtt() {
        return att;
    }

    public void setAtt(Integer att) {
        this.att = att;
    }

    public Integer getAttPer() {
        return attPer;
    }

    public void setAttPer(Integer attPer) {
        this.attPer = attPer;
    }

    public Long getMaxAtt() {
        return maxAtt;
    }

    public void setMaxAtt(Long maxAtt) {
        this.maxAtt = maxAtt;
    }


}