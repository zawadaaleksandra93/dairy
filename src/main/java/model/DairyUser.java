package model;

public class DairyUser {
    private long id;
    private String usersLogin;
    private String usersPassword;

    public DairyUser(String usersLogin, String usersPassword) {
        this.usersLogin = usersLogin;
        this.usersPassword = usersPassword;
    }

    public DairyUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsersLogin() {
        return usersLogin;
    }

    public void setUsersLogin(String usersLogin) {
        this.usersLogin = usersLogin;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }
}
