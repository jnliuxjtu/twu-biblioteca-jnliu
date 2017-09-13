package com.twu.biblioteca;

public class User {
    private String UserPassword;
    private Boolean LoggedIn;
    private String UserEmail;
    private String UserPhoneNumber;
    public User(String UserPassword, String UserEmail,String UserPhoneNumber){
        this.UserPassword=UserPassword;
        this.UserEmail=UserEmail;
        this.UserPhoneNumber=UserPhoneNumber;
    }

    public static boolean login(String UserName, String UserPassword){
        if(UserName.equals("jnliu")){
            User jnliu=new User("TWU","jnliu@thoughtworks.com","666");
            return login(jnliu,UserPassword);
        }else{
            User NameUser=null;
            return login(NameUser, UserPassword);
        }
    }

    public static boolean login(User user, String UserPassword){
        if(user==null){
            System.out.println("User doesn't exist!");
            return false;
        }else if(user.getUserPassword()==UserPassword){
            System.out.println("Logged in");
            user.setLoggedIn(true);
            return true;
        }else{
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
}
