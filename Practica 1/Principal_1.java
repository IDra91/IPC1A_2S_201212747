


package practica1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author manuel
 */
class Principal {
String Nombre1;
String Nombre2;
int op=0;
int op1=0;
int op2=0;
int op3=0;

int[] deck={1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8};
int mano[]= new int[2];
int mano2[]= new int[2];
int desechados[]= new int[3];
int field[]= new int[2];
int coin=0;
int token=0;
int Counter=0;
Scanner s1 = new Scanner(System.in);
Scanner s2 = new Scanner(System.in);
Scanner s3 = new Scanner(System.in);
    public void Opciones(){

    }
    public void menu(int opcion){
        System.out.println("1.) Jugar una Partida ");
        System.out.println("2.) Seleccionar el número de tokens a jugar ");
        System.out.println("3.) Mostrar las reglas del juego");
        System.out.println("4.) Salir");
        opcion = op;
        op = s1.nextInt();

        switch(op){
            case 1:
                if (op3 == 0){
            		System.out.println("No ha seleccionado una cantidad de tokens, por favor escoja la opción 2");
            		menu(1);
            	}else{
            		System.out.println("Por favor escriba su nombre");
            		Nombre1 = s2.nextLine();
            		System.out.println("Por favor escriba el nombre de su adversario");
            		Nombre2 = s2.nextLine();
            		System.out.println("Por favor escoja una opción para decidir su turno: ");
            		System.out.println("1.) Cara");
            		System.out.println("2.) Escudo");
            		op2 = s2.nextInt();
            		Random coin = new Random();
            		int ra = coin.nextInt(2);
            			if ((op2 == ra)){
                                turno1();
            			}
                                else {
                                turno2();
                                }
                }
                break;
            case 2:
            System.out.println("Por favor escoja la cantidad de tokens que desa jugar");
            	System.out.println("1.) 1 Token");
            	System.out.println("2.) 2 Tokens");
            	System.out.println("3.) 3 Tokens");
            	op3 = s3.nextInt();
            	token = op3;
                menu(1);
                break;
            case 3:
            System.out.println("A continuación se muestran las reglas del juego:");
				   System.out.println("(1) Guard: Permite adivinar la mano del rival (cartas del 2-8) si adivina, el jugador rival sale del juego. (5 en el mazo)");
				   System.out.println("(2) Priest: Permite ver la mano del jugador rival. (2 en el mazo)");
				   System.out.println("(3) Baron: Compara manos con el rival, el jugador con la carta mas baja sale del juego. En caso de empate no sucede nada. (2 en el mazo)");
				   System.out.println("(4) Handmaid: El jugador que utiliza esta carta es inmune a los ataques de los demas por un (1) turno. (2 en el mazo)");
				   System.out.println("(5) Prince: Permite botar la mano del jugador o la del rival. Y da una carta nueva del deck. (2 en el mazo)");
				   System.out.println("(6) King: Intercambia manos entre jugadores.(1 en el mazo)");
				   System.out.println("(7) Countess: Si el jugador tiene un Prince o King en su mano y la Countess debe jugar la Countess. (1 en el mazo)");
				   System.out.println("(8) Princess: Si el jugador juega esta carta pierde el juego. (1 en el mazo)");
                                   System.out.println("¿Deséa regresar al menú principal?");
                                   System.out.println("1.) Sí");
                                   System.out.println("2.) No");
                                   op2 = s2.nextInt();
                                   if (op2==1){
                                    menu(1);
                                   }
                                   if (op2==2){
                                    System.exit(1);
                                   }

                break;
            case 4:
                System.exit(1);
                break;
            default:
                    throw new AssertionError();

        }
    }
        public void azarcarta1(int [] card){
        Random rnd = new Random();
        for (int i = card.length -1; i>0;i--){
            int index = rnd.nextInt(i+1);
            int c = card[index];
            card[index]= card[i];
            card[i]= c;
        }
        }
   
        public void agregarmano(int deck[]){
        for(int i=12;i<mano.length;i++){
           if((deck[i]==1)){
               System.out.println(mano);
               mano[i]=1;
               deck[i]--;
           }
          if((deck[i]==2)){
              mano[i]=2;
              deck[i]--;
          }
          if((deck[i]==3)){
              mano[i]=3;
              deck[i]--;
          }
          if((deck[i]==4)){
              mano[i]=4;
              deck[i]--;
          }
          if((deck[i]==5)){
              mano[i]=5;
              deck[i]--;
          }
           if((deck[i]==6)){
               mano[i]=6;
               deck[i]--;

           }
           if((deck[i]==7)){
               mano[i]=7;
               deck[i]--;
                }
           if((deck[i]==8)){
               mano[i]=8;
               deck[i]--;
           }
        }
        }
        public void desechar(int deck[]){
            deck[15]=0;
            deck[14]=0;
            deck[13]=0;
        }
        

