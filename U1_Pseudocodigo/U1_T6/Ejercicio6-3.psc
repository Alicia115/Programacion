
Algoritmo Repetir03
	
	//Prepara un programa que divida dos números que introduzca el usuario. 
	//Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces como sea necesario, 
//hasta que introduzca un número distinto de cero, momento en que se calculará y mostrará el resultado de la división.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Repetir
		Escribir "Introduzca un número"
		Leer n1
		Escribir "Introduzca otro número"
		Leer n2
		si (n1<>0) Entonces
			Escribir "La suma es de " n1 + n2
		SiNo
			si n2<>0 Entonces
				
				Escribir "La suma es de " n1 + n2
			FinSi
			
			
		FinSi
	Hasta Que (n1 = 0) y (n2 = 0)
	Escribir "Fin del proceso"
	
FinAlgoritmo
