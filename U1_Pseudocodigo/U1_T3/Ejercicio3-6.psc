Proceso sin_titulo
	
	//Prepara un programa que pida al usuario tres números y diga cuál es el mayor de los tres.
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir n3 Como Entero
	
	Escribir "Escribe un número"
	Leer n1
	Escribir "Escribe un número"
	Leer n2
	Escribir "Escribe un número"
	Leer n3
	
	Si (n1 > n2) Y (n1 > n3) Entonces
		Escribir "El número mayor es " n1
	FinSi
	
	Si (n2 > n1) Y (n2 > n3) Entonces
		Escribir "El número mayor es " n2
	FinSi
	
	Si (n3 > n2) Y (n3 > n1) Entonces
		Escribir "El número mayor es " n3
	FinSi
	
	Si (n3 = n2) Y (n3 = n1) Entonces
		Escribir "Todos son el mismo número"
	FinSi
	
FinProceso
