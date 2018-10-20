package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        String[][] playingfiled = {{"   ", "   ", "   "}, {"   ", "   ", "   "}, {"   ", "   ", "   "}};
        printField(playingfiled);
        boolean win  = false;
        int i,j;

        while (win == false)  {
            win = player(playingfiled, win, " x ");
            if (win == true) break;
            win = player(playingfiled, win, " о ");

        }

    }


    public static boolean player(String[][] playingfiled, boolean win, String turn){

        Scanner in = new Scanner(System.in);
        System.out.println("Ходит" + turn + ", введите координату по вертикали и после, по горизонтали ( начиная с 0 )");
        int i = in.nextInt();
        int j = in.nextInt();

        if (i <= 2 && j <= 2 && playingfiled[i][j] == "   ") {
            playingfiled[i][j] = turn;
            printField(playingfiled);

            win = chek(playingfiled, win);
        } else {
            System.out.print("Неправильно введены координаты, игра закончена");
            win = true;
        }
        return win;
    }

    public static void printField(String[][] playingfiled) {
        for (int i = 0; i < playingfiled.length; i++) {
            System.out.print("|");
                    for (int j = 0; j < playingfiled.length; j++) {
                        System.out.print(playingfiled[i][j] + "|");
                    }
                    System.out.println("\n" + "-------------");
                }
        }

    public static boolean chek(String[][] playingfiled, boolean win) {
        int chek2 = 0;

        if ((playingfiled[0][0] == playingfiled[0][1] && playingfiled[0][1] == playingfiled[0][2] && playingfiled[0][0] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][0]);
            win   = true;

        }
        if ((playingfiled[0][0] == playingfiled[1][0] && playingfiled[1][0] == playingfiled[2][0] && playingfiled[0][0] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][0]);
            win  = true;
        }
        if ((playingfiled[0][0] == playingfiled[1][1] && playingfiled[1][1] == playingfiled[2][2] && playingfiled[0][0] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][0]);
            win  = true;
        }
        if ((playingfiled[0][2] == playingfiled[1][1] && playingfiled[1][1] == playingfiled[2][0] && playingfiled[0][2] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][2]);
            win  = true;
        }
        if ((playingfiled[0][1] == playingfiled[1][1] && playingfiled[1][1] == playingfiled[2][1] && playingfiled[0][1] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][1]);
            win  = true;
        }
        if ((playingfiled[0][2] == playingfiled[1][2] && playingfiled[1][2] == playingfiled[2][2] && playingfiled[0][2] != "   ")) {
            System.out.println(" Победили " + playingfiled[0][2]);
            win  = true;
        }
        if ((playingfiled[1][0] == playingfiled[1][1] && playingfiled[1][1] == playingfiled[1][2] && playingfiled[1][0] != "   ")) {
            System.out.println(" Победили " + playingfiled[1][0]);
            win  = true;
        }
        for (int i = 0; i < playingfiled.length; i++) {
            for (int j = 0; j < playingfiled.length; j++) {
                if ((playingfiled[i][j] != "   ")) {
                    chek2 += 1;
                }
            }
        }
        if (chek2 == 9){
            win = true;
            System.out.println("ничья");
        }

        return  win;

    }




    }

