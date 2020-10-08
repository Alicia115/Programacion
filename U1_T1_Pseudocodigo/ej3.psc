Algoritmo Ejercicio3
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. 
	//Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. 
	//Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error y volver a 
	//solicitarlo. A continuación se muestran algunos ejemplos.
	
	//La anchura de la figura siempre será de 6 caracteres.
	
	
	Definir altura,anchura,f,c Como Entero
	
	Repetir
		Escribir "Por favor, introduzca la altura (tiene que ser mayor o igual a 5 e impar)"
		Leer altura
	Hasta Que altura>=5 Y altura%2=1
	
	
	anchura<-6
	
	Para f<-1 Hasta altura Hacer
		Para c<-1 Hasta anchura Hacer
			Si f=1 o f=altura o c=1 o c=anchura o f=trunc(altura/2)+1
				Escribir Sin Saltar "M"
			SiNo
				Escribir Sin Saltar " "
			FinSi
			Fin Para
			Escribir " "
	Fin Para
	
	
	
	
FinAlgoritmo
