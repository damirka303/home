import java.util.scanner; 

public class interectRunner {
	public static void main(String[] agrs)
	{
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Введи певое число: ");
				String first = reader.next();
				System.out.println("Введи второе число: ");
				String sec = reader.next();
				calc.add(Inreger.valueof(first),Integer.valueof(sec));
				System.out.println(" Резульат: " + calc.getResult());
				System.out.println("Выйти yes/no: ");
				exit = reader.next();
			}
		} finally{reader.close();}
	}
}