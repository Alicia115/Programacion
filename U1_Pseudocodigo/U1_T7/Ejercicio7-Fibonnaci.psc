Algoritmo Ejercicio_Adicional_Fibonacci
	
	//Escribe un programa que muestre los n primeros términos de la serie de
	//Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
	//el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
	//términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
	//introducir por teclado.
	
	Definir x como entero
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir tamaño Como Entero
	Definir temporal Como Entero
	
	n1=0
	n2=1
	
	Repetir
		Escribir "DIme el tamaño de la serie. MIn3"
		Leer tamaño
	Hasta Que  tamaño >=3
	
	Escribir Sin Saltar n1," ", n2 " "
	para x<-3 Hasta tamaño Hacer
		
		Escribir Sin Saltar n1+n2 " " 
		temporal=n1+n2
		n1=n2
		n2=temporal
		
	FinPara
	
	
FinAlgoritmo
