Algoritmo ejercicio_adicional_reloj_arena
	
	//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. 
	//El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, 
	//en caso contrario se debe mostrar un mensaje de error.
	
	Definir n,m,i,j Como Entero
	
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

