Algoritmo ejercicio_adicional_cuadrado_vacio
	
	//Realiza un rectangulo vacío
	
	Definir n,x,i Como Entero
	
	Repetir
		Escribir "Introduzca el tamaño del reloj. Debe ser impar"
		leer n
	Hasta Que n%2=1 Y n >= 3
	
	Para x<-0 Hasta n-1 Hacer
		Para i<-0 hasta x Hacer
			Escribir Sin Saltar "--"
		FinPara
		
		Para i<-0 hasta 2*x Hacer
			Escribir Sin Saltar "* "
		FinPara
		
		Escribir " "
		
	FinPara
	

	
FinAlgoritmo

