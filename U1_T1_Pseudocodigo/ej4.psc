Algoritmo sin_titulo
	
	
	Definir n1, x, cuenta, primo, suma , maximo, minimo Como Entero

	cuenta<-0
	
		Repetir
			
			Escribir "Introduce tantos n�meros enteros positivos como quiera, para finalizar introduce un numero primo"
			Leer n1
			
			primo<-0
		
			Para x<-1 Hasta n1 Hacer
				Si n1%x=0 Entonces
					primo<-primo+1
					
				Fin Si
				
			Fin Para
			
			
			Si primo>2  Entonces
				cuenta<- cuenta +1
				suma<-suma+n1
			FinSi
			
			Si cuenta=1 Entonces
				maximo<-n1
				minimo<-n1
			SiNo
				Si maximo<n1 Entonces
					maximo<-n1
				SiNo
					Si minimo>n1 Entonces
						minimo<-n1
					FinSi
				FinSi
			FinSi
		
			
			
		Hasta Que primo<=2
		
		Escribir "La cantidad de numero entregados es " cuenta
		Escribir "El n�mero m�ximo es " maximo
		Escribir "El n�mero minimo es " minimo
		Escribir "La media de los numeros es " suma/cuenta
		

		
		
FinAlgoritmo
