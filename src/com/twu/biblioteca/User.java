package com.twu.biblioteca;

public class User {
    private String UserName;
    private String UserID="123-4567";
    private String UserPassword;
    private Boolean LoggedIn=false;
    private String UserEmail;
    private String UserPhoneNumber;
    public User(String UserName, String UserID, String UserPassword, String UserEmail,String UserPhoneNumber){
        this.UserName=UserName;
        this.UserID=UserID;
        this.UserPassword=UserPassword;
        this.UserEmail=UserEmail;
        this.UserPhoneNumber=UserPhoneNumber;
    }

//    public static boolean login(String UserID, String UserPassword){
//        if(UserID.equals("123-4567")){
//            User jnliu=new User("jnliu","123-4567","TWU","jnliu@thoughtworks.com","666");
//            return login(jnliu,UserPassword);
//        }else{
//            User NameUser=null;
//            return login(NameUser, UserPassword);
//        }
//    }

    public boolean login(String UserID, String UserPassword){
        if(this.getUserID().equals(UserID) && this.getUserPassword().equals(UserPassword)){
            System.out.println("Logged in");
            this.setLoggedIn(true);
            return true;
        }else{
//            System.out.print(UserID);
//            System.out.print(this.getUserID());
//            System.out.print(UserPassword);
//            System.out.print(this.getUserPassword());

            System.out.println("Login failed");
            return false;
        }
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public Boolean getLoggedIn() {
        return LoggedIn;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setLoggedIn(Boolean loggedIn) {
        LoggedIn = loggedIn;
    }

    public String getUserName() {
        return UserName;
    }

    public boolean showUserInfo() {
        if(this.getLoggedIn()){
            System.out.println("UserName: "+this.getUserName()+"\nUserEmai: "+this.getUserEmail()+"\nUserPhoneNumber: "+this.getUserPhoneNumber());
            return true;
        }else{
            System.out.println("Permission denied.");
            return false;
        }
    }

    public String getUserID() {
        return this.UserID;
    }
}
