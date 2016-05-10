package dar.osgi.usersearch.userservice;

public class UserRegisterImpl implements UserRegister {

	@Override
	public boolean register(String userName, String password) {
		if(userName.equalsIgnoreCase("Deba")) return true;
		return false;
	}

}
