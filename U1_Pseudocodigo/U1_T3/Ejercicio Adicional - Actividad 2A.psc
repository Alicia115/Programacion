Proceso sin_titulo
	
	//Desarrolla un programa que, partiendo de una cantidad de minutos, diga con cuantas horas y minutos se corresponde. 
	//Debemos hacerlo para 624 minutos, claro que el programa debe funcionar aunque cambiemos ese valor. 
//Pista: Para conseguir el n�mero de horas, deber�s truncar 624/60 para quedarte con su parte entera.
	
	
	Definir seg Como Entero
	Definir h,min Como Entero
	
	Escribir  "Introduzca el n�mero de segundos"
	Leer seg
	
	h<-trunc(seg/3600)
	
	min = trunc((seg - (h*3600))/60)
	
	Escribir seg, "segundos son ",h, "horas y ",min," minutos"
	
FinProceso
