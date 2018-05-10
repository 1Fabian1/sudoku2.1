package main.model;

import javafx.scene.control.Label;

import java.util.Random;

public class Solver {

    private int[][] tabela = new int[9][9];

    public Solver() {
    }

    public Solver(int[][] tabela) {
        this.tabela = tabela;
    }

    public Solver(int[] puzzle) {
        int i = 0;
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                tabela[y][x] = puzzle[i++];
            }
        }
    }

    public int[] solve() {
        recurse();
        int b[] = new int[81];
        int i = 0;
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                b[i++] = tabela[y][x];
            }
        }
        return b;
    }

    public boolean recurse() {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (tabela[y][x] == 0) {
                    for (int i = 1; i <= 9; i++) {
                        if (isAllowed(x, y, i)) {
                            tabela[y][x] = i;
                            if (recurse()) return true;
                            tabela[y][x] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    protected boolean isAllowed(int x, int y, int num) {
        return !contains(getRow(x, y), num) && !contains(getCol(x, y), num) && !contains(getSquare(x, y), num);
    }

    protected int[] getRow(int x, int y) {
        return tabela[y];
    }

    protected int[] getCol(int x, int y) {
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            b[i] = tabela[i][x];
        }
        return b;
    }

    protected int[] getSquare(int x, int y) {
        int[] b = new int[9];
        int z = 0;
        int ymod = (y / 3) * 3;
        int xmod = (x / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[z++] = tabela[ymod + i][xmod + j];
            }
        }
        return b;
    }

    private boolean contains(int[] list, int num) {
        for (int i : list) {
            if (i == num) return true;
        }
        return false;
    }


    //podpowiedź
    public int[][] hint(int[][] tabela, Label labelKomunikacja) {
        Random random = new Random();
        Silnik silnik = new Silnik();
        int x = random.nextInt(9);
        int y = random.nextInt(9);
        int podnies = 1;
        boolean miksuj = true;
        boolean canDo;

        while (miksuj) {
            if (tabela[x][y] == 0) {
                miksuj = false;
            } else {
                x = random.nextInt(9);
                y = random.nextInt(9);
            }
        }
        if (tabela[x][y] == 0) {
            canDo = silnik.walidacja(tabela);
            while (canDo) {
                tabela[x][y] = podnies;
                podnies++;
                if (silnik.walidacja(tabela)) canDo = false;
            }
            labelKomunikacja.setText("Wstawiono podpowiedź " + (podnies - 1) + " w pole x" + x + " y" + y);
            System.out.println("czy poprawne " + silnik.walidacja(tabela));
        }
        return tabela;
    }

}
