/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa;

import java.awt.*;
import static java.lang.Math.*;
import java.time.Year;
import javax.swing.JPanel;
import java.util.Arrays;
import javax.swing.JOptionPane;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author legen
 */
public class NewJFrame extends javax.swing.JFrame implements Runnable {

    int maxX;
    int maxY;
    int flags = 0;
    int toaDoXTroChuotHienTai;
    int toaDoYTroChuotHienTai;
    Option option;
    boolean[][] maTranPixel;

    Point point1 = null;
    Point point2 = null;
    Point point3 = null;
    int bkLon, bkBe;

    int luaChon = 1;
    int chiSoMax;

    boolean[] netLien = {true, true, true, true, true, true, true, true}; //8 phan tu
    boolean[] netDut = {true, true, true, false, true, true, true, false};//8 phan tu
    boolean[] netChamGach = {true, true, false, true, false}; //5 phan tu
    boolean[] net2ChamGach = {true, true, true, false, true, false, true, false};//8 phan tu
    boolean[] muiTen;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {

        initComponents();

        toaDoXTroChuotHienTai = -1;
        toaDoYTroChuotHienTai = -1;
        option = Option.Diem;
        //jPanel1.getHeight() và jPanel1.getWidth() ko xài đc lúc này???
//        int chieuCaoMax;
//        chieuCaoMax = jPanel1.getHeight()/10;
//        int chieuRongMax;
//        chieuRongMax = jPanel1.getWidth()/10;
        System.out.println(jPanel1.getHeight());
        System.out.println(jPanel1.getWidth());
        maxX = jPanel1.getHeight() / 10 + 10;
        maxY = jPanel1.getWidth() / 10 + 10;
        maTranPixel = new boolean[maxY][maxX];
        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                maTranPixel[i][j] = false;
            }
        }
        //jPanel1 = new VeOPixel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);//To change body of generated methods, choose Tools | Templates.
                //        grphcs.setColor(Color.BLACK);
                //        grphcs.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
                grphcs.setColor(Color.RED);
                for(int i = 0; i < jPanel1.getWidth(); i+= 10){
                    for(int j = 0; j < jPanel1.getHeight(); j+=10){
                        grphcs.drawRect(i, j, 10, 10);
                        if(maTranPixel[i/10][j/10] == true){
                            grphcs.setColor(Color.GREEN);
                            grphcs.fillOval(i-3, j-3, 6, 6);
                            grphcs.setColor(Color.RED);
                        }
                    }
                }
                grphcs.setColor(Color.BLACK);
                int x = jPanel1.getWidth()/2;
                int y = jPanel1.getHeight()/2;
                grphcs.drawLine((x/10)*10+10, 0, (x/10)*10+10, jPanel1.getHeight());
                grphcs.drawLine(0, (y/10)*10+10, jPanel1.getWidth(),(y/10)*10+10 );
            }
        };
        jButtonDiem = new javax.swing.JButton();
        jButtonDuongThang = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonMuiTen = new javax.swing.JButton();
        jButtonHinhChuNhat = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bkmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bkmax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jButtonDiem.setText("Điểm");
        jButtonDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDiemMouseClicked(evt);
            }
        });
        jButtonDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiemActionPerformed(evt);
            }
        });

        jButtonDuongThang.setText("Đường thẳng");
        jButtonDuongThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDuongThangMouseClicked(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
        });
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButton1.setText("Nét đứt");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Nét chấm gạch");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Nét 2 chấm gạch");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButtonMuiTen.setText("Mũi tên");
        jButtonMuiTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMuiTenMouseClicked(evt);
            }
        });

        jButtonHinhChuNhat.setText("Hình chữ nhật");
        jButtonHinhChuNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHinhChuNhatMouseClicked(evt);
            }
        });
        jButtonHinhChuNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHinhChuNhatActionPerformed(evt);
            }
        });

        jButton4.setText("Hình Tròn");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Hình Elipse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel1.setText("BK Nhỏ:");

        bkmin.setText("0");

        jLabel2.setText("Bk Lớn");

        bkmax.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDuongThang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addComponent(bkmax))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bkmin))
                        .addComponent(jButtonMuiTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonHinhChuNhat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonReset)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDiem)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDuongThang)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMuiTen)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHinhChuNhat)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bkmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bkmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonDiemActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        toaDoXTroChuotHienTai = evt.getX();
        toaDoYTroChuotHienTai = evt.getY();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        switch (option) {
            case Reset:
                break;
            case Diem:
                point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                PutPixel(point1);
                point1 = null;
                break;
            case DuongThang:
                if (point1 == null) {
                    point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point1);

                } else {
                    point2 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point2);
                    VeDuongThangPhuongPhapDDA(point1, point2);
                    point1 = null;
                    point2 = null;
                }
                break;
            case HinhChuNhat:
                if (point1 == null) {
                    point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point1);

                } else {
                    point2 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point2);
                    VeHinhChuNhat(point1, point2);
                    point1 = null;
                    point2 = null;
                }
                break;
            case MuiTen:
                if (point1 == null) {
                    point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point1);

                } else {
                    point2 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point2);
                    VeMuiTen(point1, point2);
                    point1 = null;
                    point2 = null;
                }
                break;
            case HinhTron:
                if (point1 == null) {
                    point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point1);

                } else {
                    point2 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                    PutPixel(point2);
                    VeHinhTronBresenham(point1, point2);
                    point1 = null;
                    point2 = null;
                }
                break;
            case HinhEplipse:

                point1 = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
                PutPixel(point1);
                VeHinhEplipse(point1, bkLon, bkBe);

                break;

        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
        // TODO add your handling code here:
