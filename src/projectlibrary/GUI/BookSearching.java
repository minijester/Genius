/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary.GUI;


import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectlibrary.database.dbBookSearching;

/**
 *
 * @author Sae
 */
public class BookSearching extends SuperMenu {
    DefaultTableModel dm;
    dbBookSearching bs = new dbBookSearching();
    
    public BookSearching(String id,String status) {
        this.status = status;
        this.id = id;
        initComponents();
        jPanel1.setVisible(false);
        createColumns();
    }
    
    @Override
    public void createMenu(String status, String id) {
        if(status.equals("Member")){
            MainMenu member = new MainMenu(id,status);
            member.setVisible(true);
        }
        else{
            MainMenuAdmin mainad = new MainMenuAdmin(id,status);
            mainad.setVisible(true);
        }
    }
    
    private void createColumns(){
        dm = (DefaultTableModel) table.getModel();
        dm.addColumn("ISBN");
        dm.addColumn("Book Name");
        dm.addColumn("Author");
    }
    
    private void poppulate(String isbn, String bookname, String author){
        String[] rowdata = {isbn,bookname,author};
        dm.addRow(rowdata);  
    }

    
    public boolean isISBN(){
        boolean keyinputisint = false;
        int isbn;
        try {
            isbn = Integer.parseInt(keysearch.getText());
            keyinputisint = true;
            }   catch (NumberFormatException e) {  
                }
        //if(!keysearch.getText().isEmpty()) && keysearch.getText().equalsInteger.parseInt(keysearch.getText(){
        //keyinput = true;
        //}
        return keyinputisint;
    }
    
    // check search option from combobox
    public String checkOption(){
        String option = selectSearchMethod.getSelectedItem().toString();
        return option;
    }
    
    public void search(){
        
        if(keysearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please insert key in the box");
        }
        else{
            switch (checkOption()) {
                case "ISBN":
                    ArrayList<HashMap> listISBN = bs.searchISBN(keysearch.getText());
                    
                    if(listISBN.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                    }
                    else{
                        for(HashMap l : listISBN){
                            jPanel1.setVisible(true);
                            if(l.get("ISBN").equals(keysearch.getText())){
                                poppulate(l.get("ISBN").toString(), l.get("Title").toString(), l.get("Authors").toString());
                                break;
                            }
                        }
                    }
                    
                    break;
                    
                case "Book name":
                    ArrayList<HashMap> listBookName = bs.searchBookName(keysearch.getText());
                    if(listBookName.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                    }
                    else{
                        for(HashMap l : listBookName){
                            jPanel1.setVisible(true);
                            if(l.get("Title").equals(keysearch.getText())){
                                poppulate(l.get("ISBN").toString(), l.get("Title").toString(), l.get("Authors").toString());
                                break;
                            }
                        }
                    }
                    break;
                    
                default:
                    ArrayList<HashMap> listAuthors = bs.searchAuthor(keysearch.getText());
                    if(listAuthors.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                    }
                    else{
                        for(HashMap l : listAuthors){
                            jPanel1.setVisible(true);
                            if(l.get("Authors").equals(keysearch.getText())){
                                poppulate(l.get("ISBN").toString(), l.get("Title").toString(), l.get("Authors").toString());
                                break;
                            }
                        }
                    }
                    
                    break;
            }
        }
        dbBookSearching.disconnect();
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        keysearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        booksearch = new javax.swing.JLabel();
        main = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        selectSearchMethod = new javax.swing.JComboBox<>();
        searchBy = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Searching");
        setResizable(false);

        keysearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                keysearchMousePressed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        booksearch.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        booksearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booksearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectlibrary/GUI/img/Book search.png"))); // NOI18N

        main.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        main.setText("Main Menu");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(clear)
                .addContainerGap())
        );

        selectSearchMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "BookName", "Author" }));

        searchBy.setText("Search by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(main))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(keysearch, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectSearchMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(searchBy)
                                .addGap(11, 11, 11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(booksearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keysearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(searchBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectSearchMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(main)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        dispose();
        createMenu(status, id);
    }//GEN-LAST:event_mainActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        search();
        /**
        CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me","3306","CSC105_G1","CSC105_G1","CSC105_G1");
        db.connect();
        // check if input is int so it will be only ISBN
        if(keysearch.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Please insert key in the box");
        }
        else{
            if(isISBN()){
                String sql = "SELECT * FROM LibraryBook WHERE ISBN = '"+ keysearch.getText()+ "'";
                ArrayList<HashMap> list = db.queryRows(sql);
                boolean delSuccess = db.executeQuery(sql);
                if(list.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                }
                else{
                    for(HashMap l : list){
                        jPanel1.setVisible(true);
                        if(l.get("ISBN").equals(keysearch.getText())){
                            poppulate(l.get("ISBN").toString(), l.get("Title").toString(), l.get("Authors").toString());
                            break;
                        }
                    }
                }
            db.disconnect();
          }
            else{
                String sql2 = "SELECT * FROM LibraryBook WHERE Title = '"+ keysearch.getText()+ "'";
                ArrayList<HashMap> list2 = db.queryRows(sql2);
                System.out.println(list2);
                boolean delSuccess2 = db.executeQuery(sql2);
                if(list2.isEmpty()){
                    //JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                    String sql3 = "SELECT * FROM LibraryBook WHERE Authors = '"+ keysearch.getText()+ "'";
                    ArrayList<HashMap> list3 = db.queryRows(sql3);
                    System.out.println(list3);
                    boolean delSuccess3 = db.executeQuery(sql3);

                    if(list3.isEmpty()){
                        JOptionPane.showMessageDialog(rootPane, "Sorry, we don't has this book in this Library");
                    }
                    else{
                        if(list3.size() >= table.getRowCount()){
                            // add row
                        }
                        for(HashMap l : list3){
                            jPanel1.setVisible(true);
                            if(l.get("Authors").equals(keysearch.getText())){
                                poppulate(l.get("ISBN").toString(), l.get("Title").toString(), l.get("Authors").toString());
                                break;
                            }
                        }
                    }
                }
                else{
                    for(HashMap l : list2){
                        jPanel1.setVisible(true);
                        if(l.get("Title").equals(keysearch.getText())){
                            table.setValueAt(l.get("Title"), 0, 0);
                            table.setValueAt(l.get("ISBN"), 0, 1);
                            table.setValueAt(l.get("Authors"), 0, 2);                      
                            break;
                        }
                    }
                }
            db.disconnect();
            }
        }*/
    }//GEN-LAST:event_searchActionPerformed

    private void keysearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keysearchMousePressed
        keysearch.setText(null);
    }//GEN-LAST:event_keysearchMousePressed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        table.setValueAt(null, 0, 0);
        table.setValueAt(null, 0, 1);
        table.setValueAt(null, 0, 2);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_clearActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booksearch;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keysearch;
    private javax.swing.JButton main;
    private javax.swing.JButton search;
    private javax.swing.JLabel searchBy;
    private javax.swing.JComboBox<String> selectSearchMethod;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
