Algoritmo Repetir01
	
	//Crea un programa que pida al usuario un código de usuario y una contraseña. 
	//Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234".
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	
	
	Repetir
		Escribir "Introduzca su código"
		Leer n1
		Si n1 <> 1 Entonces
			Escribir "Código incorrecto"
		SiNo
			Escribir "Introduzca su contraseña"
			Leer n2
			Si n2 <> 1234 Entonces
				Escribir "Contraseña incorrecta"
			FinSi
		FinSi
		hasta que n1=1 y n2=1234
		Escribir "Bienvenido"
	
FinAlgoritmo

