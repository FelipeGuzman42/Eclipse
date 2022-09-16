package Empresa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class Cliente extends javax.swing.JFrame implements ActionListener {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pedido2 = new javax.swing.JTextField();
        Pedido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pedido3 = new javax.swing.JTextField();
        Pedido4 = new javax.swing.JTextField();
        Pedido5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BAceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        BDenegar = new javax.swing.JButton();
        Dolares = new javax.swing.JTextField();
        Pesos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CB1 = new javax.swing.JCheckBox();
        CB2 = new javax.swing.JCheckBox();
        CB3 = new javax.swing.JCheckBox();
        CB4 = new javax.swing.JCheckBox();
        CB5 = new javax.swing.JCheckBox();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CLIENTE");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Pedido 1:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Pedido 2:");

        Pedido2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pedido1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Pedido 3:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText("Pedido 4:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Pedido 5:");

        Pedido3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pedido4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pedido5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PEDIDOS CLIENTE");

        BAceptar.setForeground(new java.awt.Color(0, 255, 0));
        BAceptar.setText("Aceptar");

        Salir.setForeground(new java.awt.Color(255, 153, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        BDenegar.setForeground(new java.awt.Color(255, 0, 51));
        BDenegar.setText("Denegar");

        Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DolaresActionPerformed(evt);
            }
        });

        Pesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesosActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Dólares:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Pesos:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Entregado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BDenegar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pedido5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pedido4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pedido3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pedido2)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Pedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CB2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Pedido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CB1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Pedido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CB3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(Pedido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CB4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Pedido5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BAceptar)
                        .addComponent(BDenegar)
                        .addComponent(Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(Salir))
                .addGap(12, 12, 12))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DolaresActionPerformed

    private void PesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BDenegar;
    private javax.swing.JCheckBox CB1;
    private javax.swing.JCheckBox CB2;
    private javax.swing.JCheckBox CB3;
    private javax.swing.JCheckBox CB4;
    private javax.swing.JCheckBox CB5;
    private javax.swing.JTextField Dolares;
    private javax.swing.JTextField Pedido1;
    private javax.swing.JTextField Pedido2;
    private javax.swing.JTextField Pedido3;
    private javax.swing.JTextField Pedido4;
    private javax.swing.JTextField Pedido5;
    private javax.swing.JTextField Pesos;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String rutaProductos;
    private int opc1, opc2, opc3, opc4, opc5;
    private ArrayList<Integer> opciones;

    public static void main(String args[]) {
        new Cliente();
    }

    public Cliente() {
        initComponents();
        this.sintoniza();
        this.rutaProductos = "./Productos/productos.txt";
        this.verificaArchivo();
        
        opciones = new ArrayList<Integer>();
        this.pedirProductos();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    private void sintoniza() {
        this.BAceptar.addActionListener(this);
        this.BDenegar.addActionListener(this);
        this.Salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent op) {
        if (op.getSource() == this.BAceptar) {
            this.setVisible(false);
            
            new Proveedores(this, this.opciones);
            this.CB1.setSelected(true);
            this.CB2.setSelected(true);
            this.CB3.setSelected(true);
            this.CB4.setSelected(true);
            this.CB5.setSelected(true);
        }

        if (op.getSource() == this.BDenegar) {
            this.pedirProductos();
        }

        if (op.getSource() == this.Salir) {
            System.exit(0);
        }
    }

    private void verificaArchivo() {
        try {
            File filex = new File(this.rutaProductos);
            if (!filex.exists()) {
                filex.createNewFile();
            }
        } catch (IOException xxx) {
            //xxx.printStackTrace();
            //System.exit(1);
            JOptionPane.showMessageDialog(null, "Fallo encontrando la ruta");
        }
    }

    private void pedirProductos() {
        Random rand = new Random();
        this.opc1 = rand.nextInt((5 - 1) + 1) + 1;
        this.opc2 = rand.nextInt((5 - 1) + 1) + 1;
        this.opc3 = rand.nextInt((5 - 1) + 1) + 1;
        this.opc4 = rand.nextInt((5 - 1) + 1) + 1;
        this.opc5 = rand.nextInt((5 - 1) + 1) + 1;
        
        opciones.clear();
        opciones.add(this.opc1);
        opciones.add(this.opc2);
        opciones.add(this.opc3);
        opciones.add(this.opc4);
        opciones.add(this.opc5);
        this.ponerProductos();
    }

    private void ponerProductos() {
        FileReader fr;
        BufferedReader br;
        Producto prod = null;
        int total = 0;

        String registro;
        try {
            fr = new FileReader(this.rutaProductos);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(String.valueOf(this.opc1)))) {
                    prod = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                    total=total+prod.getPrec();
                    this.Pedido1.setText(prod.toString());
                }
                if ((campos[0].equals(String.valueOf(this.opc2)))) {
                    prod = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                    total=total+prod.getPrec();
                    this.Pedido2.setText(prod.toString());
                }
                if ((campos[0].equals(String.valueOf(this.opc3)))) {
                    prod = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                    total=total+prod.getPrec();
                    this.Pedido3.setText(prod.toString());
                }
                if ((campos[0].equals(String.valueOf(this.opc4)))) {
                    prod = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                    total=total+prod.getPrec();
                    this.Pedido4.setText(prod.toString());
                }
                if ((campos[0].equals(String.valueOf(this.opc5)))) {
                    prod = new Producto(campos[0], campos[1], Integer.parseInt(campos[2]));
                    total=total+prod.getPrec();
                    this.Pedido5.setText(prod.toString());
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo!");
        }
        this.Dolares.setText(Integer.toString(total));
        int peso = total*3130;
        this.Pesos.setText(Integer.toString(peso));
    }
}
