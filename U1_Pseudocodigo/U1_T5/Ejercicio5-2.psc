Algoritmo Mientras02
	
	//Haz un programa que permita calcular la suma de pares de n�meros. 
	//Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que ambos n�meros introducidos sean 0.
	
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Escribe un n�mero"
	Leer n1
	Escribir "Escribe otro n�mero"
	Leer n2
	
	Mientras (n1 <> 0) O (n2 <> 0) Hacer
		
		Escribir "La suma es de " n1 + n2
		Escribir "Introduce de nuevo un n�mero"
		Leer n1
		Escribir "Introduce de nuevo otro n�mero"
		Leer n2
	FinMientras
	Escribir "Terminado"
	
FinAlgoritmo

