import hsa.Console;
class Desempenio13_Clase2
{
static Console c;
public static void main (String arg[])
{
String articulo;
int precio, codigo, descuento, incremento, contado, tarjeta;
c = new Console();
c.print("Ingrese el nombre del articulo: ");
articulo = c.readLine();
c.print("Ingrese el precio: ");
precio = c.readInt();
c.print("Ingrese el codigo 1 0 2, segun forma de pago: ");
codigo = c.readInt();
descuento = (precio * 5) / 100;
contado = precio - descuento;
incremento = (precio * 10) / 100;
tarjeta = precio + incremento;
if (codigo == 1)
{
c.print("El precio total con descuento por pago en contado es de: " + contado);
}
if (codigo == 2)
{
c.print("El precio total con incremento por pago con tarjeta es de: " + tarjeta);
}
}
}
