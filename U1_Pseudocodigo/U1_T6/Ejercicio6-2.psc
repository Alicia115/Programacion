
Algoritmo Repetir02
	
	//Haz un programa que permita calcular la suma de pares de n�meros. 
	//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que ambos n�meros introducidos sean 0. 
	//Esta vez deber�s usar "Repetir", por lo que tu soluci�n no ser� igual que la del ejercicio 6.2, que empleaba "Mientras".
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Repetir
		Escribir "Introduzca un n�mero"
		Leer n1
		Escribir "Introduzca otro n�mero"
		Leer n2
		
		si (n1<>0) o (n2<>0) Entonces
			Escribir "La suma es de " n1 + n2
		
		FinSi
	Hasta Que (n1 = 0) y (n2 = 0)
	Escribir "Fin del proceso"
	
FinAlgoritmo

