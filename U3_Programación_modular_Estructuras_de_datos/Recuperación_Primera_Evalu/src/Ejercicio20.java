public class Ejercicio20 {

    public static void main(String[] args) {

        int digit = 12322;
        int num = 2;
        int[] array = {2,22,1,5,2,222};

        System.out.println(ocurrencias(digit,num));
        System.out.println(ocurrencias(num,array));


    }


    public static int digitos(int n){
        int contador=0;

        while(n>0){
            contador++;
            n = n/10;
        }
        return contador;
    }


    public static int ocurrencias(int digito,int n){

        int contador=0;
        int resto =0;

        while(digito>0){
            resto = digito%10;
            System.out.println("resto" +resto);

            if(resto==n){
                contador++;
                System.out.println("contador "+contador);
            }
            digito = digito/10;
            System.out.println("digito"+digito);
        }

        return contador;
    }

    public static int ocurrencias(int digito,int[]a){
        int contador=0;
        int resto=0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("inicio "+a[i]);

            while (a[i]>0){
                resto = a[i]%10;
                System.out.println("resto" +resto);
                if(resto== digito){
                    contador++;
                    System.out.println("contador "+contador);
                }
                a[i] = a[i]/10;
                System.out.println("digito"+a[i]);
            }
        }
        return contador;
    }
}
