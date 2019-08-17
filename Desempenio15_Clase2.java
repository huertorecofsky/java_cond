import hsa.Console;
class Desempenio15_Clase2
{
static Console c;
public static void main (String arg[])
{
int sueldo, aniosa, incremento10, aumento10, incremento5, aumento5;
c = new Console();
c.print("Ingrese su sueldo: ");
sueldo = c.readInt();
c.print("Ingrese su antiguedad: ");
aniosa = c.readInt();
incremento10 = sueldo * 10 / 100;
aumento10 = sueldo + incremento10;
incremento5 = sueldo * 5 / 100;
aumento5 = sueldo + incremento5;
if (sueldo < 4500 && aniosa >= 10)
{
c.print("Su sueldo tiene un 10% de aumento. Total: " + aumento10);
}
if (sueldo < 4500 && aniosa < 10)
{
c.print("Su sueldo tiene un 5% de aumento. Total: " + aumento5);
}
if (sueldo >= 4500)
{
c.print("No se realiza ningun aumento. Total: " + sueldo);
}
}
}
