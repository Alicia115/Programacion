Algoritmo Mientras02
	
	//Haz un programa que permita calcular la suma de pares de números. 
	//Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.
	
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Escribe un número"
	Leer n1
	Escribir "Escribe otro número"
	Leer n2
	
	Mientras (n1 <> 0) O (n2 <> 0) Hacer
		
		Escribir "La suma es de " n1 + n2
		Escribir "Introduce de nuevo un número"
		Leer n1
		Escribir "Introduce de nuevo otro número"
		Leer n2
	FinMientras
	Escribir "Terminado"
	
FinAlgoritmo

