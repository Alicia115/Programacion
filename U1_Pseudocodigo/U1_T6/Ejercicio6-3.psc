
Algoritmo Repetir03
	
	//Prepara un programa que divida dos n�meros que introduzca el usuario. 
	//Si el segundo n�mero es cero, se le deber� avisar y volver a pedir tantas veces como sea necesario, 
//hasta que introduzca un n�mero distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Repetir
		Escribir "Introduzca un n�mero"
		Leer n1
		Escribir "Introduzca otro n�mero"
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
