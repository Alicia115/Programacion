Algoritmo Mientras03
	
	//Crea un programa que genere dos números al azar entre el 0 y el 100, y pida al usuario que calcule e introduzca su suma. 
	//Si la respuesta no es correcta, deberá volver a pedirla tantas veces como sea necesario hasta que el usuario acierte.
	//Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes hacer numero <- AZAR(101)
	
	
	Definir n1 Como entero
	Definir n2 Como Entero
	Definir resultado Como entero
	
	n1 = azar(101)
	n2 = azar(101)
	
	Escribir n1 " + " n2
	
	Escribir "Introduce la suma " 
	Leer resultado
	
	Mientras resultado <> n1+n2 Hacer
		Escribir "Intentalo de nuevo"
		Escribir "Introduce la suma"
		Leer resultado
	FinMientras
	
	Escribir "Correcto!"
	
	
	
FinAlgoritmo

