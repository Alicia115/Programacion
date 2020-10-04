Algoritmo ejercicio_adicional_flecha
	
	//Flecha
	
	Definir n,m,i,j Como Entero
	
	Repetir
		Escribir "Introduzca la altura de la flecha. Debe ser impar y mayor que 5"
		leer n
	Hasta Que n%2=1 Y n >= 5
	
	Para i <- 1 Hasta n Hacer
		
		Si i<=(trunc(n/2)+1) Entonces
			
			m=i
			
		SiNo
			m=n-i+1
		FinSi
		
		Para j <- 1 hasta m Hacer
				Escribir Sin Saltar "*"
			fin para
		Escribir " "
	Fin Para
	
	
	
	
FinAlgoritmo

