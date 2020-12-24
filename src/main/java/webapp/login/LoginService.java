package webapp.login;

public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("楠宝") && password.equals("980709");
    }
}
