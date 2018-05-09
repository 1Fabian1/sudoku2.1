package main.model;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Silnik {
    private final int dlugoscTabeli = 9;
    Solver solver = new Solver();
    private int[][] tabela = {{1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}};
    private int tablicaPom1[] = new int[9];
    private int tablicaPom2[] = new int[9];
    private int tablicaPomDuza1[][] = new int[9][9];
    private int tablicaPomDuza2[][] = new int[9][9];
    private Random random = new Random();
    private int usunieto;

    public int[][] getTabela() {
        return tabela;
    }

    public void setTabela(int[][] tabela) {
        this.tabela = tabela;
    }

    // losuje układ tabeli
    public int[][] uruchom(int[][] tabela, int ileUsunac) {
        System.out.println("Pokaż tabele na wejsciu");
        pokazTabele(tabela);
        System.out.println("tabela na wejściu " + validateV2(tabela));

        //mieszanie
        System.out.println("mieszanie");
        for (int i = 0; i < 10; i++) {
            miksujTranspozycjaA();
            przestawiajWiersze();
            przestawiajKolumny();
        }

        usuwaniePol(ileUsunac);
        pokazTabele(tabela);
        System.out.println("Czy tabela jest poprawna " + validateV2(getTabela()));
        return tabela;
    }

    public void pokazTabele(int[][] tabelaDoPokazania) {
        for (int i = 0; i < dlugoscTabeli; i++) {
            //System.out.print(tabela[i]);
            System.out.println("");
            if (i % 3 == 0) {
                System.out.println("----------------------------");
            }
            for (int j = 0; j < dlugoscTabeli; j++) {
                if (j % 3 == 0) {
                    System.out.print(" | ");
                }
                System.out.print(tabelaDoPokazania[i][j] + " ");
            }
        }
        System.out.println("\n" + "----------------------------");
    }

    private void przestawiajWiersze() {
        //przestawianie dużych wierszy
        if (random.nextBoolean()) {
            przestawDuzyWiersz(0, 3);
        }
        if (random.nextBoolean()) {
            przestawDuzyWiersz(0, 6);
        }
        if (random.nextBoolean()) {
            przestawDuzyWiersz(3, 6);
        }

        // przestawianie małych wierszy
        // pierwszy pakiet
        if (random.nextBoolean()) {
            przestawWiersz(0, 1);
        }
        if (random.nextBoolean()) {
            przestawWiersz(1, 0);
        }
        if (random.nextBoolean()) {
            przestawWiersz(1, 2);
        }
        // drugi pakiet
        if (random.nextBoolean()) {
            przestawWiersz(3, 4);
        }
        if (random.nextBoolean()) {
            przestawWiersz(4, 3);
        }
        if (random.nextBoolean()) {
            przestawWiersz(4, 5);
        }

        // trzeci pakiet
        if (random.nextBoolean()) {
            przestawWiersz(6, 7);
        }
        if (random.nextBoolean()) {
            przestawWiersz(7, 6);
        }
        if (random.nextBoolean()) {
            przestawWiersz(7, 8);
        }
    }

    private void przestawiajKolumny() {
        //przestaw duze kolumny
        if (random.nextBoolean()) {
            przestawDuzaKolumne(0, 3);
        }
        if (random.nextBoolean()) {
            przestawDuzaKolumne(0, 6);
        }
        if (random.nextBoolean()) {
            przestawDuzaKolumne(3, 6);
        }
//        if (random.nextBoolean()) {
//            przestawDuzaKolumne(3, 0);
//        }
//        if (random.nextBoolean()) {
//            przestawDuzaKolumne(6, 0);
//        }
//        if (random.nextBoolean()) {
//            przestawDuzaKolumne(6, 3);
//        }


        //pierwszy pakiet
        if (random.nextBoolean()) {
            przestawKolumne(0, 1);
        }
        if (random.nextBoolean()) {
            przestawKolumne(1, 0);
        }
        if (random.nextBoolean()) {
            przestawKolumne(1, 2);
        }
//        if (random.nextBoolean()) {
//            przestawKolumne(2, 1);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(0, 2);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(2, 0);
//        }
        // drugi pakiet
        if (random.nextBoolean()) {
            przestawKolumne(3, 4);
        }
        if (random.nextBoolean()) {
            przestawKolumne(4, 3);
        }
        if (random.nextBoolean()) {
            przestawKolumne(4, 5);
        }
//        if (random.nextBoolean()) {
//            przestawKolumne(5, 4);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(3, 5);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(5, 3);
//        }

        // trzeci pakiet
        if (random.nextBoolean()) {
            przestawKolumne(6, 7);
        }
        if (random.nextBoolean()) {
            przestawKolumne(7, 6);
        }
        if (random.nextBoolean()) {
            przestawKolumne(7, 8);
        }
//        if (random.nextBoolean()) {
//            przestawKolumne(8, 7);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(6, 8);
//        }
//        if (random.nextBoolean()) {
//            przestawKolumne(8, 6);
//        }
    }

    private void miksujTranspozycjaA() {
        int[][] tabelaPomocnicza = new int[9][9];
        if (random.nextBoolean()) {

            for (int i = 0; i < dlugoscTabeli; i++) {
                for (int j = 0; j < dlugoscTabeli; j++) {
                    tabelaPomocnicza[j][i] = tabela[i][j];
                }
            }
            for (int i = 0; i < dlugoscTabeli; i++) {
                for (int j = 0; j < dlugoscTabeli; j++) {
                    tabela[i][j] = tabelaPomocnicza[i][j];
                }
            }
        }
    }

    private void przestawWiersz(int wierszPierwszy, int wierszDrugi) {
        for (int i = 0; i < dlugoscTabeli; i++) {
            tablicaPom1[i] = tabela[wierszPierwszy][i];
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            tablicaPom2[i] = tabela[wierszDrugi][i];
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            tabela[wierszPierwszy][i] = tablicaPom2[i];
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            tabela[wierszDrugi][i] = tablicaPom1[i];
        }
    }

    private void przestawKolumne(int kolumnaPiwerwsza, int kolumnaDruga) {
        for (int i = 0; i < dlugoscTabeli; i++) {
            tablicaPom1[i] = tabela[i][kolumnaPiwerwsza];
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            tablicaPom2[i] = tabela[i][kolumnaDruga];
        }

        for (int i = 0; i < dlugoscTabeli; i++) {
            tabela[i][kolumnaPiwerwsza] = tablicaPom2[i];
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            tabela[i][kolumnaDruga] = tablicaPom1[i];
        }
    }

    private void przestawDuzyWiersz(int pierwszyWiersz, int drugiWiersz) {
        //spisywanie
        int wiersz1 = pierwszyWiersz;
        int wiersz2 = drugiWiersz;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                tablicaPomDuza1[i][j] = tabela[pierwszyWiersz][j];
            }
            pierwszyWiersz++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                tablicaPomDuza2[i][j] = tabela[drugiWiersz][j];
            }
            drugiWiersz++;
        }

        //przekładanie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                tabela[wiersz1][j] = tablicaPomDuza2[i][j];
            }
            wiersz1++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                tabela[wiersz2][j] = tablicaPomDuza1[i][j];
            }
            wiersz2++;
        }

    }

    private void przestawDuzaKolumne(int pierwszaKolumna, int drugaKolumna) {
        int kolumna1 = pierwszaKolumna;
        int kolumna2 = drugaKolumna;

        //spisywanie do tabeli
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < 3; j++) {
                tablicaPomDuza1[i][j] = tabela[i][pierwszaKolumna + j];
            }
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < 3; j++) {
                tablicaPomDuza2[i][j] = tabela[i][drugaKolumna + j];
            }
        }
        //przepisywanie
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < 3; j++) {
                tabela[i][kolumna1 + j] = tablicaPomDuza2[i][j];
            }
        }
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < 3; j++) {
                tabela[i][kolumna2 + j] = tablicaPomDuza1[i][j];
            }
        }

    }

