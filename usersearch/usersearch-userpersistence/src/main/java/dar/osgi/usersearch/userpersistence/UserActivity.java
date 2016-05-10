package dar.osgi.usersearch.userpersistence;

public interface UserActivity {

	public boolean login(String userName, String password);
	
	public boolean register(String username, String password);
}
