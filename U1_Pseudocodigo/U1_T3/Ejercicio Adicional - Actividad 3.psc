Algoritmo  ejercicio8
	
	//Desarrolla un programa que pida un n�mero, y luego escriba un men� con 3 opciones: 
	//1-calcular el valor absoluto 2-calcular la ra�z cuadrada 3- calcular el cuadrado de ese n�mero. 
	//Seg�n la opci�n que ingrese el usuario, debe calcularse una cosa u otra.
	
	Definir num Como Real
	Definir opciones Como Entero
	
	Escribir "Escoge un numero"
	leer num
	Escribir "Escoge el numero de la opcion que quieras realizar:"
	Escribir "1-calcular el valor absoluto" 
	Escribir "2-calcular la ra�z cuadrada"
	Escribir "3- calcular el cuadrado de ese n�mero"
	leer opciones
	
	Segun opciones Hacer
		1:
			Escribir "El valor absoluto es " abs(num)
		2:
			Escribir "La raiz cuadrada es " rc(num)
		3:
			Escribir "El cuadrado es " num*num
			
	Fin Segun
	
	
	
	
	
FinAlgoritmo

