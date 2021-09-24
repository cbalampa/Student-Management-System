// Libraries
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class teacherFrame extends javax.swing.JFrame {
    // Variables for mouse position
    int mousepX;
    int mousepY;

    String choice = null; // Student gender Radio Button selection
    String semesters = null; // Grade semester Radio Button selection
    
    CardLayout cardLayout = new CardLayout(); // CardLayout object

    Student student = new Student();
    Teacher teacher = new Teacher();
    Classroom mclass = new Classroom();
    Course course = new Course();
    Grades grade = new Grades();
    
    GUI changeGUI = new GUI();
    
    DefaultTableModel model;
    
    public teacherFrame() {
        initComponents();
        
        conn.myconnection();
        CenteredFrame(this);
        
        // Table initialization 
        student.studentTable(s_jTable2, "");       
        grade.gradesTable(grade_jTable, 0);     
        grade.avg_grade(0, averageNumber);
        
        // ComboBox initialization 
        course.courseList(course_jComboBox1);
        
        cardLayout = (CardLayout) (mainPanel.getLayout());
   
        setColor(teacherPanel); // Make background color look lighter | Beeing selected effect
        
        // Replacing the password asterisks to dots [TEACHER PANEL]
        t_jPassword.setEchoChar('\u25CF');
        t_jPassword2.setEchoChar('\u25CF');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_buttonGroup = new javax.swing.ButtonGroup();
        jDialog = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        grade_buttonGroup = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        teacherPanel = new javax.swing.JPanel();
        teacherLabel = new javax.swing.JLabel();
        gradesPanel = new javax.swing.JPanel();
        gradesLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        manageTeacher = new javax.swing.JPanel();
        titleMTeachers = new javax.swing.JLabel();
        t_labelBackground = new javax.swing.JPanel();
        t_idLabel = new javax.swing.JLabel();
        t_idTF = new javax.swing.JTextField();
        t_firstNameLabel = new javax.swing.JLabel();
        t_firstNameTF = new javax.swing.JTextField();
        t_lastNameLabel = new javax.swing.JLabel();
        t_lastNameTF = new javax.swing.JTextField();
        t_email = new javax.swing.JLabel();
        t_emailTF = new javax.swing.JTextField();
        t_passwd = new javax.swing.JLabel();
        t_username = new javax.swing.JLabel();
        t_usernameTF = new javax.swing.JTextField();
        t_phoneTF = new javax.swing.JTextField();
        t_addressLabel = new javax.swing.JLabel();
        t_addressTF = new javax.swing.JTextField();
        t_updateButton = new javax.swing.JButton();
        t_resetText = new javax.swing.JLabel();
        t_phoneNumber = new javax.swing.JLabel();
        t_passwd2 = new javax.swing.JLabel();
        t_jPassword = new javax.swing.JPasswordField();
        t_jPassword2 = new javax.swing.JPasswordField();
        manageGrades = new javax.swing.JPanel();
        titleMGrades = new javax.swing.JLabel();
        g_labelBackground = new javax.swing.JPanel();
        course_jScrollPane1 = new javax.swing.JScrollPane();
        grade_jTable = new javax.swing.JTable();
        grade_TF = new javax.swing.JTextField();
        course_jComboBox1 = new javax.swing.JComboBox<>();
        grade_setButton = new javax.swing.JButton();
        courseJLabel = new javax.swing.JLabel();
        extras = new javax.swing.JLabel();
        g_student = new javax.swing.JTextField();
        semester_a = new javax.swing.JRadioButton();
        semester_b = new javax.swing.JRadioButton();
        semester_c = new javax.swing.JRadioButton();
        semester = new javax.swing.JLabel();
        gradeJLabel = new javax.swing.JLabel();
        studentJLabel = new javax.swing.JLabel();
        s_jScrollPane1 = new javax.swing.JScrollPane();
        s_jTable2 = new javax.swing.JTable();
        averageNumber = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("EXTRAS");

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton2))
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(100, 100, 100))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TBD2020 - Πληροφοριακό Σύστημα");
        setMinimumSize(new java.awt.Dimension(998, 639));
        setUndecorated(true);
        setSize(new java.awt.Dimension(998, 639));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(240, 200, 105));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(998, 639));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(998, 639));
        backgroundPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundPanelMouseDragged1(evt);
            }
        });
        backgroundPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundPanelMousePressed1(evt);
            }
        });
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(240, 200, 105));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("x");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        topPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 0, 46, 21));

        minimizeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButton.setText("_");
        minimizeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minimizeButton.setDisplayedMnemonicIndex(0);
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
        });
        topPanel.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 0, 28, 21));

        backgroundPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 760, 25));

        jSplitPane.setBorder(null);
        jSplitPane.setDividerSize(0);
        jSplitPane.setMinimumSize(new java.awt.Dimension(990, 610));
        jSplitPane.setOpaque(false);
        jSplitPane.setPreferredSize(new java.awt.Dimension(990, 610));

        leftPanel.setBackground(new java.awt.Color(22, 30, 42));
        leftPanel.setMinimumSize(new java.awt.Dimension(230, 635));
        leftPanel.setPreferredSize(new java.awt.Dimension(230, 635));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherPanel.setBackground(new java.awt.Color(29, 40, 56));
        teacherPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teacherPanelMousePressed(evt);
            }
        });
        teacherPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(249, 249, 249));
        teacherLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_school_director_24px.png"))); // NOI18N
        teacherLabel.setText(" Manage Profile");
        teacherPanel.add(teacherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(teacherPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 50));

        gradesPanel.setBackground(new java.awt.Color(29, 40, 56));
        gradesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gradesPanelMousePressed(evt);
            }
        });
        gradesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gradesLabel.setForeground(new java.awt.Color(249, 249, 249));
        gradesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_exam_24px.png"))); // NOI18N
        gradesLabel.setText(" Manage Grades");
        gradesPanel.add(gradesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(gradesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_xing_140px.png"))); // NOI18N
        logo.setText("jLabel3");
        leftPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 120));

        jSplitPane.setLeftComponent(leftPanel);

        mainPanel.setBackground(new java.awt.Color(249, 249, 249));
        mainPanel.setLayout(new java.awt.CardLayout());

        manageTeacher.setBackground(new java.awt.Color(249, 249, 249));
        manageTeacher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMTeachers.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleMTeachers.setForeground(new java.awt.Color(249, 249, 249));
        titleMTeachers.setText("Manage Profile");
        manageTeacher.add(titleMTeachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        t_labelBackground.setBackground(new java.awt.Color(29, 40, 56));
        t_labelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        manageTeacher.add(t_labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        t_idLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_idLabel.setText("ID");
        manageTeacher.add(t_idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        t_idTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_idTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        t_idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_idTFKeyTyped(evt);
            }
        });
        manageTeacher.add(t_idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 30));

        t_firstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_firstNameLabel.setText("First Name");
        manageTeacher.add(t_firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        t_firstNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_firstNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_firstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 30));

        t_lastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_lastNameLabel.setText("Last Name");
        manageTeacher.add(t_lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        t_lastNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_lastNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_lastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 180, 30));

        t_email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_email.setText("Email Address");
        manageTeacher.add(t_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        t_emailTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_emailTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, 30));

        t_passwd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_passwd.setText("Password");
        manageTeacher.add(t_passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        t_username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_username.setText("Username");
        manageTeacher.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        t_usernameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_usernameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 30));

        t_phoneTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_phoneTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        t_phoneTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_phoneTFKeyTyped(evt);
            }
        });
        manageTeacher.add(t_phoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 180, 30));

        t_addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_addressLabel.setText("Address");
        manageTeacher.add(t_addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        t_addressTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_addressTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 180, 30));

        t_updateButton.setBackground(new java.awt.Color(29, 40, 56));
        t_updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_updateButton.setForeground(new java.awt.Color(249, 249, 249));
        t_updateButton.setText("UPDATE");
        t_updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_updateButton.setEnabled(false);
        t_updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_updateButtonActionPerformed(evt);
            }
        });
        manageTeacher.add(t_updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 80, 40));

        t_resetText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_resetText.setForeground(new java.awt.Color(0, 102, 153));
        t_resetText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_erase_24px_4.png"))); // NOI18N
        t_resetText.setText("Reset TextFields");
        t_resetText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_resetText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_resetTextMousePressed(evt);
            }
        });
        manageTeacher.add(t_resetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        t_phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_phoneNumber.setText("Phone Number");
        manageTeacher.add(t_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        t_passwd2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_passwd2.setText("Repeat Password");
        manageTeacher.add(t_passwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        t_jPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_jPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 180, 30));

        t_jPassword2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_jPassword2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageTeacher.add(t_jPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 180, 30));

        mainPanel.add(manageTeacher, "manageTeacher");
        manageTeacher.getAccessibleContext().setAccessibleName("manageTeacher");

        manageGrades.setBackground(new java.awt.Color(249, 249, 249));
        manageGrades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMGrades.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleMGrades.setForeground(new java.awt.Color(249, 249, 249));
        titleMGrades.setText("Manage Grades");
        manageGrades.add(titleMGrades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        g_labelBackground.setBackground(new java.awt.Color(29, 40, 56));
        g_labelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        manageGrades.add(g_labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        grade_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "A", "B", "C", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grade_jTable.getTableHeader().setReorderingAllowed(false);
        grade_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grade_jTableMousePressed(evt);
            }
        });
        course_jScrollPane1.setViewportView(grade_jTable);

        manageGrades.add(course_jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 350, 220));

        grade_TF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grade_TF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        grade_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grade_TFKeyTyped(evt);
            }
        });
        manageGrades.add(grade_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, 30));

        course_jComboBox1.setBorder(null);
        course_jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course_jComboBox1.setLightWeightPopupEnabled(false);
        manageGrades.add(course_jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 30));

        grade_setButton.setBackground(new java.awt.Color(29, 40, 56));
        grade_setButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        grade_setButton.setForeground(new java.awt.Color(249, 249, 249));
        grade_setButton.setText("SET");
        grade_setButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grade_setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_setButtonActionPerformed(evt);
            }
        });
        manageGrades.add(grade_setButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, 40));

        courseJLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        courseJLabel.setText("Course");
        manageGrades.add(courseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        extras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        extras.setForeground(new java.awt.Color(0, 102, 153));
        extras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_info_24px.png"))); // NOI18N
        extras.setText("Extra details");
        extras.setToolTipText("Detailed Information");
        extras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                extrasMousePressed(evt);
            }
        });
        manageGrades.add(extras, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        g_student.setEditable(false);
        g_student.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        g_student.setForeground(new java.awt.Color(102, 102, 102));
        g_student.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        g_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_studentActionPerformed(evt);
            }
        });
        manageGrades.add(g_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 30));

        semester_a.setBackground(new java.awt.Color(249, 249, 249));
        grade_buttonGroup.add(semester_a);
        semester_a.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semester_a.setText("C");
        manageGrades.add(semester_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        semester_b.setBackground(new java.awt.Color(249, 249, 249));
        grade_buttonGroup.add(semester_b);
        semester_b.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semester_b.setSelected(true);
        semester_b.setText("A");
        manageGrades.add(semester_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        semester_c.setBackground(new java.awt.Color(249, 249, 249));
        grade_buttonGroup.add(semester_c);
        semester_c.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semester_c.setText("B");
        manageGrades.add(semester_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        semester.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semester.setText("Semester");
        manageGrades.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        gradeJLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gradeJLabel.setText("Grade");
        manageGrades.add(gradeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        studentJLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studentJLabel.setText("Student");
        manageGrades.add(studentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        s_jTable2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AM", "First Name", "Last Name", "Gender", "Father", "Mother Full Name", "Address", "Phone Number", "Birthedate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        s_jTable2.getTableHeader().setReorderingAllowed(false);
        s_jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                s_jTable2MousePressed(evt);
            }
        });
        s_jScrollPane1.setViewportView(s_jTable2);
        if (s_jTable2.getColumnModel().getColumnCount() > 0) {
            s_jTable2.getColumnModel().getColumn(0).setResizable(false);
            s_jTable2.getColumnModel().getColumn(1).setResizable(false);
            s_jTable2.getColumnModel().getColumn(2).setResizable(false);
            s_jTable2.getColumnModel().getColumn(3).setResizable(false);
            s_jTable2.getColumnModel().getColumn(4).setResizable(false);
            s_jTable2.getColumnModel().getColumn(5).setResizable(false);
            s_jTable2.getColumnModel().getColumn(6).setResizable(false);
            s_jTable2.getColumnModel().getColumn(7).setResizable(false);
            s_jTable2.getColumnModel().getColumn(8).setResizable(false);
        }

        manageGrades.add(s_jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 690, 220));

        averageNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        averageNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        averageNumber.setText("0");
        manageGrades.add(averageNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 100, 50, -1));

        averageLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        averageLabel.setText("Average:");
        manageGrades.add(averageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 100, 60, -1));

        mainPanel.add(manageGrades, "manageGrades");

        jSplitPane.setRightComponent(mainPanel);
        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        backgroundPanel.add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 25, 990, 610));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 998, 639));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Close program when [X] is clicked 
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Do you want to log out?", 
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(response){
                case JOptionPane.YES_OPTION: 
                    loginFrame login = new loginFrame();
                    login.setVisible(true);
                    login.pack();
                    login.setLocationRelativeTo(null);
                    System.out.println("[OPTION=YES]: User logged out.");
                    this.dispose();
                    break;
                case JOptionPane.NO_OPTION:
                    System.out.println("[OPTION=NO]: Log out action was cancelled.");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.out.println("[OPTION=CLOSED]: Box is closed. Log out action was cancelled.");
                default:
                    break;
            }
    }//GEN-LAST:event_exitButtonMouseClicked

    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    // [X] mouse over effects
    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setOpaque(true);
        exitButton.setBackground(new Color(255, 51, 51));
        exitButton.setForeground(new Color(249, 249, 249));
        exitButton.setToolTipText("Close");
    }//GEN-LAST:event_exitButtonMouseEntered

    // [X] mouse out effects
    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setOpaque(false);
        exitButton.setBackground(new Color(0, 0, 0, 0));
        exitButton.setForeground(new Color(22, 30, 42));
        exitButton.setToolTipText("");
    }//GEN-LAST:event_exitButtonMouseExited

    // [-] Minimize current window
    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    // [-] mouse over effects
    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButton.setOpaque(true);
        minimizeButton.setBackground(new Color(29, 40, 56));
        minimizeButton.setForeground(new Color(249, 249, 249));
        minimizeButton.setToolTipText("Minimize");
    }//GEN-LAST:event_minimizeButtonMouseEntered

    // [-] mouse out effects
    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButton.setOpaque(false);
        minimizeButton.setBackground(new Color(0, 0, 0, 0));
        minimizeButton.setForeground(new Color(22, 30, 42));
        minimizeButton.setToolTipText("");
    }//GEN-LAST:event_minimizeButtonMouseExited

    //  Get mouse potition when mouse is pressed
    private void backgroundPanelMousePressed1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMousePressed1
        if (!evt.isMetaDown()) {
            mousepX = evt.getX();
            mousepY = evt.getY();
        }
    }//GEN-LAST:event_backgroundPanelMousePressed1

    // Drag with mouse
    private void backgroundPanelMouseDragged1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPanelMouseDragged1
        if (!evt.isMetaDown()) {
            Point p = getLocation();
            setLocation(p.x + evt.getX() - mousepX,
                    p.y + evt.getY() - mousepY);
        }
    }//GEN-LAST:event_backgroundPanelMouseDragged1

    // Accept only numbers for Teacher ID
    private void t_idTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_idTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_t_idTFKeyTyped

    // Accept only numbers and space for Phone Number
    private void t_phoneTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_phoneTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {evt.consume();} 
    }//GEN-LAST:event_t_phoneTFKeyTyped

    // Update Teacher info
    private void t_updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_updateButtonActionPerformed

            if(!t_jPassword.getText().equals(t_jPassword2.getText())){
                JOptionPane.showMessageDialog(this, "Password is not the same.");
                System.out.println("[WARNING]: Password is not the same.");
            }else{

            } // End of Password and Repeat Password checking
            
            if(t_updateButton.isEnabled()){t_updateButton.setEnabled(false);}
    }//GEN-LAST:event_t_updateButtonActionPerformed

    // Reset all text fields
    private void t_resetTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_resetTextMousePressed
        
        // Reset Error GUI [ DELETE IF YOU WANT ]
        changeGUI.resetColors(t_idLabel, t_idTF);
        changeGUI.resetColors(t_firstNameLabel, t_firstNameTF);
        changeGUI.resetColors(t_lastNameLabel, t_lastNameTF);
        changeGUI.resetColors(t_username, t_usernameTF);
        changeGUI.resetColors(t_passwd, t_jPassword);
        changeGUI.resetColors(t_passwd2, t_jPassword2);
        changeGUI.resetColors(t_email, t_emailTF);
        changeGUI.resetColors(t_phoneNumber, t_phoneTF);
        changeGUI.resetColors(t_addressLabel, t_addressTF);
        
        if(t_updateButton.isEnabled()){t_updateButton.setEnabled(false);}
        if(!t_idTF.isEditable()){t_idTF.setEditable(true);}
    }//GEN-LAST:event_t_resetTextMousePressed

    // Check if all required fields have been filled
   public boolean t_checkField() {
        if (t_idTF.getText().equals("") || t_firstNameTF.getText().equals("") || t_lastNameTF.getText().equals("")
                || t_usernameTF.getText().equals("") || t_jPassword.getText().equals("") || t_jPassword2.getText().equals("")
                || t_emailTF.getText().equals("") || t_phoneTF.getText().equals("") || t_addressTF.getText().equals("")) {

            // Error GUI
            changeGUI.errorColors(t_idLabel, t_idTF);
            changeGUI.errorColors(t_firstNameLabel, t_firstNameTF);
            changeGUI.errorColors(t_lastNameLabel, t_lastNameTF);
            changeGUI.errorColors(t_username, t_usernameTF);
            changeGUI.errorColors(t_passwd, t_jPassword);
            changeGUI.errorColors(t_passwd2, t_jPassword2);
            changeGUI.errorColors(t_email, t_emailTF);
            changeGUI.errorColors(t_phoneNumber, t_phoneTF);
            changeGUI.errorColors(t_addressLabel, t_addressTF);
            JOptionPane.showMessageDialog(null, "All required fields must be filled out.");
            System.out.println("[WARNING]: All required fields must be filled out.");
            
            return false;
        }
        
        // Reset Error GUI
        changeGUI.resetColors(t_idLabel, t_idTF);
        changeGUI.resetColors(t_firstNameLabel, t_firstNameTF);
        changeGUI.resetColors(t_lastNameLabel, t_lastNameTF);
        changeGUI.resetColors(t_username, t_usernameTF);
        changeGUI.resetColors(t_passwd, t_jPassword);
        changeGUI.resetColors(t_passwd2, t_jPassword2);
        changeGUI.resetColors(t_email, t_emailTF);
        changeGUI.resetColors(t_phoneNumber, t_phoneTF);
        changeGUI.resetColors(t_addressLabel, t_addressTF);
           
        return true;
    }  
   
    private void teacherPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherPanelMousePressed
        cardLayout.show(mainPanel, "manageTeacher");
        setColor(teacherPanel);
        resetColor(gradesPanel);
    }//GEN-LAST:event_teacherPanelMousePressed

    private void gradesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesPanelMousePressed
        cardLayout.show(mainPanel, "manageGrades");
        setColor(gradesPanel);
        resetColor(teacherPanel);
    }//GEN-LAST:event_gradesPanelMousePressed
