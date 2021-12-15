package gitprojectdemo;

public class EvenOddCheck {

	public String checkEvenOdd(int no) {
		if (no % 2 == 0) {
			return "No. is Even Number";
		} else {
			return "No. is Odd Number";
		}
	}

	public static void main(String[] args) {
		EvenOddCheck eoc = new EvenOddCheck();
		String result = eoc.checkEvenOdd(26);
		System.out.println(result);
	}

}
