package entity;

public class User {
	int id;
    String username;
    String password;    
    //getter和setter省略	
    
    
    
    @Override
    public String toString() {
         return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
    
	public User(int id, String username, String password) {
		//super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	
	public User() {
		//super();
		this.id = 0;
		this.username = null;
		this.password = null;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    


}
