import LoginDetails.LoginPage;
import LoginDetails.UsernameAndPassword;
import PingPongGame.PingPong;

public class Main {
    public static void main(String[] args) {

        UsernameAndPassword UserAndPass = new UsernameAndPassword();

        LoginPage loginpage = new LoginPage(UserAndPass.getInfo());


    }
}
