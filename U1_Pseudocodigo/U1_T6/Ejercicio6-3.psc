
Algoritmo Repetir03
	
	//Prepara un programa que divida dos n�meros que introduzca el usuario. 
	//Si el segundo n�mero es cero, se le deber� avisar y volver a pedir tantas veces como sea necesario, 
//hasta que introduzca un n�mero distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduzca un n�mero"
	Leer n1
	
	Repetir
		Escribir "Introduzca otro n�mero"
		Leer n2
		si (n2=0) Entonces
			Escribir "El divisor no puede ser 0"
		FinSi
	Hasta Que n2<>0
	Escribir "La divisi�n es ", n1/n2
	
FinAlgoritmo
