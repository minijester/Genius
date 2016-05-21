/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;

/**
 *
 * @author Sae
 */
public class MainMenuAdmin extends SuperMenu {

    
    public MainMenuAdmin(String id,String status) {
        this.status = status;
        this.id = id;
        initComponents();
        this.setLocationRelativeTo(null);
	this.setResizable(false);
    }
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        library = new javax.swing.JLabel();
        infor = new javax.swing.JButton();
        bs = new javax.swing.JButton();
        bl = new javax.swing.JButton();
        ab = new javax.swing.JButton();
        burrow = new javax.swing.JButton();
        returnsys = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);

        jPanel1.setLayout(null);

        library.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        library.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Library Admin.png"))); // NOI18N
        jPanel1.add(library);
        library.setBounds(0, 0, 674, 90);

        infor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        infor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Information icon.png"))); // NOI18N
        infor.setText("Check Information");
        infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforActionPerformed(evt);
            }
        });
        jPanel1.add(infor);
        infor.setBounds(20, 130, 263, 41);

        bs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Book-searching icon.png"))); // NOI18N
        bs.setText("Book Searching");
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });
        jPanel1.add(bs);
        bs.setBounds(20, 210, 231, 41);

        bl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/notepad-icon.png"))); // NOI18N
        bl.setText("Backlog");
        bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blActionPerformed(evt);
            }
        });
        jPanel1.add(bl);
        bl.setBounds(20, 300, 149, 41);

        ab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/add-book-icon.png"))); // NOI18N
        ab.setText("Add Book");
        ab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abActionPerformed(evt);
            }
        });
        jPanel1.add(ab);
        ab.setBounds(340, 210, 169, 41);

        burrow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        burrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/borrow-icon.png"))); // NOI18N
        burrow.setText("Borrow System");
        burrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burrowActionPerformed(evt);
            }
        });
        jPanel1.add(burrow);
        burrow.setBounds(340, 130, 229, 41);

        returnsys.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        returnsys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Return-icon.png"))); // NOI18N
        returnsys.setText("Return System");
        returnsys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnsysActionPerformed(evt);
            }
        });
        jPanel1.add(returnsys);
        returnsys.setBounds(340, 300, 225, 41);

        logout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(240, 390, 113, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/LibraryBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-6, 0, 680, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        createNewLogin();
    }//GEN-LAST:event_logoutActionPerformed

    private void inforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforActionPerformed
        dispose();
        createInformation(status, id);
    }//GEN-LAST:event_inforActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
        dispose();
        createBookSearching(status, id);
    }//GEN-LAST:event_bsActionPerformed

    private void blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blActionPerformed
        dispose();
        createBacklog(status, id);
    }//GEN-LAST:event_blActionPerformed

    private void abActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abActionPerformed
        dispose();
        createAddbook(status, id);
    }//GEN-LAST:event_abActionPerformed

    private void burrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burrowActionPerformed
        dispose();
        createBurrow(status, id);
    }//GEN-LAST:event_burrowActionPerformed

    private void returnsysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnsysActionPerformed
        dispose();
        createReturn(status, id);
    }//GEN-LAST:event_returnsysActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ab;
    private javax.swing.JButton bl;
    private javax.swing.JButton bs;
    private javax.swing.JButton burrow;
    private javax.swing.JButton infor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel library;
    private javax.swing.JButton logout;
    private javax.swing.JButton returnsys;
    // End of variables declaration//GEN-END:variables

    @Override
    public void createMenu(String status, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
