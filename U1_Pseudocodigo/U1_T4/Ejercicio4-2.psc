Proceso sin_titulo
	
	//Crea una variante del ejercicio 5.1, en la que emplees varios SI-ENTONCES en vez de SEGUN.
	
	Definir n1 Como Entero
	Escribir "Escribe un numero"
	Leer n1
	
	Si n1 = 1 Entonces
		Escribir "Hoy es lunes"
	SiNo
		Si n1 = 2 Entonces
			Escribir "Hoy es martes"
		SiNo
			Si n1 = 3 Entonces
				Escribir "Hoy es miércoles"
			SiNo
				Si n1 = 4 Entonces
					Escribir "Hoy es jueves"
				SiNo
					Si n1 = 5 Entonces
						Escribir "Hoy es viernes"
					SiNo
						Si n1 = 6 Entonces
							Escribir "Hoy es sábado"
						SiNo
							Si n1 = 7 Entonces
								Escribir "Hoy es domingo"
							SiNo
								Escribir "No es ningún día de la semana"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
			
		FinSi
	FinSi
	
	
FinProceso
