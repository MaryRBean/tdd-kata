package fizzbuzz;

public class FizzBuzz {

	public String say(int i) {
		if(isFizz(i) && isBuzz(i)) {
			return "fizzbuzz";
		}
		if(isFizz(i)) {
			return "fizz";
		}
		if(isBuzz(i)) {
			return "buzz";
		}
		//what is happening is new integer(i).toString
		return ""+i;
	}

	private boolean isBuzz(int i) {
		return i % 5 ==0;
	}

	private boolean isFizz(int i) {
		return i % 3 == 0;
	}


}
