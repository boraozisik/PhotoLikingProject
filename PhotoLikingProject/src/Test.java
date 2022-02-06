
public class Test {
	public static void main(String[] args) {
		User u1 = new User("GG", "Giorno", "Giovanna", "2000", "1234", "gg@.com", "address", "adress");
		User u2 = new User("JJ", "Joseph", "Joestar", "1987", "1234", "jj@.com", "address", "adress");
		User u3 = new User("BB", "Bruno", "Buccarati", "1993", "1234", "bb@.com", "address", "adress");
		u1.loginToSystem("GG", "1234");
		u2.loginToSystem("JJ", "1234");
		u3.loginToSystem("BB", "1234");
		Photo p1 = new Photo("Golden Experience", u1);
		Photo p2 = new Photo("Hermit Purple", u2);
		Photo p3 = new Photo("Sticky Fingers", u3);
		u1.addToFriends(u2);
		u1.addToFriends(u3);
		u1.viewFriends();
		u1.message("Hello", u2);
		u1.message("Heyy", u3);
		u2.viewInbox();
		u3.viewInbox();
		u1.viewPhotos();
		u2.viewPhotos();
		u3.viewPhotos();
		u1.voteForPost(p3);
		u2.voteForPost(p3);
		u1.voteForDontPost(p2);
		u3.voteForDontPost(p2);
		u2.voteForPost(p1);
		u3.voteForDontPost(p1);
		u1.comment("Nice photo", p3);
		u2.comment("Nice photo", p1);
		u3.comment("Bad photo", p2);
		p1.viewPhotoInformation();
		p2.viewPhotoInformation();
		p3.viewPhotoInformation();
		
	}
}
