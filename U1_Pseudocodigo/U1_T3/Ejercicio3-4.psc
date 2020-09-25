Proceso sin_titulo
	
	//Haz un programa que pida al usuario dos números y diga cuántos de ellos son positivos.
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	
	Escribir "Escribe un número"
	Leer n1
	
	Escribir "Escribe otro número"
	Leer n2
	
	
	
	Si (n1 >= 0) Y (n2 >= 0) Entonces
		Escribir "De los números escritos estos son los positivos: " n1, " y " n2
	FinSi
	
	Si (n1 >= 0) Y (n2 < 0) Entonces
		Escribir "De los números escritos estos son los positivos: " n1
	FinSi
	
	Si (n1 < 0) Y (n2 >= 0) Entonces
		Escribir "De los números escritos estos son los positivos: " n2
	FinSi
	
	Si (n1 < 0) Y (n2 < 0) Entonces
		Escribir "De los números escritos ninguno son positivos"
	FinSi
	
	
	
	
FinProceso
