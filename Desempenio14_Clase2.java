import hsa.Console;
class Desempenio14_Clase2
{
static Console c;
public static void main (String arg[])
{
int n1, n2, n3;
c = new Console();
c.print("Ingrese el primer numero: ");
n1 = c.readInt();
c.print("Ingrese el segundo numero: ");
n2 = c.readInt();
c.print("Ingrese el tercer numero: ");
n3 = c.readInt();
if (n1 == n2 && n1 == n3 && n2 == n3)
{
c.print("Todos los numeros son iguales: ");
}
else
{
c.print("No todos los numeros son iguales: ");
}
}
}
