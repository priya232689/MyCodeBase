

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class second_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,43,48,54,43,54,54,54,5,3,4,65,43);
		Optional<Integer>second_highest=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if(second_highest.isPresent()) {
			System.out.println("Second highest number" + second_highest.get());
		}
		
	}

}
