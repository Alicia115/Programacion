public class BucleBreak1 {
    public static void main( String args[] ) {

        int i;
        System.out.println( "Empezamos..." );

        for ( i=1 ; i<=20 ; i++ ) {
            if (i==15){
                continue;
            }
            System.out.println(i);
        }


    }
}
