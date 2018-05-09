package main.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import main.model.Silnik;
import main.model.Solver;
import main.model.ZapiszWczytaj;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerGlowny implements Initializable {

    int licznikPomocy = 0;
    @FXML
    private javafx.scene.control.Label labelKomunikacja;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu plik;
    @FXML
    private MenuItem zamknij;
    @FXML
    private MenuItem zapisz;
    @FXML
    private MenuItem wczytaj;
    @FXML
    private MenuItem drukuj;
    @FXML
    private Menu pomoc;
    @FXML
    private Menu edycja;
    @FXML
    private MenuItem oAplikacji;
    @FXML
    private Menu menuOpcje;
    @FXML
    private MenuItem menuItemPokazTabele;
    @FXML
    private GridPane GridPane;
    @FXML
    private TextField f00;
    @FXML
    private TextField f10;
    @FXML
    private TextField f20;
    @FXML
    private TextField f30;
    @FXML
    private TextField f40;
    @FXML
    private TextField f50;
    @FXML
    private TextField f60;
    @FXML
    private TextField f70;
    @FXML
    private TextField f80;
    @FXML
    private TextField f01;
    @FXML
    private TextField f11;
    @FXML
    private TextField f21;
    @FXML
    private TextField f31;
    @FXML
    private TextField f41;
    @FXML
    private TextField f51;
    @FXML
    private TextField f61;
    @FXML
    private TextField f71;
    @FXML
    private TextField f81;
    @FXML
    private TextField f02;
    @FXML
    private TextField f12;
    @FXML
    private TextField f22;
    @FXML
    private TextField f32;
    @FXML
    private TextField f42;
    @FXML
    private TextField f52;
    @FXML
    private TextField f62;
    @FXML
    private TextField f72;
    @FXML
    private TextField f82;
    @FXML
    private TextField f03;
    @FXML
    private TextField f13;
    @FXML
    private TextField f23;
    @FXML
    private TextField f33;
    @FXML
    private TextField f43;
    @FXML
    private TextField f53;
    @FXML
    private TextField f63;
    @FXML
    private TextField f73;
    @FXML
    private TextField f83;
    @FXML
    private TextField f04;
    @FXML
    private TextField f14;
    @FXML
    private TextField f24;
    @FXML
    private TextField f34;
    @FXML
    private TextField f44;
    @FXML
    private TextField f54;
    @FXML
    private TextField f64;
    @FXML
    private TextField f74;
    @FXML
    private TextField f84;
    @FXML
    private TextField f05;
    @FXML
    private TextField f15;
    @FXML
    private TextField f25;
    @FXML
    private TextField f35;
    @FXML
    private TextField f45;
    @FXML
    private TextField f55;
    @FXML
    private TextField f65;
    @FXML
    private TextField f75;
    @FXML
    private TextField f85;
    @FXML
    private TextField f06;
    @FXML
    private TextField f16;
    @FXML
    private TextField f26;
    @FXML
    private TextField f36;
    @FXML
    private TextField f46;
    @FXML
    private TextField f56;
    @FXML
    private TextField f66;
    @FXML
    private TextField f76;
    @FXML
    private TextField f86;
    @FXML
    private TextField f07;
    @FXML
    private TextField f17;
    @FXML
    private TextField f27;
    @FXML
    private TextField f37;
    @FXML
    private TextField f47;
    @FXML
    private TextField f57;
    @FXML
    private TextField f67;
    @FXML
    private TextField f77;
    @FXML
    private TextField f87;
    @FXML
    private TextField f08;
    @FXML
    private TextField f18;
    @FXML
    private TextField f28;
    @FXML
    private TextField f38;
    @FXML
    private TextField f48;
    @FXML
    private TextField f58;
    @FXML
    private TextField f68;
    @FXML
    private TextField f78;
    @FXML
    private TextField f88;
    private Silnik silnik = new Silnik();
    private ZapiszWczytaj zapiszWczytaj = new ZapiszWczytaj();
    private List<TextField> listaTextField = new ArrayList<>();

    public void dodajTextFieldDoTabeli() {
        listaTextField.add(f00);
        listaTextField.add(f10);
        listaTextField.add(f20);
        listaTextField.add(f30);
        listaTextField.add(f40);
        listaTextField.add(f50);
        listaTextField.add(f60);
        listaTextField.add(f70);
        listaTextField.add(f80);

        listaTextField.add(f01);
        listaTextField.add(f11);
        listaTextField.add(f21);
        listaTextField.add(f31);
        listaTextField.add(f41);
        listaTextField.add(f51);
        listaTextField.add(f61);
        listaTextField.add(f71);
        listaTextField.add(f81);

        listaTextField.add(f02);
        listaTextField.add(f12);
        listaTextField.add(f22);
        listaTextField.add(f32);
        listaTextField.add(f42);
        listaTextField.add(f52);
        listaTextField.add(f62);
        listaTextField.add(f72);
        listaTextField.add(f82);

        listaTextField.add(f03);
        listaTextField.add(f13);
        listaTextField.add(f23);
        listaTextField.add(f33);
        listaTextField.add(f43);
        listaTextField.add(f53);
        listaTextField.add(f63);
        listaTextField.add(f73);
        listaTextField.add(f83);

        listaTextField.add(f04);
        listaTextField.add(f14);
        listaTextField.add(f24);
        listaTextField.add(f34);
        listaTextField.add(f44);
        listaTextField.add(f54);
        listaTextField.add(f64);
        listaTextField.add(f74);
        listaTextField.add(f84);

        listaTextField.add(f05);
        listaTextField.add(f15);
        listaTextField.add(f25);
        listaTextField.add(f35);
        listaTextField.add(f45);
        listaTextField.add(f55);
        listaTextField.add(f65);
        listaTextField.add(f75);
        listaTextField.add(f85);

        listaTextField.add(f06);
        listaTextField.add(f16);
        listaTextField.add(f26);
        listaTextField.add(f36);
        listaTextField.add(f46);
        listaTextField.add(f56);
        listaTextField.add(f66);
        listaTextField.add(f76);
        listaTextField.add(f86);

        listaTextField.add(f07);
        listaTextField.add(f17);
        listaTextField.add(f27);
        listaTextField.add(f37);
        listaTextField.add(f47);
        listaTextField.add(f57);
        listaTextField.add(f67);
        listaTextField.add(f77);
        listaTextField.add(f87);

        listaTextField.add(f08);
        listaTextField.add(f18);
        listaTextField.add(f28);
        listaTextField.add(f38);
        listaTextField.add(f48);
        listaTextField.add(f58);
        listaTextField.add(f68);
        listaTextField.add(f78);
        listaTextField.add(f88);

    }

    @FXML
    void zapisuj(ActionEvent event) throws IOException {
        zapiszWczytaj.zapisV2(silnik.getTabela());
        aktualizuj();
    }

    @FXML
    void wczytuj(ActionEvent event) throws IOException {
        silnik.setTabela(zapiszWczytaj.wczytajV3(labelKomunikacja));
        dodajTextFieldDoTabeli();
        parujTextFieldZTabela();
        aktualizuj();
    }

    @FXML
    void wydrukuj(ActionEvent event) {
        System.out.println("Drukowanie");
        zapiszWczytaj.planszaDoHmtl(silnik.getTabela());
        try {
            zapiszWczytaj.drukuj("Plik.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void pokazTabele(ActionEvent event) {
        silnik.pokazTabele(silnik.getTabela());
        System.out.println("Czy poprawna " + silnik.validateV2(silnik.getTabela()));
    }

    @FXML
    void Zamknij(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void startLatwy(ActionEvent event) {
        silnik.setTabela(silnik.uruchom(silnik.getTabela(), 5));
        dodajTextFieldDoTabeli();
        parujTextFieldZTabela();
        aktualizuj();
    }

    @FXML
    void startSredni(ActionEvent event) {
        silnik.setTabela(silnik.uruchom(silnik.getTabela(), 30));
        dodajTextFieldDoTabeli();
        parujTextFieldZTabela();
        aktualizuj();
    }

    @FXML
    void startTrudny(ActionEvent event) {
        silnik.setTabela(silnik.uruchom(silnik.getTabela(), 65));
        dodajTextFieldDoTabeli();
        parujTextFieldZTabela();
        aktualizuj();
    }

    @FXML
    void podpowiedz(ActionEvent event) {
        if (licznikPomocy < 3) {
            String label1 = labelKomunikacja.getText().toString();
            System.out.println("Podpowiedz");
            Solver hintt = new Solver();
            hintt.hint(silnik.getTabela(), labelKomunikacja);
            parujTextFieldZTabela();
            String label2 = labelKomunikacja.getText().toString();
            if (!label1.equals(label2)) {
                licznikPomocy++;
            }
        } else {
            labelKomunikacja.setText("Wykorzystałeś całą pomoc");
        }

    }

    @FXML
    void rozwiaz(ActionEvent event) {
//        Poprawne rozwiązanie
        System.out.println("Rozwiaz");
        Solver solver = new Solver(silnik.getTabela());
        solver.solve();
        parujTextFieldZTabela();
        if (silnik.validateV2(silnik.getTabela()) && silnik.czyWygrana(silnik.getTabela())) {
            labelKomunikacja.setText("Brawo Wygrałeś");
        } else {
            System.out.println("ponowna próba");
            labelKomunikacja.setText("Nie rozwiązano plnaszy");
        }


    }

    //działa bardzo dobrze
    public void parujTextFieldZTabela() {
        int helper = 0;
        for (int i = 0; i < silnik.getTabela().length; i++) {
            for (int j = 0; j < silnik.getTabela().length; j++) {
                if (silnik.getTabela()[i][j] == 0 || silnik.getTabela() == null) {
                    listaTextField.get(helper).setText("");
                } else {
                    listaTextField.get(helper).setText(String.valueOf(silnik.getTabela()[i][j]));
                }
                helper++;
            }
        }
    }

    public void parujTabelezTextField() {
        int helper = 0;
        for (int i = 0; i < silnik.getTabela().length; i++) {
            for (int j = 0; i < silnik.getTabela().length; j++) {
                silnik.getTabela()[i][j] = Integer.parseInt(listaTextField.get(helper).toString());
                helper++;
            }
        }
    }


    // aktualizuje TextField
    public void aktualizuj() {

        // 00
        f00.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f00, 0, 0);
            }
        });

        f10.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f10, 0, 1);
            }
        });
        f20.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f20, 0, 2);
            }
        });
        f30.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f30, 0, 3);
            }
        });
        f40.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f40, 0, 4);
            }
        });
        f50.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f50, 0, 5);
            }
        });
        f60.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f60, 0, 6);
            }
        });
        f70.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f70, 0, 7);
            }
        });
        f80.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f80, 0, 8);
            }
        });
        //drugi wiersz
        f01.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f01, 1, 0);
            }
        });

        f11.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f11, 1, 1);
            }
        });
        f21.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f21, 1, 2);
            }
        });
        f31.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f31, 1, 3);
            }
        });
        f41.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f41, 1, 4);
            }
        });
        f51.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f51, 1, 5);
            }
        });
        f61.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f61, 1, 6);
            }
        });
        f71.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f71, 1, 7);
            }
        });
        f81.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f81, 1, 8);
            }
        });
        //drugi wiersz
        f02.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f02, 2, 0);
            }
        });

        f12.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f12, 2, 1);
            }
        });
        f22.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f22, 2, 2);
            }
        });
        f32.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f32, 2, 3);
            }
        });
        f42.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f42, 2, 4);
            }
        });
        f52.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f52, 2, 5);
            }
        });
        f62.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f62, 2, 6);
            }
        });
        f72.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f72, 2, 7);
            }
        });
        f82.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f82, 2, 8);
            }
        });
        // trzeci wiersz
        f03.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f03, 3, 0);
            }
        });

        f13.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f13, 3, 1);
            }
        });
        f23.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f23, 3, 2);
            }
        });
        f33.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f23, 3, 3);
            }
        });
        f43.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f43, 3, 4);
            }
        });
        f53.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f53, 3, 5);
            }
        });
        f63.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f63, 3, 6);
            }
        });
        f73.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f73, 3, 7);
            }
        });
        f83.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f83, 3, 8);
            }
        });
        //czwarty wiersz
        f04.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f04, 4, 0);
            }
        });

        f14.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f14, 4, 1);
            }
        });
        f24.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f24, 4, 2);
            }
        });
        f34.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f34, 4, 3);
            }
        });
        f44.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f44, 4, 4);
            }
        });
        f54.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f54, 4, 5);
            }
        });
        f64.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f64, 4, 6);
            }
        });
        f74.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f74, 4, 7);
            }
        });
        f84.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f84, 4, 8);
            }
        });
        //piąty wiersz
        f05.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f05, 5, 0);
            }
        });

        f15.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f15, 5, 1);
            }
        });
        f25.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f25, 5, 2);
            }
        });
        f35.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f35, 5, 3);
            }
        });
        f45.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f45, 5, 4);
            }
        });
        f55.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f55, 5, 5);
            }
        });
        f65.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f65, 5, 6);
            }
        });
        f75.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f75, 5, 7);
            }
        });
        f85.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f85, 5, 8);
            }
        });
        //szósty wiersz
        f06.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f06, 6, 0);
            }
        });

        f16.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f16, 6, 1);
            }
        });
        f26.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f26, 6, 2);
            }
        });
        f36.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f36, 6, 3);
            }
        });
        f46.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f46, 6, 4);
            }
        });
        f56.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f56, 6, 5);
            }
        });
        f66.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f66, 6, 6);
            }
        });
        f76.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f76, 6, 7);
            }
        });
        f86.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f86, 6, 8);
            }
        });
        //siódmy wiersz
        f07.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f07, 7, 0);
            }
        });

        f17.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f17, 7, 1);
            }
        });
        f27.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f27, 7, 2);
            }
        });
        f37.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f37, 7, 3);
            }
        });
        f47.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f47, 7, 4);
            }
        });
        f57.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f57, 7, 5);
            }
        });
        f67.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f67, 7, 6);
            }
        });
        f77.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f77, 7, 7);
            }
        });
        f87.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f87, 7, 8);
            }
        });
        //ósmy wiersz
        f08.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f08, 8, 0);
            }
        });

        f18.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f18, 8, 1);
            }
        });
        f28.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f28, 8, 2);
            }
        });
        f38.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f38, 8, 3);
            }
        });
        f48.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f48, 8, 4);
            }
        });
        f58.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f58, 8, 5);
            }
        });
        f68.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f68, 8, 6);
            }
        });
        f78.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f78, 8, 7);
            }
        });
        f88.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                silnik.aktualizujPole(labelKomunikacja, f88, 8, 8);
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelKomunikacja.setText("Komunikaty z sudoku");


    }

}
