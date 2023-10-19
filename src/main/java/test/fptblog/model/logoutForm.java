/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.model;

/**
 *
 * @author Dell
 */
public class logoutForm {
    private String  FullName;
    private String  roleID;
    private String  FPTMail;
    private String  PassWord;

    public logoutForm(){
        super();
    }
    
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getFPTMail() {
        return FPTMail;
    }

    public void setFPTMail(String FPTMail) {
        this.FPTMail = FPTMail;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    
   @Override
   public String toString(){
       return FullName +"/"+roleID+"/"+FPTMail+"/"+PassWord;
   }
}
