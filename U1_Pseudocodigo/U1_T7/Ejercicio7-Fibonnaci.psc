Algoritmo Ejercicio_Adicional_Fibonacci
	
	//Escribe un programa que muestre los n primeros t�rminos de la serie de
	//Fibonacci. El primer t�rmino de la serie de Fibonacci es 0, el segundo es 1 y
	//el resto se calcula sumando los dos anteriores, por lo que tendr�amos que los
	//t�rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El n�mero n se debe
	//introducir por teclado.
	
	Definir x como entero
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir tama�o Como Entero
	Definir temporal Como Entero
	
	n1=0
	n2=1
	
	Repetir
		Escribir "DIme el tama�o de la serie. MIn3"
		Leer tama�o
	Hasta Que  tama�o >=3
	
	Escribir Sin Saltar n1," ", n2 " "
	para x<-3 Hasta tama�o Hacer
		
		Escribir Sin Saltar n1+n2 " " 
		temporal=n1+n2
		n1=n2
		n2=temporal
		
	FinPara
	
	
FinAlgoritmo
