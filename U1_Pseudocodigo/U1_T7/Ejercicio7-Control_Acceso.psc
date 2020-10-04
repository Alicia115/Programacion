Algoritmo caja
	
	
	Definir combinacion Como Real
	Definir intentos Como Entero
	
	
	intentos <- 1
	
	Repetir
		Escribir "Intrpduzca cable de acceso de 4 digitos"
		leer combinacion
		
		Si combinacion<>1234 Entonces
			Escribir "Lo siento esa no es la combinación"
			intentos= intentos +1
		FinSi
		
	Hasta Que combinacion=1234 o intentos = 4
	
	Si combinacion=1234 Entonces
		Escribir "La caja se ha abierto satisfactoriamente"
	SiNo
		Si intentos>4 Entonces
			Escribir "Has superado el numero de intentos, pruebe mas tarde"
		FinSi
	FinSi
	
	
	
	
	
FinAlgoritmo
	