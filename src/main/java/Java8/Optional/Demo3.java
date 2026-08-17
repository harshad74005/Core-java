package Java8.Optional;

import java.util.Optional;

public interface Demo3 {
	
	public static Optional<String> getPrice(int price)
	{
		if(price==500)
		{
			return Optional.of("The price is 500");
		}
		else if(price > 500)
		{
			return Optional.of("The value is greter than 500");
		}
		else
		{
			return Optional.empty();
		}
	}
	public static void main(String[] args) {
		Optional<String> getAmt = getPrice(600);
		System.out.println(" "+getAmt.orElse("Price is low"));
	}
}
