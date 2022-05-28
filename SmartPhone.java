package week3.day1;

public class SmartPhone extends AndriodPhone{

	public void ConnectWhatsapp() {
		System.out.println("Connecting the WhatsApp ");
				
	}
	
	public void TakeVideo() {
		System.out.println("Taking the video by using Camera as part of method overriding");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone();
		myPhone.SendMsg();
		myPhone.MakeCall();
		myPhone.SaveContact();
		myPhone.TakeVideo();
		myPhone.ConnectWhatsapp();		

	}

}
