Proceso sin_titulo
	
	//Desarrolla un programa que pida un n�mero, y luego escriba un men� con 3 opciones: 
	//1-calcular el valor absoluto 2-calcular la ra�z cuadrada 3- calcular el cuadrado de ese n�mero. 
	//Seg�n la opci�n que ingrese el usuario, debe calcularse una cosa u otra.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Elige un n�mero"
	Leer n1
	Escribir "Elige entre estas opciones: 1-calcular su valor absoluto. 2- calcular su ra�z cuadrada o 3- calcular el cuadrado de ese n�mero"
	leer n2
	
	Si n2 = 1 Entonces
		Escribir "El valor absoluto de " n1 " es " abs(n1)
	SiNo
		si n2 = 2 entonces
			Escribir "La ra�z cuadrada de " n1 " es " rc(n1)
		sino 
			si n2 = 3 Entonces
				Escribir "El cuadrado de " n1 " es " n1^2
				
			FinSi
			
		FinSi
	FinSi
	
	
FinProceso
