package examen1_claudiacortes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Claudia Cortes
 */
public class Principal extends javax.swing.JFrame {

    /*CIFRADO DE CESAR SUMAR   A CADA POSICION
    DESCIFRADO DE CESRA RESTAR 3 A CADA POSICION*/
    /**
     * Creates new form Principal
     */
     private Personas KIM =new Personas("KIM",15,1,"F","Casada","Propietaria"); 
    private static Random Ran = new Random();
    private ArrayList<Personas> R=new ArrayList();
    public Principal() {
        
        initComponents();
        R.add(KIM);
         TF_Salario.enable(false);
           // bandera = false;
            TF_Salario.enable(false);//
            CB_Familiares.enable(false);
            TF_Horario1.enable(false);//
           TF_Salario.enable(false);
            TF_tiempoT1.enable(false);//
            tf_altura.enable(false);
            tf_peso.enable(false);
          //  tf_edad.enable(false);
           // tf_edad.enable(false);
            ocupacion.enable(true);//
            tf_trabajo.enable(false);
       // String Encriptado= EncriptadoCesar("HOLA",4);
        //CifradoVigenere CV=new CifradoVigenere(Encriptado,"ABC");
        //Encriptado=CV.Cifrar();
       // CifradoTrans CT=new CifradoTrans(Encriptado,"ABC");
       // Encriptado=CT.Cifrar();
        //Encriptado=CT.DesCifrar();
       
        
               // System.out.println(Encriptado);
               // System.out.println(descifradoCesar(Encriptado,4));
               // System.out.println("VIGENERE");
                
    }

