package main.model;

import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ZapiszWczytaj extends Silnik implements Serializable {
    final int dlugoscTabeli = 9;
    List<String> lista = new ArrayList<>();
    String[][] tabelaStringow = new String[9][9];
    int[][] tabelaPom = new int[9][9];

    public void zapisV2(int[][] tabelaDoZapisu) throws IOException {
        //doListy(tabelaDoZapisu);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Zapisz tabele");
        File selectedFile = null;
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        selectedFile = fileChooser.showSaveDialog(null);
        File file = new File(String.valueOf(selectedFile));
        PrintWriter pr = null;
        try {
            int k1 = 0;
            pr = new PrintWriter(file);
            int[] tablica1wymiar = new int[81];
            for (int i = 0; i < tabelaDoZapisu.length; i++) {
                for (int j = 0; j < tabelaDoZapisu.length; j++) {
                    tablica1wymiar[k1] = tabelaDoZapisu[i][j];
                    k1++;
                }
            }

            int k2 = 0;
            for (int i = 0; i < tabelaDoZapisu.length; i++) {
                for (int j = 0; j < tabelaDoZapisu.length; j++) {
                    pr.print(tablica1wymiar[k2] + " ");
                    k2++;
                }
                pr.println();
            }
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    public int[][] wczytajV3(Label labelKomunikacja) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wczytaj planszę");
        File selectedFile = null;
        StringBuilder builder = new StringBuilder();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        //while (selectedFile == null) {
        selectedFile = fileChooser.showOpenDialog(null);
        //}
        File file = new File(String.valueOf(selectedFile));
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                builder.append(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String ss = String.valueOf(builder);
        String[] arr = ss.split(" ");

        int k = 0;
        System.out.println("dlugosc listy" + lista.size());
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                tabelaStringow[i][j] = arr[k];
                k++;

            }
        }
        int h;
        for (int i = 0; i < dlugoscTabeli; i++) {
            for (int j = 0; j < dlugoscTabeli; j++) {
                h = Integer.parseInt(tabelaStringow[i][j]);
                tabelaPom[i][j] = h;
                h++;

            }
        }
        setTabela(tabelaPom);
        if (!walidacja(getTabela())) {
            labelKomunikacja.setText("Nie udało się poprawnie wczytać planszy");
            return null;
        } else {
            labelKomunikacja.setText("Poprawnie wczytano planszę");
            return tabelaPom;
        }
    }

    //drukowanie z pliku html
    public void drukuj(String nazwaPliku) throws IOException {
        Desktop.getDesktop().browse(new File(nazwaPliku).toURI());
    }

    public void planszaDoHmtl(int[][] tabelaDoWydruku) {
        try {
            PrintWriter pw = new PrintWriter("Plik.html");
            pw.println("<!doctype html>\n" +
                    "<html>\n" +
                    "\t<head>\n" +
                    "\t\t<meta charset=\"UTF-8\">\n" +
                    "\t\t<title>Plansza sudoku</title>\n" +
                    "\t</head>\n" +
                    "\t<body>\n" +
                    "\t<font size=\"8\">\n" +
                    "\t\t<table style=\"width:50%\" style=\"height:80%\" border=\"1\">");
            for (int i = 0; i < dlugoscTabeli; i++) {
                pw.print("<tr>");
                for (int j = 0; j < dlugoscTabeli; j++) {
                    if (tabelaDoWydruku[i][j] == 0) {
                        pw.print("<td></td>");
                    } else {
                        pw.print("<td>" + tabelaDoWydruku[i][j] + "</td>");
                    }
                }
                pw.print("</tr>");
            }
            pw.println("</table>\n" +
                    "\t\t</font>\n" +
                    "\t</body>\n" +
                    "</html>");

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

