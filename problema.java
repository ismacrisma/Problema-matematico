package ismaell;
import java.util.Scanner;
import java.lang.Math;
public class problema {
	
	/**
	 * @author      ismael <ismael.abbou@ies-sabadell.cat>  
	 * @version     1.0                
	 * @since       1.0          
	 */

	
	/**
	* <p> British medical ha FET 1 estudi de l'Efectes secundaris del tabac i ha calculat que per cada cigar consumit </p>
	* <p> ens quieta 11 minuts de vida. British medical t'ha demanat un programa que et calculi quants anys de vida et va a treure. </p>
	*
	* <ul>
	* 	<li> <p> El programa deve demanar a l'usuari: </p> </li>
	* 	<li> <p> l'edat en què va començar a fumar </p> </li>
	* 	<li> <p> en què edat vol deixar de fumar </p> </li>
	* 	<li> <p> quants cigarrets fumes al dia </p> </li>
	* </ul>
	* 	
	*/
	
	static Scanner reader = new Scanner(System.in);
	
	/**
	 * <h2>Aqui estara el index del programa es a dir el main</h2>
	 * @param args .
	 * @author ismael
	 * @since 1-3-2018
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ops=' ';
		int tempIni=0;
		int tempFin=0;
		int cuantCigar=0;
		
			do {
				
				tempIni = pedirIni();
				tempFin = pedirFin();
				cuantCigar = pedirCigar();
				calcular(tempIni,tempFin,cuantCigar);
				ops = repetir();
				
			}while(ops=='s'|| ops=='S');
			
	}
	private static void calcular(int tempIni, int tempFin, int cuantCigar) {
		// TODO Auto-generated method stub
		float  res=0,res1=0;
		int res2=0,res3=0,res4=0,res5=0;
		float rango= tempFin-tempIni;
		float año = 356;
		float muerteMinDia = 11 * cuantCigar;
		float hora = 60;
		float dia = 24;
		
		res = rango * año; // calcular cuantos dias teine el rango(año)  
		
		res1 = muerteMinDia / hora; // calcular cuantas horas de vida restantes por dia 
		
		res2=calculMin(res,res1); // calcular el total de minutos perdidas dentro del rango 
		
		res5=calculHora(res2,hora);//res2/hora;
		
		res3=calculDia(res5,dia);//res5/dia; // calcular el total de dia perdidas dentro del rango 
		
		res4=calculAño(res3,año); //res3/año;
		
		System.out.println("Ha este ritmo va a perder "+res2+" minutos de tu vida. ");
		System.out.println("Ha este ritmo va a perder "+res5+" horas de vida. ");
		System.out.println("Ha este ritmo va a perder "+res3+" dias de vida. ");
		System.out.println("Ha este ritmo va a perder "+res4+" años de tu vida. ");
		
		
		
	}
	
	
	
	/**
	 * <h2> En este codigo dividimos res3/año para opetner r2 en años;</h2>
	 * @param  res3 division de res5/dia .
	 * @param  año su valor es 356 .
	 * @author ismael
	 * @since 23-2-2018
	 * @return val
	 */

	
	 static int calculAño(int res3, float año) {
		// TODO Auto-generated method stub
		 float valor;
		int val;
		valor = res3/año;
		val=(int) Math.floor(valor);
			
		
		return val;
	}
	 
		/**
		 * @param  res5.
		 * @param  f. 
		 * @author ismael
		 * @since 23-2-2018
		 * @return val
		 */
	 
	static int calculDia(int res5,float f) {
		// TODO Auto-generated method stub
		float valor;
		int val;
		valor = res5/f;
		val=(int) Math.floor(valor);
		
		
		return val;
	}
	
	/**
	 * @param  res2 . 
	 * @param  hora .
	 * @author ismael
	 * @since 23-2-2018
	 * @return val
	 */
	
	static int calculHora(int res2, float hora) {
		// TODO Auto-generated method stub
		float valor;
		int val;
		
		valor = res2/hora;
		val=(int) Math.floor(valor);
		
	
		return val;
		
	}
	
	/**
	 * @param  res .
	 * @param  res1 .
	 * @since 23-2-2018
	 * @return val
	 */
	static int calculMin(float res, float res1) {
		// TODO Auto-generated method stub
		
		float valor;
		int val;
		
		valor = res * res1;
		val=(int) Math.floor(valor);
		
		
		return val;
	}
	
	/**
	 * @author ismael
	 * @since 23-2-2018
	 * @return res
	 */
	
	private static int pedirIni() {
		// TODO Auto-generated method stub
		int res=0;
		
		System.out.println("Introduce en que edad empezaste a fumar  : ");
		res = reader.nextInt(); 
		
		return res;
	}
	
	/**
	 *
	 * @author ismael
	 * @since 23-2-2018
	 * @return res
	 */
	
	private static int pedirFin() {
		// TODO Auto-generated method stub
		int res=0;
		
		System.out.println("Introduce en que edad quieres dejar de fumar  : ");
		res = reader.nextInt(); 
		
		return res;
	}
	
	
	/**
	 * @author ismael
	 * @since 23-2-2018
	 * @return res
	 */
	
	private static int pedirCigar() {
		// TODO Auto-generated method stub
		
		int res=0;
		
		System.out.println("Introduce el numero de cigaros fumados diarios : ");
		res = reader.nextInt(); 
		
		return res;
	}
	
	/**
	 * @author ismael
	 * @since 23-2-2018
	 * @return res

	 */
	private static char repetir() {
		// TODO Auto-generated method stub
		
		char res=' ';
		
		System.out.println("Quieres volver intentarlo (s/n)?  : ");
		res = reader.next().charAt(0);
		
		return res;
	}

}
