Algoritmo CalculadoraSimple
	Escribir 'Primer Numero: ';
	Leer num1;
	Escribir 'Segundo Numero';
	Leer num2;
	Escribir '1.Sumar';
	Escribir '2.Restar';
	Escribir '3.Multiplicar';
	Escribir '4.Dividir';
	Escribir 'Opcion: ';
	Leer op;
	Segun op Hacer
		1:
			resultado<-num1+num2;
		2:
			resultado<-num1-num2;
		3:
			resultado<-num1*num2;
		4:
			Si num2 = 0 Entonces
				error<-'No division para 0';
				er <- Verdadero;
			SiNo
				resultado<-num1/num2;
			Fin Si
		De Otro Modo:
			Escribir 'opcion no valida';
	Fin Segun
	Si er = Verdadero Entonces
		Escribir error;
	SiNo
		Escribir 'El resultado es: ', resultado;
	Fin Si	
FinAlgoritmo
