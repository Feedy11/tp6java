package tp6;
import java.io.IOException;

public class Authentification {
    private static final String LoginCorrect = "scott";
    private static final String PwdCorrect = "tiger";

    public Authentification() throws IOException, WrongLoginException, WrongPwdException, WrongInputLength {
        getUserLogin("sss");
        getUserPWD("aaa");
    }

	public String  getUserLogin(String login) throws WrongInputLength,WrongLoginException {
		if(!login.equals(LoginCorrect)) {
            throw new WrongLoginException("login incorrecte!");
		}
		
		if(login.length()>10) {
            throw new WrongInputLength(login +" plus de 10 characters !");
		}
		
		return "marche!!";
	}
	public String  getUserPWD(String pwd) throws WrongInputLength,WrongPwdException {
		
		if(!pwd.equals(PwdCorrect)) {
            throw new WrongPwdException("pwd incorrecte!");
		}
		if(pwd.length()>10) {
            throw new WrongInputLength(pwd+"plus de 10 characters !");
		}
		
		
		return "marche!!";
	}

}
