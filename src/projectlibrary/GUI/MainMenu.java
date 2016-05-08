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
public class MainMenu extends javax.swing.JFrame {

    String status;
    String id;
    public MainMenu(String id,String status) {
        initComponents();
        this.status = status;
        this.id = id;
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
        info = new javax.swing.JButton();
        search = new javax.swing.JButton();
        backlog = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member");
        setResizable(false);

        jPanel1.setLayout(null);

        library.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        library.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Library System.png"))); // NOI18N
        jPanel1.add(library);
        library.setBounds(0, 0, 670, 108);

        info.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Information icon.png"))); // NOI18N
        info.setText("Check Information");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info);
        info.setBounds(10, 140, 263, 41);

        search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/book-icon.png"))); // NOI18N
        search.setText("Book Searching");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(300, 140, 231, 41);

        backlog.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backlog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notepad-icon.png"))); // NOI18N
        backlog.setText("Backlog");
        backlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlogActionPerformed(evt);
            }
        });
        jPanel1.add(backlog);
        backlog.setBounds(190, 250, 149, 41);

        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(230, 340, 93, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Library.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-50, -10, 610, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        dispose();
        BookSearching bs = new BookSearching(id,status);
        bs.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void backlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlogActionPerformed
        dispose();
        Backlog bl = new Backlog(id,status);
        bl.setVisible(true);
    }//GEN-LAST:event_backlogActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
         dispose();
        Information c = new Information(id,status);
        c.setVisible(true);
                            
    }//GEN-LAST:event_infoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backlog;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel library;
    private javax.swing.JButton logout;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
