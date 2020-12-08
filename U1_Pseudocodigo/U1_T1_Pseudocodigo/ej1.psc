Algoritmo Ejercicio1
	Definir cantidad Como entero
	
	Escribir "¿Cuanta cantidad va a querer de su pedido?"
	Leer cantidad
	
	Si (cantidad<=100) Entonces
		Escribir "El precio de su pedido es de " cantidad*5.23 " euros"
	SiNo
		Si (cantidad>=101) Y (cantidad<=1000)
			Escribir "El precio de su pedido es de " (100*5.23)+((cantidad-100)*4.16) " euros"
		SiNo
			si cantidad>1000 Entonces
				
				Escribir "El precio de su pedido es de " ((100*5.23)+(900*4.16))+((cantidad-1000)*(5.3/2)) " euros"
				
			FinSi
			
		FinSi
		
	Fin Si
FinAlgoritmo
