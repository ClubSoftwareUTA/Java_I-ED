Algoritmo ReporbadosAprobados
	i<-1;
	aprob<-0;
	reprob<-0;
	Mientras i<=10 Hacer
		Escribir "Igrese la nota: ";
		Leer nota;
		Si nota>=7 Entonces
			aprob <- aprob+1;
		SiNo
			reprob <- reprob+1;
		Fin Si
		i<-i+1;
	Fin Mientras
	Escribir aprob;
	Escribir reprob;
FinAlgoritmo
