import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

/*  Ens interessa saber quants segons de classe es realitzen realment durant una tarda de classes de DAM. Per això cal que donats les hores, minuts i segons d'una tarda de classe de DAM, sapiguem quants segons s'han realitzat.

Input Format

h, m i s: són hores minuts i segons introduïts.

Constraints

Suposem h,m i s que seran nombres no negatius i amb els límits m<60 i s<60

Output Format

Es mostra el nombre de segons efectius de classe de DAM.

Sample Input 0

1
1
1
Sample Output 0

3661
Sample Input 1

0
59
59
Sample Output 1

3599
Sample Input 2

0
10
0
Sample Output 2

600
Sample Input 3

3
25
45
Sample Output 3

12345

 */










public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt()* 3600;
        int m = sc.nextInt()* 60;
        int s = sc.nextInt()* 1;

        System.out.println(h+m+s);



    }

}
