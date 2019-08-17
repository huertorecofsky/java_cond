import hsa.Console;
class Desempenio10_Clase2
{
static Console c;
public static void main (String arg[])
{
float n1, n2, suma, diferencia, producto, division;
c = new Console ();
c.print("Ingrese un numero: ");
n1 = c.readFloat();
c.println();
c.print("Ingrese otro numero: ");
n2 = c.readFloat();
suma = n1 + n2;
diferencia = n1 - n2;
producto = n1 * n2;
division = n1 / n2;
if (n1 > n2)
{
c.println ("La suma es: " + suma);
c.println ("La diferencia es: " + diferencia);
}
else 
{
c.println ("El producto es: " + producto);
c.println ("La division es: " + division);
}
}
}
