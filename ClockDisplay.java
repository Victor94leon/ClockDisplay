/**
 * Imaginemos que tenemos un amigo programador en Java como nosotros que quiere hacer una aplicaci�n para tel�fonos Android consistente en un reloj 
 * en formato 24 horas, que muestre las horas y minutos desde las 00:00 hasta las 23:59.
 *
 *Como anda muy apurado de tiempo, nos pide que le hagamos parte del trabajo. Concretamente necesita que le programemos una clase llamada ClockDisplay que:
 *
 *Permita fijar un momento determinado de tiempo expresado en horas y minutos. Por ejemplo, si yo le indico a un m�todo 23 y 45 como par�metros, el tiempo 
 * del reloj debe quedar fijado a 23:45. El nombre del m�todo debe ser setTime.
 *Permita hacer avanzar un minuto el tiempo fijado. Evidentemente, el usuario podr� invocar este m�todo tantas veces como quiera. El nombre del m�todo debe ser timeTick.
 *Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. El nombre del m�todo debe ser getTime. Ojo: la cadena siempre debe
 *tener 5 caracteres.
 *
 *Es muy posible que no seas capaz de completar la actividad. No te preocupes, el objetivo es intentarlo.
 */

public class ClockDisplay 
{
     // Tiempo guardado en horas.
    private int horas;
    // Tiempo guardado en minutos.
    private int minutos;
    
    /**
     * Crea un objeto de la clase ClockDisplay.
     */
    public ClockDisplay ()
    { 
        horas = 0;
        minutos = 0;
    }
    
     /**
     * Introducir un una hora desde las 00:00 hasta las 23:59 (PM).
     */
    public void setTime (int hora,int min)
    {
        if (hora>=0 & hora<=23 & minutos >=0 & minutos<=59){
            horas = hora;
            minutos = min;
        }
        else {
            System.out.println("La hora no es correcta");
        }
    }
    
     /**
     * Avanza un minuto la hora del reloj.
     */
    public void timeTick ()
    {
        minutos = (minutos + 1);
        if (minutos > 59){
            horas = horas + 1;
            minutos = 0;
        }
        
        if (horas > 23) {
            horas = 0;
        }
    }
    
    /**
     * Devuelve una cadena de 5 caracteres mostrando la hora separada de los minutos mediante dos puntos.
     */
    public String getTime ()
    {
        String horaDelReloj;
        if (horas<10 & minutos<10) {
            horaDelReloj = "0" + horas + ":" + "0" + minutos;
        }
        else if (horas<10 & minutos>=10) {
            horaDelReloj = "0" + horas + ":" + minutos; 
        }
        else if (horas>=10 & minutos<10) {
            horaDelReloj = horas + ":" + "0" + minutos;
        }
        else {
            horaDelReloj = horas + ":" + minutos;
        }
        return horaDelReloj;
    }
    
}