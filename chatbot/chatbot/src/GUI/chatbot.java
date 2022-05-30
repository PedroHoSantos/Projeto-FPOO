/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SENAI
 */
public class chatbot extends javax.swing.JFrame {

    /**
     * Creates new form chatbot
     */
    public chatbot() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
                     areaConversa.append("\n Bot: Olá, aqui é o abrakadabra, quanto gostaria de pagar? \n-");
                     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaConversa = new javax.swing.JTextArea();
        txtFrase = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBot Abrakadabra");

        jPanel1.setBackground(new java.awt.Color(222, 98, 98));

        jPanel2.setBackground(new java.awt.Color(255, 184, 140));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 184, 140));
        jLabel2.setFont(new java.awt.Font("Miriam Libre", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ABRAKADABRA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areaConversa.setEditable(false);
        areaConversa.setBackground(new java.awt.Color(245, 224, 211));
        areaConversa.setColumns(20);
        areaConversa.setLineWrap(true);
        areaConversa.setRows(5);
        areaConversa.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaConversa);

        txtFrase.setBackground(new java.awt.Color(245, 224, 211));
        txtFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFraseActionPerformed(evt);
            }
        });

        enviar.setBackground(new java.awt.Color(77, 59, 59));
        enviar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(77, 59, 59));
        enviar.setText("ENVIAR");
        enviar.setOpaque(true);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        lista.setBackground(new java.awt.Color(245, 224, 211));
        lista.setColumns(20);
        lista.setLineWrap(true);
        lista.setRows(3);
        lista.setTabSize(5);
        lista.setWrapStyleWord(true);
        jScrollPane2.setViewportView(lista);

        jButton2.setBackground(new java.awt.Color(77, 59, 59));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(77, 59, 59));
        jButton2.setText("REFAZER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );

        jMenu1.setText("Ficheiro");

        jMenuItem1.setText("Nova Conversa");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
      if(txtFrase.getText().contains("refazer")){
          reset();
          txtFrase.setText("");
      }else{
        String[] split = areaConversa.getText().split("-");
       
      
areaConversa.append("\n Você:"+txtFrase.getText()+" \n-");
System.out.print(split.length );

        try {
            mensagemUsuario(txtFrase.getText(),split.length);
        } catch (IOException ex) {
            Logger.getLogger(chatbot.class.getName()).log(Level.SEVERE, null, ex);
        }
   txtFrase.setText("");
      }
    }//GEN-LAST:event_enviarActionPerformed

    private void txtFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFraseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();

        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void reset(){
        areaConversa.setText("");
        lista.setText("");
        areaConversa.append("\n Bot: Olá, aqui é o abrakadabra, quanto gostaria de pagar? \n-");
    }
    public void mensagemUsuario(String msg,int numMsg) throws IOException{
      String[] pizza2 = {"Pizza de Calabresa - 30.00 - Pizza 2", "Pizza 4 queijos - 35.50 - Pizza 2","Pizza Portuguesa - 31.50 - Pizza 2","Pizza Margerita - 30.00 - Pizza 2","Pizza de Strogonoff - 37.50 - Pizza 2","Pizza Brocolis com bacon - 32.50 - Pizza 2","Pizza de Atum - 30.00 - Pizza 2" };
      String[] portalDaPizza = {"Pizza de Calabresa - 32.00 - Porta da Pizza", "Pizza 4 queijos - 39.50 - Porta da Pizza","Pizza Portuguesa - 33.50 - Porta da Pizza","Pizza Salmão - 32.00 - Porta da Pizza","Pizza de Chocolate - 39.50 - Porta da Pizza","Pizza Brocolis com bacon - 34.50 - Porta da Pizza","Pizza de Atum - 32.00 - Porta da Pizza" };
      
      String[] esfihasiria = {"Esfiha de Calabresa - 10.00 - Esfihas Siria", "Esfiha de Carne - 8.00 - Esfihas Siria", "Esfiha de Queijo - 10.00 - Esfihas Siria "};
      String[] alakazan = {"Esfiha de Calabresa - 4.00 - Alakazan", "Esfiha de carne - 5.00 - Alakazan","Esfiha de queijo - 3.00 - Alakazan" };
      String[][] restaurantes = {pizza2, portalDaPizza, alakazan, esfihasiria};
      
     
      switch(numMsg){
            case 1:
                
           areaConversa.append("\n Bot: O que gostaria de comer? \n-");
 lista.append("\n Valor: "+msg+"\n-");

                break;
            case 3:                 
   

                lista.append("\n Pedido: "+msg+"\n");
                areaConversa.append("\n Aguarde enquanto computamos suas opções...\n");
                                

               
                double valor = 0;
                try{
                    valor = Double.parseDouble(lista.getText().split("-")[0].split("Valor: ")[1]);
                }catch(Exception e){
                    areaConversa.append("\n Por favor, refaça o pedido com um valor válido. Envie 'refazer' para refazer.\n");
                    break;
                }
                 areaConversa.append("\n tudo certo \n");
                 
                 ArrayList<String> possiveis = new ArrayList<String>();
                 double valorRestaurantes = 0;
              

                 String comidaRestaurantes = "";
                 for(int i = 0; i<restaurantes.length;i++ ){
                     for(int o = 0; o<restaurantes[i].length;o++ ){
                         valorRestaurantes = Double.parseDouble(restaurantes[i][o].split(" - ")[1]);
                         comidaRestaurantes = restaurantes[i][o].split(" - ")[0];
                         comidaRestaurantes = comidaRestaurantes.toLowerCase();
                         if(comidaRestaurantes.contains(msg) && valorRestaurantes <= valor){
                               possiveis.add(restaurantes[i][o]);
                         } 
                     }
                 }
                 areaConversa.append("\n Opções possíveis: "+possiveis.size()+" \n");

                 for(int p = 0;p<possiveis.size();p++){
                    areaConversa.append("\n "+possiveis.get(p)+" \n");
 
                 }
                break;

                
          
        }
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatbot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaConversa;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea lista;
    private javax.swing.JTextField txtFrase;
    // End of variables declaration//GEN-END:variables
}
