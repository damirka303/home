import java.util.scanner; 

public class interectRunner {
	public static void main(String[] agrs)
	{
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("����� ����� �����: ");
				String first = reader.next();
				System.out.println("����� ������ �����: ");
				String sec = reader.next();
				calc.add(Inreger.valueof(first),Integer.valueof(sec));
				System.out.println(" ��������: " + calc.getResult());
				System.out.println("����� yes/no: ");
				exit = reader.next();
			}
		} finally{reader.close();}
	}
}