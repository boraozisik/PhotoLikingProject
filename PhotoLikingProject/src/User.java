import java.util.ArrayList;

public class User {
	
	private String userName;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String password;
	private String email;
	private String homeAddress;
	private String workAddress;
	private boolean isOnline;
	private ArrayList<User> friends;
	private ArrayList<String> inbox;
	private ArrayList<Photo> photos; 
	 
	public User(String userName, String name, String surname, String dateOfBirth, String password, String email,
			String homeAddress, String workAddress) {
		
		this.userName = userName;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.email = email;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
		this.friends = new ArrayList<User>();
		this.inbox = new ArrayList<String>();
		this.photos = new ArrayList<Photo>();
	}


	public String getUsername() {
		return userName;
	}


	public void setUsername(String username) {
		this.userName = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}


	public String getWorkAddress() {
		return workAddress;
	}


	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}


	public boolean isOnline() {
		return isOnline;
	}


	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	 
	public void viewUserInformation() {
		System.out.println("Username: " +this.userName);
		System.out.println("Name: " +this.name);
		System.out.println("Surname: " +this.surname);
		System.out.println("Date of Birth: " +this.dateOfBirth);
		System.out.println("Password: " +this.password);
		System.out.println("E-mail: " +this.email);
		System.out.println("Home-Adress: " +this.homeAddress);
		System.out.println("Work-Adress: " +this.workAddress);
			
	}
	 
	public boolean loginToSystem(String username , String password) {
		if(isOnline == true) {
			System.out.println("You are already logged in...");
		}
		else if(username.equals(this.userName) & password.equals(this.password)) { 
			isOnline = true;
			System.out.println("Login successful , Welcome!!!");
		}
		else {
			System.out.println(" Login unsuccessful , wrong password or username...");
		}
		return this.isOnline;
	 }
	
	 public void addToFriends(User u) {
		 this.friends.add(u);
	 }
	 
	 public void viewFriends() {
		 for(int i = 0; i < this.friends.size(); i++) {
			 System.out.println(i+1 + ".friends's name is: " + this.friends.get(i).getUsername());			 
		 }
	 }
	 
	 public void receiveMessage(String message) {
		 this.inbox.add(message);
	 }
	 
	 public void message(String message ,User u) {
		 u.receiveMessage(message);
	 }
	 
	 public void viewInbox() {
		 for(int i = 0; i < this.inbox.size(); i++) {
			 System.out.println(i+1 + ".message is: " + this.inbox.get(i));	
		 }
	 }
	 
	 public void addToPhotos(Photo p) {
		 this.photos.add(p);
	 }
	 public void viewPhotos() {
		 for(int i = 0; i < this.photos.size(); i++) {
			 System.out.println(i+1 + ".Photo's name is: " + this.photos.get(i).getPhotoName());	
		 }
	 }
	 public void voteForPost(Photo p) {
		 System.out.println("You just voted  post for this photo ==>" + p.getPhotoName() +"");
		 p.receiveVoteForPost();
	 }
	 public void voteForDontPost(Photo p) {
		 System.out.println("You just voted  dont post for this photo ==>" + p.getPhotoName() +"");
		 p.receiveVoteForDontPost();
	 }
	 public void comment(String comment, Photo p) {
		 p.receiveComment(comment);
	 }
	 
	 
	 
	 
	 
	 
	 
}






























