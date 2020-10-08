Algoritmo dibujar_A
	
	Definir tam, f, c como entero
	
	
	Repetir
		Escribir "Introduce el tamaño, mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 y tam%2=1
	
	
	Para f<-0 hasta tam-1 Hacer
		Si (f=0) o (f=trunc(tam/2)) Entonces
			Escribir "XXXXX"
		SiNo
			Escribir "X---X"
		FinSi
	FinPara
	
	
FinAlgoritmo
	