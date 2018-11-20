package Matematica;

public class BalancoTrimestral {
	public static void main(String[] args) {
		double gastoJaneiro = 15000.21;
		double gastoFevereiro = 23000.34;
		double gastoMarco = 17000.33;
		double gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		double mediaMensal = gastoTrimestre / 3;
		
		System.out.println(gastoTrimestre);
		System.out.println("A média mensal é de: " + mediaMensal);
		
		for	(int	i	=	0;	i	<	100;	i++)	{
			if	(i	>	50	&&	i	<	60)	{
				break;
			}
			System.out.println(i);
}
	}
}
