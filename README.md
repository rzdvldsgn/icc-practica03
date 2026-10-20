# Practica 03
## 01 Referencias e Inmutabilidad de String
```
System.out.println(a == b);
```
Compara la variable a con b y devuelve false, pues se compara una variable con un objeto
```
System.out.println(a == c);
```
Devuelve true, pues c esta asignada como una concatenacion, y esta tiene el mismo valor que a
```
System.out.println(a == d);
```
Devuelve false, pues compara el valor inicial de d con el de a
```
system.out.println(a.equals(d));
```
Devuelve true, pues "equals" compara el valor final de d
```
System.out.println(a);
```
Imprime la variable a (Java)
```
system.out.println(b);
```
Imprime la variable b concatenada con "21" (Java 21)

## Operaciones e Indices en StringBuilder
## ABCDE
```
sb.delete(1, 4);
```
borra del caracter A hasta el caracter C, no borra 4 caracteres pues las cadenas comienzan a contarse desde 0
```
sd.insetr(1, "xyz");
```
Cambia el caracter E por xyz
```
sd.reverse();
```
Invierte la cadena (EDCBA)
```
sd.replace(1, 4, "-");
```
Cambia los caracteres de la posicion 1 a 4 por "-"
```
System.out.println(sb);
```
Imprime E-A, pues la cadena fue modificada previamente
```
Sysem.out.println(sb.length);
```
Imprime la longutud de la cadena
```
System.out.println(sb.capacity);
```
Imprime la capacidad total de la cadena, es distinto a "length", este ultimo imprime solo los caracteres usados de la capacidad total

## 03 Referencias Compartidas
```
System.out.println(a);
```
Imprime "Hola mundo", pues se agrega "mundo" al final de la variable a
```
System.out.println(b);
```
Imprime "mundo", pues anteriormente se eliminaroin caracteres de b
```
System.out.println(c);
```
Imprime "Hola", pues c en un objeto aparte de a
```
system.out.println(a == b);
```
Compara los valores iniciales de a y b, devuelve true
```
System.out.println(a.equals(b));
```
Compara los valores finales de a y b, devuelve true
```
System.out.println(a.equals(c));
```
Como a y c son objetos distintos, devuelve false

