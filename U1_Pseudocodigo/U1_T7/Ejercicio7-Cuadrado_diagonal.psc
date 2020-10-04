Algoritmo ejercicio_adicional_cuadrado_diagonal
	
	//Realiza un rectangulo con diagonales
	
	Definir altura, fila, columna Como Entero
	
	Repetir
		Escribir "Introduzca la altura del cuadrado. Debe ser impar y mayor que 5"
		leer altura
	Hasta Que altura%2=1 Y altura >= 5
	
	Para fila<-1 Hasta altura Hacer
		Para columna <-1 hasta altura Hacer
			Si fila=1 O fila=altura O columna=1 O columna=altura O fila=columna O fila+columna=altura + 1 Entonces
				Escribir Sin Saltar "*"
				
			FinSi
			
		FinPara
		Escribir " "
	Fin Para
	
	
	
	
FinAlgoritmo

