package Fundamentos;
// variables o metodos de clase son static
//variables o metodos de instancia no son static
//para acceder a un metodo o variable static es: NombreClase.Metodo 
//o NombreClase.variable
class cuentaBancaria{
	public int saldo;
	public int saldo2;
	public int saldo3;
	public static int numero=0;
}

public class Variables {
	public static void sumarSaldo(cuentaBancaria cta){
		cta.saldo +=10;
	}
	public static void sumarSaldo(int saldo){
		saldo+=10;
	}
	public static void sumarSaldo2(cuentaBancaria cta1){
		cta1.saldo2 +=15;
	}
	public static void sumarSaldo2(int saldo2){
		saldo2+=15;
	}
	public static void sumarSaldo3(cuentaBancaria cta2){
		cta2.saldo3 +=3000;
	}
	public static void sumarSaldo3(int saldo3){
		saldo3+=3000;
	}
//crear minimo 10 objetos de cuenta Bancaria 
	public static void main (String []args){
		cuentaBancaria ct1=new cuentaBancaria();
		cuentaBancaria ct2=ct1;
		ct1.saldo=1000;
		sumarSaldo(ct1);
		sumarSaldo(ct2);
		System.out.println(ct1.saldo);//imprime 1020
		System.out.println(ct2.saldo);//imprime 1020
		
		cuentaBancaria ct3=new cuentaBancaria();
		ct3.saldo2=500;
		System.out.println(ct3.saldo2);//imprime 500
		sumarSaldo2(ct3);
		System.out.println(ct3.saldo2);//imprime 515
		cuentaBancaria ct4=ct3;
		System.out.println(ct4.saldo2);//imprime 515
		sumarSaldo2(ct4);
		System.out.println(ct4.saldo2);//imprime 530
		
		ct3.saldo2=30;
		System.out.println(ct3.saldo2);//imprime 30
		
		cuentaBancaria ct5=new cuentaBancaria();
		ct5.saldo3=70;
		System.out.println(ct5.saldo3);//imprime 70
		sumarSaldo3(ct5);
		System.out.println(ct5.saldo3);//imprime 3070

        ct5=new cuentaBancaria();
        System.out.println("ct5:"+ ct5.saldo3);//imprime 0

		ct2=new cuentaBancaria();
		System.out.println("ct2:"+ ct2.saldo);//imprime 0
		
		
	}
	
	}

