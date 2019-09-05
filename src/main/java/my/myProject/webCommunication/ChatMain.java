package my.myProject.webCommunication;

public class ChatMain {

	public static void main(String[] args) {
		ChatRecevice chatRecevice = new ChatRecevice();
		chatRecevice.start();
		
		ChatSender chatSender = new ChatSender();
		chatSender.start();
			
	}
}
