Proceso sin_titulo
	
	//Realiza un programa que pida al usuario un importe en pesetas, y escriba su equivalencia en euros, teniendo en cuenta que:
	//Si la cantidad introducida es negativa, el programa debe mostrar un mensaje de error: "El valor en pesetas no es correcto"
		//1 euro = 166,386 pesetas
	
	
	Definir pesetas Como Real
	
	Escribir "Introduce una cantidad en pesetas"
	Leer pesetas
	
	Si pesetas <= 0 Entonces
		escribir "La cantidad debe ser positiva"
	SiNo
		Escribir pesetas, "pesetas son ", pesetas/166.386, "euros"
	FinSi
	
	
	
FinProceso
