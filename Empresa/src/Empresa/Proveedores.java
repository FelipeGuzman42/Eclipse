package Empresa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class Proveedores extends javax.swing.JFrame implements ActionListener {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Alga = new javax.swing.JTextField();
        Arroz = new javax.swing.JTextField();
        Salmon = new javax.swing.JTextField();
        Queso = new javax.swing.JTextField();
        Ajon = new javax.swing.JTextField();
        Pepino = new javax.swing.JTextField();
        Masago = new javax.swing.JTextField();
        Atun = new javax.swing.JTextField();
        Dinamita = new javax.swing.JTextField();
        Agua = new javax.swing.JTextField();
        Palmito = new javax.swing.JTextField();
        Langos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        AlgaP = new javax.swing.JTextField();
        ArrozP = new javax.swing.JTextField();
        SalmonP = new javax.swing.JTextField();
        QuesoP = new javax.swing.JTextField();
        AjonP = new javax.swing.JTextField();
        PepinoP = new javax.swing.JTextField();
        AlgaD = new javax.swing.JTextField();
        ArrozD = new javax.swing.JTextField();
        SalmonD = new javax.swing.JTextField();
        QuesoD = new javax.swing.JTextField();
        AjonD = new javax.swing.JTextField();
        PepinoD = new javax.swing.JTextField();
        MasagoD = new javax.swing.JTextField();
        AtunP = new javax.swing.JTextField();
        MasagoP = new javax.swing.JTextField();
        DinamitaP = new javax.swing.JTextField();
        LangosP = new javax.swing.JTextField();
        PalmitoP = new javax.swing.JTextField();
        AguaP = new javax.swing.JTextField();
        AtunD = new javax.swing.JTextField();
        DinamitaD = new javax.swing.JTextField();
        LangosD = new javax.swing.JTextField();
        PalmitoD = new javax.swing.JTextField();
        AguaD = new javax.swing.JTextField();
        Pesos = new javax.swing.JTextField();
        Dolares = new javax.swing.JTextField();
        Dias = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Proveedor de Sushi");

        Salir.setForeground(new java.awt.Color(255, 153, 0));
        Salir.setText("Regresar");

        Aceptar.setForeground(new java.awt.Color(51, 255, 0));
        Aceptar.setText("Aceptar");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Alga");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Arroz");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Salmón");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Queso crema");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ajonjolí");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Pepino");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Palmito de cangrejo");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Aguacate");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Masago");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Atún");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Salsa dinamita");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Langostino");

        Alga.setText("0");
        Alga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgaActionPerformed(evt);
            }
        });

        Arroz.setText("0");

        Salmon.setText("0");

        Queso.setText("0");

        Ajon.setText("0");

        Pepino.setText("0");

        Masago.setText("0");

        Atun.setText("0");

        Dinamita.setText("0");

        Agua.setText("0");

        Palmito.setText("0");

        Langos.setText("0");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Unidades");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Días");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Precio");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Unidades");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Precio");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Días");

        AlgaP.setText("1");

        ArrozP.setText("1");

        SalmonP.setText("5");

        QuesoP.setText("2");

        AjonP.setText("1");

        PepinoP.setText("1");

        AlgaD.setText("2");

        ArrozD.setText("5");

        SalmonD.setText("3");

        QuesoD.setText("1");

        AjonD.setText("1");

        PepinoD.setText("4");

        MasagoD.setText("1");

        AtunP.setText("3");

        MasagoP.setText("1");

        DinamitaP.setText("1");

        LangosP.setText("7");

        PalmitoP.setText("3");

        AguaP.setText("2");

        AtunD.setText("7");

        DinamitaD.setText("6");

        LangosD.setText("10");

        PalmitoD.setText("8");

        AguaD.setText("3");

        Pesos.setText("Precio Pesos");

        Dolares.setText("Precio Dolares");

        Dias.setText("Restantes");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Dolares:");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Pesos:");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Días:");

        Fecha.setText("Fecha");
        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Alga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Arroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Salmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Queso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(AlgaP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ArrozP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SalmonP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(QuesoP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Ajon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(AjonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Pepino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(PepinoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Masago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(MasagoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Atun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dinamita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Langos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Palmito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AguaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LangosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DinamitaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AtunP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PalmitoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AtunD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MasagoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DinamitaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LangosD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PalmitoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AguaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(AlgaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ArrozD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(SalmonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(QuesoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(AjonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PepinoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(241, 241, 241))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(219, 219, 219)))))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Masago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlgaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlgaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MasagoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MasagoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArrozP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArrozD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtunP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtunD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dinamita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalmonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalmonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DinamitaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DinamitaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Queso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Langos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuesoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuesoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LangosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LangosD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Palmito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AjonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AjonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PalmitoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PalmitoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pepino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PepinoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PepinoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AguaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AguaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salir)
                            .addComponent(Pesos)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Aceptar)
                        .addComponent(Dolares)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlgaActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Agua;
    private javax.swing.JTextField AguaD;
    private javax.swing.JTextField AguaP;
    private javax.swing.JTextField Ajon;
    private javax.swing.JTextField AjonD;
    private javax.swing.JTextField AjonP;
    private javax.swing.JTextField Alga;
    private javax.swing.JTextField AlgaD;
    private javax.swing.JTextField AlgaP;
    private javax.swing.JTextField Arroz;
    private javax.swing.JTextField ArrozD;
    private javax.swing.JTextField ArrozP;
    private javax.swing.JTextField Atun;
    private javax.swing.JTextField AtunD;
    private javax.swing.JTextField AtunP;
    private javax.swing.JTextField Dias;
    private javax.swing.JTextField Dinamita;
    private javax.swing.JTextField DinamitaD;
    private javax.swing.JTextField DinamitaP;
    private javax.swing.JTextField Dolares;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Langos;
    private javax.swing.JTextField LangosD;
    private javax.swing.JTextField LangosP;
    private javax.swing.JTextField Masago;
    private javax.swing.JTextField MasagoD;
    private javax.swing.JTextField MasagoP;
    private javax.swing.JTextField Palmito;
    private javax.swing.JTextField PalmitoD;
    private javax.swing.JTextField PalmitoP;
    private javax.swing.JTextField Pepino;
    private javax.swing.JTextField PepinoD;
    private javax.swing.JTextField PepinoP;
    private javax.swing.JTextField Pesos;
    private javax.swing.JTextField Queso;
    private javax.swing.JTextField QuesoD;
    private javax.swing.JTextField QuesoP;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Salmon;
    private javax.swing.JTextField SalmonD;
    private javax.swing.JTextField SalmonP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private Cliente cli;
    private GregorianCalendar gc = new GregorianCalendar();
    private ArrayList<Integer> opciones = new ArrayList<Integer>();
    private int dia = 0, d = 0, total = 0, algas = 0, arroces = 0, aguas = 0, quesos = 0, salmones = 0, ajons = 0, pepis = 0, masas = 0, atuns = 0, dinas = 0, langos = 0, palmis = 0;

    public Proveedores(Cliente cli, ArrayList ops) {
        initComponents();
        this.opciones = ops;
        this.numeros();
        this.calendario();
        this.dia();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.cli = cli;
        this.sintoniza();
    }

    private void sintoniza() {
        this.Aceptar.addActionListener(this);
        this.Salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent op) {
        if (op.getSource() == this.Aceptar) {
            if (this.Aceptar.getText().equals("Finalizar")) {
                this.setVisible(false);
                this.cli.setVisible(true);
            } else {
                this.avanzar();
            }
        }
        if (op.getSource() == this.Salir) {
            this.setVisible(false);
            this.cli.setVisible(true);
        }
    }

    public void numeros() {
        for (int i = 0; i < this.opciones.size(); i++) {
            this.algas = this.algas + 1;
            this.arroces = this.arroces + 1;
            if (this.opciones.get(i) == 1) {
                this.salmones = this.salmones + 1;
                this.quesos = this.quesos + 1;
                this.ajons = this.ajons + 1;
            }
            if (this.opciones.get(i) == 2) {
                this.pepis = this.pepis + 1;
                this.palmis = this.palmis + 1;
                this.aguas = this.aguas + 1;
                this.masas = this.masas + 1;
            }
            if (this.opciones.get(i) == 3) {
                this.atuns = this.atuns + 1;
                this.salmones = this.salmones + 1;
                this.palmis = this.palmis + 1;
                this.masas = this.masas + 1;
                this.aguas = this.aguas + 1;
                this.ajons = this.ajons + 1;
                this.dinas = this.dinas + 1;
            }
            if (this.opciones.get(i) == 4) {
                this.salmones = this.salmones + 1;
                this.langos = this.langos + 1;
                this.aguas = this.aguas + 1;
                this.quesos = this.quesos + 1;
            }
            if (this.opciones.get(i) == 5) {
                this.langos = this.langos + 1;
                this.quesos = this.quesos + 1;
                this.aguas = this.aguas + 1;
                this.salmones = this.salmones + 1;
                this.ajons = this.ajons + 1;
            }
        }
        this.texto();
    }

    public void texto() {
        this.Alga.setText(Integer.toString(this.algas));
        this.total = this.total + (this.algas * Integer.parseInt(this.AlgaP.getText()));
        this.Arroz.setText(Integer.toString(this.arroces));
        this.total = this.total + (this.arroces * Integer.parseInt(this.ArrozP.getText()));
        this.Salmon.setText(Integer.toString(this.salmones));
        if (this.salmones != 0) {
            this.total = this.total + (this.salmones * Integer.parseInt(this.SalmonP.getText()));
        }
        this.Queso.setText(Integer.toString(this.quesos));
        if (this.quesos != 0) {
            this.total = this.total + (this.quesos * Integer.parseInt(this.QuesoP.getText()));
        }
        this.Ajon.setText(Integer.toString(this.ajons));
        if (this.ajons != 0) {
            this.total = this.total + (this.ajons * Integer.parseInt(this.AjonP.getText()));
        }
        this.Pepino.setText(Integer.toString(this.pepis));
        if (this.pepis != 0) {
            this.total = this.total + (this.pepis * Integer.parseInt(this.PepinoP.getText()));
        }
        this.Masago.setText(Integer.toString(this.masas));
        if (this.masas != 0) {
            this.total = this.total + (this.masas * Integer.parseInt(this.MasagoP.getText()));
        }
        this.Atun.setText(Integer.toString(this.atuns));
        if (this.atuns != 0) {
            this.total = this.total + (this.atuns * Integer.parseInt(this.AtunP.getText()));
        }
        this.Dinamita.setText(Integer.toString(this.dinas));
        if (this.dinas != 0) {
            this.total = this.total + (this.dinas * Integer.parseInt(this.DinamitaP.getText()));
        }
        this.Langos.setText(Integer.toString(this.langos));
        if (this.langos != 0) {
            this.total = this.total + (this.langos * Integer.parseInt(this.LangosP.getText()));
        }
        this.Palmito.setText(Integer.toString(this.palmis));
        if (this.palmis != 0) {
            this.total = this.total + (this.palmis * Integer.parseInt(this.PalmitoP.getText()));
        }
        this.Agua.setText(Integer.toString(this.aguas));
        if (this.aguas != 0) {
            this.total = this.total + (this.aguas * Integer.parseInt(this.AguaP.getText()));
        }

        this.Dolares.setText(Integer.toString(this.total));
        int peso = this.total * 3130;
        this.Pesos.setText(Integer.toString(peso));
    }

    public void dia() {
        if (this.langos != 0) {
            this.dia = 10;
        } else if (this.palmis != 0) {
            this.dia = 8;
        } else {
            this.dia = 5;
        }
        this.Dias.setText(Integer.toString(this.dia));
    }

    public void calendario() {
        int randBetween = 2018 + (int) Math.round(Math.random() * (2019 - 2018));

        int year = randBetween;

        gc.set(gc.YEAR, year);

        randBetween = 1 + (int) Math.round(Math.random() * (gc.getActualMaximum(gc.DAY_OF_YEAR) - 1));

        int dayOfYear = randBetween;

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        String cadena = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));

        d = gc.get(gc.DAY_OF_MONTH) + 1;

        this.Fecha.setText(cadena);
    }

    public void avanzar() {
        this.dia = this.dia - 1;
        this.Dias.setText(Integer.toString(this.dia));
        if (this.dia != 0) {
            this.Aceptar.setText("Avanzar día");
        } else {
            this.Aceptar.setText("Finalizar");

        }

        String cadena = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + (d));
        d++;

        this.Fecha.setText(cadena);
    }
}
