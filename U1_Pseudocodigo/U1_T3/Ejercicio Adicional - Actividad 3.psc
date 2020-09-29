Proceso sin_titulo
	
	//Desarrolla un programa que pida un número, y luego escriba un menú con 3 opciones: 
	//1-calcular el valor absoluto 2-calcular la raíz cuadrada 3- calcular el cuadrado de ese número. 
	//Según la opción que ingrese el usuario, debe calcularse una cosa u otra.
	
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Elige un número"
	Leer n1
	Escribir "Elige entre estas opciones: 1-calcular su valor absoluto. 2- calcular su raíz cuadrada o 3- calcular el cuadrado de ese número"
	leer n2
	
	Si n2 = 1 Entonces
		Escribir "El valor absoluto de " n1 " es " abs(n1)
	SiNo
		si n2 = 2 entonces
			Escribir "La raíz cuadrada de " n1 " es " rc(n1)
		sino 
			si n2 = 3 Entonces
				Escribir "El cuadrado de " n1 " es " n1^2
				
			FinSi
			
		FinSi
	FinSi
	
	
FinProceso
