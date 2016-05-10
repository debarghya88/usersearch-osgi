package dar.osgi.usersearch.userservice;

public class UserLoginImpl implements UserLogin {

	@Override
	public boolean login(String userName, String password) {
		if(userName.equalsIgnoreCase("Deba")) return true;
		return false;
	}

}
