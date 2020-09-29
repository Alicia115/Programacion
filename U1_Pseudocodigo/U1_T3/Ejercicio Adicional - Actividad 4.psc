Proceso sin_titulo
	
	Definir horas Como Real
	
	Escribir "Introduzca horas trabajadas"
	Leer horas
	
	si (horas <= 40) Entonces
		Escribir "El sueldo semanal por " horas " trabajadas es de " horas*10
		
	sino
		si (horas >= 41) Entonces
			Escribir "El sueldo semanal por " horas " tabajadas es de " horas*15
		FinSi
	FinSi
	
	
FinProceso
