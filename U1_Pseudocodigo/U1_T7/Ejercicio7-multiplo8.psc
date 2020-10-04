Algoritmo Ejercicio_Adicional_multiplo_8
	
	// Pide un numero al usuario y encontrar a partir de ese numero los 10 primeros multiplos de 8
	
	Definir n, multiplos Como entero
	
	Escribir "Intruduzca un número"
	Leer n
	
	multiplos=0
	
	mientras multiplos <= 10
		
		si n%8 = 0 Entonces
			multiplos= multiplos+1
			Escribir n, "es múltiplo de 8"
		FinSi
		
		n = n +1
		
	FinMientras
	
	
	
	
FinAlgoritmo