/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "[dbo].[tblUser]")
public class userModel {

    @Id
    @Column(name = "UserID")
    private String UserID;
    @Column(name = "UserName")
    private String userName;
    // @Column(name = "Password")
    private String Password;
    @Column(name = "RoleID")
    private String Roleid;
    // @Column(name = "Birthdate")
    private String Birthdate;
    // @Column(name = "Award")
    private int Award;
    // @Column(name = "NumberOfPosts")
    private int NumberOfPosts;
    // @Column(name = "Status")
    private int Status;
    // @Column(name = "Description")
    private String Description;
    // @Column(name = "Major")
    private String Major;
    // @Column(name = "Image")
    private String Image;
    
    @OneToMany
    @JoinColumn(name = "UserID")
    private List<postModel> postModel;
    
    public userModel() {

    }

    public userModel(String UserID, String UserName, String Password, String Roleid, String Birthdate, int Award,
            int NumberOfPosts, int Status, String Description, String Major, String Image) {
        this.UserID = UserID;
        this.userName = UserName;
        this.Password = Password;
        this.Roleid = Roleid;
        this.Birthdate = Birthdate;
        this.Award = Award;
        this.NumberOfPosts = NumberOfPosts;
        this.Status = Status;
        this.Description = Description;
        this.Major = Major;
        this.Image = null;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRoleid() {
        return Roleid;
    }

    public void setRoleid(String Roleid) {
        this.Roleid = Roleid;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public int getAward() {
        return Award;
    }

    public void setAward(int Award) {
        this.Award = Award;
    }

    public int getNumberOfPosts() {
        return NumberOfPosts;
    }

    public void setNumberOfPosts(int NumberOfPosts) {
        this.NumberOfPosts = NumberOfPosts;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return UserID + " / " + userName + " / " + Password + " / " + Roleid + " / " + Birthdate + " / " + Award
                + " / " + NumberOfPosts + " / " + Status + " / " + Description
                + " / " + Major + " / " + Image;
    }
}
