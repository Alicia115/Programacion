Algoritmo Ejercicio10
	
	// A partir del ejemplo que dibuja un rect�ngulo de asteriscos, crea un que dibuje un cuadrado 
	//(deber� pedir s�lo un dato, el lado, y ambas �rdenes "para" deber�n tener ese valor como l�mite).
	
	Definir n Como real
	Definir fila Como Real
	Definir columna Como Real
	
	Escribir Sin Saltar"Introduce el lado del cuadrado"
	Leer n
	
	para fila <- 1 Hasta n Hacer
		
		Para columna <- 1 Hasta n Hacer
			Escribir Sin Saltar " * " 
		FinPara
		Escribir " "
	FinPara
	
	
FinAlgoritmo