    /*PEDIRLE LA CONTRASEÑA CUANDO AGREGA*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        CB_Usuarios2 = new javax.swing.JComboBox<>();
        cb_Tipo1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_peso1 = new javax.swing.JTextField();
        tf_altura1 = new javax.swing.JTextField();
        tf_trabajo1 = new javax.swing.JTextField();
        CB_Familiares1 = new javax.swing.JComboBox<>();
        tf_Estadocivil1 = new javax.swing.JTextField();
        tf_edad1 = new javax.swing.JTextField();
        tf_nombre1 = new javax.swing.JTextField();
        tf_id1 = new javax.swing.JTextField();
        rb_m1 = new javax.swing.JRadioButton();
        rb_f1 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        ocupacion1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TF_Horario2 = new javax.swing.JTextField();
        TF_tiempoT2 = new javax.swing.JTextField();
        TF_Salario1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CB_Usuarios = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Onjeto_Nombre = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tamano = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        calidad = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_Estadocivil = new javax.swing.JTextField();
        cb_Tipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CB_Familiares = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_peso = new javax.swing.JTextField();
        tf_trabajo = new javax.swing.JTextField();
        tf_altura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TF_Salario = new javax.swing.JTextField();
        TF_Horario1 = new javax.swing.JTextField();
        TF_tiempoT1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rb_m = new javax.swing.JRadioButton();
        rb_f = new javax.swing.JRadioButton();
        ocupacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamsj = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        CB_Remitentes = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        CB_Usuarios3 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        CB_OBJETOS = new javax.swing.JComboBox<>();
        CB_Usuarios1 = new javax.swing.JComboBox<>();
        combotipo1 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        calidad1 = new javax.swing.JTextField();
        tamano1 = new javax.swing.JTextField();
        marca1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Onjeto_Nombre1 = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_Usuarios2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        CB_Usuarios2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_Usuarios2ItemStateChanged(evt);
            }
        });
        jPanel2.add(CB_Usuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 380, -1));

        cb_Tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "Empleado", " " }));
        cb_Tipo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Tipo1ItemStateChanged(evt);
            }
        });
        jPanel2.add(cb_Tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, -1));

        jLabel18.setText("Tipo_Persona");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel19.setText("Nombre");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel20.setText("Edad");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel21.setText("Estado Civil");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel22.setText("Rol");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, -1));

        jLabel23.setText("Trabajo");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel24.setText("Altura");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel25.setText("Peso");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel2.add(tf_peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 60, -1));
        jPanel2.add(tf_altura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, -1));
        jPanel2.add(tf_trabajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 60, -1));

        CB_Familiares1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papa", "Mama", "Hermana", "Esposo", "Hermano", " " }));
        jPanel2.add(CB_Familiares1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        jPanel2.add(tf_Estadocivil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));
        jPanel2.add(tf_edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, -1));
        jPanel2.add(tf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));
        jPanel2.add(tf_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 120, -1));

        rb_m1.setText("M");
        rb_m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_m1ActionPerformed(evt);
            }
        });
        jPanel2.add(rb_m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        rb_f1.setText("F");
        jPanel2.add(rb_f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel26.setText("Sexo");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));
        jPanel2.add(ocupacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 120, -1));

        jLabel27.setText("Ocupacion");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel28.setText("Horario");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        jPanel2.add(TF_Horario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, -1));
        jPanel2.add(TF_tiempoT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, -1));
        jPanel2.add(TF_Salario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 110, -1));

        jLabel29.setText("Salario");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel30.setText("Tiempo_Trabajo");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jButton2.setText("EDITAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, -1));

        jLabel38.setText("Usuario a Editar");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTabbedPane1.addTab("Editar", jPanel2);

        jButton4.setText("Eliminar Contacto");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rol", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla2);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel31.setText("Tu lista de Contactos Actual.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jLabel3.setText("Dueño");

        jLabel17.setText("Tipo");

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapato", "Ropa", "Objeto Hogar", " " }));

        jLabel34.setText("Marca");

        jButton5.setText("Guardar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        Onjeto_Nombre.setColumns(20);
        Onjeto_Nombre.setRows(5);
        jScrollPane1.setViewportView(Onjeto_Nombre);

        jLabel35.setText("Descripcion");

        jLabel36.setText("Tamano");

        jLabel37.setText("Calidad");

        jLabel39.setText("Color");

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel37))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tamano)
                    .addComponent(combotipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marca)
                    .addComponent(calidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(CB_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39)
                        .addGap(48, 48, 48)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(calidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        jTabbedPane1.addTab("Crear Objeto", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Edad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("Estado Civil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 180, -1));
        jPanel1.add(tf_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, -1));
        jPanel1.add(tf_Estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, -1));

        cb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "Empleado" }));
        cb_Tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_TipoItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, -1));

        jLabel5.setText("Tipo_Persona");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, -1));

        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel7.setText("Rol");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, -1));

        CB_Familiares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papa", "Mama", "Hermana", "Esposo", "Hermano", " " }));
        jPanel1.add(CB_Familiares, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel8.setText("Trabajo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setText("Altura");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setText("Peso");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(tf_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, -1));
        jPanel1.add(tf_trabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, -1));
        jPanel1.add(tf_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 60, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel12.setText("Ocupacion");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel13.setText("Horario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel14.setText("Salario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel15.setText("Tiempo_Trabajo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));
        jPanel1.add(TF_Salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 110, -1));
        jPanel1.add(TF_Horario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 110, -1));
        jPanel1.add(TF_tiempoT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, -1));

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 120, -1));

        jLabel16.setText("Sexo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        rb_m.setText("M");
        rb_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mActionPerformed(evt);
            }
        });
        jPanel1.add(rb_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        rb_f.setText("F");
        jPanel1.add(rb_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));
        jPanel1.add(ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, -1));

        jTabbedPane1.addTab("Crear Persona", jPanel1);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        tablamsj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensaje", "Receptor", "Remitente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablamsj);

        jButton3.setText("Enviar Mensaje");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        CB_Remitentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_RemitentesItemStateChanged(evt);
            }
        });

        jLabel32.setText("Destinatario");

        CB_Usuarios3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_Usuarios3ItemStateChanged(evt);
            }
        });

        jLabel33.setText("Remitente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_Usuarios3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_Remitentes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jButton3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Remitentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(CB_Usuarios3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mensajes", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_OBJETOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel6.add(CB_OBJETOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 352, -1));

        jPanel6.add(CB_Usuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 240, -1));

        combotipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapato", "Ropa", "Objeto Hogar", " " }));
        jPanel6.add(combotipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel40.setText("Tipo");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel41.setText("Dueño");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel42.setText("Marca");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel43.setText("Tamano");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel44.setText("Calidad");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel45.setText("Color");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 120, 20));
        jPanel6.add(calidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, -1));
        jPanel6.add(tamano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, -1));
        jPanel6.add(marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, -1));

        Onjeto_Nombre1.setColumns(20);
        Onjeto_Nombre1.setRows(5);
        jScrollPane4.setViewportView(Onjeto_Nombre1);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 160));

        jLabel46.setText("Descripcion");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jButton8.setText("Editar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 170, 40));

        jLabel47.setText("Objeto a Modificar");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, 120, 20));

        jTabbedPane1.addTab("Modificar Objetos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int codigo;
        bandera2 = true;
        boolean guardado = true;
        String nombre, sexo, EstadoCivil, rol, trabajo, ocupacion1, horario;
        Color C;
        int altura = 0, peso = 0, sueldo = 0, tiempo = 0, edad = 0, ID = 0;

        try {
            EstadoCivil = tf_Estadocivil.getText();
            trabajo = tf_trabajo.getText();
            ocupacion1 = ocupacion.getText();
            nombre = tf_nombre.getText();

            edad = Integer.parseInt(tf_edad.getText());
            ID = Integer.parseInt(tf_id.getText());
            tf_edad.getText();
            if (rb_m.isSelected()) {
                sexo = "M";
            } else {
                sexo = "F";
            }
            Personas X = new Personas(nombre, edad, ID, sexo, EstadoCivil, cb_Tipo.getSelectedItem().toString());

            if (bandera) {//Familiar
                altura = Integer.parseInt(tf_altura.getText());
                Familiar Y = new Familiar(CB_Familiares.getSelectedItem().toString(), trabajo, altura, peso);

                X = Y;
                //X.setAltura(altura);
                X.setRol(CB_Familiares.getSelectedItem().toString());

            } else {//Empleado
                sueldo = Integer.parseInt(TF_Salario.getText());
                horario = TF_Horario1.getText();
                tiempo = Integer.parseInt(TF_tiempoT1.getText());
                Personal P = new Personal(ocupacion1, horario, tiempo);
                X = P;

            }
            X.setE_Civil(EstadoCivil);
            X.setEdad(edad);
            X.setId(ID);
            X.setNombre(nombre);
            X.setRol(cb_Tipo.getSelectedItem().toString());
            X.setSexo(sexo);
            if (CB_Familiares.getSelectedItem().toString().equals("Papa") && cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
                if (papa <= 0) {
                    bandera2 = false;
                }
            } else if (CB_Familiares.getSelectedItem().toString().equals("Mama") && cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
                if (Mama <= 0) {
                    bandera2 = false;
                }
            } else if (CB_Familiares.getSelectedItem().toString().equals("Esposo") && cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
                if (Esposo <= 0) {
                    bandera2 = false;
                }
            } else if (CB_Familiares.getSelectedItem().toString().equals("Hermano") && cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
                if (Hermano <= 0) {
                    bandera2 = false;
                }
            } else if (CB_Familiares.getSelectedItem().toString().equals("Hermana") && cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
                if (hermanas <= 0) {
                    bandera2 = false;
                }
            }
            if (bandera2) {
                String Contra = JOptionPane.showInputDialog("Ingrese la contraseña");
                if (Contra.equals(ContraMaestra)) {
                    JOptionPane.showMessageDialog(this, "Contacto Guardado");

                    //System.out.println("Guardando Tu contacto");
                    DefaultComboBoxModel Modelo = (DefaultComboBoxModel) CB_Usuarios.getModel();
                    Modelo.addElement(X);
                     DefaultComboBoxModel Remitente = (DefaultComboBoxModel) CB_Remitentes.getModel();
                     R.add(X);
                      for (Personas personas : R) {
                       Remitente.addElement(personas);
                    }
                       CB_Remitentes.setModel(Remitente);
                    CB_Usuarios.setModel(Modelo);
                    CB_Usuarios2.setModel(Modelo);
                    CB_Usuarios3.setModel(Modelo);
                     
                     
                     
                    guardado = true;
                    if (CB_Familiares.getSelectedItem().toString().equals("Papa")) {
                        papa--;
                    } else if (CB_Familiares.getSelectedItem().toString().equals("Mama")) {
                        Mama--;
                    } else if (CB_Familiares.getSelectedItem().toString().equals("Esposo")) {
                        Esposo--;
                    } else if (CB_Familiares.getSelectedItem().toString().equals("Hermano")) {
                        Hermano--;
                    } else {
                        hermanas--;
                    }

                    tf_Estadocivil.setText("");
                    tf_trabajo.setText("");
                    ocupacion.setText("");
                    tf_nombre.setText("");
                    tf_edad.setText("");
                    tf_altura.setText("");
                    CB_Familiares.setSelectedIndex(0);
                    tf_peso.setText("");
                    tf_id.setText("");
                   // CB_Familiares.enable(true);
                    TF_Salario.setText("");
                    TF_Horario1.setText("");
                    TF_tiempoT1.setText("");
                    Personas S = (Personas) CB_Usuarios2.getSelectedItem();
                    Object[] newrow = {
                        S.getRol(), S.getNombre()
                    };

                    DefaultTableModel Modelo2 = (DefaultTableModel) tabla2.getModel();
                    Modelo2.addRow(newrow);
                    //tablamsj.setModel(Modelo2);
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");

                }
            } else {
                JOptionPane.showMessageDialog(this, "No podemos guardar el Contacto");
                System.out.println("");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos.");

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void rb_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_mActionPerformed

    private void cb_TipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_TipoItemStateChanged
        if (cb_Tipo.getSelectedItem().toString().equals("Familiar")) {
            /*TF_Salario.enable(false);//
            CB_Familiares.enable(true);
            TF_Horario1.enable(false);//
            TF_Salario.enable(false);
            TF_tiempoT1.enable(false);//
            tf_altura.enable(true);
          //  tf_edad.enable(true);
           // tf_edad.enable(true);
            ocupacion.enable(false);//
             TF_Salario.enable(false);*/
            TF_Salario.enable(false);
            //TF_Salario.enable(false);//
            CB_Familiares.enable(true);
            TF_Horario1.enable(false);//
           TF_Salario.enable(false);
            TF_tiempoT1.enable(false);//
            tf_altura.enable(true);
            tf_peso.enable(true);
          //  tf_edad.enable(false);
           // tf_edad.enable(false);
            ocupacion.enable(true);//
            tf_trabajo.enable(true);
            bandera = true;
        } else {
            bandera=false;
             TF_Salario.enable(true);
           // bandera = false;
            TF_Salario.enable(true);//
            CB_Familiares.enable(false);
            TF_Horario1.enable(true);//
           TF_Salario.enable(true);
            TF_tiempoT1.enable(true);//
            tf_altura.enable(false);
            tf_peso.enable(false);
          //  tf_edad.enable(false);
           // tf_edad.enable(false);
            ocupacion.enable(false);//
            tf_trabajo.enable(false);
            /*  TF_Salario.enable(true);
            TF_Salario.enable(true);
            bandera = false;
            TF_Salario.enable(true);//
            CB_Familiares.enable(false);
            TF_Horario1.enable(true);//
           // TF_Salario.enable(false);
            TF_tiempoT1.enable(true);//
            tf_altura.enable(false);
          //  tf_edad.enable(false);
           // tf_edad.enable(false);
            ocupacion.enable(true);//*/
        }


    }//GEN-LAST:event_cb_TipoItemStateChanged

    private void cb_Tipo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Tipo1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_Tipo1ItemStateChanged

    private void rb_m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_m1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        String Contra = JOptionPane.showInputDialog("Ingrese la contraseña");
        if (Contra.equals(ContraMaestra)) {/*TERMINAR*/
            Seleccionado.setE_Civil(tf_Estadocivil.getText());
            //tf_trabajo1.getText()

            //ocupacion1.getText();
            Seleccionado.setNombre(tf_nombre1.getText());
            Seleccionado.setEdad(Integer.parseInt(tf_edad1.getText()));
            Seleccionado.setE_Civil(tf_Estadocivil1.getText());
            Seleccionado.setId(Integer.parseInt(tf_id1.getText()));
            //tf_altura1.getText();
            //CB_Familiares1.setSelectedItem(Seleccionado.getRol());
            // TF_Salario1.getText();
            //TF_Horario1.getText();
            //TF_tiempoT2.getText();
            /**/
            tf_Estadocivil1.setText("");
            tf_trabajo1.setText("");
            ocupacion1.setText("");
            tf_nombre1.setText("");
            tf_edad1.setText("");
            tf_altura1.setText("");
            CB_Familiares1.setSelectedIndex(0);
            TF_Salario1.setText("");
            TF_Horario1.setText("");
            TF_tiempoT2.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void CB_Usuarios2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_Usuarios2ItemStateChanged
        if (evt.getStateChange() == 2) {
            Seleccionado = (Personas) CB_Usuarios2.getSelectedItem();
            tf_Estadocivil.setText(Seleccionado.getE_Civil());
            //  tf_trabajo.setText();
            // ocupacion.setText();
            tf_nombre1.setText(Seleccionado.getNombre());
            tf_edad1.setText("" + Seleccionado.getEdad());
            tf_id1.setText("" + Seleccionado.getId());
            if (Seleccionado.getSexo().equals("M")) {
                rb_m1.setSelected(true);
                rb_f1.setSelected(false);
            } else {
                rb_f1.setSelected(true);
                rb_m1.setSelected(false);
            }
        }
    }//GEN-LAST:event_CB_Usuarios2ItemStateChanged

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String Contra = JOptionPane.showInputDialog("Ingrese la contraseña");
        if (Contra.equals(ContraMaestra)) {
            JOptionPane.showMessageDialog(this, "Guardando Contraseña");
            if (tabla2.getSelectedRow() >= 0) {
                DefaultTableModel Modelo = (DefaultTableModel) tabla2.getModel();
                Modelo.removeRow(tabla2.getSelectedRow());
                tabla2.setModel(Modelo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA");
        }
        ///   
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        String Mensaje = JOptionPane.showInputDialog("Ingrese su mensaje a este usuario.");
       
        Destinatario = (Personas) CB_Usuarios3.getSelectedItem();
        Emisor = (Personas) CB_Remitentes.getSelectedItem();
        Destinatario.setMensajes(new Mensaje(Destinatario, Mensaje, Emisor));
        Emisor.setMensajes(new Mensaje(Destinatario, Mensaje, Emisor));
        Object[] newrow = {
            Mensaje, Destinatario.getNombre(), Emisor.getNombre()
        };
        DefaultTableModel Modelo2 = (DefaultTableModel) tablamsj.getModel();
        Modelo2.addRow(newrow);
        tablamsj.setModel(Modelo2);
            if (Destinatario.getRol().equals("Familiar")) {
            if (((Familiar) Destinatario).getRelacion().equals("Esposo")) {
                System.out.println("ENCRIPTANDO MENSAJE DE KIM AL ESPOSO");
                Codificar(Mensaje);
               /*AGREGAR EL CIFRADO CESAR*/
               /*String Encriptado= EncriptadoCesar(Mensaje,4);
                System.out.println(Encriptado);
                System.out.println(descifradoCesar(Encriptado,4));*/
                
            }
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void CB_RemitentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_RemitentesItemStateChanged
       /* if (evt.getStateChange()==2) {
             String Mensaje = JOptionPane.showInputDialog("Ingrese su mensaje a este usuario.");
        Destinatario = (Personas) CB_Usuarios3.getSelectedItem();
        Emisor = (Personas) CB_Usuarios6.getSelectedItem();
        Object[] newrow = {
            Mensaje, Destinatario.getNombre(), Emisor.getNombre()
        };
        DefaultTableModel Modelo2 = (DefaultTableModel) tablamsj.getModel();
        Modelo2.addRow(newrow);
        tablamsj.setModel(Modelo2);
        }*/
    }//GEN-LAST:event_CB_RemitentesItemStateChanged

    private void CB_Usuarios3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_Usuarios3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Usuarios3ItemStateChanged

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
     boolean Bandera=true;
     try {
         Color C;
          C=jButton6.getBackground();
        String Nombre =Onjeto_Nombre.getText();
       String Marca =marca.getText();
       int tamano1= Integer.parseInt(tamano.getText());
       int Calidad=Integer.parseInt(calidad.getText());
       Objetos O= new Objetos();
        if (Calidad<1||Calidad>10) {
            bandera=false;
        }
        if (combotipo.getSelectedItem().toString().equals("Zapato") ) {
            Zapatos Z=new Zapatos();
            O=Z;
            
        }else if (combotipo.getSelectedItem().toString().equals("Ropa")){
            Ropa R= new Ropa();
            O=R;
        }else{
            Objetos_Hogar OH= new Objetos_Hogar();
            O=OH;
        }
        O.setMarca(Marca);
        O.setDescripcion(Nombre);
        O.setTamano(tamano1);
        O.setCalidad(Calidad);
        O.setColor(C);
        Personas P= ((Personas)CB_Usuarios.getSelectedItem());
        ((Personas)CB_Usuarios.getSelectedItem()).setP(P);
         if (Bandera) {
               String Contra = JOptionPane.showInputDialog("Ingrese la contraseña");
               if (Contra.equals(ContraMaestra)) {
            JOptionPane.showMessageDialog(this,"OBJETO GUARDADO EXITOSAMENTE");
            DefaultComboBoxModel Modelo = (DefaultComboBoxModel)  CB_OBJETOS.getModel();
            Modelo.addElement(O);
            CB_OBJETOS.setModel(Modelo);
        }else{
            JOptionPane.showMessageDialog(this,"Contraseña incorrecta");
        }
         }else{
            JOptionPane.showMessageDialog(this,"Error en la calidad");
         }
          } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se guardaron los datos.");

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
         jButton6.setBackground(JColorChooser.showDialog(this, "SELECIONE UN COLOR", Color.yellow));
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
     
     String Contra=JOptionPane.showInputDialog("Ingrese la contraseña");
        if (Contra.equals(ContraMaestra)) {
             ObjetoSeleccionado.setTamano(Integer.parseInt(tamano1.getText()));
             ObjetoSeleccionado.setCalidad(Integer.parseInt(calidad1.getText()));
             ObjetoSeleccionado.setColor(jButton7.getBackground());
             ObjetoSeleccionado.setDescripcion(Onjeto_Nombre1.getText());
             ObjetoSeleccionado.setP(((Personas)CB_Usuarios1.getSelectedItem()));
        }
      
    }//GEN-LAST:event_jButton8MouseClicked

   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Familiares;
    private javax.swing.JComboBox<String> CB_Familiares1;
    private javax.swing.JComboBox<String> CB_OBJETOS;
    private javax.swing.JComboBox<String> CB_Remitentes;
    private javax.swing.JComboBox<String> CB_Usuarios;
    private javax.swing.JComboBox<String> CB_Usuarios1;
    private javax.swing.JComboBox<String> CB_Usuarios2;
    private javax.swing.JComboBox<String> CB_Usuarios3;
    private javax.swing.JTextArea Onjeto_Nombre;
    private javax.swing.JTextArea Onjeto_Nombre1;
    private javax.swing.JTextField TF_Horario1;
    private javax.swing.JTextField TF_Horario2;
    private javax.swing.JTextField TF_Salario;
    private javax.swing.JTextField TF_Salario1;
    private javax.swing.JTextField TF_tiempoT1;
    private javax.swing.JTextField TF_tiempoT2;
    private javax.swing.JTextField calidad;
    private javax.swing.JTextField calidad1;
    private javax.swing.JComboBox<String> cb_Tipo;
    private javax.swing.JComboBox<String> cb_Tipo1;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JComboBox<String> combotipo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField marca1;
    private javax.swing.JTextField ocupacion;
    private javax.swing.JTextField ocupacion1;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_f1;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rb_m1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tablamsj;
    private javax.swing.JTextField tamano;
    private javax.swing.JTextField tamano1;
    private javax.swing.JTextField tf_Estadocivil;
    private javax.swing.JTextField tf_Estadocivil1;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_altura1;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_edad1;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_id1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_peso1;
    private javax.swing.JTextField tf_trabajo;
    private javax.swing.JTextField tf_trabajo1;
    // End of variables declaration//GEN-END:variables
private int Mama = 1;
    private int papa = 1;
    private int hermanas = 4;
    private int Esposo = 1;
    private int Hermano = 1;
    private boolean bandera;
    private boolean bandera2 = true;
    private String ContraMaestra = "1234";
    private Personas Seleccionado;
    private Personas Destinatario;
    private Personas Emisor;
    private Objetos ObjetoSeleccionado;
  public static void Codificar(String Mensaje1) {
        System.out.println("------CODIFICACION DE LOS DATOS------");
        String Mensaje = Mensaje1;
        String CESAR = EncriptadoCesar(Mensaje, 3);
        //CESAR
        System.out.println("CIFRANDO");
        System.out.println("→César: " + CESAR);
        CifradoTrans CIFTRANS = new CifradoTrans(CESAR, "abc");
        //TRASPOSICION-CESAR
        String TRANS = CIFTRANS.Cifrar();
        System.out.println("→ Trasposición: " + TRANS);
        CifradoVigenere CIFVIG = new CifradoVigenere(TRANS, "abc");
        // CifradoVigenere C_C=new CifradoVigenere(Y);
        //DESCODIFICACIONES
        CIFVIG.setTxT(TRANS);
        //String Z=cc.getTxT();
        String VIG = CIFVIG.Cifrar();
        System.out.println("→Vigenere: " + VIG);
        CIFVIG.setTxT(VIG);
        String DESVIG = CIFVIG.DesCifrar();
        System.out.println("DESCIFRADO");
        System.out.println("→Vigenere: " + DESVIG);
        CIFTRANS.setTxT(DESVIG);
        String DESTRANS = CIFTRANS.DesCifrar();
        System.out.println("→Trasposición: " + DESTRANS);
        String DESCES = descifradoCesar(DESTRANS, 3);
        System.out.println("Descifrado FINAL: " + DESCES);
    }

    public static String EncriptadoCesar(String msm,int Desplazamiento){
        StringBuilder cifrado = new StringBuilder();
        Desplazamiento = Desplazamiento % 26;
        for (int i = 0; i < msm.length(); i++) {
            if (msm.charAt(i) >= 'a' && msm.charAt(i) <= 'z') {
                if ((msm.charAt(i) + Desplazamiento) > 'z') {
                    cifrado.append((char) (msm.charAt(i) + Desplazamiento - 26));
                } else {
                    cifrado.append((char) (msm.charAt(i) + Desplazamiento));
                }
            } else if (msm.charAt(i) >= 'A' && msm.charAt(i) <= 'Z') {
                if ((msm.charAt(i) + Desplazamiento) > 'Z') {
                    cifrado.append((char) (msm.charAt(i) + Desplazamiento - 26));
                } else {
                    cifrado.append((char) (msm.charAt(i) + Desplazamiento));
                }
            }
        }
        return cifrado.toString();
    }
    
    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
    
}
