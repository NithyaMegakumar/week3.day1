package week3.day1;

public class CreateCalculator {

//	// TODO Auto-generated method stub
		public void add(int a, int b)
		{
			int Sum = a + b;
			System.out.println("The addition of two Numbers" +(Sum));
		}

		public void add(int a,int b,int c)
		{
			int Sum = a + b + c;
			System.out.println("The addition of Three Numbers:" +(Sum));
		}
		
		public void Sub(int a, int b)
		{
			int Ans = a - b;
			System.out.println("The addition of two Numbers:" +(Ans));
		}

		public void Sub(double a, double b)
		{
			double Ans = a - b;
			System.out.println("The addition of two Numbers:" +(Ans));
		}
		
		public void Mul(int a, int b)
		{
			int Multiply = a * b;
			System.out.println("The addition of two Numbers:" +(Multiply));
		}

		public void Mul(int a, double b)
		{
			double Multiply = a * b;
			System.out.println("The addition of two Numbers:" +(Multiply));
		}

		public static void main(String[] args) {
			
			CreateCalculator cal = new CreateCalculator();
			cal.add(5, 6);
			cal.add(5, 6, 10);
			cal.Sub(10, 5);
			cal.Sub(10.15, 5.50);
			cal.Mul(5, 6);
			cal.Mul(5, 6.25);
		}
		

	}


