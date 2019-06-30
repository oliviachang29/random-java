import java.util.ArrayList;
// Not functional
class proj3 {
	long num = 600851475143L;
	private boolean isPrime(Long a) {
		if (a % 2 == 0) {
    	return false; // checks divisibility by 2
	  }
	  for (long i=3; i*i<=a; i+=2) {
	    if (a % i == 0) {
	      return false;
	    }
	  }
	  return true;
	}

	public static void main(String[] args) {
		ArrayList<Long> factors = new ArrayList<>();
		for(long i = 1; i <= num / 2; i++) {
		   if (num % i == 0) {
		   	factors.add(i);
		   	System.out.println(i);
		  }
		}

		System.out.println("Prime factors: ");
		for (long i = 0; i < factors.size(); i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}

// List<String> myList = new ArrayList<>();