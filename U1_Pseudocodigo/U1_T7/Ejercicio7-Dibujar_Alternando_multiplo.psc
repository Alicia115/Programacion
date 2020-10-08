Algoritmo dibujar_alternando_multiplo
	
	Definir tam, f, c como entero
	
	
	Repetir
		Escribir "Introduce el tamaño, mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 y tam%2=1
	
	
	Para f<-0 hasta tam-1 Hacer
		Si f%3<> 0 Entonces
			Escribir "XXXXXXX"
		SiNo
			Escribir "XX---XX"
		FinSi
	FinPara
	
	
FinAlgoritmo