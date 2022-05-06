package week1.day4;

public class Mobile {

	public void sendMessage() {
		System.out.println("send message");
	}
	private void audioCall() {
		System.out.println("Audio Call");
	}
	protected void videoCall() {
		System.out.println("Video Call");
	}
	void shareDocument() {
		System.out.println("share document");
	}
	
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.audioCall();
	mob.videoCall();
	mob.sendMessage();
	mob.shareDocument();
}
	
	
}
