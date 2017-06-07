
package corsa;

/**
 * Pista è la finestra che contiene il percorso di gara
 * @author Andrea Vallorani
 */
public class Pista extends javax.swing.JFrame {
    
    int posizione1; 
    int posizione2; 
    int posizione3; 
    int posizione4; 
    int posizione5; 
    public Pista() {
        initComponents();
        posizione1 = this.icoCane1.getX();
        posizione1 = this.icoCane2.getX();
        posizione1 = this.icoCane3.getX();
        posizione1 = this.icoCane4.getX();
        posizione1 = this.icoCane5.getX();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        corsia1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icoCane1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bottoneAvvio = new javax.swing.JButton();
        statoGara = new javax.swing.JLabel();
        corsia4 = new javax.swing.JPanel();
        icoCane4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        corsia6 = new javax.swing.JPanel();
        icoCane5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        corsia12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        icoCane3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        corsia13 = new javax.swing.JPanel();
        icoCane2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        RIAVVIA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        corsia1.setBackground(new java.awt.Color(51, 51, 0));
        corsia1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setToolTipText("");
        corsia1.add(jLabel1);
        jLabel1.setBounds(430, 20, 10, 17);

        icoCane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/cane.gif"))); // NOI18N
        corsia1.add(icoCane1);
        icoCane1.setBounds(10, 0, 54, 50);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia1.add(jPanel1);
        jPanel1.setBounds(70, 0, 10, 50);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia1.add(jPanel6);
        jPanel6.setBounds(820, 0, 10, 50);

        bottoneAvvio.setBackground(new java.awt.Color(0, 204, 204));
        bottoneAvvio.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        bottoneAvvio.setText("VIA!");
        bottoneAvvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAvvioActionPerformed(evt);
            }
        });

        statoGara.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        statoGara.setText("Gara non ancora iniziata");

        corsia4.setBackground(new java.awt.Color(51, 51, 0));
        corsia4.setLayout(null);

        icoCane4.setBackground(new java.awt.Color(0, 0, 204));
        icoCane4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/cane.gif"))); // NOI18N
        corsia4.add(icoCane4);
        icoCane4.setBounds(10, 0, 54, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        corsia4.add(jLabel4);
        jLabel4.setBounds(430, 20, 10, 17);

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia4.add(jPanel4);
        jPanel4.setBounds(70, 0, 10, 50);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        corsia4.add(jPanel9);
        jPanel9.setBounds(820, 0, 10, 60);

        corsia6.setBackground(new java.awt.Color(51, 51, 0));
        corsia6.setLayout(null);

        icoCane5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/cane.gif"))); // NOI18N
        corsia6.add(icoCane5);
        icoCane5.setBounds(10, 0, 54, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");
        corsia6.add(jLabel6);
        jLabel6.setBounds(430, 20, 10, 17);

        jPanel5.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia6.add(jPanel5);
        jPanel5.setBounds(70, 0, 10, 50);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia6.add(jPanel10);
        jPanel10.setBounds(820, 0, 10, 50);

        corsia12.setBackground(new java.awt.Color(51, 51, 0));
        corsia12.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        corsia12.add(jLabel3);
        jLabel3.setBounds(430, 20, 10, 17);

        icoCane3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/cane.gif"))); // NOI18N
        corsia12.add(icoCane3);
        icoCane3.setBounds(10, 0, 55, 50);

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia12.add(jPanel3);
        jPanel3.setBounds(70, 0, 10, 50);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia12.add(jPanel8);
        jPanel8.setBounds(820, 0, 10, 50);

        corsia13.setBackground(new java.awt.Color(51, 51, 0));
        corsia13.setLayout(null);

        icoCane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/cane.gif"))); // NOI18N
        corsia13.add(icoCane2);
        icoCane2.setBounds(10, 0, 54, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        corsia13.add(jLabel2);
        jLabel2.setBounds(430, 20, 10, 17);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia13.add(jPanel2);
        jPanel2.setBounds(70, 0, 10, 50);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        corsia13.add(jPanel7);
        jPanel7.setBounds(820, 0, 10, 50);

        RIAVVIA.setBackground(new java.awt.Color(0, 204, 204));
        RIAVVIA.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        RIAVVIA.setText("RIAVVIA");
        RIAVVIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIAVVIAActionPerformed(evt);
            }
        });

        jLabel7.setText("1°");

        jLabel8.setText("3°");

        jLabel9.setText("2°");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(corsia6, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addComponent(corsia13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(corsia12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(corsia4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(corsia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statoGara, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(bottoneAvvio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(RIAVVIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(corsia1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statoGara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RIAVVIA)
                    .addComponent(bottoneAvvio)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAvvioActionPerformed
        Giudice giudice = new Giudice(this);
        giudice.start();
        this.bottoneAvvio.setEnabled(false);
    }//GEN-LAST:event_bottoneAvvioActionPerformed

    private void RIAVVIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIAVVIAActionPerformed
        this.icoCane1.setLocation(posizione1,this.icoCane1.getY());
        this.icoCane2.setLocation(posizione2,this.icoCane2.getY());
        this.icoCane3.setLocation(posizione3,this.icoCane3.getY());
        this.icoCane4.setLocation(posizione4,this.icoCane4.getY());
        this.icoCane5.setLocation(posizione5,this.icoCane5.getY());
        this.bottoneAvvio.setEnabled(true);
    }//GEN-LAST:event_RIAVVIAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RIAVVIA;
    private javax.swing.JButton bottoneAvvio;
    private javax.swing.JPanel corsia1;
    private javax.swing.JPanel corsia12;
    private javax.swing.JPanel corsia13;
    private javax.swing.JPanel corsia4;
    private javax.swing.JPanel corsia6;
    public javax.swing.JLabel icoCane1;
    public javax.swing.JLabel icoCane2;
    public javax.swing.JLabel icoCane3;
    public javax.swing.JLabel icoCane4;
    public javax.swing.JLabel icoCane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel statoGara;
    // End of variables declaration//GEN-END:variables
}
