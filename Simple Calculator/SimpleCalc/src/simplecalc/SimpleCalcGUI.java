/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.awt.Color;

/**
 *
 * @author Shivam Agrawal
 */
public class SimpleCalcGUI extends java.awt.Frame {

    /**
     * Creates new form SimpleCalcGUI
     */
    public SimpleCalcGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        button17 = new java.awt.Button();
        button18 = new java.awt.Button();
        button19 = new java.awt.Button();
        button20 = new java.awt.Button();
        label1 = new java.awt.Label();
        ans = new java.awt.Label();
        label3 = new java.awt.Label();

        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(350, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 102, 255));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button1.setBackground(new java.awt.Color(0, 255, 153));
        button1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button1.setLabel("7");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 255, 153));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button2.setLabel("8");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 255, 153));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button3.setLabel("9");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 255, 153));
        button4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button4.setLabel("6");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(0, 255, 153));
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button5.setLabel("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(0, 255, 153));
        button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button6.setLabel("4");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(0, 255, 153));
        button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button7.setLabel("3");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
        });
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(0, 255, 153));
        button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button8.setLabel("2");
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button8MouseExited(evt);
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(0, 255, 153));
        button9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button9.setLabel("1");
        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button9MouseExited(evt);
            }
        });
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(0, 255, 153));
        button10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        button10.setLabel("Exit");
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button10MouseExited(evt);
            }
        });
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(0, 255, 153));
        button11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button11.setLabel("0");
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button11MouseExited(evt);
            }
        });
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(0, 255, 153));
        button12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button12.setLabel("00");
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button12MouseExited(evt);
            }
        });
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setBackground(new java.awt.Color(0, 204, 204));
        button13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button13.setLabel("DEL");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button14.setBackground(new java.awt.Color(0, 204, 204));
        button14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button14.setLabel("AC");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        button15.setBackground(new java.awt.Color(0, 204, 204));
        button15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button15.setLabel("x");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        button16.setBackground(new java.awt.Color(0, 204, 204));
        button16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button16.setLabel("/");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        button17.setBackground(new java.awt.Color(0, 204, 204));
        button17.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        button17.setLabel("+");
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });

        button18.setBackground(new java.awt.Color(0, 204, 204));
        button18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button18.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        button18.setLabel("-");
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });

        button19.setBackground(new java.awt.Color(0, 204, 204));
        button19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button19.setLabel("Ans");
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });

        button20.setBackground(new java.awt.Color(0, 204, 204));
        button20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button20.setLabel("=");
        button20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                button20FocusLost(evt);
            }
        });
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setBackground(new java.awt.Color(0, 153, 153));

        ans.setBackground(new java.awt.Color(153, 255, 153));
        ans.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N

        label3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    
    void mouseEnt(java.awt.Button b)
    {
                Color c1=new Color(0,179,195);
                b.setBackground(c1);   
    }
    
    void mouseExit(java.awt.Button b)
    {
                Color c1=new Color(0,255,153);
                 b.setBackground(c1); 
    }
    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        mouseEnt(button1);   // TODO add your handling code here:
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        mouseExit(button1);         // TODO add your handling code here:
    }//GEN-LAST:event_button1MouseExited

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
        mouseEnt(button2);        // TODO add your handling code here:
    }//GEN-LAST:event_button2MouseEntered

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        mouseEnt(button3);        // TODO add your handling code here:
    }//GEN-LAST:event_button3MouseEntered

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        mouseEnt(button6);        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseEntered

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        mouseEnt(button5);        // TODO add your handling code here:
    }//GEN-LAST:event_button5MouseEntered

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        mouseEnt(button4);        // TODO add your handling code here:
    }//GEN-LAST:event_button4MouseEntered

    private void button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseEntered
        mouseEnt(button9);        // TODO add your handling code here:
    }//GEN-LAST:event_button9MouseEntered

    private void button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseEntered
        mouseEnt(button8);        // TODO add your handling code here:
    }//GEN-LAST:event_button8MouseEntered

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
        mouseEnt(button7);        // TODO add your handling code here:
    }//GEN-LAST:event_button7MouseEntered

    private void button12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseEntered
        mouseEnt(button12);        // TODO add your handling code here:
    }//GEN-LAST:event_button12MouseEntered

    private void button11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseEntered
        mouseEnt(button11);        // TODO add your handling code here:
    }//GEN-LAST:event_button11MouseEntered

    private void button10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseEntered
        mouseEnt(button10);        // TODO add your handling code here:
    }//GEN-LAST:event_button10MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
       mouseExit(button2);            // TODO add your handling code here:
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
       mouseExit(button3);            // TODO add your handling code here:
    }//GEN-LAST:event_button3MouseExited

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
       mouseExit(button6);        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseExited

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
       mouseExit(button5);        // TODO add your handling code here:
    }//GEN-LAST:event_button5MouseExited

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
       mouseExit(button4);        // TODO add your handling code here:
    }//GEN-LAST:event_button4MouseExited

    private void button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button9MouseExited
       mouseExit(button9);        // TODO add your handling code here:
    }//GEN-LAST:event_button9MouseExited

    private void button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseExited
       mouseExit(button8);        // TODO add your handling code here:
    }//GEN-LAST:event_button8MouseExited

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
       mouseExit(button7);        // TODO add your handling code here:
    }//GEN-LAST:event_button7MouseExited

    private void button12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseExited
       mouseExit(button12);        // TODO add your handling code here:
    }//GEN-LAST:event_button12MouseExited

    private void button11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseExited
       mouseExit(button11);        // TODO add your handling code here:
    }//GEN-LAST:event_button11MouseExited

    private void button10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseExited
       mouseExit(button10);        // TODO add your handling code here:
    }//GEN-LAST:event_button10MouseExited

String equa="";
int lans=0;
    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
equa=ans.getText();
int aa=SimpleCalc.cal(equa);
lans=aa;
equa="";
ans.setText(""+aa);
if(SimpleCalc.error){ans.setText("Limit exceed");
ans.setBackground(new java.awt.Color(255,153,153));  }     // TODO add your handling code here:
    }//GEN-LAST:event_button20ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        equa+='1';
        ans.setText(equa);
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        equa+='2';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        equa+='3';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        equa+='+';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button17ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        equa+='4';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        equa+='5';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        equa+='6';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        equa+='7';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        equa+='8';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        equa+='9';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        equa+='0';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        equa+="00";
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        equa+='*';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button15ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        equa+='/';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button16ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        equa+='-';
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button18ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        equa="";
        ans.setText("");   
        SimpleCalc.error=false;
        ans.setBackground(new java.awt.Color(153,255,153));// TODO add your handling code here:
    }//GEN-LAST:event_button14ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        equa+=lans;
        ans.setText(equa);        // TODO add your handling code here:
    }//GEN-LAST:event_button19ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        try{equa=equa.substring(0,equa.length()-1);
        ans.setText(equa);}catch(Exception e){ equa=""; ans.setText(equa); }       // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void button20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_button20FocusLost
        equa="";
        ans.setText("");   
        SimpleCalc.error=false;
        ans.setBackground(new java.awt.Color(153,255,153));        // TODO add your handling code here:
    }//GEN-LAST:event_button20FocusLost

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalcGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label ans;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button19;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}