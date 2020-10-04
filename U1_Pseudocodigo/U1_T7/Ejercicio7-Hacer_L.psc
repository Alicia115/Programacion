Algoritmo Ejercicio_L
	
	//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
	//programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
	//mitad (división entera entre 2) de la altura más uno.
	
	
	Definir f,x Como Entero
	
	Escribir "Introduce el tamaño"
	Leer f
	
	Para x<-1 Hasta f-1
		Escribir "*"
	FinPara
	
	Para x<-1 hasta trunc(f/2)+1 Hacer
		Escribir Sin Saltar "*"
	FinPara
	
	Escribir ""
	
FinAlgoritmo
	