Proceso sin_titulo
	
	//Haz un programa que pida al usuario dos n�meros y diga cu�ntos de ellos son positivos.
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	
	Escribir "Escribe un n�mero"
	Leer n1
	
	Escribir "Escribe otro n�mero"
	Leer n2
	
	
	
	Si (n1 >= 0) Y (n2 >= 0) Entonces
		Escribir "De los n�meros escritos estos son los positivos: " n1, " y " n2
	FinSi
	
	Si (n1 >= 0) Y (n2 < 0) Entonces
		Escribir "De los n�meros escritos estos son los positivos: " n1
	FinSi
	
	Si (n1 < 0) Y (n2 >= 0) Entonces
		Escribir "De los n�meros escritos estos son los positivos: " n2
	FinSi
	
	Si (n1 < 0) Y (n2 < 0) Entonces
		Escribir "De los n�meros escritos ninguno son positivos"
	FinSi
	
	
	
	
FinProceso
