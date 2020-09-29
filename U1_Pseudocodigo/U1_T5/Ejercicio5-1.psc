
	
	//Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras que no introduzca "1234". 
	//Cuando finalmente escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.
Algoritmo Mientras01	
	Definir n1 Como Entero
	Escribir "Introduzca su contraseña"
	Leer n1
	
	Mientras n1 <> 1234 Hacer
		Escribir "Contraseña incorrecta"
		Escribir "Inténtelo de nuevo, introduzca su contraseña"
		Leer n1
	FinMientras
	Escribir "Bienvenido"
FinAlgoritmo


