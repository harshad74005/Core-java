	package Java8.Optional;
	
	import java.util.Optional;
	
	public class Demo2 {
		public static Optional<String> getStudentName(int id)
		{
			if(id==1)
			{
				return Optional.of("harshad");
			}
			else {
				return Optional.empty();
			}
			
		}
		public static void main(String[] args) {
			
			
			Optional<String> getId = getStudentName(2);
			getId.stream().map((a)->a.toUpperCase()).forEach(System.out::println);;
			System.out.println("The Name is  "+getId.orElse("Unkwon person name "));
		}
	}
