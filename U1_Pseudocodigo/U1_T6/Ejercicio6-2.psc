
Algoritmo Repetir02
	
	//Haz un programa que permita calcular la suma de pares de números. 
	//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0. 
	//Esta vez deberás usar "Repetir", por lo que tu solución no será igual que la del ejercicio 6.2, que empleaba "Mientras".
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Repetir
		Escribir "Introduzca un número"
		Leer n1
		Escribir "Introduzca otro número"
		Leer n2
		
		si (n1<>0) o (n2<>0) Entonces
			Escribir "La suma es de " n1 + n2
		
		FinSi
	Hasta Que (n1 = 0) y (n2 = 0)
	Escribir "Fin del proceso"
	
FinAlgoritmo