// END OF CARDLAYOUT  // END OF CARDLAYOUT // END OF CARDLAYOUT // END OF CARDLAYOUT
    
// GRADES ========= GRADES ============ GRADES ============
    private void grade_jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grade_jTableMousePressed
        int rowIndex = grade_jTable.getSelectedRow();
        model = (DefaultTableModel) grade_jTable.getModel();
        course_jComboBox1.setSelectedItem(model.getValueAt(rowIndex, 0).toString());
    }//GEN-LAST:event_grade_jTableMousePressed

    private void grade_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grade_TFKeyTyped
       if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_grade_TFKeyTyped

    private void grade_setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_setButtonActionPerformed
        // Get value of groupbutton                 
        if (semester_a.isSelected()) {
            semesters = semester_a.getText();
        } else if (semester_b.isSelected()) {
            semesters = semester_b.getText();
        } else if (semester_c.isSelected()) {
            semesters = semester_c.getText();
        } 
        
        if(course_jComboBox1.getSelectedItem().equals("") || g_student.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select Student and Course.");
        }else{
            if(Integer.valueOf(grade_TF.getText()) > 20){
                JOptionPane.showMessageDialog(this, "This student is too good! Acceptable grade values: [0-20]");
                changeGUI.errorColors(gradeJLabel, grade_TF);
            }else{
                String selected = String.valueOf(course_jComboBox1.getSelectedItem());
    
                grade.avg_grade(Integer.valueOf(am), averageNumber);
            }
        }
    }//GEN-LAST:event_grade_setButtonActionPerformed

    private void extrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extrasMousePressed
                    jDialog.setVisible(true);
                    jDialog.pack();
                    jDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_extrasMousePressed
    String am;
    private void s_jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_jTable2MousePressed
        int rowIndex = s_jTable2.getSelectedRow();
        model = (DefaultTableModel) s_jTable2.getModel();

        DefaultTableModel grade_model = (DefaultTableModel) grade_jTable.getModel();
        grade_model.setRowCount(0);
        
        am = (model.getValueAt(rowIndex, 0).toString());      
        grade.gradesTable(grade_jTable, Integer.valueOf(am));
        
        g_student.setText(" "+ model.getValueAt(rowIndex, 1).toString() + " " + model.getValueAt(rowIndex, 2).toString());
        
        grade.avg_grade(Integer.valueOf(am), averageNumber);
    }//GEN-LAST:event_s_jTable2MousePressed

    private void g_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_studentActionPerformed

    // setColor and resetColor methods to change JPANELs' [under left panel] appearance
    void setColor(JPanel panel) {
        panel.setBackground(new Color(43, 60, 84));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(29, 40, 56));
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageLabel;
    private javax.swing.JLabel averageNumber;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel courseJLabel;
    private javax.swing.JComboBox<String> course_jComboBox1;
    private javax.swing.JScrollPane course_jScrollPane1;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel extras;
    private javax.swing.JPanel g_labelBackground;
    private javax.swing.JTextField g_student;
    private javax.swing.ButtonGroup gender_buttonGroup;
    private javax.swing.JLabel gradeJLabel;
    private javax.swing.JTextField grade_TF;
    private javax.swing.ButtonGroup grade_buttonGroup;
    private javax.swing.JTable grade_jTable;
    private javax.swing.JButton grade_setButton;
    private javax.swing.JLabel gradesLabel;
    private javax.swing.JPanel gradesPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel manageGrades;
    private javax.swing.JPanel manageTeacher;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JScrollPane s_jScrollPane1;
    private javax.swing.JTable s_jTable2;
    private javax.swing.JLabel semester;
    private javax.swing.JRadioButton semester_a;
    private javax.swing.JRadioButton semester_b;
    private javax.swing.JRadioButton semester_c;
    private javax.swing.JLabel studentJLabel;
    private javax.swing.JLabel t_addressLabel;
    private javax.swing.JTextField t_addressTF;
    private javax.swing.JLabel t_email;
    private javax.swing.JTextField t_emailTF;
    private javax.swing.JLabel t_firstNameLabel;
    private javax.swing.JTextField t_firstNameTF;
    private javax.swing.JLabel t_idLabel;
    private javax.swing.JTextField t_idTF;
    private javax.swing.JPasswordField t_jPassword;
    private javax.swing.JPasswordField t_jPassword2;
    private javax.swing.JPanel t_labelBackground;
    private javax.swing.JLabel t_lastNameLabel;
    private javax.swing.JTextField t_lastNameTF;
    private javax.swing.JLabel t_passwd;
    private javax.swing.JLabel t_passwd2;
    private javax.swing.JLabel t_phoneNumber;
    private javax.swing.JTextField t_phoneTF;
    private javax.swing.JLabel t_resetText;
    private javax.swing.JButton t_updateButton;
    private javax.swing.JLabel t_username;
    private javax.swing.JTextField t_usernameTF;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JPanel teacherPanel;
    private javax.swing.JLabel titleMGrades;
    private javax.swing.JLabel titleMTeachers;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
