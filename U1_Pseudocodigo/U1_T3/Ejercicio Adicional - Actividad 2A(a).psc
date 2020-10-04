Algoritmo minutosejercicio
	
	//	Desarrolla un programa que, partiendo de una cantidad de minutos, diga con cuantas horas y minutos se corresponde. 
	//Debemos hacerlo para 624 minutos, claro que el programa debe funcionar aunque cambiemos ese valor. Pista:
	//Para conseguir el número de horas, deberás truncar 624/60 para quedarte con su parte entera.
//Ejemplo: 624 segundos son 10 horas y 24 minutos.
	
	
	Definir n Como Real
	Definir horas Como Real
	Definir minutos Como Real
	
	Escribir "Intruduzca el numero de minutos"
	leer n
	
	horas<-trunc(n/60)
	
	

	
	minutos <- n-horas*60
	
	Escribir n " minutos son ",horas, " horas y ",minutos," minutos"
	
	
	
FinAlgoritmo
	