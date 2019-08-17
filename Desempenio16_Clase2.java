import hsa.Console;
class Desempenio16_Clase2
{
static Console c;
public static void main (String arg[])
{
int n1, n2, n3;
c = new Console();
c.print("Ingrese un numero: ");
n1 = c.readInt();
c.print("Ingrese otro numero: ");
n2 = c.readInt ();
c.print("Ingrese otro numero: ");
n3 = c.readInt ();
if (n1<10 || n2<10 || n3<10)
{
c.print("Algunos de los numeros es menor a 10");
}
else
{
c.print("Ninguno de los numeros es menor a 10");
}
}
}
