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
@Table(name = "[dbo].[Reaction]")
public class reactionModel {
     @Id
    private int reactId;
    
    @Column(name = "ReactName")
    private String reactName;
    
    @Column(name = "Description")        
    private String description;
    
    @Column(name = "Image")        
    private String image;

    public reactionModel() {
    }

    public reactionModel(int reactId, String reactName, String description, String image) {
        this.reactId = reactId;
        this.reactName = reactName;
        this.description = description;
        this.image = image;
    }

    public int getReactId() {
        return reactId;
    }

    public void setReactId(int reactId) {
        this.reactId = reactId;
    }

    public String getReactName() {
        return reactName;
    }

    public void setReactName(String reactName) {
        this.reactName = reactName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "reactionModel{" + "reactId=" + reactId + ", reactName=" + reactName 
                + ", description=" + description + ", image=" + image + '}';
    }
}
