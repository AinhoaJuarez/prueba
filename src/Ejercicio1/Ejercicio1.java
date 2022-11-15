/**
 * @author Ainhoa Juárez
 */
package Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		// no funcionará ya que la variable a es de tipo int y "a" es un String.
		int a = "a";
		System.out.println(a);

		// no funcionará ya que la variable pi es de tipo int y "3.14" es un double.
		int pi = 3.14;
		System.out.println(pi);

		// Si funcionará y se imprimirá 2.14.
		double pi = 3.14;
		System.out.println(pi);

		// Si funcionará y se imprimirá false ya que 1 no es igual a 4.
		boolean adivina = (1 == 4);
		System.out.println(adivina);

		// No funcionará ya que no se puede comparar 97 con "a" puesto que 97 es tipo
		// int y a tipo Strng.
		boolean adivina = (97 == "a" == 97);
		System.out.println(adivina);

		// No funcionará ya que no se puede comparar 97 con "a" puesto que 97 es tipo
		// int y a tipo Strng.
		boolean adivina = (97 == "a" == true);
		System.out.println(adivina);
	}

}
