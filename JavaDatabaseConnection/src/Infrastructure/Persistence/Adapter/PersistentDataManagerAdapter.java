package Infrastructure.Persistence.Adapter;

import Shared.UserAdapter;
import java.util.List;

public interface PersistentDataManagerAdapter {
	public void updateUser(UserAdapter user);

	public List<UserAdapter> getListUser();
	
	public void clearUserList();

	public void insertUser(UserAdapter user);

	public void removeUser(UserAdapter user);
        
        public UserAdapter loginUser(UserAdapter user);
}
