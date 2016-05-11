package dar.osgi.usersearch.userservice;

import dar.osgi.usersearch.userpersistence.UserActivity;

public class UserRegisterImpl implements UserRegister {
	
	UserActivity userActivity;

	@Override
	public boolean register(String userName, String password) {
		return userActivity.register(userName, userName);
	}

	public void setUserActivity(UserActivity userActivity) {
		this.userActivity = userActivity;
	}	

}
