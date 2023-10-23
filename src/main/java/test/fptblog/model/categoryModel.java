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
@Table(name = "[dbo].[Category]")
public class categoryModel {
    @Id
    private int categoryId;
    
    @Column(name = "CategoryName")
    private String categoryName;
    
    @Column(name = "CategoryDescription")        
    private String categoryDescription;
    
    @Column(name = "Status")        
    private int status;

    public categoryModel() {
    }

    public categoryModel(int categoryId, String categoryName, String categoryDescription, int status) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "categoryModel{" + "categoryId=" + categoryId + ", categoryName=" + categoryName 
                + ", categoryDescription=" + categoryDescription + ", status=" + status + '}';
    }
}