//    //do usunięcia
//    private boolean validate(int[] check) {
//        int i = 0;
//        Arrays.sort(check);
//        for (int number : check) {
//            if (number != ++i) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    //do usunięcia
//    public boolean czyPoprawne(int[][] grid) {
//        for (int i = 0; i < 9; i++) {
//
//            int[] row = new int[9];
//            int[] square = new int[9];
//            int[] column = grid[i].clone();
//
//            for (int j = 0; j < 9; j++) {
//                row[j] = grid[j][i];
//                square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
//            }
//            if (!(validate(column) && validate(row) && validate(square)))
//                return false;
//        }
//        return true;
//    }

    public boolean czyWygrana(int[][] board) {
        int licznik = 0;
        if (validateV2(board)) {
            for (int i = 0; i < dlugoscTabeli; i++) {
                for (int j = 0; j < dlugoscTabeli; j++) {
                    if (board[i][j] != 0) {
                        licznik++;
                        if (licznik == 81) {
                            return true;
                        }
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public void usuwaniePol(int ileUsunac) {
        while (usunieto < ileUsunac) {
            tabela[random.nextInt(9)][random.nextInt(9)] = 0;
            usunieto++;
        }
    }

    public void aktualizujPole(Label labelKomunikacja, TextField wybranyTextField, int wiersz, int kolumna) {
        boolean czyMozna = false;
        final int powrot = getTabela()[wiersz][kolumna];
        int[][] tempTab;
        tempTab = getTabela();
        Integer cyfra;
        String textZamiana;
        String wroc = Integer.toString(powrot);
        textZamiana = wybranyTextField.getText();
        if (textZamiana.equals("0") || textZamiana.equals("1") || textZamiana.equals("2") || textZamiana.equals("3") || textZamiana.equals("4") ||
                textZamiana.equals("5") || textZamiana.equals("6") || textZamiana.equals("7") || textZamiana.equals("8") || textZamiana.equals("9")) {

            if (textZamiana == "" | textZamiana == null | textZamiana.isEmpty()) {
                textZamiana = "0";
            }
            cyfra = Integer.parseInt(textZamiana);

            tempTab[wiersz][kolumna] = cyfra;
            setTabela(tempTab);
            czyMozna = validateV2(getTabela());

            if (czyMozna) {
                labelKomunikacja.setText("pomyślnie wsatwiono: " + getTabela()[wiersz][kolumna]);
                System.out.println("aktualizacja wykonana");
                if (czyWygrana(getTabela())) {
                    labelKomunikacja.setText("Brawo Wygrałeś!");
                    System.out.println("BRAWO WYGRAŁEŚ");
                }
            } else {
                getTabela()[wiersz][kolumna] = Integer.parseInt(wroc);

                labelKomunikacja.setText("Wstaw inną liczbę");
                System.out.println("Wstaw inną liczbę");
                wybranyTextField.setText("");

            }
        } else {
            labelKomunikacja.setText("Niepoprawny format danych");
            System.out.println("niepoprawny format danych");
            wybranyTextField.setText("");

        }
    }

    public boolean validateV2(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[10];
            boolean[] col = new boolean[10];

            for (int j = 0; j < 9; j++) {
                if (row[grid[i][j]] & grid[i][j] > 0) {
                    return false;
                }
                row[grid[i][j]] = true;

                if (col[grid[j][i]] & grid[j][i] > 0) {
                    return false;
                }
                col[grid[j][i]] = true;

                if ((i + 3) % 3 == 0 && (j + 3) % 3 == 0) {
                    boolean[] sqr = new boolean[10];
                    for (int m = i; m < i + 3; m++) {
                        for (int n = j; n < j + 3; n++) {
                            if (sqr[grid[m][n]] & grid[m][n] > 0) {
                                return false;
                            }
                            sqr[grid[m][n]] = true;
                        }
                    }
                }

            }
        }
        return true;
    }


}
