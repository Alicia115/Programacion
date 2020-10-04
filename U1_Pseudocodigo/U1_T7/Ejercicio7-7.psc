Algoritmo Ejercicio10
	
	// A partir del ejemplo que dibuja un rectángulo de asteriscos, crea un que dibuje un cuadrado 
	//(deberá pedir sólo un dato, el lado, y ambas órdenes "para" deberán tener ese valor como límite).
	
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
