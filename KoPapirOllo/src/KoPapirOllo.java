/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bandi
 */

class KoPapirOllo
{
    public static void main ( String[] args ){
        Scanner s = new Scanner (System.in) ;
        Random rn= new Random( ) ;

        try
        {
            while ( true )
            {
                String tipp=s.nextLine();
                System.out.println(tipp);
                //if ( tipp == "vege" ) EZ itt nem fog működni!!!
                if ( tipp.compareTo("vege")==0 )
                    break ;
                if ( tipp.compareTo("ko")==0 || tipp.compareTo("papir")==0 || tipp.compareTo("ollo")==0 )
                {
                    int random=rn.nextInt(3);

                    if ( tipp.compareTo("ko")==0 && random == 0 )
                        System.out.println ( "Döntetlen !" ) ;
                    if ( tipp.compareTo("ko")==0 && random == 1 )
                        System.out.println( "Nyertem!" ) ;
                    if ( tipp.compareTo("ko")==0 && random == 2 )
                        System.out.println ( "Nyertél!" ) ;

                    if( tipp.compareTo("papir")==0 && random == 0 )
                        System.out.println ( "Nyertél!" ) ;
                    if( tipp.compareTo("papir")==0 && random == 1 )
                        System.out.println ( "Döntetlen !" ) ;
                    if( tipp.compareTo("papir")==0 && random == 2 )
                        System.out.println ( "Nyertem! " ) ;

                    if( tipp.compareTo("ollo")==0 && random == 0 )
                        System.out.println ( "Nyertem! " ) ;
                    if( tipp.compareTo("ollo")==0 && random == 1 )
                        System.out.println ( "Nyertél!" ) ;
                    if( tipp.compareTo("ollo")==0 && random == 2 )
                        System.out.println ( "Döntetlen !" ) ;
                }

                else
                    System.out.println( "Adja meg a  'ko' ,   'papir'  vagy  'ollo'   sztringek valamelyikét" ) ;
                }
        }
        catch(Exception e){
            System.out.println("HIBA TÖRTÉNT");
        }
    }
}