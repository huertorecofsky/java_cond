import hsa.Console;
class Desempenio11_Clase2
{
static Console c;
public static void main (String arg[])
{
float l, a, superficie;
c = new Console();
c.print ("Ingrese el lado: ");
l = c.readFloat();
c.print ("Ingrese el ancho: ");
a = c.readFloat();
superficie = l * a;
if (superficie > 10)
{
c.println("Habitacion adecuada");
}
else
{
c.print("Habitacion pequenia");
}
}
}
