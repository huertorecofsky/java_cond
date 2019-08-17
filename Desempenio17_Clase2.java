import hsa.Console;
class Desempenio17_Clase2
{
static Console c;
public static void main (String arg [])
{
float altura;
c = new Console();
c.print("Ingrese su altura: ");
altura = c.readFloat();
if (altura < 1.60)
{
c.print ("Persona baja");
}
if (altura >= 1.60 && altura <= 1.75)
{
c.print ("Persona estandar");
}
if (altura > 1.75)
{
c.print ("Persona alta");
}
}
}