    private void efectos1(int field[]) {

        if ((field[0]==1)||(field[1]==1)){

                    System.out.println("Escoja un número");
                    System.out.println("[2],[3],[4],[5],[6],[7],[8]");
                        if ((op2==mano2[0])||(op2==mano2[1])){
                            System.out.println("Tú acabas de ganar");
                            Counter++;
                            if((Counter == op3)){
                                System.out.println("Has ganado la partida, felicidades");

                            }
                            else{
                                menu(1);
                            }
                        }
                       else{
                        menu(1);
                       }
    }
         if ((field[0]==2)||(field[1]==2)){
                    if((mano2[0]==1)){
                        System.out.println("La mano de tu oponente es: ");
                        System.out.println("1.) Guard");
                        return;
                        
                    }
                    if((mano2[0]==2)){
                        System.out.println("La mano de tu oponente es: ");
                        System.out.println("1.) Priest");
                        return;
                    }
                    if((mano2[0]==3)){
                        System.out.println("La mano de tu oponente es: ");
                        System.out.println("1.) Baron");
                        return;
                    }
                    if((mano2[0]==4)){
                        System.out.println("La mano del oponente está protegida por la HandMaid");
                        return;
                    }
                    if((mano2[0]==5)){
                        System.out.println("La mano de tu oponente es: ");
                        System.out.println("1.) Prince");
                        return;
                    }
                    if((mano2[0]==6)){
                        System.out.println("La mano de tu oponente es: ");
                        System.out.println("1.) King");
                        return;
                    }
                   if((mano2[0]==7)){
                       System.out.println("La mano de tu oponente es: ");
                       System.out.println("1.) Countess");
                       return;
                   }
    }
        if((field[0]==3)||(field[1]==3)){
                if((mano[0]>mano2[0])||(mano[1]>mano2[0])||(mano[1]>mano2[1])||(mano[0]>mano2[1])){
                    System.out.println("Tú acabas de ganar");
                    Counter++;
                            if((Counter == op3)){
                                System.out.println("Has ganado la partida, felicidades");

                            }
                            else{
                                menu(1);
                            }
                        }
                       else{
                       System.out.println("Has perdido la partida, ¿deséas continuar?");
                       System.out.println("1.) Sí");
                       System.out.println("2.) No");
                       op2 = s2.nextInt();
                            if (op2 == 1){
                                    menu(1);
                                }
                            else{
                                System.exit(1);
                            }
            }
        if((field[0]==5)||(field[1]==5)){
            System.out.println("¿A quién deséas botar la mano?");
            System.out.println("1.) A tí mismo");
            System.out.println("2.) Al rival");
            op2 = s2.nextInt();
            if (op2 == 1){
                mano[0]= 0;
                mano[1]= 0;

            }
           if (op2 == 2){
                mano2[0]=0;
                mano2[1]=0;
           }
        }
        if((field[0]==6)||(field[1]==6)){

        }

    }
    }
    private void turno1() {
        System.out.println("Es su turno");
            azarcarta1(deck);
            for(int i = 0; i< deck.length;i++){

            }

            desechar(deck);
            if (deck[12]==1){
                System.out.println("Jugador 2: ");
                System.out.println(Nombre2);
                System.out.println("Jugador 1: ");
                System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=1;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    System.out.println("Por favor escoja una de las cartas");
                    op2 = s2.nextInt();
                        mano[1]=0;
                        field[0]=1;
                        efectos1(field);
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;

                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }
                    if(deck[11]==7){
                   System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
        }
           if (deck[12]==2){
               System.out.println("Jugador 2: ");
               System.out.println(Nombre2);
               System.out.println("Jugador 1: ");
               System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=2;
                if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Guard");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }
                    if(deck[11]==7){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Priest");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
           }
                if (deck[12]==3){
                System.out.println("Jugador 2: ");
                System.out.println(Nombre2);
                System.out.println("Jugador 1: ");
                System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=3;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }
                    if(deck[11]==7){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Baron");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }

        }
           if (deck[12]==4){
               System.out.println("Jugador 2: ");
               System.out.println(Nombre2);
               System.out.println("Jugador 1: ");
               System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=4;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                   System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                   System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }
                    if(deck[11]==7){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) HandMaid");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
           }
                if (deck[12]==5){
                System.out.println("Jugador 2: ");
                System.out.println(Nombre2);
                System.out.println("Jugador 1: ");
                System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=5;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }
                    if(deck[11]==7){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Prince");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
        }
           if (deck[12]==6){
               System.out.println("Jugador 2: ");
               System.out.println(Nombre2);
               System.out.println("Jugador 1: ");
               System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=6;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }

                    if(deck[11]==7){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Countess");
                        deck[11]=0;
                        mano[1]=7;
                    }
                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) King");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
           }
          if (deck[12]==7){
                System.out.println("Jugador 2: ");
                System.out.println(Nombre2);
                System.out.println("Jugador 1: ");
                System.out.println(Nombre1);
                deck[12]=0;
                mano[0]=7;
                    if(deck[11]==1){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) Guard");
                        deck[11]=0;
                        mano[1]=1;
                    }
                    if(deck[11]==2){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) Priest");
                        deck[11]=0;
                        mano[1]=2;
                    }
                    if(deck[11]==3){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) Baron");
                        deck[11]=0;
                        mano[1]=3;
                    }
                    if(deck[11]==4){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) HandMaid");
                        deck[11]=0;
                        mano[1]=4;
                    }
                    if(deck[11]==5){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) Prince");
                        deck[11]=0;
                        mano[1]=5;
                    }
                    if(deck[11]==6){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) King");
                        deck[11]=0;
                        mano[1]=6;
                    }

                    if(deck[11]==8){
                    System.out.println("Tu mano es: ");
                    System.out.println("1.) Countess");
                    System.out.println("2.) Princess");
                        deck[11]=0;
                        mano[1]=8;
                    }
        }
           if (deck[12]==8){
               System.out.println("Tu mano es: ");
               System.out.println("1.) Princess");
               System.out.println("Has perdido");
                System.out.println("Has perdido, ¿Deséas continuar?");
               System.out.println("1.) Sí");
               System.out.println("2.) No");
               op2 = s2.nextInt();
               if (op2 == 1){
                   menu(1);
               }
            else{
                System.exit(1);
                 }
           }
    }

    
    

    private void turno2() {
        azarcarta1(deck);
        for(int i = 0; i< deck.length;i++){

            }
        System.out.println("Es el turno del oponente");
                       
                desechar(deck);
           if (deck[12]==1){
                deck[12]=0;
                mano2[0]=1;
                    if (deck[11]==1){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Guard");
                        deck[11]=0;
                        mano[0]=1;
                     }
        }
           if (deck[12]==2){
                deck[12]=0;
                mano2[0]=2;
                    if (deck[11]==2){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Priest");
                        deck[11]=0;
                        mano[0]=2;
                    }
        }
           if (deck[12]==3){
                deck[12]=0;
                mano2[0]=3;
                    if (deck[11]==3){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Baron");
                        deck[11]=0;
                        mano[0]=3;
                         }
        }
             if (deck[12]==4){
                deck[12]=0;
                mano2[0]=4;
                    if (deck[11]==4){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) HandMaid");
                        deck[11]=0;
                        mano[0]=4;
                    }
        }
            if (deck[12]==5){
                deck[12]=0;
                mano2[0]=5;
                    if (deck[11]==5){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Prince");
                        deck[11]=0;
                        mano[0]=5;
                    }
        }
            if (deck[12]==6){
                deck[12]=0;
                mano2[0]=6;
                    if (deck[11]==6 ){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) King");
                        deck[11]=0;
                        mano[0]=6;
                         }
        }
             if (deck[12]==7){
                deck[12]=0;
                mano2[0]=7;
                    if (deck[12]==7){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Countess");
                        deck[11]=0;
                        mano[0]=7;
                        }
        }
          if (deck[12]==8){
            deck[12]=0;
            mano2[0]=8;
            System.out.println("Tú acabas de ganar");
            Counter++;
            if (Counter == op3){
              System.out.println("Has ganado la partida, felicidades");
            }
 else{
                menu(1);
 }
                    if (deck[11]==8){
                        System.out.println("Jugador 2: ");
                        System.out.println(Nombre2);
                        System.out.println("Jugador 1: ");
                        System.out.println(Nombre1);
                        System.out.println("Tu mano es: ");
                        System.out.println("1.) Princess");
                        System.out.println("Has perdido, ¿Deséas continuar?");
                        System.out.println("1.) Sí");
                        System.out.println("2.) No");
                        op2 = s2.nextInt();
                            if (op2 == 1){
                                menu(1);
                            }
                            else{
                            System.exit(1);
                 }

           }
    }
}
}
