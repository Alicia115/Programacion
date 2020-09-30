Proceso sin_titulo
	
	//Desarrolla un programa que, partiendo de una cantidad de minutos, diga con cuantas horas y minutos se corresponde. 
	//Debemos hacerlo para 624 minutos, claro que el programa debe funcionar aunque cambiemos ese valor. 
//Pista: Para conseguir el número de horas, deberás truncar 624/60 para quedarte con su parte entera.
	
	
	Definir minutos Como Real
	Definir truncado Como Real
	Definir horas Como Real
	
	Escribir "Intruduzca los minutos y sacaremos cuantas horas y minutos son"
	leer truncado
	truncado = truncado/60
	horas = trunc(truncado)
	minutos = (truncado - horas)*60
	Escribir truncado*60 " minutos son: " horas " horas y " minutos " minutos"
	
	
	
FinProceso
