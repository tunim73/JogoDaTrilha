package jogos;

import java.awt.Color;

public class Jogotrilha extends javax.swing.JFrame {

    public Jogotrilha() {
        
        super("Jogo da Trilha");

        initComponents();
    }

    public int celula[][]  = new int[3][8];
    public int x = 0, y = 0;
    public int nX = 0, nO = 0;

    public int contagemI = 0, contagemE = 0, contadorX = 0, contadorO = 0;
    public int trilha = 0, Vtrilhado = 0, Vtrilha = 0;

    static int stage = 0;
    public int li = 0, ci = 0, lf = 0, cf = 0;

    public int moveX = 0, moveO = 0;

    public int ativo = 0, ativo1 = 0, ativo2 = 0;
    public int l1f = 30, c1f = 30;
    public int l2f = 30, c2f = 30;
    public int l3f = 30, c3f = 30;

    public boolean jogador1 = true;
    public boolean jogador2 = false;

    public int A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X;
    //APRESENTAÇÕES
    public void FormaButton() {
        switch (celula[0][7]) {
            case 4:
                b1.setBackground(new Color(140, 255, 251));
                b1.setText("O");
                break;
            case 1:
                b1.setBackground(new Color(218, 31, 38));
                b1.setText("X");
                break;
            case 0:
                b1.setBackground(new Color(16, 18, 46));
                b1.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][0]) {
            case 4:
                b2.setBackground(new Color(140, 255, 251));
                b2.setText("O");
                break;
            case 1:
                b2.setBackground(new Color(218, 31, 38));
                b2.setText("X");
                break;
            case 0:
                b2.setBackground(new Color(16, 18, 46));
                b2.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][1]) {
            case 4:
                b3.setBackground(new Color(140, 255, 251));
                b3.setText("O");
                break;
            case 1:
                b3.setBackground(new Color(218, 31, 38));
                b3.setText("X");
                break;
            case 0:
                b3.setBackground(new Color(16, 18, 46));
                b3.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][2]) {
            case 4:
                b4.setBackground(new Color(140, 255, 251));
                b4.setText("O");
                break;
            case 1:
                b4.setBackground(new Color(218, 31, 38));
                b4.setText("X");
                break;
            case 0:
                b4.setBackground(new Color(16, 18, 46));
                b4.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][3]) {
            case 4:
                b5.setBackground(new Color(140, 255, 251));
                b5.setText("O");
                break;
            case 1:
                b5.setBackground(new Color(218, 31, 38));
                b5.setText("X");
                break;
            case 0:
                b5.setBackground(new Color(16, 18, 46));
                b5.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][4]) {
            case 4:
                b6.setBackground(new Color(140, 255, 251));
                b6.setText("O");
                break;
            case 1:
                b6.setBackground(new Color(218, 31, 38));
                b6.setText("X");
                break;
            case 0:
                b6.setBackground(new Color(16, 18, 46));
                b6.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][5]) {
            case 4:
                b7.setBackground(new Color(140, 255, 251));
                b7.setText("O");
                break;
            case 1:
                b7.setBackground(new Color(218, 31, 38));
                b7.setText("X");
                break;
            case 0:
                b7.setBackground(new Color(16, 18, 46));
                b7.setText("");
                break;
            default:
                break;
        }
        switch (celula[0][6]) {
            case 4:
                b8.setBackground(new Color(140, 255, 251));
                b8.setText("O");
                break;
            case 1:
                b8.setBackground(new Color(218, 31, 38));
                b8.setText("X");
                break;
            case 0:
                b8.setBackground(new Color(16, 18, 46));
                b8.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][7]) {
            case 4:
                b9.setBackground(new Color(140, 255, 251));
                b9.setText("O");
                break;
            case 1:
                b9.setBackground(new Color(218, 31, 38));
                b9.setText("X");
                break;
            case 0:
                b9.setBackground(new Color(16, 18, 46));
                b9.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][0]) {
            case 4:
                b10.setBackground(new Color(140, 255, 251));
                b10.setText("O");
                break;
            case 1:
                b10.setBackground(new Color(218, 31, 38));
                b10.setText("X");
                break;
            case 0:
                b10.setBackground(new Color(16, 18, 46));
                b10.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][1]) {
            case 4:
                b11.setBackground(new Color(140, 255, 251));
                b11.setText("O");
                break;
            case 1:
                b11.setBackground(new Color(218, 31, 38));
                b11.setText("X");
                break;
            case 0:
                b11.setBackground(new Color(16, 18, 46));
                b11.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][2]) {
            case 4:
                b12.setBackground(new Color(140, 255, 251));
                b12.setText("O");
                break;
            case 1:
                b12.setBackground(new Color(218, 31, 38));
                b12.setText("X");
                break;
            case 0:
                b12.setBackground(new Color(16, 18, 46));
                b12.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][3]) {
            case 4:
                b13.setBackground(new Color(140, 255, 251));
                b13.setText("O");
                break;
            case 1:
                b13.setBackground(new Color(218, 31, 38));
                b13.setText("X");
                break;
            case 0:
                b13.setBackground(new Color(16, 18, 46));
                b13.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][4]) {
            case 4:
                b14.setBackground(new Color(140, 255, 251));
                b14.setText("O");
                break;
            case 1:
                b14.setBackground(new Color(218, 31, 38));
                b14.setText("X");
                break;
            case 0:
                b14.setBackground(new Color(16, 18, 46));
                b14.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][5]) {
            case 4:
                b15.setBackground(new Color(140, 255, 251));
                b15.setText("O");
                break;
            case 1:
                b15.setBackground(new Color(218, 31, 38));
                b15.setText("X");
                break;
            case 0:
                b15.setBackground(new Color(16, 18, 46));
                b15.setText("");
                break;
            default:
                break;
        }
        switch (celula[1][6]) {
            case 4:
                b16.setBackground(new Color(140, 255, 251));
                b16.setText("O");
                break;
            case 1:
                b16.setBackground(new Color(218, 31, 38));
                b16.setText("X");
                break;
            case 0:
                b16.setBackground(new Color(16, 18, 46));
                b16.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][7]) {
            case 4:
                b17.setBackground(new Color(140, 255, 251));
                b17.setText("O");
                break;
            case 1:
                b17.setBackground(new Color(218, 31, 38));
                b17.setText("X");
                break;
            case 0:
                b17.setBackground(new Color(16, 18, 46));
                b17.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][0]) {
            case 4:
                b18.setBackground(new Color(140, 255, 251));
                b18.setText("O");
                break;
            case 1:
                b18.setBackground(new Color(218, 31, 38));
                b18.setText("X");
                break;
            case 0:
                b18.setBackground(new Color(16, 18, 46));
                b18.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][1]) {
            case 4:
                b19.setBackground(new Color(140, 255, 251));
                b19.setText("O");
                break;
            case 1:
                b19.setBackground(new Color(218, 31, 38));
                b19.setText("X");
                break;
            case 0:
                b19.setBackground(new Color(16, 18, 46));
                b19.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][2]) {
            case 4:
                b20.setBackground(new Color(140, 255, 251));
                b20.setText("O");
                break;
            case 1:
                b20.setBackground(new Color(218, 31, 38));
                b20.setText("X");
                break;
            case 0:
                b20.setBackground(new Color(16, 18, 46));
                b20.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][3]) {
            case 4:
                b21.setBackground(new Color(140, 255, 251));
                b21.setText("O");
                break;
            case 1:
                b21.setBackground(new Color(218, 31, 38));
                b21.setText("X");
                break;
            case 0:
                b21.setBackground(new Color(16, 18, 46));
                b21.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][4]) {
            case 4:
                b22.setBackground(new Color(140, 255, 251));
                b22.setText("O");
                break;
            case 1:
                b22.setBackground(new Color(218, 31, 38));
                b22.setText("X");
                break;
            case 0:
                b22.setBackground(new Color(16, 18, 46));
                b22.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][5]) {
            case 4:
                b23.setBackground(new Color(140, 255, 251));
                b23.setText("O");
                break;
            case 1:
                b23.setBackground(new Color(218, 31, 38));
                b23.setText("X");
                break;
            case 0:
                b23.setBackground(new Color(16, 18, 46));
                b23.setText("");
                break;
            default:
                break;
        }
        switch (celula[2][6]) {
            case 4:
                b24.setBackground(new Color(140, 255, 251));
                b24.setText("O");
                break;
            case 1:
                b24.setBackground(new Color(218, 31, 38));
                b24.setText("X");
                break;
            case 0:
                b24.setBackground(new Color(16, 18, 46));
                b24.setText("");
                break;
            default:
                break;
        }

    }
    public void FormaFase() {
        if (contagemI == 0) {
            FASE.setText("FASE 1");

        } else if (contagemI == 18 && ativo == 0) {
            FASE.setText("FASE 2");
            ativo = 1;
        } else if (ativo1 == 1) {
            FASE.setText("FASE 3");
            ativo1 = 2;
        }

    }
    public void FormaJogador() {
        if (jogador1 == true) {
            vez.setFont(new java.awt.Font("Courier New", 1, 36));
            vez.setText("X");
            vez.setForeground(new java.awt.Color(218, 31, 38));
            jogador.setForeground(new java.awt.Color(218, 31, 38));
            jogador.setText("Jogador");
        } else if (jogador2 == true) {
            vez.setFont(new java.awt.Font("Courier New", 1, 36));
            vez.setText("O");
            vez.setForeground(new java.awt.Color(140, 255, 251));
            jogador.setForeground(new java.awt.Color(140, 255, 251));
            jogador.setText("Jogador");
        }

    }
    public void FormaJtrilha() {
        if (jogador1 == true) {
            ftrilha.setForeground(new java.awt.Color(218, 31, 38));
            ftrilha.setText("X Formou Trilha");

        } else if (jogador2 == true) {
            ftrilha.setForeground(new java.awt.Color(140, 255, 251));
            ftrilha.setText("O Formou Trilha");
        }
    }
    public void FormaRetirada() {
        if (jogador1 == true) {

            removido.setForeground(new java.awt.Color(255, 255, 220));
            removido.setText("Removido um O");
        } else if (jogador2 == true) {

            removido.setForeground(new java.awt.Color(255, 255, 220));
            removido.setText("Removido um X");
        }
    }
    public void FormaNovojogo() {
        vez.setText("");
        jogador.setText("");
        novojogo.setBackground(new java.awt.Color(16, 18, 46));
        novojogo.setFont(new java.awt.Font("Agency FB", 1, 24));
        novojogo.setForeground(new java.awt.Color(255, 252, 72));
        novojogo.setText("NOVO JOGO");
        novojogo.setToolTipText("NOVO JOGO");
        novojogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 252, 72), 2));
        novojogo.setEnabled(true);
    }
    public void FormaVencedor() {
        if (nX == 2 || nO == 2) {
            Informacional.setText("NX " + nX + "            NO " + nO);
        }
        if (jogador1 == true && moveX == 0 || jogador2 == true && moveO == 0) {
            if (jogador2 == true) {
                Informacional.setText("X Parou Movimentos de O");
            } else if (jogador1 == true) {
                Informacional.setText("O Parou Movimentos de X");
            }
        }

        if (jogador2 == true) {
            painelV.setVisible(true);
            jogadorvencedor.setForeground(new java.awt.Color(218, 31, 38));
            vencedor.setForeground(new java.awt.Color(218, 31, 38));
            vencedor.setText("X");
            VENCEU.setForeground(new java.awt.Color(218, 31, 38));

        } else if (jogador1 == true) {
            painelV.setVisible(true);
            jogadorvencedor.setForeground(new java.awt.Color(140, 255, 251));
            vencedor.setForeground(new java.awt.Color(140, 255, 251));
            vencedor.setText("O");
            VENCEU.setForeground(new java.awt.Color(140, 255, 251));
        }
    }
    public void FormaInformacional() {
        if (contagemI <= 18 && ativo2 == 0) {
            Informacional.setForeground(new java.awt.Color(255, 255, 72));
            Informacional.setText("Contagem Inicial " + contagemI);
            if (contagemI == 18) {
                ativo2 = 10;
            }
        } else if (nX > 3 && nO > 3 || nX == 3 && nO > 3 || nX > 3 && nO == 3) {
            Informacional.setForeground(new java.awt.Color(255, 255, 72));
            Informacional.setText("NX " + nX + "            NO " + nO);
        } else if (nX == 3 && nO == 3) {
            Informacional.setForeground(new java.awt.Color(255, 255, 72));
            Informacional.setText("Jogadas para o Empate " + (10 - contagemE));
        }
    }

    //Em caso de empate ou vitória... novo jogo
    public void novojogo() {

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 8; c++) {
                celula[l][c] = 0;
            }
        }
        contagemI = 0;
        contagemE = 0;
        ativo = 0;
        ativo1 = 0;
        ativo2 = 0;
        l1f = 30;
        c1f = 30;
        l2f = 30;
        c2f = 30;
        l3f = 30;
        c3f = 30;
        Informacional.setText("");
        novojogo.setVisible(false);
        novojogo.setEnabled(false);
        painelV.setVisible(false);
        FormaJogador();
        FormaButton();
        FormaFase();
    }

    //Verifica fase do jogo
    public void verificaNumeroDePecas() {
        nO = 0;
        nX = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 8; c++) {
                if (celula[l][c] == 1) {
                    nX++;
                }
                if (celula[l][c] == 4) {
                    nO++;
                }
            }
        }
    }

    public int devolveFaseAtual() {
        verificaNumeroDePecas();
        if (contagemI < 18) {
            return 0;
        } else if ((nX == 3) && (jogador1 == true) || (nO == 3) && (jogador2 == true)) {
            return 2;
        } else if (nX == 2) {
            return 3;
        } else if (nO == 2) {
            return 3;
        } else {
            return 1;
        }
    }

    // Troca os jogadores
    public void jogadorAtivo() {
        if (jogador1 == true) {
            jogador1 = false;
            jogador2 = true;
        } else {
            jogador1 = true;
            jogador2 = false;
        }
        FormaJogador();
    }

    //Bota o jogo pra funcionar recebendo as variaveis do botão
    public void funcionando() {

        if (devolveFaseAtual() == 0) {
            Fase1();
        } else if (devolveFaseAtual() == 1) {
            if (jogador1 == true && moveX != 0) {
                Fase2();
            } else if (jogador2 == true && moveO != 0) {
                Fase2();
            }
        } else if (devolveFaseAtual() == 2) {
            Fase3();
        }
        if (devolveFaseAtual() == 3) {
            FaseV();
        }
    }

    /*
    FASES DO JOGO
    Fase 1... esta fase coloca as peças ao tabuleiro e
    terminara qunado todas as peças forem colocadas no tabuleiro.
    Fase 2... esta fase move as peças uma celula de cada vez
    Fase 3... esta fase ocorre quando um dos jogadores
    ficam com 3 peças no tabuleiro... o jogador que possuir 3 peças
    poderá locomover sua peça para qualquer celula vazia do tabuleiro
     */
    public void Fase1() {
        removido.setText("");
        if (contagemI == 0) {
            FormaFase();
        }

        if (formouTrilha(l1f, c1f) == true) {
            trilhado2();
            verificaNumeroDePecas();
            if (trilhado(x, y) == false) {
                trilhando();
            } else if (jogador1 == true && contadorO == nO) {
                trilhando();
            } else if (jogador2 == true && contadorX == nX) {
                trilhando();
            }
        } else if (formouTrilha(l1f, c1f) == false) {
            jogada1();
        }

        verificaNumeroDePecas();
        pmovendo();
        if (contagemI == 18) {
            if (jogador1 == true && moveX == 0 || jogador2 == true && moveO == 0) {
                FaseV();
            } else {
                FormaFase();
            }
        }
    }

    public void Fase2() {
        removido.setText("");
        if ((formouTrilha(l2f, c2f) == true) || (formouTrilha(l1f, c1f) == true) || (formouTrilha(l3f, c3f) == true)) {
            trilhado2();
            if (trilhado(x, y) == false) {
                trilhando();
            } else if (jogador1 == true && contadorO == nO) {
                trilhando();
            } else if (jogador2 == true && contadorX == nX) {
                trilhando();
            }
        } else if (formouTrilha(l2f, c2f) == false) {
            stage();
        }

        if (nX == 3 && ativo1 == 0 || nO == 3 && ativo1 == 0) {
            ativo1 = 1;
            FormaFase();
        }
    }

    public void Fase3() {
        removido.setText("");
        if ((formouTrilha(l3f, c3f) == true) || (formouTrilha(l2f, c2f) == true) || (formouTrilha(l1f, c1f) == true)) {
            trilhado2();
            verificaNumeroDePecas();
            if (trilhado(x, y) == false) {
                trilhando();
            } else if (jogador1 == true && contadorO == nO) {
                trilhando();
            } else if (jogador2 == true && contadorX == nX) {
                trilhando();
            }
        } else {
            stage();
        }
    }

    //JOGADAS DE ACORDO COM AS FASES
    public void jogada1() {

        if (jogador1 == true) {
            if (celula[x][y] == 0) {
                celula[x][y] = 1;
                contagemI++;
                l1f = x;
                c1f = y;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(x, y) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }
        } else {
            if (celula[x][y] == 0) {
                celula[x][y] = 4;
                contagemI++;
                l1f = x;
                c1f = y;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(x, y) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }
        }
    }

    public boolean Jogada2() {
        if ((li == lf) && ((ci + 1) % 8 == cf) && (celula[li][ci] == 1) && (celula[lf][cf] == 0) && (jogador1 == true)) {

            celula[lf][cf] = celula[li][ci];
            celula[li][ci] = 0;
            l2f = lf;
            c2f = cf;
            FormaButton();
            verificaNumeroDePecas();
            FormaInformacional();
            if (formouTrilha(x, y) == true) {
                FormaJtrilha();
            } else {
                jogadorAtivo();
                pmovendo();
                if (jogador2 == true && moveO == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }
            }

            return true;
        }

        if ((li == lf) && ((ci + 1) % 8 == cf) && (celula[li][ci] == 4) && (celula[lf][cf] == 0) && (jogador2 == true)) {

            celula[lf][cf] = celula[li][ci];
            celula[li][ci] = 0;
            l2f = lf;
            c2f = cf;
            FormaButton();
            verificaNumeroDePecas();
            FormaInformacional();
            if (formouTrilha(x, y) == true) {
                FormaJtrilha();
            } else {
                jogadorAtivo();
                pmovendo();
                if (jogador1 == true && moveX == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }
            }

            return true;
        }

        if ((li == lf) && ((ci + 7) % 8 == cf) && (celula[li][ci] == 1) && (celula[lf][cf] == 0) && (jogador1 == true)) {

            celula[lf][cf] = celula[li][ci];
            celula[li][ci] = 0;
            l2f = lf;
            c2f = cf;
            FormaButton();
            verificaNumeroDePecas();
            FormaInformacional();
            if (formouTrilha(x, y) == true) {
                FormaJtrilha();
            } else {
                jogadorAtivo();
                pmovendo();
                if (jogador2 == true && moveO == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }
            }

            return true;
        }

        if ((li == lf) && ((ci + 7) % 8 == cf) && (celula[li][ci] == 4) && (celula[lf][cf] == 0) && (jogador2 == true)) {

            celula[lf][cf] = celula[li][ci];
            celula[li][ci] = 0;
            l2f = lf;
            c2f = cf;
            FormaButton();
            verificaNumeroDePecas();
            FormaInformacional();
            if (formouTrilha(x, y) == true) {
                FormaJtrilha();
            } else {
                jogadorAtivo();
                pmovendo();
                if (jogador1 == true && moveX == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }
            }

            return true;
        }

        if ((ci % 2 == 0) && (ci == cf) && (celula[li][ci] == 1) && (celula[lf][cf] == 0) && (jogador1 == true)) {

            if (((li + 1) == lf) || ((li - 1) == lf)) {
                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l2f = lf;
                c2f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(x, y) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                    pmovendo();
                    if (jogador2 == true && moveO == 0 && nX != 3 && nO != 3) {
                        FaseV();
                    }
                }

                return true;
            }
        }

        if ((ci % 2 == 0) && (ci == cf) && (celula[li][ci] == 4) && (celula[lf][cf] == 0) && (jogador2 == true)) {

            if (((li + 1) == lf) || ((li - 1) == lf)) {
                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l2f = lf;
                c2f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(x, y) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                    pmovendo();
                    if (jogador1 == true && moveX == 0 && nX != 3 && nO != 3) {
                        FaseV();
                    }
                }

                return true;
            }
        }
        return false;
    }

    public void Jogada3() {
        if (nX == 3 && nO == 3) {

            if ((nX == 3) && (celula[lf][cf] == 0) && (celula[li][ci] == 1) && (jogador1 == true)) {

                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l3f = lf;
                c3f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(lf, cf) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }

            if ((nO == 3) && (celula[lf][cf] == 0) && (celula[li][ci] == 4) && (jogador2 == true)) {

                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l3f = lf;
                c3f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(lf, cf) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }

            contagemE++;

        } else {
            if ((nX == 3) && (celula[lf][cf] == 0) && (celula[li][ci] == 1) && (jogador1 == true)) {

                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l3f = lf;
                c3f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(lf, cf) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }

            if ((nO == 3) && (celula[lf][cf] == 0) && (celula[li][ci] == 4) && (jogador2 == true)) {

                celula[lf][cf] = celula[li][ci];
                celula[li][ci] = 0;
                l3f = lf;
                c3f = cf;
                FormaButton();
                verificaNumeroDePecas();
                FormaInformacional();
                if (formouTrilha(lf, cf) == true) {
                    FormaJtrilha();
                } else {
                    jogadorAtivo();
                }
            }
        }

        if (contagemE == 10) {
            FaseV();
        }
    }

    /*
    FASES DE ENCERRAMENTO
    FaseV... Quando um dos jogadores vence a partida deixando o rival
    com 2 peças.
    FaseV... Se ocorrer de um dos jogadores deixar o rival impossivel de se locomover
    na fase2, esse jogador vencerá
     */
    public void FaseV() {
        removido.setText("");
        FormaNovojogo();
        FormaVencedor();

    }

    //O stage muda recebe e manda as variaveis para a mudança de posição de uma peça
    public void stage() {
        if (jogador1 == true) {
            if (stage == 0) {
                if (celula[x][y] == 1) {
                    li = x;
                    ci = y;
                    stage = 1;
                }
            } else if (stage != 0) {
                if (celula[x][y] == 1) {
                    li = x;
                    ci = y;
                } else if (celula[x][y] == 0) {
                    lf = x;
                    cf = y;
                    stage = 0;

                    if (devolveFaseAtual() == 1) {
                        Jogada2();
                    } else if (devolveFaseAtual() == 2) {
                        Jogada3();
                    }
                }
            }
        } else if (jogador2 == true) {
            if (stage == 0) {
                if (celula[x][y] == 4) {
                    li = x;
                    ci = y;
                    stage = 1;
                }
            } else if (stage != 0) {
                if (celula[x][y] == 4) {
                    li = x;
                    ci = y;
                } else if (celula[x][y] == 0) {
                    lf = x;
                    cf = y;
                    stage = 0;

                    if (devolveFaseAtual() == 1) {
                        Jogada2();
                    } else if (devolveFaseAtual() == 2) {
                        Jogada3();
                    }
                }
            }
        }
    }

    // Verifica se o jogador tem a capacidade de movimentação na FASE 2
    public void pmovendo() {
        moveX = 0;
        moveO = 0;

        //07 00 01
        if (celula[0][7] == 1) {
            if (celula[0][0] == 0 || celula[0][6] == 0) {
                moveX++;
            }
        }
        if (celula[0][7] == 4) {
            if (celula[0][0] == 0 || celula[0][6] == 0) {
                moveO++;
            }
        }
        if (celula[0][0] == 1) {
            if (celula[0][7] == 0 || celula[1][0] == 0 || celula[0][1] == 0) {
                moveX++;
            }
        }
        if (celula[0][0] == 4) {
            if (celula[0][7] == 0 || celula[1][0] == 0 || celula[0][1] == 0) {
                moveO++;
            }
        }
        if (celula[0][1] == 1) {
            if (celula[0][2] == 0 || celula[0][0] == 0) {
                moveX++;
            }
        }
        if (celula[0][1] == 4) {
            if (celula[0][2] == 0 || celula[0][0] == 0) {
                moveO++;
            }
        }
        //02 03 04
        if (celula[0][2] == 1) {
            if (celula[0][1] == 0 || celula[1][2] == 0 || celula[0][3] == 0) {
                moveX++;
            }
        }
        if (celula[0][2] == 4) {
            if (celula[0][1] == 0 || celula[1][2] == 0 || celula[0][3] == 0) {
                moveO++;
            }
        }
        if (celula[0][3] == 1) {
            if (celula[0][2] == 0 || celula[0][4] == 0) {
                moveX++;
            }
        }
        if (celula[0][3] == 4) {
            if (celula[0][2] == 0 || celula[0][4] == 0) {
                moveO++;
            }
        }
        if (celula[0][4] == 1) {
            if (celula[0][3] == 0 || celula[1][4] == 0 || celula[0][5] == 0) {
                moveX++;
            }
        }
        if (celula[0][4] == 4) {
            if (celula[0][3] == 0 || celula[1][4] == 0 || celula[0][5] == 0) {
                moveO++;
            }
        }
        //05 06
        if (celula[0][5] == 1) {
            if (celula[0][6] == 0 || celula[0][4] == 0) {
                moveX++;
            }
        }
        if (celula[0][5] == 4) {
            if (celula[0][6] == 0 || celula[0][4] == 0) {
                moveO++;
            }
        }
        if (celula[0][6] == 1) {
            if (celula[0][7] == 0 || celula[1][6] == 0 || celula[0][5] == 0) {
                moveX++;
            }
        }
        if (celula[0][6] == 4) {
            if (celula[0][7] == 0 || celula[1][6] == 0 || celula[0][5] == 0) {
                moveO++;
            }
        }
        //17 10 11
        if (celula[1][7] == 1) {
            if (celula[1][6] == 0 || celula[1][0] == 0) {
                moveX++;
            }
        }
        if (celula[1][7] == 4) {
            if (celula[1][6] == 0 || celula[1][0] == 0) {
                moveO++;
            }
        }
        if (celula[1][0] == 1) {
            if (celula[0][0] == 0 || celula[1][7] == 0 || celula[2][0] == 0 || celula[1][1] == 0) {
                moveX++;
            }
        }
        if (celula[1][0] == 4) {
            if (celula[0][0] == 0 || celula[1][7] == 0 || celula[2][0] == 0 || celula[1][1] == 0) {
                moveO++;
            }
        }
        if (celula[1][1] == 1) {
            if (celula[1][2] == 0 || celula[1][0] == 0) {
                moveX++;
            }
        }
        if (celula[1][1] == 4) {
            if (celula[1][2] == 0 || celula[1][0] == 0) {
                moveO++;
            }
        }
        //12 13 14
        if (celula[1][2] == 1) {
            if (celula[0][2] == 0 || celula[1][3] == 0 || celula[2][2] == 0 || celula[1][1] == 0) {
                moveX++;
            }
        }
        if (celula[1][2] == 4) {
            if (celula[0][2] == 0 || celula[1][3] == 0 || celula[2][2] == 0 || celula[1][1] == 0) {
                moveO++;
            }
        }
        if (celula[1][3] == 1) {
            if (celula[1][2] == 0 || celula[1][4] == 0) {
                moveX++;
            }
        }
        if (celula[1][3] == 4) {
            if (celula[1][2] == 0 || celula[1][4] == 0) {
                moveO++;
            }
        }
        if (celula[1][4] == 1) {
            if (celula[0][4] == 0 || celula[1][3] == 0 || celula[2][4] == 0 || celula[1][5] == 0) {
                moveX++;
            }
        }
        if (celula[1][4] == 4) {
            if (celula[0][4] == 0 || celula[1][3] == 0 || celula[2][4] == 0 || celula[1][5] == 0) {
                moveO++;
            }
        }

        //15 16
        if (celula[1][5] == 1) {
            if (celula[1][4] == 0 || celula[1][6] == 0) {
                moveX++;
            }
        }
        if (celula[1][5] == 4) {
            if (celula[1][4] == 0 || celula[1][6] == 0) {
                moveO++;
            }
        }
        if (celula[1][6] == 1) {
            if (celula[0][6] == 0 || celula[1][7] == 0 || celula[2][6] == 0 || celula[1][5] == 0) {
                moveX++;
            }
        }
        if (celula[1][6] == 4) {
            if (celula[0][6] == 0 || celula[1][7] == 0 || celula[2][6] == 0 || celula[1][5] == 0) {
                moveO++;
            }
        }

        //27 20 21
        if (celula[2][7] == 1) {
            if (celula[2][6] == 0 || celula[2][0] == 0) {
                moveX++;
            }
        }
        if (celula[2][7] == 4) {
            if (celula[2][6] == 0 || celula[2][0] == 0) {
                moveO++;
            }
        }
        if (celula[2][0] == 1) {
            if (celula[2][7] == 0 || celula[1][0] == 0 || celula[2][1] == 0) {
                moveX++;
            }
        }
        if (celula[2][0] == 4) {
            if (celula[2][7] == 0 || celula[1][0] == 0 || celula[2][1] == 0) {
                moveO++;
            }
        }
        if (celula[2][1] == 1) {
            if (celula[2][0] == 0 || celula[2][2] == 0) {
                moveX++;
            }
        }
        if (celula[2][1] == 4) {
            if (celula[2][0] == 0 || celula[2][2] == 0) {
                moveO++;
            }
        }

        //22 23 24
        if (celula[2][2] == 1) {
            if (celula[2][3] == 0 || celula[1][2] == 0 || celula[2][1] == 0) {
                moveX++;
            }
        }
        if (celula[2][2] == 4) {
            if (celula[2][3] == 0 || celula[1][2] == 0 || celula[2][1] == 0) {
                moveO++;
            }
        }
        if (celula[2][3] == 1) {
            if (celula[2][4] == 0 || celula[2][2] == 0) {
                moveX++;
            }
        }
        if (celula[2][3] == 4) {
            if (celula[2][4] == 0 || celula[2][2] == 0) {
                moveO++;
            }
        }
        if (celula[2][4] == 1) {
            if (celula[2][3] == 0 || celula[1][4] == 0 || celula[2][5] == 0) {
                moveX++;
            }
        }
        if (celula[2][4] == 4) {
            if (celula[2][3] == 0 || celula[1][4] == 0 || celula[2][5] == 0) {
                moveO++;
            }
        }
        if (celula[2][5] == 1) {
            if (celula[2][4] == 0 || celula[2][6] == 0) {
                moveX++;
            }
        }
        if (celula[2][5] == 4) {
            if (celula[2][4] == 0 || celula[2][6] == 0) {
                moveO++;
            }
        }
        if (celula[2][6] == 1) {
            if (celula[2][7] == 0 || celula[1][6] == 0 || celula[2][5] == 0) {
                moveX++;
            }
        }
        if (celula[2][6] == 4) {
            if (celula[2][7] == 0 || celula[1][6] == 0 || celula[2][5] == 0) {
                moveO++;
            }
        }
    }

    /*
    formouTrilha... verifica a formção da trilha
    trilhando... encaminha as peças a serem retiradas
    retiraPeça... só retira peça mesmo
     */
    public boolean formouTrilha(int lf, int cf) {
        if ((lf == 0) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                trilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                trilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                trilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                trilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                trilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                trilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                trilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                trilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                trilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                trilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                trilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                trilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        if (lf == 0) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                trilha = celula[0][7] + celula[0][0] + celula[0][1];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                trilha = celula[0][1] + celula[0][2] + celula[0][3];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                trilha = celula[0][3] + celula[0][4] + celula[0][5];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                trilha = celula[0][5] + celula[0][6] + celula[0][7];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        } else if (lf == 1) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                trilha = celula[1][7] + celula[1][0] + celula[1][1];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                trilha = celula[1][1] + celula[1][2] + celula[1][3];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                trilha = celula[1][3] + celula[1][4] + celula[1][5];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                trilha = celula[1][5] + celula[1][6] + celula[1][7];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        } else if (lf == 2) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                trilha = celula[2][7] + celula[2][0] + celula[2][1];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                trilha = celula[2][1] + celula[2][2] + celula[2][3];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                trilha = celula[2][3] + celula[2][4] + celula[2][5];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                trilha = celula[2][5] + celula[2][6] + celula[2][7];
                if (trilha == 3 || trilha == 12) {
                    return true;
                }
            }
        }

        return false;
    }

    public void trilhando() {
        if (trilha == 3) {
            if (retiraPeca(x, y) == true) {
                l1f = 30;
                c1f = 30;
                l2f = 30;
                c2f = 30;
                l3f = 30;
                c3f = 30;
                ftrilha.setText("");
                FormaRetirada();
                jogadorAtivo();
                pmovendo();
                verificaNumeroDePecas();
                FormaInformacional();
                if (jogador2 == true && moveO == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }

            }
        }

        if (trilha == 12) {
            if (retiraPeca(x, y) == true) {
                l1f = 30;
                c1f = 30;
                l2f = 30;
                c2f = 30;
                l3f = 30;
                c3f = 30;
                ftrilha.setText("");
                FormaRetirada();
                jogadorAtivo();
                pmovendo();
                verificaNumeroDePecas();
                FormaInformacional();
                if (jogador1 == true && moveX == 0 && nX != 3 && nO != 3) {
                    FaseV();
                }

            }
        }
    }

    public boolean retiraPeca(int li, int ci) {
        if (trilha == 3) {
            if (celula[li][ci] == 4) {
                celula[li][ci] = 0;
                FormaButton();
                return true;
            }
        } else if (trilha == 12) {
            if (celula[li][ci] == 1) {
                celula[li][ci] = 0;
                FormaButton();
                return true;
            }
        }
        return false;
    }

    /*
    Verificação se a peça a ser retirada é valida
    Se a peça a ser retirada faz parte de uma trilha, a peça não poderá ser retirada,
    mas se não tiver nenhuma peça no tabuleiro, que não faça parte de uma trilha,
    o jogador poderá retirar uma peça de uma trilha.
    trilhado... verifica se a peça a ser retirada faz parte de uma trilha
    trilhado2... verifica se a alguma peça que não está em uma trilha
    trilhado3... complemento de trilhado 2
     */
    public boolean trilhado(int lf, int cf) {
        if ((lf == 0) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                Vtrilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                Vtrilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 0)) {
            if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                Vtrilha = celula[0][0] + celula[1][0] + celula[2][0];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                Vtrilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                Vtrilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 2)) {
            if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                Vtrilha = celula[0][2] + celula[1][2] + celula[2][2];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                Vtrilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                Vtrilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 4)) {
            if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                Vtrilha = celula[0][4] + celula[1][4] + celula[2][4];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 0) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                Vtrilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 1) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                Vtrilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if ((lf == 2) && (cf == 6)) {
            if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                Vtrilha = celula[0][6] + celula[1][6] + celula[2][6];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        if (lf == 0) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                Vtrilha = celula[0][7] + celula[0][0] + celula[0][1];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                Vtrilha = celula[0][1] + celula[0][2] + celula[0][3];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                Vtrilha = celula[0][3] + celula[0][4] + celula[0][5];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                Vtrilha = celula[0][5] + celula[0][6] + celula[0][7];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        } else if (lf == 1) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                Vtrilha = celula[1][7] + celula[1][0] + celula[1][1];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                Vtrilha = celula[1][1] + celula[1][2] + celula[1][3];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                Vtrilha = celula[1][3] + celula[1][4] + celula[1][5];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                Vtrilha = celula[1][5] + celula[1][6] + celula[1][7];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        } else if (lf == 2) {

            if ((cf == 7) || (cf == 0) || (cf == 1)) {
                Vtrilha = celula[2][7] + celula[2][0] + celula[2][1];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 1) || (cf == 2) || (cf == 3)) {
                Vtrilha = celula[2][1] + celula[2][2] + celula[2][3];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 3) || (cf == 4) || (cf == 5)) {
                Vtrilha = celula[2][3] + celula[2][4] + celula[2][5];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }

            if ((cf == 5) || (cf == 6) || (cf == 7)) {
                Vtrilha = celula[2][5] + celula[2][6] + celula[2][7];
                if (Vtrilha == 3 || Vtrilha == 12) {
                    return true;
                }
            }
        }

        return false;
    }

    public void trilhado2() {
        contadorX = 0;
        contadorO = 0;
        Vtrilhado = 0;
        A = 0;
        B = 0;
        C = 0;
        D = 0;
        E = 0;
        F = 0;
        G = 0;
        H = 0;
        I = 0;
        J = 0;
        K = 0;
        L = 0;
        M = 0;
        N = 0;
        P = 0;
        Q = 0;
        R = 0;
        S = 0;
        T = 0;
        U = 0;
        V = 0;
        W = 0;
        X = 0;

        for (lf = 0; lf < 3; lf++) {
            for (cf = 0; cf < 8; cf++) {
                if ((lf == 0) && (cf == 0)) {
                    if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                        Vtrilhado = celula[0][0] + celula[1][0] + celula[2][0];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            A = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            A = 4;
                        }
                    }
                }

                if ((lf == 1) && (cf == 0)) {
                    if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                        Vtrilhado = celula[0][0] + celula[1][0] + celula[2][0];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            B = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            B = 4;
                        }
                    }
                }

                if ((lf == 2) && (cf == 0)) {
                    if ((celula[0][0] == celula[1][0]) && (celula[1][0] == celula[2][0])) {
                        Vtrilhado = celula[0][0] + celula[1][0] + celula[2][0];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            C = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            C = 4;
                        }
                    }
                }

                if ((lf == 0) && (cf == 2)) {
                    if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                        Vtrilhado = celula[0][2] + celula[1][2] + celula[2][2];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            D = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            D = 4;
                        }
                    }
                }

                if ((lf == 1) && (cf == 2)) {
                    if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                        Vtrilhado = celula[0][2] + celula[1][2] + celula[2][2];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            E = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            E = 4;
                        }
                    }
                }

                if ((lf == 2) && (cf == 2)) {
                    if ((celula[0][2] == celula[1][2]) && (celula[1][2] == celula[2][2])) {
                        Vtrilhado = celula[0][2] + celula[1][2] + celula[2][2];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            F = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            F = 4;
                        }
                    }
                }

                if ((lf == 0) && (cf == 4)) {
                    if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                        Vtrilhado = celula[0][4] + celula[1][4] + celula[2][4];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            G = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            G = 4;
                        }
                    }
                }

                if ((lf == 1) && (cf == 4)) {
                    if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                        Vtrilhado = celula[0][4] + celula[1][4] + celula[2][4];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            H = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            H = 4;
                        }
                    }
                }

                if ((lf == 2) && (cf == 4)) {
                    if ((celula[0][4] == celula[1][4]) && (celula[1][4] == celula[2][4])) {
                        Vtrilhado = celula[0][4] + celula[1][4] + celula[2][4];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            I = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            I = 4;
                        }
                    }
                }

                if ((lf == 0) && (cf == 6)) {
                    if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                        Vtrilhado = celula[0][6] + celula[1][6] + celula[2][6];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            J = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            J = 4;
                        }
                    }
                }

                if ((lf == 1) && (cf == 6)) {
                    if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                        Vtrilhado = celula[0][6] + celula[1][6] + celula[2][6];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            K = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            K = 4;
                        }
                    }
                }

                if ((lf == 2) && (cf == 6)) {
                    if ((celula[0][6] == celula[1][6]) && (celula[1][6] == celula[2][6])) {
                        Vtrilhado = celula[0][6] + celula[1][6] + celula[2][6];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            L = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            L = 4;
                        }
                    }
                }

                if (lf == 0) {

                    if ((cf == 7) || (cf == 0) || (cf == 1)) {
                        Vtrilhado = celula[0][7] + celula[0][0] + celula[0][1];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            M = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            M = 4;
                        }
                    }

                    if ((cf == 1) || (cf == 2) || (cf == 3)) {
                        Vtrilhado = celula[0][1] + celula[0][2] + celula[0][3];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            N = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            N = 4;
                        }
                    }

                    if ((cf == 3) || (cf == 4) || (cf == 5)) {
                        Vtrilhado = celula[0][3] + celula[0][4] + celula[0][5];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            O = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            O = 4;
                        }
                    }

                    if ((cf == 5) || (cf == 6) || (cf == 7)) {
                        Vtrilhado = celula[0][5] + celula[0][6] + celula[0][7];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            P = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            P = 4;
                        }
                    }
                } else if (lf == 1) {

                    if ((cf == 7) || (cf == 0) || (cf == 1)) {
                        Vtrilhado = celula[1][7] + celula[1][0] + celula[1][1];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            Q = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            Q = 4;
                        }
                    }

                    if ((cf == 1) || (cf == 2) || (cf == 3)) {
                        Vtrilhado = celula[1][1] + celula[1][2] + celula[1][3];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            R = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            R = 4;
                        }
                    }

                    if ((cf == 3) || (cf == 4) || (cf == 5)) {
                        Vtrilhado = celula[1][3] + celula[1][4] + celula[1][5];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            S = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            S = 4;
                        }
                    }

                    if ((cf == 5) || (cf == 6) || (cf == 7)) {
                        Vtrilhado = celula[1][5] + celula[1][6] + celula[1][7];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            T = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            T = 4;
                        }
                    }
                } else if (lf == 2) {

                    if ((cf == 7) || (cf == 0) || (cf == 1)) {
                        Vtrilhado = celula[2][7] + celula[2][0] + celula[2][1];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            U = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            U = 4;
                        }
                    }

                    if ((cf == 1) || (cf == 2) || (cf == 3)) {
                        Vtrilhado = celula[2][1] + celula[2][2] + celula[2][3];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            V = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            V = 4;
                        }
                    }

                    if ((cf == 3) || (cf == 4) || (cf == 5)) {
                        Vtrilhado = celula[2][3] + celula[2][4] + celula[2][5];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            W = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            W = 4;
                        }
                    }

                    if ((cf == 5) || (cf == 6) || (cf == 7)) {
                        Vtrilhado = celula[2][5] + celula[2][6] + celula[2][7];
                        if (Vtrilhado == 3) {
                            contadorX++;
                            X = 1;
                        } else if (Vtrilhado == 12) {
                            contadorO++;
                            X = 4;
                        }
                    }
                }
            }
        }
        trilhado3();
    }

    public void trilhado3() {
        if (T == K) {
            if (T == 1) {
                contadorX--;
            } else if (T == 4) {
                contadorO--;
            }
        }
        if (P == J) {
            if (P == 1) {
                contadorX--;
            } else if (P == 4) {
                contadorO--;
            }
        }
        if (X == L) {
            if (X == 1) {
                contadorX--;
            } else if (X == 4) {
                contadorO--;
            }
        }
        if (B == Q) {
            if (Q == 1) {
                contadorX--;
            } else if (Q == 4) {
                contadorO--;
            }
        }
        if (A == M) {
            if (M == 1) {
                contadorX--;
            } else if (M == 4) {
                contadorO--;
            }
        }
        if (U == C) {
            if (U == 1) {
                contadorX--;
            } else if (C == 4) {
                contadorO--;
            }
        }
        if (D == N) {
            if (D == 1) {
                contadorX--;
            } else if (D == 4) {
                contadorO--;
            }
        }
        if (E == R) {
            if (E == 1) {
                contadorX--;
            } else if (E == 4) {
                contadorO--;
            }
        }
        if (F == V) {
            if (F == 1) {
                contadorX--;
            } else if (F == 4) {
                contadorO--;
            }
        }
        if (O == G) {
            if (G == 1) {
                contadorX--;
            } else if (G == 4) {
                contadorO--;
            }
        }
        if (S == H) {
            if (S == 1) {
                contadorX--;
            } else if (S == 4) {
                contadorO--;
            }
        }
        if (W == I) {
            if (W == 1) {
                contadorX--;
            } else if (W == 4) {
                contadorO--;
            }
        }
        if (M == P) {
            if (M == 1) {
                contadorX--;
            } else if (M == 4) {
                contadorO--;
            }
        }
        if (M == N) {
            if (N == 1) {
                contadorX--;
            } else if (N == 4) {
                contadorO--;
            }
        }
        if (N == O) {
            if (O == 1) {
                contadorX--;
            } else if (N == 4) {
                contadorO--;
            }
        }
        if (O == P) {
            if (P == 1) {
                contadorX--;
            } else if (P == 4) {
                contadorO--;
            }
        }
        if (T == Q) {
            if (T == 1) {
                contadorX--;
            } else if (T == 4) {
                contadorO--;
            }
        }
        if (Q == R) {
            if (Q == 1) {
                contadorX--;
            } else if (Q == 4) {
                contadorO--;
            }
        }
        if (R == S) {
            if (S == 1) {
                contadorX--;
            } else if (S == 4) {
                contadorO--;
            }
        }
        if (S == T) {
            if (S == 1) {
                contadorX--;
            } else if (S == 4) {
                contadorO--;
            }
        }
        if (U == X) {
            if (U == 1) {
                contadorX--;
            } else if (U == 4) {
                contadorO--;
            }
        }
        if (U == V) {
            if (U == 1) {
                contadorX--;
            } else if (U == 4) {
                contadorO--;
            }
        }
        if (V == W) {
            if (V == 1) {
                contadorX--;
            } else if (V == 4) {
                contadorO--;
            }
        }
        if (W == X) {
            if (W == 1) {
                contadorX--;
            } else if (W == 4) {
                contadorO--;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        painelV = new javax.swing.JPanel();
        jogadorvencedor = new javax.swing.JLabel();
        vencedor = new javax.swing.JLabel();
        VENCEU = new javax.swing.JLabel();
        FASE = new javax.swing.JLabel();
        jogador = new javax.swing.JLabel();
        vez = new javax.swing.JLabel();
        ftrilha = new javax.swing.JLabel();
        removido = new javax.swing.JLabel();
        Informacional = new javax.swing.JLabel();
        novojogo = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();
        Linhas = new javax.swing.JLabel();
        Renomear = new javax.swing.JLabel();
        fundao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Trilha");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(788, 672));
        setName("Jogo Da Trilha"); // NOI18N
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        b1.setBackground(new java.awt.Color(16, 18, 46));
        b1.setForeground(new java.awt.Color(16, 18, 46));
        b1.setToolTipText("");
        b1.setAutoscrolls(true);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1.setMinimumSize(new java.awt.Dimension(46, 6));
        b1.setName(""); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(10, 140, 44, 44);

        b2.setBackground(new java.awt.Color(16, 18, 46));
        b2.setForeground(new java.awt.Color(16, 18, 46));
        b2.setToolTipText("");
        b2.setAutoscrolls(true);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2.setMinimumSize(new java.awt.Dimension(46, 6));
        b2.setName(""); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(240, 140, 44, 44);

        b3.setBackground(new java.awt.Color(16, 18, 46));
        b3.setForeground(new java.awt.Color(16, 18, 46));
        b3.setToolTipText("");
        b3.setAutoscrolls(true);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b3.setMinimumSize(new java.awt.Dimension(46, 6));
        b3.setName(""); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(470, 140, 44, 44);

        b4.setBackground(new java.awt.Color(16, 18, 46));
        b4.setForeground(new java.awt.Color(16, 18, 46));
        b4.setToolTipText("");
        b4.setAutoscrolls(true);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b4.setMinimumSize(new java.awt.Dimension(46, 6));
        b4.setName(""); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(470, 360, 44, 44);

        b5.setBackground(new java.awt.Color(16, 18, 46));
        b5.setForeground(new java.awt.Color(16, 18, 46));
        b5.setToolTipText("");
        b5.setAutoscrolls(true);
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b5.setMinimumSize(new java.awt.Dimension(46, 6));
        b5.setName(""); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(470, 580, 44, 44);

        b6.setBackground(new java.awt.Color(16, 18, 46));
        b6.setForeground(new java.awt.Color(16, 18, 46));
        b6.setToolTipText("");
        b6.setAutoscrolls(true);
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b6.setMinimumSize(new java.awt.Dimension(46, 6));
        b6.setName(""); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(240, 580, 44, 44);

        b7.setBackground(new java.awt.Color(16, 18, 46));
        b7.setForeground(new java.awt.Color(16, 18, 46));
        b7.setToolTipText("");
        b7.setAutoscrolls(true);
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b7.setMinimumSize(new java.awt.Dimension(46, 6));
        b7.setName(""); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(10, 580, 44, 44);

        b8.setBackground(new java.awt.Color(16, 18, 46));
        b8.setForeground(new java.awt.Color(16, 18, 46));
        b8.setToolTipText("");
        b8.setAutoscrolls(true);
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b8.setMinimumSize(new java.awt.Dimension(46, 6));
        b8.setName(""); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(10, 360, 44, 44);

        b9.setBackground(new java.awt.Color(16, 18, 46));
        b9.setForeground(new java.awt.Color(16, 18, 46));
        b9.setToolTipText("");
        b9.setAutoscrolls(true);
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b9.setMinimumSize(new java.awt.Dimension(46, 6));
        b9.setName(""); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(90, 210, 44, 44);

        b10.setBackground(new java.awt.Color(16, 18, 46));
        b10.setForeground(new java.awt.Color(16, 18, 46));
        b10.setToolTipText("");
        b10.setAutoscrolls(true);
        b10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b10.setMinimumSize(new java.awt.Dimension(46, 6));
        b10.setName(""); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(240, 210, 44, 44);

        b11.setBackground(new java.awt.Color(16, 18, 46));
        b11.setForeground(new java.awt.Color(16, 18, 46));
        b11.setToolTipText("");
        b11.setAutoscrolls(true);
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b11.setMinimumSize(new java.awt.Dimension(46, 6));
        b11.setName(""); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(400, 210, 44, 44);

        b12.setBackground(new java.awt.Color(16, 18, 46));
        b12.setForeground(new java.awt.Color(16, 18, 46));
        b12.setToolTipText("");
        b12.setAutoscrolls(true);
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b12.setMinimumSize(new java.awt.Dimension(46, 6));
        b12.setName(""); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(400, 360, 44, 44);

        b13.setBackground(new java.awt.Color(16, 18, 46));
        b13.setForeground(new java.awt.Color(16, 18, 46));
        b13.setToolTipText("");
        b13.setAutoscrolls(true);
        b13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b13.setMinimumSize(new java.awt.Dimension(46, 6));
        b13.setName(""); // NOI18N
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13);
        b13.setBounds(400, 520, 44, 44);

        b21.setBackground(new java.awt.Color(16, 18, 46));
        b21.setForeground(new java.awt.Color(16, 18, 46));
        b21.setToolTipText("");
        b21.setAutoscrolls(true);
        b21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b21.setMinimumSize(new java.awt.Dimension(46, 6));
        b21.setName(""); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21);
        b21.setBounds(320, 440, 44, 44);

        b15.setBackground(new java.awt.Color(16, 18, 46));
        b15.setForeground(new java.awt.Color(16, 18, 46));
        b15.setToolTipText("");
        b15.setAutoscrolls(true);
        b15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b15.setMinimumSize(new java.awt.Dimension(46, 6));
        b15.setName(""); // NOI18N
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15);
        b15.setBounds(90, 510, 44, 44);

        b23.setBackground(new java.awt.Color(16, 18, 46));
        b23.setForeground(new java.awt.Color(16, 18, 46));
        b23.setToolTipText("");
        b23.setAutoscrolls(true);
        b23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b23.setMinimumSize(new java.awt.Dimension(46, 6));
        b23.setName(""); // NOI18N
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23);
        b23.setBounds(160, 440, 44, 44);

        b18.setBackground(new java.awt.Color(16, 18, 46));
        b18.setForeground(new java.awt.Color(16, 18, 46));
        b18.setToolTipText("");
        b18.setAutoscrolls(true);
        b18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b18.setMinimumSize(new java.awt.Dimension(46, 6));
        b18.setName(""); // NOI18N
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18);
        b18.setBounds(240, 280, 44, 44);

        b19.setBackground(new java.awt.Color(16, 18, 46));
        b19.setForeground(new java.awt.Color(16, 18, 46));
        b19.setToolTipText("");
        b19.setAutoscrolls(true);
        b19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b19.setMinimumSize(new java.awt.Dimension(46, 6));
        b19.setName(""); // NOI18N
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19);
        b19.setBounds(320, 280, 44, 44);

        b20.setBackground(new java.awt.Color(16, 18, 46));
        b20.setForeground(new java.awt.Color(16, 18, 46));
        b20.setToolTipText("");
        b20.setAutoscrolls(true);
        b20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b20.setMinimumSize(new java.awt.Dimension(46, 6));
        b20.setName(""); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20);
        b20.setBounds(320, 360, 44, 44);

        b14.setBackground(new java.awt.Color(16, 18, 46));
        b14.setForeground(new java.awt.Color(16, 18, 46));
        b14.setToolTipText("");
        b14.setAutoscrolls(true);
        b14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b14.setMinimumSize(new java.awt.Dimension(46, 6));
        b14.setName(""); // NOI18N
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14);
        b14.setBounds(240, 510, 44, 44);

        b16.setBackground(new java.awt.Color(16, 18, 46));
        b16.setForeground(new java.awt.Color(16, 18, 46));
        b16.setToolTipText("");
        b16.setAutoscrolls(true);
        b16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b16.setMinimumSize(new java.awt.Dimension(46, 6));
        b16.setName(""); // NOI18N
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16);
        b16.setBounds(90, 360, 44, 44);

        b17.setBackground(new java.awt.Color(16, 18, 46));
        b17.setForeground(new java.awt.Color(16, 18, 46));
        b17.setToolTipText("");
        b17.setAutoscrolls(true);
        b17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b17.setMinimumSize(new java.awt.Dimension(46, 6));
        b17.setName(""); // NOI18N
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17);
        b17.setBounds(160, 280, 44, 44);

        b24.setBackground(new java.awt.Color(16, 18, 46));
        b24.setForeground(new java.awt.Color(16, 18, 46));
        b24.setToolTipText("");
        b24.setAutoscrolls(true);
        b24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b24.setMinimumSize(new java.awt.Dimension(46, 6));
        b24.setName(""); // NOI18N
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24);
        b24.setBounds(160, 360, 44, 44);

        b22.setBackground(new java.awt.Color(16, 18, 46));
        b22.setForeground(new java.awt.Color(16, 18, 46));
        b22.setToolTipText("");
        b22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b22.setMinimumSize(new java.awt.Dimension(46, 6));
        b22.setName(""); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22);
        b22.setBounds(240, 440, 44, 44);

        jLayeredPane1.setBackground(new java.awt.Color(16, 18, 46));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 252, 72), 2));

        painelV.setVisible(false);
        painelV.setFocusCycleRoot(true);
        painelV.setOpaque(false);
        painelV.setLayout(null);

        jogadorvencedor.setBackground(new java.awt.Color(16, 18, 46));
        jogadorvencedor.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jogadorvencedor.setForeground(new java.awt.Color(120, 120, 120));
        jogadorvencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogadorvencedor.setText("JOGADOR");
        jogadorvencedor.setToolTipText("");
        painelV.add(jogadorvencedor);
        jogadorvencedor.setBounds(0, 0, 210, 40);
        jogadorvencedor.getAccessibleContext().setAccessibleParent(painelV);

        vencedor.setBackground(new java.awt.Color(16, 18, 46));
        vencedor.setFont(new java.awt.Font("Courier New", 3, 48)); // NOI18N
        vencedor.setForeground(new java.awt.Color(120, 120, 120));
        vencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vencedor.setText("X");
        vencedor.setToolTipText("");
        painelV.add(vencedor);
        vencedor.setBounds(0, 40, 210, 40);
        vencedor.getAccessibleContext().setAccessibleName("");

        VENCEU.setBackground(new java.awt.Color(16, 18, 46));
        VENCEU.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        VENCEU.setForeground(new java.awt.Color(120, 120, 120));
        VENCEU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VENCEU.setText("VENCEU ! !");
        VENCEU.setToolTipText("");
        painelV.add(VENCEU);
        VENCEU.setBounds(0, 80, 210, 40);
        VENCEU.getAccessibleContext().setAccessibleName("");

        jLayeredPane1.add(painelV);
        painelV.setBounds(10, 140, 210, 120);

        FASE.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        FASE.setForeground(new java.awt.Color(255, 252, 75));
        FASE.setText("FASE 1");
        jLayeredPane1.add(FASE);
        FASE.setBounds(60, 0, 110, 50);

        jogador.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jogador.setForeground(new java.awt.Color(218, 31, 38));
        jogador.setText("Jogador");
        jogador.setMaximumSize(new java.awt.Dimension(100, 40));
        jogador.setMinimumSize(new java.awt.Dimension(100, 40));
        jLayeredPane1.add(jogador);
        jogador.setBounds(50, 70, 110, 50);

        vez.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        vez.setForeground(new java.awt.Color(218, 31, 38));
        vez.setText("X");
        vez.setMaximumSize(new java.awt.Dimension(22, 40));
        vez.setMinimumSize(new java.awt.Dimension(22, 40));
        jLayeredPane1.add(vez);
        vez.setBounds(160, 80, 22, 40);

        ftrilha.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        ftrilha.setForeground(new java.awt.Color(150, 0, 80));
        jLayeredPane1.add(ftrilha);
        ftrilha.setBounds(40, 130, 150, 40);

        removido.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        removido.setForeground(new java.awt.Color(255, 255, 10));
        jLayeredPane1.add(removido);
        removido.setBounds(40, 130, 150, 40);

        Informacional.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        Informacional.setForeground(new java.awt.Color(255, 255, 72));
        Informacional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(Informacional);
        Informacional.setBounds(0, 320, 230, 30);

        novojogo.setBackground(new java.awt.Color(16, 18, 46));
        novojogo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        novojogo.setForeground(new java.awt.Color(255, 252, 72));
        novojogo.setToolTipText("");
        novojogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 18, 46)));
        novojogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novojogo.setEnabled(false);
        novojogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novojogoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(novojogo);
        novojogo.setBounds(25, 360, 180, 50);
        novojogo.getAccessibleContext().setAccessibleName("NOVO JOGO");
        novojogo.getAccessibleContext().setAccessibleDescription("NOVO JOGO");

        SAIR.setBackground(new java.awt.Color(16, 18, 46));
        SAIR.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SAIR.setForeground(new java.awt.Color(14, 209, 69));
        SAIR.setText("SAIR DA TRILHA");
        SAIR.setToolTipText("SAIR DA TRILHA");
        SAIR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 209, 69), 2));
        SAIR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });
        jLayeredPane1.add(SAIR);
        SAIR.setBounds(25, 420, 180, 50);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(532, 140, 230, 480);

        Linhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogos/500px-M.png"))); // NOI18N
        Linhas.setText("jLabel2");
        getContentPane().add(Linhas);
        Linhas.setBounds(10, 140, 500, 490);

        Renomear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogos/nome.jpg"))); // NOI18N
        getContentPane().add(Renomear);
        Renomear.setBounds(90, 30, 340, 87);

        fundao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogos/Fundo.jpg"))); // NOI18N
        fundao.setText("Fundo");
        getContentPane().add(fundao);
        fundao.setBounds(0, 0, 3000, 3000);
        fundao.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        x = 0;
        y = 0;
        funcionando();
    }//GEN-LAST:event_b2ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        x = 2;
        y = 7;
        funcionando();
    }//GEN-LAST:event_b17ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        x = 0;
        y = 6;
        funcionando();
    }//GEN-LAST:event_b8ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        x = 0;
        y = 7;
        funcionando();
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        x = 0;
        y = 1;
        funcionando();
    }//GEN-LAST:event_b3ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        x = 1;
        y = 7;
        funcionando();
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        x = 1;
        y = 0;
        funcionando();
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        x = 1;
        y = 1;
        funcionando();
    }//GEN-LAST:event_b11ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        x = 0;
        y = 2;
        funcionando();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        x = 0;
        y = 3;
        funcionando();
    }//GEN-LAST:event_b5ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        x = 1;
        y = 2;
        funcionando();
    }//GEN-LAST:event_b12ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        x = 2;
        y = 1;
        funcionando();
    }//GEN-LAST:event_b19ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        x = 1;
        y = 6;
        funcionando();
    }//GEN-LAST:event_b16ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        x = 2;
        y = 6;
        funcionando();
    }//GEN-LAST:event_b24ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        x = 2;
        y = 0;
        funcionando();
    }//GEN-LAST:event_b18ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        x = 2;
        y = 2;
        funcionando();
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        x = 2;
        y = 3;
        funcionando();
    }//GEN-LAST:event_b21ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        x = 2;
        y = 5;
        funcionando();
    }//GEN-LAST:event_b23ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        x = 1;
        y = 5;
        funcionando();
    }//GEN-LAST:event_b15ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        x = 1;
        y = 4;
        funcionando();
    }//GEN-LAST:event_b14ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        x = 1;
        y = 3;
        funcionando();
    }//GEN-LAST:event_b13ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        x = 0;
        y = 5;
        funcionando();
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        x = 0;
        y = 4;
        funcionando();
    }//GEN-LAST:event_b6ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        x = 2;
        y = 4;
        funcionando();
    }//GEN-LAST:event_b22ActionPerformed

    private void novojogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novojogoActionPerformed

        novojogo();
    }//GEN-LAST:event_novojogoActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SAIRActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Jogotrilha().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FASE;
    private javax.swing.JLabel Informacional;
    private javax.swing.JLabel Linhas;
    private javax.swing.JLabel Renomear;
    private javax.swing.JButton SAIR;
    private javax.swing.JLabel VENCEU;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel ftrilha;
    private javax.swing.JLabel fundao;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jogador;
    private javax.swing.JLabel jogadorvencedor;
    private javax.swing.JButton novojogo;
    private javax.swing.JPanel painelV;
    private javax.swing.JLabel removido;
    private javax.swing.JLabel vencedor;
    private javax.swing.JLabel vez;
    // End of variables declaration//GEN-END:variables
}
