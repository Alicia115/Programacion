Algoritmo Repetir01
	
	//Crea un programa que pida al usuario un c�digo de usuario y una contrase�a. 
	//Deber� repetirse hasta que el c�digo sea "1" y la contrase�a sea "1234".
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	
	
	Repetir
		Escribir "Introduzca su c�digo"
		Leer n1
		Si n1 <> 1 Entonces
			Escribir "C�digo incorrecto"
		SiNo
			Escribir "Introduzca su contrase�a"
			Leer n2
			Si n2 <> 1234 Entonces
				Escribir "Contrase�a incorrecta"
			FinSi
		FinSi
		hasta que n1=1 y n2=1234
		Escribir "Bienvenido"
	
FinAlgoritmo

