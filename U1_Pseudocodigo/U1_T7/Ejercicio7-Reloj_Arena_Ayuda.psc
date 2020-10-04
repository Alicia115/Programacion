Algoritmo relojarena
	
	Definir n,m,i,j,esp Como Entero
	
	Repetir
		Escribir "Introduzca el tamaño del reloj. Debe ser impar"
		leer n
	Hasta Que n%2=1 Y n >= 3
	
	Para i <- 1 Hasta n Hacer
		
		Si i<=(trunc(n/2)+1) Entonces
			esp= i-1
			m=n-(i-1)*2
		SiNo
			m=i-(n-i)
			esp=n-i
		FinSi
		
		Si esp>0 entonces
			Para j <- 1 hasta esp Hacer
				Escribir Sin Saltar " "
			fin para
		FinSi
	
		
		Para j <- 1 hasta m Hacer
			Escribir Sin Saltar "*"
		fin para
		
		Escribir " "
	Fin Para
	
	
FinAlgoritmo
	