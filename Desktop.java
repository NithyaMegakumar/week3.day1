package week3.day1;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("The size of desktop is 21.5 inch");
		
	}

	public static void main(String[] args) {
		Desktop sys = new Desktop();
		sys.computerModel();
		sys.desktopSize();

	}

}