//        option = Option.Reset;
//        for (int i = 0; i < maxY; i += 10) {
//            for (int j = 0; j < maxX; j += 10) {
//                maTranPixel[i/10][j/10] = false;
//            }
//        }
    }//GEN-LAST:event_jButtonResetMouseClicked

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.Reset;

        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                maTranPixel[i][j] = false;
            }
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDiemMouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.Diem;
    }//GEN-LAST:event_jButtonDiemMouseClicked

    private void jButtonDuongThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDuongThangMouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.DuongThang;
        luaChon = 1;
    }//GEN-LAST:event_jButtonDuongThangMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.DuongThang;
        luaChon = 2;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.DuongThang;
        luaChon = 3;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.DuongThang;
        luaChon = 4;
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButtonHinhChuNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHinhChuNhatMouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.HinhChuNhat;
    }//GEN-LAST:event_jButtonHinhChuNhatMouseClicked

    private void jButtonHinhChuNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHinhChuNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHinhChuNhatActionPerformed

    private void jButtonMuiTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMuiTenMouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;

        option = Option.MuiTen;
    }//GEN-LAST:event_jButtonMuiTenMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;
        option = Option.HinhTron;
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        point1 = null;
        point2 = null;
        bkBe = Integer.parseInt(bkmin.getText()) * 10;
        bkLon = Integer.parseInt(bkmax.getText()) * 10;
        if (bkLon > 0 && bkBe > 0) {
            if (bkBe > bkLon) {
                JOptionPane.showMessageDialog(rootPane, "Bán kính bé của bạn lớn hơn bán kính lớn!!");
            } else {
                option = Option.HinhEplipse;
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập bán kính!!");
        }


    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        NewJFrame main = new NewJFrame();
        main.setVisible(true);
        new Thread((Runnable) main).start();

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //hàm main ban đầu
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            
//            public void run() {
//                new NewJFrame().setVisible(true);     
//                
//            }
//        });
    }

    @Override
    public void run() {
        while (true) {
            jPanel1.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkmax;
    private javax.swing.JTextField bkmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonDiem;
    private javax.swing.JButton jButtonDuongThang;
    private javax.swing.JButton jButtonHinhChuNhat;
    private javax.swing.JButton jButtonMuiTen;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    //cái này để hiện ra hàm override, customize code ở trong phần design nó ngu nó ko tự hiện
    public class VeOPixel extends JPanel {

        @Override
        protected void paintComponent(Graphics grphcs) {
            
        }

    }

    enum Option {
        Diem,
        DuongThang,
        Reset,
        HinhChuNhat,
        MuiTen,
        HinhTron,
        HinhEplipse
    }

    public class Point {

        public int toaDoX;
        public int toaDoY;
    }

    //hàm làm tròn để xác định điểm muốn vẽ trên ma trận pixel
    public Point LamTronDiem(int x, int y) {
        Point point = new Point();
        if (x % 10 >= 5) {
            x = (x / 10) * 10 + 10;
        } else {
            x = (x / 10) * 10;
        }
        if (y % 10 >= 5) {
            y = (y / 10) * 10 + 10;
        } else {
            y = (y / 10) * 10;
        }
        point.toaDoX = x;
        point.toaDoY = y;
        return point;
    }

    public void PutPixel(Point point) {
        maTranPixel[point.toaDoX / 10][point.toaDoY / 10] = true;
    }

    public void VeDuongThangPhuongPhapDDA(Point point1, Point point2) {
        //khoi tao dx va dy
        int Dx = abs(point1.toaDoX - point2.toaDoX);
        int Dy = abs(point1.toaDoY - point2.toaDoY);
        //khoi tao diem sinh ke tiep co toa do xTemp va yTemp
        float xTemp;
        float yTemp;
        //khoi tao 1 bien tam kieu point de ve pixel vi ham pixel tham so truyen vao la 1 point
        Point pTemp;
        float m;     // he so goc m
        boolean[] netVe = new boolean[8]; // khoi tao bien tam netVe de luu tru mang ve cac net tuy truong hop (co 4 truong hop) // xem vong switch o duoi se hieu
        int n = -1; //so phan tu se chay
        switch (luaChon) {
            case 1:
                netVe = netLien;
                n = 8;
                break;
            case 2:
                netVe = netDut;
                n = 8;
                break;
            case 3:
                netVe = netChamGach;
                n = 5;
                break;
            case 4:
                netVe = net2ChamGach;
                n = 8;
                break;
        }

        //bat dau thuat toan dda
        //neu dx >= dy thi x++ (trong bai cua minh thi phai x+=10 boi vi 1 o pixel co don vi la 10x10),
        // y tinh theo x, neu dy < dx thi y++ (y+=10), x tinh theo y
        if (Dx >= Dy) {
            //boi vi la x++ và xTemp se giu gia tri cua point 1 nen phai luon chac chan rang point 1 có toa do X lon hon toa do X cua point 2
            if (point1.toaDoX > point2.toaDoX) {
                SwapPoint(point1, point2);
                flags = 1;
            }
            //xTemp và yTemp giu gia tri cua point 1
            xTemp = point1.toaDoX;
            yTemp = point1.toaDoY;
            //tinh he so goc m
            m = (float) Dy / Dx;
            int i = 0;//khoi tao bien chay i de chay mang netVe, neu i = n thi cho i = 0 lai
            //vong while de sinh diem tiep theo
            while (xTemp < point2.toaDoX) {
                xTemp += 10; // tang x len
                i++; // tang i len
                if (i == n) {
                    i = 0;
                }
                //tinh y theo x
                //neu ma y1 ma nho hon y2 (tuong tuong y1 nam tren y2 trong ma tran o pixel) thi yTemp phai dan dan di chuyen xuong (yTemp += m), nguoc lai thi yTemp -= m
                if (point1.toaDoY < point2.toaDoY) {
                    yTemp += m * 10;
                } else {
                    yTemp -= m * 10;
                }
                //de pTemp giu gia tri xTemp va yTemp de ve, co giai thich luc khoi tao bien pTemp roi 
                pTemp = LamTronDiem((int) xTemp, (int) yTemp);
                //Tuy theo net ve, o do la true moi put pixel, ko thi thoi
                if (netVe[i] == true) {
                    PutPixel(pTemp);

                }
            }
        } else {
            if (point1.toaDoY > point2.toaDoY) {
                SwapPoint(point1, point2);
                flags = 1;
            }
            xTemp = point1.toaDoX;
            yTemp = point1.toaDoY;
            m = (float) Dx / Dy;
            int i = 0;
            while (yTemp < point2.toaDoY) {
                yTemp += 10;
                n++;
                if (point1.toaDoX < point2.toaDoX) {
                    xTemp += m * 10;
                } else {
                    xTemp -= m * 10;
                }
                pTemp = LamTronDiem((int) xTemp, (int) yTemp);
                if (netVe[i] == true) {
                    PutPixel(pTemp);
                }
            }
        }
        if (flags == 1) {
            SwapPoint(point1, point2);
            flags = 0;
        }
    }

    public void VeHinhChuNhat(Point point1, Point point2) {
        Point point3 = new Point(); // Khai bao diem thu nhat cua duong cheo con lai
        Point point4 = new Point(); // Khai bao diem thu hai cua duong cheo con lai   
        // Tim toa do 2 diem cua duong cheo con lai dua vao 2 diem của đường chéo thứ nhát
        point3.toaDoX = point2.toaDoX;
        point3.toaDoY = point1.toaDoY;
        point4.toaDoX = point1.toaDoX;
        point4.toaDoY = point2.toaDoY;
        PutPixel(point3);
        PutPixel(point4);
        // Vẽ bốn đường thẳng nối các điểm với nhau tạo thành hình chữ nhật     
        VeDuongThangPhuongPhapDDA(point1, point3);
        VeDuongThangPhuongPhapDDA(point4, point1);
        VeDuongThangPhuongPhapDDA(point4, point2);
        VeDuongThangPhuongPhapDDA(point3, point2);
    }

    public void VeMuiTen(Point point1, Point point2) {
        VeDuongThangPhuongPhapDDA(point1, point2); // Vẽ đường thẳng chưa có mũi tên
        Point point3 = new Point(); // Khai báo điểm thứ nhất của mũi tên
        Point point4 = new Point(); // Khai báo điểm thứ 2 của mũi tên
        if (point1.toaDoY == point2.toaDoY) { // Trường hợp mũi tên nằm ngang
            if (point2.toaDoX > point1.toaDoX) { // Mũi tên theo chiều từ trái sang
                // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                point3.toaDoX = point2.toaDoX - 20;
                point3.toaDoY = point2.toaDoY + 20;
                point4.toaDoX = point2.toaDoX - 20;
                point4.toaDoY = point2.toaDoY - 20;
            } else { // Mũi tên theo chiều từ phải sang
                // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                point3.toaDoX = point2.toaDoX + 20;
                point3.toaDoY = point2.toaDoY + 20;
                point4.toaDoX = point2.toaDoX + 20;
                point4.toaDoY = point2.toaDoY - 20;
            }
        }

        if (point1.toaDoX == point2.toaDoX) { //Trường hợp mũi tên thẳng đứng
            if (point1.toaDoY > point2.toaDoY) { // Mũi tên từ trên xuống
                // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                point3.toaDoX = point2.toaDoX - 20;
                point3.toaDoY = point2.toaDoY + 20;
                point4.toaDoX = point2.toaDoX + 20;
                point4.toaDoY = point2.toaDoY + 20;
            } else {// Mũi tên từ dưới lên
                // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                point3.toaDoX = point2.toaDoX - 20;
                point3.toaDoY = point2.toaDoY - 20;
                point4.toaDoX = point2.toaDoX + 20;
                point4.toaDoY = point2.toaDoY - 20;
            }
        }

        if (point1.toaDoX != point2.toaDoX && point1.toaDoY != point2.toaDoY) { //Trường hợp mũi tên chéo

            if (point1.toaDoX > point2.toaDoX) { //Mũi tên từ phải sang
                if (point1.toaDoY < point2.toaDoY) { // Mũi tên từ dưới lên
                    // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                    point3.toaDoX = point2.toaDoX + 20;
                    point3.toaDoY = point2.toaDoY;
                    point4.toaDoX = point2.toaDoX;
                    point4.toaDoY = point2.toaDoY - 20;
                } else { // Mũi tên từ trên xuống
                    // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                    point3.toaDoX = point2.toaDoX;
                    point3.toaDoY = point2.toaDoY + 20;
                    point4.toaDoX = point2.toaDoX + 20;
                    point4.toaDoY = point2.toaDoY;
                }
            } else { // Mũi tên từ trái sang
                if (point1.toaDoY < point2.toaDoY) { // Mũi tên từ dưới lên
                    // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                    point3.toaDoX = point2.toaDoX - 20;
                    point3.toaDoY = point2.toaDoY;
                    point4.toaDoX = point2.toaDoX;
                    point4.toaDoY = point2.toaDoY - 20;
                } else { //Mũi tên từ trên xuống
                    // Tìm toạ độ 2 điểm của mũi tên dựa vào điểm cuối của đường thẳng đã vẽ
                    point3.toaDoX = point2.toaDoX;
                    point3.toaDoY = point2.toaDoY + 20;
                    point4.toaDoX = point2.toaDoX - 20;
                    point4.toaDoY = point2.toaDoY;
                }
            }
        }
        PutPixel(point3);
        PutPixel(point4);
        VeDuongThangPhuongPhapDDA(point2, point3);// Vẽ đường thẳng từ điểm cuối đến điểm thứ nhất của mũi tên 
        VeDuongThangPhuongPhapDDA(point2, point4);// Vẽ đường thẳng từ điểm cuối đến điểm thứ hai của mũi tên
    }

    public void SwapPoint(Point point1, Point point2) {
        int xTemp;
        int yTemp;
        xTemp = point1.toaDoX;
        yTemp = point1.toaDoY;
        point1.toaDoX = point2.toaDoX;
        point1.toaDoY = point2.toaDoY;
        point2.toaDoX = xTemp;
        point2.toaDoY = yTemp;
    }

    public void VeHinhTronBresenham(Point point1, Point point2) {

        /*
        B1: Chọn điểm cần vẽ(x,y) = (0,R), tính P = 3-2R (P đầu tiên)
        B2: Vẽ điểm (x,y) // vẽ 8 điểm
        B3: x=x+1
        B4: Nếu P<0 : P=P+4x+6
            Ngược lại: y=y-1;
                        P = P +4(x-y) + 10
        B5: Nếu x<= y: Quay lại 2
            Ngược lại: Kết thúc
         */
        int x = point2.toaDoX - point1.toaDoX;
        int y = point2.toaDoY - point1.toaDoY;
        int r = (int) sqrt(pow(x, 2) + pow(y, 2)); // tính bán kính của đường tròn
        int p = 3 - 2 * r; // p đầu tiên 
        point2.toaDoX = 0; // vẽ 1 cung tại tâm đương tròn
        point2.toaDoY = r;  // với bán kính bằng r

        while (point2.toaDoX <= point2.toaDoY) {
            Ve8DiemDoiXung(point1, point2);
            point2.toaDoX++;
            if (p < 0) {
                p = p + 4 * (point2.toaDoX) + 6;
            } else {
                point2.toaDoY--;
                p = p + 4 * (point2.toaDoX - point2.toaDoY) + 10;
            }
        }

    }

    public void Ve8DiemDoiXung(Point point1, Point point2) {
        int xc = point1.toaDoX;
        int yc = point1.toaDoY;
        int x = point2.toaDoX;
        int y = point2.toaDoY;

        Point p1, p2, p3, p4, p5, p6, p7, p8; // chọn 8 đối xứng điểm để hiện lên 

        p1 = LamTronDiem(x + xc, y + yc);    // Cộng 1 độ dời xc từ tâm đến điểm cần vẽ
        p2 = LamTronDiem(y + xc, x + yc);
        p3 = LamTronDiem(y + xc, -x + yc);
        p4 = LamTronDiem(x + xc, -y + yc);
        p5 = LamTronDiem(-x + xc, -y + yc);
        p6 = LamTronDiem(-y + xc, -x + yc);
        p7 = LamTronDiem(-y + xc, x + yc);
        p8 = LamTronDiem(-x + xc, y + yc);

        PutPixel(p1); // hiện các điểm đối xứng
        PutPixel(p2);
        PutPixel(p3);
        PutPixel(p4);
        PutPixel(p5);
        PutPixel(p6);
        PutPixel(p7);
        PutPixel(p8);

    }

    public void VeHinhEplipse(Point point1, int bkLon, int bkBe) {
        point2 = new Point();
        point3 = new Point();
        point2.toaDoX = point1.toaDoX;
        point2.toaDoY = point1.toaDoY - bkBe;

        point3.toaDoX = point1.toaDoX + bkLon;
        point3.toaDoY = point1.toaDoY;

        int a1 = point3.toaDoX - point1.toaDoX;
        int a3 = point3.toaDoY - point1.toaDoY;
        int b1 = point2.toaDoX - point1.toaDoX;
        int b3 = point2.toaDoY - point1.toaDoY;

        int a = (int) sqrt(pow(a1, 2) + pow(a3, 2)); // ban kinh lon
        int b = (int) sqrt(pow(b1, 2) + pow(b3, 2)); // ban kinh be

        int a2 = (int) pow(a, 2);
        int b2 = (int) pow(b, 2);
        point2.toaDoX = 0;
        point2.toaDoY = b;
        int fx = 0;
        int fy = 2 * a2 * point2.toaDoY;
        Ve4Diem(point1, point2);

        int p = (int) (b2 - a2 * b + a2 / 4);
        while (fx < fy) {
            point2.toaDoX++;
            fx += 2 * b2;
            if (p < 0) {
                p += b2 * (2 * point2.toaDoX + 3);
            } else {
                point2.toaDoY--;
                p += b2 * (2 * point2.toaDoX + 3) + a2 * (2 - 2 * point2.toaDoY);
                fy -= 2 * a2;
            }
            Ve4Diem(point1, point2);
        }

        p = (int) (b2 * (point2.toaDoX + 1 / 2) * (point2.toaDoX + 1 / 2) + a2 * (point2.toaDoY - 1) * (point2.toaDoY - 1) - a2 * b2);
        while (point2.toaDoY > 0) {
            point2.toaDoY--;
            fy -= 2 * a2;
            if (p >= 0) {
                p += a2 * (3 - 2 * point2.toaDoY);
            } else {
                point2.toaDoX++;
                fx += 2 * b2;
                p += b2 * (2 * point2.toaDoX + 2) + a2 * (3 - 2 * point2.toaDoY);
            }
            Ve4Diem(point1, point2);
        }
    }

    public void Ve4Diem(Point point1, Point point2) {
        int xc = point1.toaDoX;
        int yc = point1.toaDoY;
        int x = point2.toaDoX;
        int y = point2.toaDoY;
        Point p1, p2, p3, p4; //  
        p1 = LamTronDiem(x + xc, y + yc);    // Cộng 1 độ dời xc từ tâm đến điểm cần vẽ
        p2 = LamTronDiem(-x + xc, y + yc);
        p3 = LamTronDiem(+x + xc, -y + yc);
        p4 = LamTronDiem(-x + xc, -y + yc);
        PutPixel(p1); // hiện các điểm 
        PutPixel(p2);
        PutPixel(p3);
        PutPixel(p4);

    }

}
