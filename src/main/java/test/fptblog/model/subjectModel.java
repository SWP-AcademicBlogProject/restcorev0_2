/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "[dbo].[Subject]")
public class subjectModel {
    @Id
    private int subjectId;
    
    @Column(name = "SubjecName")
    private String subjectName;
    
    @Column(name = "Description")
    private String description;
    
    @Column(name = "Status")
    private int status;

    public subjectModel() {
    }

    public subjectModel(int subjectId, String subjectName, String description, int status) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.description = description;
        this.status = status;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "subjectModel{" + "subjectId=" + subjectId + ", subjectName=" + subjectName + ", description=" + description + ", status=" + status + '}';
    }
    
    
}
