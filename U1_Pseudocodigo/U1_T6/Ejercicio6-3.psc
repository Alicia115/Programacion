
Algoritmo Repetir03
	
	//Prepara un programa que divida dos números que introduzca el usuario. 
	//Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces como sea necesario, 
//hasta que introduzca un número distinto de cero, momento en que se calculará y mostrará el resultado de la división.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduzca un número"
	Leer n1
	
	Repetir
		Escribir "Introduzca otro número"
		Leer n2
		si (n2=0) Entonces
			Escribir "El divisor no puede ser 0"
		FinSi
	Hasta Que n2<>0
	Escribir "La división es ", n1/n2
	
FinAlgoritmo
