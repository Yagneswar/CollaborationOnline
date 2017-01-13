package com.niit.collaboration.dao;

import java.util.List;
import com.niit.collaboration.model.Friend;

public interface FriendDAO {

	public List<Friend> getMyFriends(String userId);
	
	public Friend get(String userId , String friendId);
	
	public void delete(String userId ,String friendId);
	
	public boolean save(Friend friend);
	
	public boolean update(Friend friend);
	
	public List<Friend> getNewFriendRequest(String userId);
	
	public void setOnline(String userId);
	
	public void setOffline(String userId);
	
}
