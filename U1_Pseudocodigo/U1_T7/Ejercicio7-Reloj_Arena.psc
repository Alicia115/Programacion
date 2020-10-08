Algoritmo ejercicio_adicional_reloj_arena
	
	//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. 
	//El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, 
	//en caso contrario se debe mostrar un mensaje de error.
	
	Definir tam, f, c Como Entero
	
	Repetir
		Escribir "Introduzca el tamaño del reloj. Debe ser impar"
		leer tam
	Hasta Que tam%2=1 Y tam >= 3
	
	Para f<-0 Hasta tam-1 Hacer
		Para c<-0 hasta tam-1 Hacer
			Si (f=0) O (f=tam-1) o (c>=f y f+c<=tam-1) o (f+c>=tam-1 y f>=c) Entonces
				
				Escribir Sin Saltar "*"	
			sino 
				Escribir sin saltar "-"
			FinSi
			
		FinPara
		
		Escribir " "
		
	FinPara
	

	
FinAlgoritmo

