import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите массу тела(кг) и рост(м) через пробел: ");
		double m = scanner.nextDouble();
		double h = scanner.nextDouble();
		double IMT = m/(h*h);
		if (h<=0 | h>350) {
		    System.out.println("Указан некорректный рост");
		    
		}
		else if (m<=0 | m>1000){
		    System.out.println("Указан некорректный вес");
		    
		}
		else if(IMT>0 & IMT<=16){
		    System.out.println("Выраженный дефицит массы тела");
		}
		else if(IMT>16 & IMT<19){
		    System.out.println("Недостаточная масса тела");
		}
		else if(IMT>=19 & IMT<25){
		    System.out.println("Нормальная масса тела");
		}
		else if(IMT>=25){
		    System.out.println("Избыточная масса тела");
		}
	}
}
