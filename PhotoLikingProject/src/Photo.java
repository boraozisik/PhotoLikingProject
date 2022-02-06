import java.util.ArrayList;

public class Photo {
	private String photoName;
	private User photoOwner;
	private int postCount;
	private int dontPostCount;
	private ArrayList<String> comments;
	
	public Photo(String photoName,User photoOwner) {
		
		this.photoName = photoName;
		this.photoOwner = photoOwner;
		this.comments = new ArrayList<String>();
		this.photoOwner.addToPhotos(this);
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}

	public int getDontPostCount() {
		return dontPostCount;
	}

	public void setDontPostCount(int dontPostCount) {
		this.dontPostCount = dontPostCount;
	}
	
	public User getPhotoOwner() {
		return photoOwner;
	}

	public void setPhotoOwner(User photoOwner) {
		this.photoOwner = photoOwner;
	}

	public void receiveVoteForPost() {
		this.postCount++;
	}
	public void receiveVoteForDontPost() {
		this.dontPostCount++;
	}
	public void receiveComment(String comment) {
		this.comments.add(comment);
	}
	public void viewPhotoInformation() {
		System.out.println("Photo's name is ==>" +this.photoName);
		System.out.println("Photo's User's username is ==>" +this.photoOwner.getUsername());
		System.out.println("Photo's votes for post is ==>" +this.postCount);
		System.out.println("Photo's votes for don't post is ==>" +this.dontPostCount);
		viewComments();
	}
	public void viewComments() {
		for(int i = 0; i < this.comments.size(); i++) {
			System.out.println(i+1 + ".comment is: " + this.comments.get(i));	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
