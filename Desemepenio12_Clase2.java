import hsa.Console;
class Desemepenio12_Clase2
{
static Console c;
public static void main (String arg[])
{
int d, m, a;
c= new Console();
c.print ("Ingrese el dia: ");
d = c.readInt();
c.print ("Ingrese el mes: ");
m = c.readInt();
c.print("Ingrese el anio: ");
a = c.readInt();

if (m <= 3)
{
c.println ("Corresponde al primer trimestre");
}
else
{
c.println ("No corresponde al primer trimestre");
}
}
}

