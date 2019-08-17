import hsa.Console;
class Desemepenio9_Clase2
{
static Console c;
public static void main (String arg[])
{
int n;
c = new Console();
c.print("Ingrese un numero entero del 0 al 99: ");
n = c.readInt();
if (n <= 9 && n >= 0)
{
c.print("Tiene un solo digito");
}
if (n >= 10 && n <= 99)
{
c.print("Tiene dos digitos");
}
if (n >= 100)
{
c.print("Ingrese un numero valido");
}
}
}
