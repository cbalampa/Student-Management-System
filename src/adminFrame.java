// Libraries
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class adminFrame extends javax.swing.JFrame {
    private int mousepX,  mousepY;     // Variables for mouse position
    private String choice = null; // Student gender Radio Button selection
    private String semesters = null; // Grade semester Radio Button selection
    private String sid_grade; // Student ID for average grade
    
    private CardLayout cardLayout = new CardLayout(); // CardLayout object

    private Student student = new Student();
    private Teacher teacher = new Teacher();
    private Classroom mclass = new Classroom();
    private Course course = new Course();
    private Grades grade = new Grades();
    private GUI changeGUI = new GUI();
 
    private DefaultTableModel model;
    
    public adminFrame() {
        initComponents();   
        conn.myconnection(); // Connect to remote Database
        initialize(); // Initialize compoments
        
        CenteredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_buttonGroup = new javax.swing.ButtonGroup();
        extraDialog = new javax.swing.JDialog();
        Background = new javax.swing.JPanel();
        title_Best = new javax.swing.JLabel();
        best_student = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        copyrightLabel = new javax.swing.JLabel();
        title_Best1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        topfive = new javax.swing.JTable();
        grade_buttonGroup = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jSplitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        studentPanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        teacherPanel = new javax.swing.JPanel();
        teacherLabel = new javax.swing.JLabel();
        classPanel = new javax.swing.JPanel();
        classLabel = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        courseLabel = new javax.swing.JLabel();
        gradesPanel = new javax.swing.JPanel();
        gradesLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        manageStudent = new javax.swing.JPanel();
        titleMStudents = new javax.swing.JLabel();
        s_amTF = new javax.swing.JTextField();
        s_firstNameTF = new javax.swing.JTextField();
        s_lastNameTF = new javax.swing.JTextField();
        s_fatherNameTF = new javax.swing.JTextField();
        s_motherNameTF = new javax.swing.JTextField();
        s_maleRadioBtn = new javax.swing.JRadioButton();
        s_femaleRadioBtn = new javax.swing.JRadioButton();
        s_addressTF = new javax.swing.JTextField();
        s_phoneTF = new javax.swing.JTextField();
        s_amLabel = new javax.swing.JLabel();
        s_firstNameLabel = new javax.swing.JLabel();
        s_lastNameLabel = new javax.swing.JLabel();
        s_genderLabel = new javax.swing.JLabel();
        s_fatherLabel = new javax.swing.JLabel();
        s_motherLabel = new javax.swing.JLabel();
        s_addressLabel = new javax.swing.JLabel();
        s_phoneNumberLabel = new javax.swing.JLabel();
        s_birthdateLabel = new javax.swing.JLabel();
        s_jScrollPane = new javax.swing.JScrollPane();
        s_jTable = new javax.swing.JTable();
        s_addButton = new javax.swing.JButton();
        s_deleteButton = new javax.swing.JButton();
        s_resetText = new javax.swing.JLabel();
        s_updateButton = new javax.swing.JButton();
        labelBackground = new javax.swing.JPanel();
        s_searchBarJPanel = new javax.swing.JPanel();
        searchIcon = new javax.swing.JLabel();
        s_searchBar = new javax.swing.JTextField();
        s_jDateChooser = new com.toedter.calendar.JDateChooser();
        manageTeacher = new javax.swing.JPanel();
        titleMTeachers = new javax.swing.JLabel();
        t_labelBackground = new javax.swing.JPanel();
        t_searchBarJPanel = new javax.swing.JPanel();
        searchIcon1 = new javax.swing.JLabel();
        t_searchBar = new javax.swing.JTextField();
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
        t_deleteButton = new javax.swing.JButton();
        t_addButton = new javax.swing.JButton();
        t_updateButton = new javax.swing.JButton();
        t_jScrollPane = new javax.swing.JScrollPane();
        t_jTable = new javax.swing.JTable();
        t_resetText = new javax.swing.JLabel();
        t_phoneNumber = new javax.swing.JLabel();
        t_passwd2 = new javax.swing.JLabel();
        t_jPassword = new javax.swing.JPasswordField();
        t_jPassword2 = new javax.swing.JPasswordField();
        manageClasses = new javax.swing.JPanel();
        titleMClasses = new javax.swing.JLabel();
        c_labelBackground = new javax.swing.JPanel();
        c_jScrollPane = new javax.swing.JScrollPane();
        c_jTable = new javax.swing.JTable();
        choose = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        c_name = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        counter = new javax.swing.JLabel();
        newClassTitle = new javax.swing.JLabel();
        c_student = new javax.swing.JLabel();
        populateTitle = new javax.swing.JLabel();
        c_studentTF = new javax.swing.JTextField();
        c_nameTF = new javax.swing.JTextField();
        class_updateButton = new javax.swing.JButton();
        class_deleteButton = new javax.swing.JButton();
        class_addButton = new javax.swing.JButton();
        room_deleteButton = new javax.swing.JButton();
        room_addButton = new javax.swing.JButton();
        manageCourses = new javax.swing.JPanel();
        titleCourses = new javax.swing.JLabel();
        course_background = new javax.swing.JPanel();
        course_jScrollPane = new javax.swing.JScrollPane();
        course_jTable = new javax.swing.JTable();
        choose_course = new javax.swing.JLabel();
        course_name = new javax.swing.JLabel();
        course_jComboBox = new javax.swing.JComboBox<>();
        teacher_counter = new javax.swing.JLabel();
        newCoursesTitle = new javax.swing.JLabel();
        course_teacher = new javax.swing.JLabel();
        assign_course = new javax.swing.JLabel();
        course_teacherTF = new javax.swing.JTextField();
        course_nameTF = new javax.swing.JTextField();
        assign_deleteButton = new javax.swing.JButton();
        assign_addButton = new javax.swing.JButton();
        course_deleteButton = new javax.swing.JButton();
        course_addButton = new javax.swing.JButton();
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
        exportJLabel = new javax.swing.JLabel();

        extraDialog.setTitle("Manage Grades - Extra Details");
        extraDialog.setBackground(new java.awt.Color(249, 249, 249));
        extraDialog.setMinimumSize(new java.awt.Dimension(760, 590));
        extraDialog.setResizable(false);
        extraDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(249, 249, 249));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_Best.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title_Best.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_Best.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_trophy_30px.png"))); // NOI18N
        title_Best.setText(" Top Student");
        Background.add(title_Best, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, 40));

        best_student.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        best_student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.add(best_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 760, 40));

        jPanel.setBackground(new java.awt.Color(29, 40, 56));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Background.add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 70));

        copyrightLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        copyrightLabel.setText("Copyright© 2021 TBD. All Rights Reserved");
        Background.add(copyrightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        title_Best1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title_Best1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_Best1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_leaderboard_30px.png"))); // NOI18N
        title_Best1.setText(" Best Five Students");
        Background.add(title_Best1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 250, 40));

        topfive.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        topfive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AM", "First Name", "Last Name", "Grade", "Title 5"
            }
        ));
        topfive.setRowHeight(32);
        topfive.setSelectionBackground(new java.awt.Color(29, 40, 56));
        topfive.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        topfive.setShowHorizontalLines(false);
        topfive.setShowVerticalLines(false);
        jScrollPane1.setViewportView(topfive);
        if (topfive.getColumnModel().getColumnCount() > 0) {
            topfive.getColumnModel().getColumn(0).setPreferredWidth(20);
            topfive.getColumnModel().getColumn(1).setPreferredWidth(40);
            topfive.getColumnModel().getColumn(2).setPreferredWidth(40);
            topfive.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 300, 560, 188));

        extraDialog.getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 590));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TBD2021 - Πληροφοριακό Σύστημα");
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

        studentPanel.setBackground(new java.awt.Color(29, 40, 56));
        studentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentPanelMousePressed(evt);
            }
        });
        studentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentLabel.setForeground(new java.awt.Color(249, 249, 249));
        studentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_student_male_24px.png"))); // NOI18N
        studentLabel.setText(" Manage Students");
        studentPanel.add(studentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(studentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 50));

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
        teacherLabel.setText(" Manage Teachers");
        teacherPanel.add(teacherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(teacherPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        classPanel.setBackground(new java.awt.Color(29, 40, 56));
        classPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classPanelMousePressed(evt);
            }
        });
        classPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classLabel.setForeground(new java.awt.Color(249, 249, 249));
        classLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_classroom_24px.png"))); // NOI18N
        classLabel.setText(" Manage Classes");
        classPanel.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(classPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        coursePanel.setBackground(new java.awt.Color(29, 40, 56));
        coursePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                coursePanelMousePressed(evt);
            }
        });
        coursePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(249, 249, 249));
        courseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_book_24px.png"))); // NOI18N
        courseLabel.setText(" Manage Courses");
        coursePanel.add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leftPanel.add(coursePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 50));

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

        leftPanel.add(gradesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_xing_140px.png"))); // NOI18N
        logo.setText("jLabel3");
        leftPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 120));

        jSplitPane.setLeftComponent(leftPanel);

        mainPanel.setBackground(new java.awt.Color(249, 249, 249));
        mainPanel.setLayout(new java.awt.CardLayout());

        manageStudent.setBackground(new java.awt.Color(249, 249, 249));
        manageStudent.setPreferredSize(new java.awt.Dimension(760, 590));
        manageStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMStudents.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleMStudents.setForeground(new java.awt.Color(249, 249, 249));
        titleMStudents.setText("Manage Students");
        manageStudent.add(titleMStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        s_amTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_amTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        s_amTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_amTFKeyTyped(evt);
            }
        });
        manageStudent.add(s_amTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 30));

        s_firstNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_firstNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageStudent.add(s_firstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 30));

        s_lastNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_lastNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageStudent.add(s_lastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 180, 30));

        s_fatherNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_fatherNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageStudent.add(s_fatherNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 180, 30));

        s_motherNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_motherNameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageStudent.add(s_motherNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 180, 30));

        s_maleRadioBtn.setBackground(new java.awt.Color(249, 249, 249));
        gender_buttonGroup.add(s_maleRadioBtn);
        s_maleRadioBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_maleRadioBtn.setSelected(true);
        s_maleRadioBtn.setText("Male");
        manageStudent.add(s_maleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        s_maleRadioBtn.getAccessibleContext().setAccessibleName("male");

        s_femaleRadioBtn.setBackground(new java.awt.Color(249, 249, 249));
        gender_buttonGroup.add(s_femaleRadioBtn);
        s_femaleRadioBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_femaleRadioBtn.setText("Female");
        manageStudent.add(s_femaleRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));
        s_femaleRadioBtn.getAccessibleContext().setAccessibleName("female");

        s_addressTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_addressTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageStudent.add(s_addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 180, 30));

        s_phoneTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_phoneTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        s_phoneTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_phoneTFKeyTyped(evt);
            }
        });
        manageStudent.add(s_phoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 180, 30));

        s_amLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_amLabel.setText("AM");
        manageStudent.add(s_amLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        s_firstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_firstNameLabel.setText("First Name");
        manageStudent.add(s_firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        s_lastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_lastNameLabel.setText("Last Name");
        manageStudent.add(s_lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        s_genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_genderLabel.setText("Gender");
        manageStudent.add(s_genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        s_fatherLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_fatherLabel.setText("Father Full Name");
        manageStudent.add(s_fatherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        s_motherLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_motherLabel.setText("Mother Full Name");
        manageStudent.add(s_motherLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        s_addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_addressLabel.setText("Address");
        manageStudent.add(s_addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        s_phoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_phoneNumberLabel.setText("Phone Number");
        manageStudent.add(s_phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        s_birthdateLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_birthdateLabel.setText("Date");
        manageStudent.add(s_birthdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        s_jTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        s_jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        s_jTable.setSelectionBackground(new java.awt.Color(29, 40, 56));
        s_jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        s_jTable.getTableHeader().setReorderingAllowed(false);
        s_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                s_jTableMousePressed(evt);
            }
        });
        s_jScrollPane.setViewportView(s_jTable);
        if (s_jTable.getColumnModel().getColumnCount() > 0) {
            s_jTable.getColumnModel().getColumn(0).setResizable(false);
            s_jTable.getColumnModel().getColumn(1).setResizable(false);
            s_jTable.getColumnModel().getColumn(2).setResizable(false);
            s_jTable.getColumnModel().getColumn(3).setResizable(false);
            s_jTable.getColumnModel().getColumn(4).setResizable(false);
            s_jTable.getColumnModel().getColumn(5).setResizable(false);
            s_jTable.getColumnModel().getColumn(6).setResizable(false);
            s_jTable.getColumnModel().getColumn(7).setResizable(false);
            s_jTable.getColumnModel().getColumn(8).setResizable(false);
        }

        manageStudent.add(s_jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 690, 270));

        s_addButton.setBackground(new java.awt.Color(29, 40, 56));
        s_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s_addButton.setForeground(new java.awt.Color(249, 249, 249));
        s_addButton.setText("ADD");
        s_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_addButtonActionPerformed(evt);
            }
        });
        manageStudent.add(s_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 80, 40));

        s_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        s_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        s_deleteButton.setText("DELETE");
        s_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_deleteButtonActionPerformed(evt);
            }
        });
        manageStudent.add(s_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 80, 40));

        s_resetText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s_resetText.setForeground(new java.awt.Color(0, 102, 153));
        s_resetText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_erase_24px_4.png"))); // NOI18N
        s_resetText.setText("Reset TextFields");
        s_resetText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s_resetText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                s_resetTextMousePressed(evt);
            }
        });
        manageStudent.add(s_resetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        s_updateButton.setBackground(new java.awt.Color(29, 40, 56));
        s_updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s_updateButton.setForeground(new java.awt.Color(249, 249, 249));
        s_updateButton.setText("UPDATE");
        s_updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s_updateButton.setEnabled(false);
        s_updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_updateButtonActionPerformed(evt);
            }
        });
        manageStudent.add(s_updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 40));

        labelBackground.setBackground(new java.awt.Color(29, 40, 56));
        labelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s_searchBarJPanel.setBackground(new java.awt.Color(255, 255, 255));
        s_searchBarJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        s_searchBarJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchIcon.setBackground(new java.awt.Color(255, 255, 255));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_18px.png"))); // NOI18N
        s_searchBarJPanel.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 20, 25));

        s_searchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s_searchBar.setForeground(new java.awt.Color(153, 153, 153));
        s_searchBar.setText("Type here to search");
        s_searchBar.setBorder(null);
        s_searchBar.setOpaque(false);
        s_searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s_searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s_searchBarFocusLost(evt);
            }
        });
        s_searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_searchBarKeyReleased(evt);
            }
        });
        s_searchBarJPanel.add(s_searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 0, 312, 25));

        labelBackground.add(s_searchBarJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 12, 345, 25));

        manageStudent.add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        s_jDateChooser.setBackground(new java.awt.Color(249, 249, 249));
        s_jDateChooser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        s_jDateChooser.setMaximumSize(new java.awt.Dimension(87, 20));
        s_jDateChooser.setMinimumSize(new java.awt.Dimension(87, 20));
        manageStudent.add(s_jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, 30));

        mainPanel.add(manageStudent, "manageStudent");
        manageStudent.getAccessibleContext().setAccessibleName("manageStudent");

        manageTeacher.setBackground(new java.awt.Color(249, 249, 249));
        manageTeacher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMTeachers.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleMTeachers.setForeground(new java.awt.Color(249, 249, 249));
        titleMTeachers.setText("Manage Teachers");
        manageTeacher.add(titleMTeachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        t_labelBackground.setBackground(new java.awt.Color(29, 40, 56));
        t_labelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_searchBarJPanel.setBackground(new java.awt.Color(255, 255, 255));
        t_searchBarJPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        t_searchBarJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchIcon1.setBackground(new java.awt.Color(255, 255, 255));
        searchIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_18px.png"))); // NOI18N
        t_searchBarJPanel.add(searchIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 1, 20, 25));

        t_searchBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_searchBar.setForeground(new java.awt.Color(153, 153, 153));
        t_searchBar.setText("Type here to search");
        t_searchBar.setBorder(null);
        t_searchBar.setOpaque(false);
        t_searchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_searchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_searchBarFocusLost(evt);
            }
        });
        t_searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_searchBarKeyReleased(evt);
            }
        });
        t_searchBarJPanel.add(t_searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 0, 312, 25));

        t_labelBackground.add(t_searchBarJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 12, 345, 25));

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

        t_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        t_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        t_deleteButton.setText("DELETE");
        t_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_deleteButtonActionPerformed(evt);
            }
        });
        manageTeacher.add(t_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 80, 40));

        t_addButton.setBackground(new java.awt.Color(29, 40, 56));
        t_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_addButton.setForeground(new java.awt.Color(249, 249, 249));
        t_addButton.setText("ADD");
        t_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        t_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_addButtonActionPerformed(evt);
            }
        });
        manageTeacher.add(t_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 80, 40));

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
        manageTeacher.add(t_updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 40));

        t_jTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        t_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Username", "Password", "Address", "Phone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_jTable.setSelectionBackground(new java.awt.Color(29, 40, 56));
        t_jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_jTable.getTableHeader().setReorderingAllowed(false);
        t_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_jTableMousePressed(evt);
            }
        });
        t_jScrollPane.setViewportView(t_jTable);
        if (t_jTable.getColumnModel().getColumnCount() > 0) {
            t_jTable.getColumnModel().getColumn(0).setResizable(false);
            t_jTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            t_jTable.getColumnModel().getColumn(1).setResizable(false);
            t_jTable.getColumnModel().getColumn(2).setResizable(false);
            t_jTable.getColumnModel().getColumn(3).setResizable(false);
            t_jTable.getColumnModel().getColumn(4).setResizable(false);
            t_jTable.getColumnModel().getColumn(5).setResizable(false);
            t_jTable.getColumnModel().getColumn(6).setResizable(false);
            t_jTable.getColumnModel().getColumn(7).setResizable(false);
        }

        manageTeacher.add(t_jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 690, 270));

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

        manageClasses.setBackground(new java.awt.Color(249, 249, 249));
        manageClasses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageClasses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleMClasses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleMClasses.setForeground(new java.awt.Color(249, 249, 249));
        titleMClasses.setText("Manage Classes");
        manageClasses.add(titleMClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        c_labelBackground.setBackground(new java.awt.Color(29, 40, 56));
        c_labelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        manageClasses.add(c_labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        c_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Class", "Last Name", "First Name", "AM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        c_jTable.setSelectionBackground(new java.awt.Color(29, 40, 56));
        c_jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        c_jTable.getTableHeader().setReorderingAllowed(false);
        c_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c_jTableMousePressed(evt);
            }
        });
        c_jScrollPane.setViewportView(c_jTable);

        manageClasses.add(c_jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 400, 460));

        choose.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        choose.setText("Choose Classroom");
        manageClasses.add(choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, -1));
        manageClasses.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 280, 20));

        c_name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        c_name.setText("Class Name");
        manageClasses.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jComboBox.setBorder(null);
        jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox.setLightWeightPopupEnabled(false);
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        manageClasses.add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 80, 30));

        counter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        counter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_team_30px.png"))); // NOI18N
        counter.setText("4");
        counter.setToolTipText("Number of Students");
        manageClasses.add(counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 90, 60, 30));

        newClassTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newClassTitle.setText("Make new Classroom");
        manageClasses.add(newClassTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        c_student.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        c_student.setText("Student AM");
        manageClasses.add(c_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        populateTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        populateTitle.setText("Populate Classroom");
        manageClasses.add(populateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        c_studentTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_studentTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        c_studentTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_studentTFKeyTyped(evt);
            }
        });
        manageClasses.add(c_studentTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        c_nameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_nameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageClasses.add(c_nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 30));

        class_updateButton.setBackground(new java.awt.Color(29, 40, 56));
        class_updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        class_updateButton.setForeground(new java.awt.Color(249, 249, 249));
        class_updateButton.setText("UPDATE");
        class_updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        class_updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_updateButtonActionPerformed(evt);
            }
        });
        manageClasses.add(class_updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 40));

        class_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        class_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        class_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        class_deleteButton.setText("DELETE");
        class_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        class_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_deleteButtonActionPerformed(evt);
            }
        });
        manageClasses.add(class_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 80, 40));

        class_addButton.setBackground(new java.awt.Color(29, 40, 56));
        class_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        class_addButton.setForeground(new java.awt.Color(249, 249, 249));
        class_addButton.setText("ADD");
        class_addButton.setToolTipText("Number of Students");
        class_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        class_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_addButtonActionPerformed(evt);
            }
        });
        manageClasses.add(class_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, 40));

        room_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        room_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        room_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        room_deleteButton.setText("DELETE");
        room_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        room_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_deleteButtonActionPerformed(evt);
            }
        });
        manageClasses.add(room_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 80, 40));

        room_addButton.setBackground(new java.awt.Color(29, 40, 56));
        room_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        room_addButton.setForeground(new java.awt.Color(249, 249, 249));
        room_addButton.setText("ADD");
        room_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        room_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_addButtonActionPerformed(evt);
            }
        });
        manageClasses.add(room_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 80, 40));

        mainPanel.add(manageClasses, "manageClasses");
        manageClasses.getAccessibleContext().setAccessibleName("manageClasses");
        manageClasses.getAccessibleContext().setAccessibleDescription("");

        manageCourses.setBackground(new java.awt.Color(249, 249, 249));
        manageCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleCourses.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleCourses.setForeground(new java.awt.Color(249, 249, 249));
        titleCourses.setText("Manage Courses");
        manageCourses.add(titleCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        course_background.setBackground(new java.awt.Color(29, 40, 56));
        course_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        manageCourses.add(course_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        course_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Course", "Last Name", "First Name", "Teacher ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        course_jTable.setSelectionBackground(new java.awt.Color(29, 40, 56));
        course_jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        course_jTable.getTableHeader().setReorderingAllowed(false);
        course_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                course_jTableMousePressed(evt);
            }
        });
        course_jScrollPane.setViewportView(course_jTable);

        manageCourses.add(course_jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 690, 270));

        choose_course.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        choose_course.setText("Choose Course");
        manageCourses.add(choose_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 110, -1));

        course_name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        course_name.setText("Course Name");
        manageCourses.add(course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        course_jComboBox.setBorder(null);
        course_jComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course_jComboBox.setLightWeightPopupEnabled(false);
        course_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_jComboBoxActionPerformed(evt);
            }
        });
        manageCourses.add(course_jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 230, 30));

        teacher_counter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        teacher_counter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_team_30px.png"))); // NOI18N
        teacher_counter.setToolTipText("Number of Teachers");
        manageCourses.add(teacher_counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 280, 60, 30));

        newCoursesTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newCoursesTitle.setText("Make new Course");
        manageCourses.add(newCoursesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        course_teacher.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        course_teacher.setText("Teacher ID");
        manageCourses.add(course_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        assign_course.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        assign_course.setText("Assign Course");
        manageCourses.add(assign_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        course_teacherTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_teacherTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        course_teacherTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                course_teacherTFKeyTyped(evt);
            }
        });
        manageCourses.add(course_teacherTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, 30));

        course_nameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_nameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        manageCourses.add(course_nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 280, 30));

        assign_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        assign_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        assign_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        assign_deleteButton.setText("DELETE");
        assign_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assign_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_deleteButtonActionPerformed(evt);
            }
        });
        manageCourses.add(assign_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 80, 40));

        assign_addButton.setBackground(new java.awt.Color(29, 40, 56));
        assign_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        assign_addButton.setForeground(new java.awt.Color(249, 249, 249));
        assign_addButton.setText("ASSIGN");
        assign_addButton.setToolTipText("Number of Students");
        assign_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assign_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_addButtonActionPerformed(evt);
            }
        });
        manageCourses.add(assign_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 80, 40));

        course_deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        course_deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_deleteButton.setForeground(new java.awt.Color(249, 249, 249));
        course_deleteButton.setText("DELETE");
        course_deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        course_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_deleteButtonActionPerformed(evt);
            }
        });
        manageCourses.add(course_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 40));

        course_addButton.setBackground(new java.awt.Color(29, 40, 56));
        course_addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        course_addButton.setForeground(new java.awt.Color(249, 249, 249));
        course_addButton.setText("ADD");
        course_addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        course_addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_addButtonActionPerformed(evt);
            }
        });
        manageCourses.add(course_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 80, 40));

        mainPanel.add(manageCourses, "manageCourses");

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
        grade_jTable.setSelectionBackground(new java.awt.Color(29, 40, 56));
        grade_jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        s_jTable2.setSelectionBackground(new java.awt.Color(29, 40, 56));
        s_jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        exportJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportJLabel.setForeground(new java.awt.Color(0, 102, 153));
        exportJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon_text_file.png"))); // NOI18N
        exportJLabel.setText("Export to file");
        exportJLabel.setToolTipText("");
        exportJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exportJLabelMousePressed(evt);
            }
        });
        manageGrades.add(exportJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));

        mainPanel.add(manageGrades, "manageGrades");

        jSplitPane.setRightComponent(mainPanel);
        mainPanel.getAccessibleContext().setAccessibleName("mainPanel");

        backgroundPanel.add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 25, 990, 610));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 998, 639));

        getAccessibleContext().setAccessibleName("TBD2021 - Πληροφοριακό Σύστημα");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Close program when [X] is clicked 
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Do you want to log out?", 
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(response){
            case JOptionPane.YES_OPTION: 
                extraDialog.dispose(); // close Extra Details (Grade Panel) window
                
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
        mouseoverFX(exitButton);
    }//GEN-LAST:event_exitButtonMouseEntered
    // [X] mouse out effects
    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        mouseoutFX(exitButton);
    }//GEN-LAST:event_exitButtonMouseExited
    // [-] Minimize current window
    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked
    // [-] mouse over effects
    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        mouseoverFX(minimizeButton);
    }//GEN-LAST:event_minimizeButtonMouseEntered
    // [-] mouse out effects
    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        mouseoutFX(minimizeButton);
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
            setLocation(p.x + evt.getX() - mousepX, p.y + evt.getY() - mousepY);
        }
    }//GEN-LAST:event_backgroundPanelMouseDragged1
   
    
/*
    Lines 1469 to 1619 are for Student management purposes
    KEY ACTIONS: Insert, Delete, Update & Search (case insensitive)
 */
    private void s_searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s_searchBarFocusGained
        if (s_searchBar.getText().equals("Type here to search")) 
            s_searchBar.setText("");
    }//GEN-LAST:event_s_searchBarFocusGained
    private void s_searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s_searchBarFocusLost
        if (s_searchBar.getText().equals("")) 
            s_searchBar.setText("Type here to search");
    }//GEN-LAST:event_s_searchBarFocusLost

    // Insert Student Info to Database
    private void s_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_addButtonActionPerformed
        getStudentSexSelectedRB(); // Get selected value of the Gender groupbutton 
        if (s_checkField()) studentAction(s_addButton);
    }//GEN-LAST:event_s_addButtonActionPerformed
    // Remove Student from Database
    private void s_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_deleteButtonActionPerformed
        getStudentSexSelectedRB(); // Get selected value of the Gender groupbutton 
        if (s_checkField()) studentAction(s_deleteButton);
    }//GEN-LAST:event_s_deleteButtonActionPerformed
     // Accept only numbers and space for Phone Number
    private void s_phoneTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_phoneTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {evt.consume();} 
    }//GEN-LAST:event_s_phoneTFKeyTyped
    // Accept only numbers for Student AM
    private void s_amTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_amTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_s_amTFKeyTyped
    // Reset all text fields
    private void s_resetTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_resetTextMousePressed
        changeGUI.clearTextField(studentTextFields());
        resetErrors("student"); // Reset colors after error print
        s_jDateChooser.setDate(null);
        
        if(s_updateButton.isEnabled()){s_updateButton.setEnabled(false);}
        if(!s_amTF.isEditable()){s_amTF.setEditable(true);}
    }//GEN-LAST:event_s_resetTextMousePressed
    // Update Student info
    private void s_updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_updateButtonActionPerformed
        if (s_checkField()) studentAction(s_updateButton); 
    }//GEN-LAST:event_s_updateButtonActionPerformed
    // Fill JTextFields with data from Student table
    private void s_jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_jTableMousePressed
        getStudentTableData();
        s_updateButton.setEnabled(true);
        s_amTF.setEditable(false);
    }//GEN-LAST:event_s_jTableMousePressed
   // Search for a specific Student
    private void s_searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_searchBarKeyReleased
        DefaultTableModel model = (DefaultTableModel) s_jTable.getModel();
        model.setRowCount(0);
        student.studentTable(s_jTable, s_searchBar.getText());
    }//GEN-LAST:event_s_searchBarKeyReleased

    // Fill Student table with database data
    private void getStudentTableData(){
        int rowIndex = s_jTable.getSelectedRow();
        model = (DefaultTableModel) s_jTable.getModel();

        // Get active Radio button value
        if (model.getValueAt(rowIndex, 3).toString().equals("Male"))
            s_maleRadioBtn.setSelected(true);
        else 
            s_femaleRadioBtn.setSelected(true);

        // Fill JTextFields with Table data
        s_amTF.setText(model.getValueAt(rowIndex, 0).toString());
        s_firstNameTF.setText(model.getValueAt(rowIndex, 1).toString());
        s_lastNameTF.setText(model.getValueAt(rowIndex, 2).toString());
        s_fatherNameTF.setText(model.getValueAt(rowIndex, 4).toString());
        s_motherNameTF.setText(model.getValueAt(rowIndex, 5).toString());
        s_addressTF.setText(model.getValueAt(rowIndex, 6).toString());
        s_phoneTF.setText(model.getValueAt(rowIndex, 7).toString());

        Date bdate;
        try {
            bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 8).toString());
            s_jDateChooser.setDate(bdate);
        } catch (ParseException ex) {
            Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Set values from JTextFields to Student
    private void setStudent(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String bdate = dateFormat.format(s_jDateChooser.getDate());
        
        getStudentSexSelectedRB(); // Get selected value of the Gender groupbutton 
        
        student.setAM(Integer.valueOf(s_amTF.getText()));
        student.setFName(s_firstNameTF.getText().trim());
        student.setLName(s_lastNameTF.getText().trim());
        student.setGender(choice);
        student.setFather(s_fatherNameTF.getText().trim());
        student.setMother(s_motherNameTF.getText().trim());
        student.setAddress(s_addressTF.getText().trim());
        student.setPhone(s_phoneTF.getText().trim());
        student.setBirthday(bdate);
    }
    // Perform action to the database
    private void studentAction(JButton button){
        int response = JOptionPane.showConfirmDialog(null, "Do you want to "+button.getText().toLowerCase()+" this Student?", 
                        "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            switch(response){
                    case JOptionPane.YES_OPTION:
                        setStudent();
                        student.manageStudent(button.getText());  
                        changeGUI.clearTextField(studentTextFields());
                        s_jDateChooser.setDate(null);
                        s_amTF.setEditable(true);
                        if(s_updateButton.isEnabled()){s_updateButton.setEnabled(false);}
                        break;
                    case JOptionPane.NO_OPTION:
                        System.out.println("[OPTION=NO]: "+button.getText()+" action was cancelled.");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        System.out.println("[OPTION=CLOSED]: Box is closed. "+button.getText()+" action was cancelled.");                        
                    default:
                        break;
                }           
            
            DefaultTableModel model = (DefaultTableModel) s_jTable.getModel();
            model.setRowCount(0);
            student.studentTable(s_jTable, "");

            DefaultTableModel grade_model = (DefaultTableModel) s_jTable2.getModel();
            grade_model.setRowCount(0);
            student.studentTable(s_jTable2, "");
    }
    // Check if all required fields have been filled
    public boolean s_checkField() {
        if (studentEmpty()) {       
            handleErrors("student"); // Change UI to notify user for errors           
            return false;
        } else if (s_jDateChooser.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "Invalid date.");
            return false;
        }      
        resetErrors("student"); // Reset colors after error print        
        return true;
    }
    // Check if Student fields are empty
    private boolean studentEmpty(){
        if(s_amTF.getText().equals("") || s_firstNameTF.getText().equals("") || s_lastNameTF.getText().equals("")
                || s_fatherNameTF.getText().equals("") || s_motherNameTF.getText().equals("") || s_addressTF.getText().equals("")
                || s_phoneTF.getText().equals("") || s_jDateChooser.getDate() == null)
            return true;
        return false;
    }
/*
    End of Student management code
*/

/*
    Lines 1628 to 1750 are for Teacher management purposes
    KEY ACTIONS: Insert, Delete, Update & Search (case insensitive)
 */
    private void t_searchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_searchBarFocusGained
        if (t_searchBar.getText().equals("Type here to search")) {
            t_searchBar.setText("");
        }
    }//GEN-LAST:event_t_searchBarFocusGained
    private void t_searchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_searchBarFocusLost
        if (t_searchBar.getText().equals("")) {
            t_searchBar.setText("Type here to search");
        }
    }//GEN-LAST:event_t_searchBarFocusLost
    
    // Search for a specific Teacher
    private void t_searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchBarKeyReleased
        DefaultTableModel model = (DefaultTableModel) t_jTable.getModel();
        model.setRowCount(0);
        teacher.teacherTable(t_jTable, t_searchBar.getText());
    }//GEN-LAST:event_t_searchBarKeyReleased
    // Accept only numbers for Teacher ID
    private void t_idTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_idTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_t_idTFKeyTyped
    // Accept only numbers and space for Phone Number
    private void t_phoneTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_phoneTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) {evt.consume();} 
    }//GEN-LAST:event_t_phoneTFKeyTyped
    // Remove Teacher from Database
    private void t_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_deleteButtonActionPerformed
        if (t_checkField()) teacherAction(t_deleteButton);
    }//GEN-LAST:event_t_deleteButtonActionPerformed
    // Insert Teacher into Database
    private void t_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_addButtonActionPerformed
        if (t_checkField()) teacherAction(t_addButton);
    }//GEN-LAST:event_t_addButtonActionPerformed
    // Update Teacher info
    private void t_updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_updateButtonActionPerformed
        if (t_checkField()) teacherAction(t_updateButton);
    }//GEN-LAST:event_t_updateButtonActionPerformed
    // Fill JTextFields with data from Teacher table
    private void t_jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_jTableMousePressed
         getTeacherTableData();
        t_updateButton.setEnabled(true);
        t_idTF.setEditable(false);
    }//GEN-LAST:event_t_jTableMousePressed
    // Reset all text fields
    private void t_resetTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_resetTextMousePressed
        changeGUI.clearTextField(teacherTextFields());
        resetErrors("teacher"); // Reset colors after error print
        
        if(t_updateButton.isEnabled()){t_updateButton.setEnabled(false);}
        if(!t_idTF.isEditable()){t_idTF.setEditable(true);}
    }//GEN-LAST:event_t_resetTextMousePressed

    // Fill Teacher table with database data
    private void getTeacherTableData(){
        int rowIndex = t_jTable.getSelectedRow();
        model = (DefaultTableModel) t_jTable.getModel();

        // Fill JTextFields with Table data
        t_idTF.setText(model.getValueAt(rowIndex, 0).toString());
        t_firstNameTF.setText(model.getValueAt(rowIndex, 1).toString());
        t_lastNameTF.setText(model.getValueAt(rowIndex, 2).toString());
        t_usernameTF.setText(model.getValueAt(rowIndex, 3).toString());
        t_jPassword.setText(model.getValueAt(rowIndex, 4).toString());
        t_jPassword2.setText(model.getValueAt(rowIndex, 4).toString());
        t_addressTF.setText(model.getValueAt(rowIndex, 5).toString());
        t_phoneTF.setText(model.getValueAt(rowIndex, 6).toString());
        t_emailTF.setText(model.getValueAt(rowIndex, 7).toString());
    }
    // Set values from JTextFields to Teacher
    private void setTeacher() {
        teacher.setID(Integer.valueOf(t_idTF.getText()));
        teacher.setFName(t_firstNameTF.getText().trim());
        teacher.setLName(t_lastNameTF.getText().trim());
        teacher.setUsername(t_lastNameTF.getText().trim());
        teacher.setPassword(t_jPassword.getText().trim());
        teacher.setAddress(t_addressTF.getText().trim());
        teacher.setPhone(t_phoneTF.getText().trim());
        teacher.setEmail(t_emailTF.getText().trim());
    }
    // Perform action to the database
    private void teacherAction(JButton button) {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to " + button.getText().toLowerCase() + " this Teacher?",
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (response) {
            case JOptionPane.YES_OPTION:
                setTeacher();
                teacher.manageTeacher(button.getText());
                changeGUI.clearTextField(teacherTextFields());
                t_idTF.setEditable(true);
                if (t_updateButton.isEnabled())
                    t_updateButton.setEnabled(false);
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("[OPTION=NO]: " + button.getText() + " action was cancelled.");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("[OPTION=CLOSED]: Box is closed. " + button.getText() + " action was cancelled.");
            default:
                break;
        }

        DefaultTableModel model = (DefaultTableModel) t_jTable.getModel();
        model.setRowCount(0);
        teacher.teacherTable(t_jTable, "");
    }
    // Check if all required fields have been filled
   public boolean t_checkField() {
        if (teacherEmpty()) {
            handleErrors("teacher"); // Change UI to notify user for errors        
            return false;
        }
        resetErrors("teacher"); // Reset colors after error print
        return true;
    } 
    // Check if Teacher fields are empty
    private boolean teacherEmpty() {
        if (t_idTF.getText().equals("") || t_firstNameTF.getText().equals("") || t_lastNameTF.getText().equals("")
                || t_usernameTF.getText().equals("") || t_jPassword.getText().equals("") || t_jPassword2.getText().equals("")
                || t_emailTF.getText().equals("") || t_phoneTF.getText().equals("") || t_addressTF.getText().equals(""))
            return true;
        return false;
    }   
/*
    End of Teacher management code
*/   

   
// ========= CARDLAYOUT ========= CARDLAYOUT ========= CARDLAYOUT ================   
    // Set Student panel active
    private void studentPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentPanelMousePressed
        cardLayout.show(mainPanel, "manageStudent");
        setActivePanel(studentPanel);
    }//GEN-LAST:event_studentPanelMousePressed
    // Set Teacher panel active
    private void teacherPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherPanelMousePressed
        cardLayout.show(mainPanel, "manageTeacher");
        setActivePanel(teacherPanel);
    }//GEN-LAST:event_teacherPanelMousePressed
    // Set Courses panel active
    private void coursePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursePanelMousePressed
        cardLayout.show(mainPanel, "manageCourses");
        setActivePanel(coursePanel);
    }//GEN-LAST:event_coursePanelMousePressed
    // Set Grades panel active
    private void gradesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradesPanelMousePressed
        cardLayout.show(mainPanel, "manageGrades");
        setActivePanel(gradesPanel);
    }//GEN-LAST:event_gradesPanelMousePressed
    // Set Classes panel active
    private void classPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classPanelMousePressed
        cardLayout.show(mainPanel, "manageClasses");
        setActivePanel(classPanel);
    }//GEN-LAST:event_classPanelMousePressed
// END OF CARDLAYOUT  // END OF CARDLAYOUT // END OF CARDLAYOUT // END OF CARDLAYOUT
    
    
/*
    Lines 1790 to 1830 are for Classroom management purposes
    KEY ACTIONS: Insert & Delete
 */
    // Add new Classroom to Database
    private void room_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_addButtonActionPerformed
        if(c_nameTF.getText().isEmpty()){
            changeGUI.errorColors(c_name, c_nameTF);
            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        }else{
            classAction(room_addButton);
        } // End of isEmpty
    }//GEN-LAST:event_room_addButtonActionPerformed

    // Remove Classroom from Database
    private void room_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_deleteButtonActionPerformed
        if(c_nameTF.getText().isEmpty()){
            changeGUI.errorColors(c_name, c_nameTF);
            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        }else{
            classAction(room_deleteButton);
        } // End of isEmpty
    }//GEN-LAST:event_room_deleteButtonActionPerformed
    // Perform action to the database
    private void classAction(JButton button){
        int response = JOptionPane.showConfirmDialog(null, "Do you want to " + button.getText().toLowerCase() + " this Classroom?",
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (response) {
            case JOptionPane.YES_OPTION:
                mclass.setClassroomName(c_nameTF.getText());
                mclass.manageClassroom(button.getText());
                resetErrors("classroom"); // Reset colors after error print        

                jComboBox.removeAllItems();
                 mclass.classList(jComboBox);  
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("[OPTION=NO]: " + button.getText() + " action was cancelled.");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("[OPTION=CLOSED]: Box is closed. " + button.getText() + " action was cancelled.");
            default:
                break;
        }
    }
    
    
/*
    Lines 1825 to 1929 are for Classroom management purposes
    KEY ACTIONS: Populate Classroom [Insert, Delete, Update Students]
 */    
    // Add Student to a Class
    private void class_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_addButtonActionPerformed
        if(roomEmpty()){
            room_checkField();
        }else{
            if(!student.contains(Integer.valueOf(c_studentTF.getText())))
                JOptionPane.showMessageDialog(this, "Student with AM "+c_studentTF.getText()+" does not exist.");
            else
                classroomAction(class_addButton);
        } // End of if
    }//GEN-LAST:event_class_addButtonActionPerformed
    // Remove Student from Class
    private void class_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_deleteButtonActionPerformed
        if(roomEmpty()){
            room_checkField();
        }else{
            if(!student.contains(Integer.valueOf(c_studentTF.getText())))
                JOptionPane.showMessageDialog(this, "Student with AM  "+c_studentTF.getText()+" does not exist.");
            else
                classroomAction(class_deleteButton);
        } // End of if
    }//GEN-LAST:event_class_deleteButtonActionPerformed
    // Change Student's Class
    private void class_updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_updateButtonActionPerformed
        if(roomEmpty()){
            room_checkField();
        }else{
            if(!student.contains(Integer.valueOf(c_studentTF.getText())))
                JOptionPane.showMessageDialog(this, "Student with AM "+c_studentTF.getText()+" does not exist.");
            else
                classroomAction(class_updateButton);
        } // End of if
    }//GEN-LAST:event_class_updateButtonActionPerformed
    // Accept only numbers for Student AM
    private void c_studentTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_studentTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_c_studentTFKeyTyped
    // Filter Table based on ComboBox selection 
    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        DefaultTableModel model2 = (DefaultTableModel) c_jTable.getModel();
        model2.setRowCount(0);
        String selected = String.valueOf(jComboBox.getSelectedItem());

        mclass.classTable(c_jTable, selected);
        int number = mclass.getNumberOfStudents();
        counter.setText(String.valueOf(number));
    }//GEN-LAST:event_jComboBoxActionPerformed
    // Fill text field
    private void c_jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_jTableMousePressed
        int rowIndex = c_jTable.getSelectedRow();
        model = (DefaultTableModel) c_jTable.getModel();

        c_studentTF.setText(model.getValueAt(rowIndex, 4).toString());
        jComboBox.setSelectedItem(model.getValueAt(rowIndex, 1).toString());

        class_updateButton.setEnabled(true);
    }//GEN-LAST:event_c_jTableMousePressed
    
    // Set values from JTextFields to Classroom
    private void setClassroom() {
        mclass.setClassroomName(jComboBox.getSelectedItem().toString());
        mclass.setStudentID(Integer.valueOf(c_studentTF.getText()));
    }
    // Perform action to the database
    private void classroomAction(JButton button) {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to " + button.getText().toLowerCase() + " this Student?",
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (response) {
            case JOptionPane.YES_OPTION:
                setClassroom();
                mclass.manageClass(button.getText());
                changeGUI.clearTextField(teacherTextFields());               
                resetErrors("classroom"); // Reset colors after error print        
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("[OPTION=NO]: " + button.getText() + " action was cancelled.");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("[OPTION=CLOSED]: Box is closed. " + button.getText() + " action was cancelled.");
            default:
                break;
        }

        DefaultTableModel model = (DefaultTableModel) c_jTable.getModel();
        model.setRowCount(0);
        mclass.classTable(c_jTable, String.valueOf(jComboBox.getSelectedItem()));
    }
    // Check if all required fields have been filled
    private boolean room_checkField() {
        if (roomEmpty()) {
            handleErrors("classroom"); // Change UI to notify user for errors        
            return false;
        }
        //resetErrors("classroom", "reset"); // Reset colors after error print        
        return true;
    } 
    // Check if Classroom fields are empty
    private boolean roomEmpty(){
        if(jComboBox.getSelectedItem().equals("") || c_studentTF.getText().isEmpty())
            return true;
       
        return false;
    }
/*
    End of Classroom management code
*/ 
    
    
/*
    Lines 1936 to 2062 are for Course management purposes
    KEY ACTIONS: Insert, Delete
 */ 
    private void course_jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_jTableMousePressed
        int rowIndex = course_jTable.getSelectedRow();
        model = (DefaultTableModel) course_jTable.getModel();

        course_teacherTF.setText(model.getValueAt(rowIndex, 4).toString());
        course_jComboBox.setSelectedItem(model.getValueAt(rowIndex, 1).toString());

        //assign_updateButton.setEnabled(true);
    }//GEN-LAST:event_course_jTableMousePressed
    // Filter JTable based on ComboBox selection
    private void course_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_jComboBoxActionPerformed
        DefaultTableModel model3 = (DefaultTableModel) course_jTable.getModel();
        model3.setRowCount(0);
        String selected = String.valueOf(course_jComboBox.getSelectedItem());

        course.courseTable(course_jTable, selected);
        int number = course.getNumberOfTeachers();
        teacher_counter.setText(String.valueOf(number));
    }//GEN-LAST:event_course_jComboBoxActionPerformed

    // Accept only numbers for Teacher ID
    private void course_teacherTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_teacherTFKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_course_teacherTFKeyTyped

    // Remove assignment from Teacher
    private void assign_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_deleteButtonActionPerformed
        if(assigmentEmpty()){
            handleErrors("assignment");
        }else{
            if(!teacher.contains(Integer.valueOf(course_teacherTF.getText())))
                JOptionPane.showMessageDialog(this, "Teacher with ID = "+course_teacherTF.getText()+" does not exist.");
            else
                assignmentAction(assign_deleteButton);
        } // End of isEmpty
    }//GEN-LAST:event_assign_deleteButtonActionPerformed
    // Assign Course to Teacher
    private void assign_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_addButtonActionPerformed
        if(assigmentEmpty()){
            handleErrors("assignment");
        }else{
            if(!teacher.contains(Integer.valueOf(course_teacherTF.getText())))
                JOptionPane.showMessageDialog(this, "Teacher with ID = "+course_teacherTF.getText()+" does not exist.");
            else
                assignmentAction(assign_addButton);
        } // End of isEmpty
    }//GEN-LAST:event_assign_addButtonActionPerformed

    // Remove Course from Database
    private void course_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_deleteButtonActionPerformed
        if(course_nameTF.getText().isEmpty())
            handleErrors("course");
        else
            courseAction(course_deleteButton);
    }//GEN-LAST:event_course_deleteButtonActionPerformed
    // Add a new Course to Database
    private void course_addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_addButtonActionPerformed
        if(course_nameTF.getText().isEmpty())
            handleErrors("course");
        else
            courseAction(course_addButton);  
    }//GEN-LAST:event_course_addButtonActionPerformed
 
    private void courseAction(JButton button){
        int response = JOptionPane.showConfirmDialog(null, "Do you want to "+button.getText().toLowerCase()+" this Course?", 
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        switch(response){
                case JOptionPane.YES_OPTION:
                    course.setCourseName(course_nameTF.getText());
                    course.manageCourses(button.getText());
                    resetErrors("course");
          
                    // Update Course list [Course Panel]
                    course_jComboBox.removeAllItems();
                    course.courseList(course_jComboBox);

                    // Update Course list [Grade Panel]
                    course_jComboBox1.removeAllItems();
                    course.courseList(course_jComboBox1);
                    break;
                case JOptionPane.NO_OPTION:
                    System.out.println("[OPTION=NO]: "+button.getText()+" action was cancelled.");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.out.println("[OPTION=CLOSED]: Box is closed. "+button.getText()+" action was cancelled.");
                default:
                    break;
            }           
        course.getNumberOfTeachers();                  
    }
    
    // Set values from JTextFields to Course
    private void setCourse() {
        course.setCourseName(course_jComboBox.getSelectedItem().toString());
        course.setTeacherID(Integer.valueOf(course_teacherTF.getText()));
    }
    // Perform action to the database
    private void assignmentAction(JButton button) {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to " + button.getText().toLowerCase() + " this Teacher?",
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch (response) {
            case JOptionPane.YES_OPTION:
                setCourse();
                resetErrors("assignment"); // Reset colors after error print
                course.manageAssignments(button.getText());
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("[OPTION=NO]: " + button.getText() + " action was cancelled.");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("[OPTION=CLOSED]: Box is closed. " + button.getText() + " action was cancelled.");
            default:
                break;
        }

        DefaultTableModel model = (DefaultTableModel) course_jTable.getModel();
        model.setRowCount(0);
        course.courseTable(course_jTable, String.valueOf(course_jComboBox.getSelectedItem()));
    }
    // Check if Course Assignment fields are empty
    private boolean assigmentEmpty() {
        if (course_jComboBox.getSelectedItem().equals("") || course_teacherTF.getText().isEmpty())
            return true;
        return false;
    } 
/*
    End of Course management code
*/ 
      
    
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
        if(gradeEmpty()){
            handleErrors("grade");
        }else{
            if(Integer.valueOf(grade_TF.getText()) > 20){
                JOptionPane.showMessageDialog(this, "This student is too good! Acceptable grade values: [0-20]");
                changeGUI.errorColors(gradeJLabel, grade_TF);
            }else{
                gradeAction();
            }
        }
    }//GEN-LAST:event_grade_setButtonActionPerformed

    private void extrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extrasMousePressed
        extraDialog.setVisible(true);
        extraDialog.pack();
        extraDialog.setLocationRelativeTo(null);
             
        DefaultTableModel model = (DefaultTableModel) topfive.getModel();
        model.setRowCount(0);
        
        grade.top_student(best_student);
        grade.top_five_students(topfive);
    }//GEN-LAST:event_extrasMousePressed
    
    private void s_jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_jTable2MousePressed
        exportJLabel.setVisible(true);
        
        int rowIndex = s_jTable2.getSelectedRow();
        model = (DefaultTableModel) s_jTable2.getModel();
        
        DefaultTableModel grade_model = (DefaultTableModel) grade_jTable.getModel();
        grade_model.setRowCount(0);
        
        sid_grade = (model.getValueAt(rowIndex, 0).toString());      
        grade.gradesTable(grade_jTable, Integer.valueOf(sid_grade));
        
        g_student.setText(" "+ model.getValueAt(rowIndex, 1).toString() + " " + model.getValueAt(rowIndex, 2).toString());
        
        grade.avg_grade(Integer.valueOf(sid_grade), averageNumber);
    }//GEN-LAST:event_s_jTable2MousePressed

    private void exportJLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportJLabelMousePressed
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();

            if(file == null)
                return;

            if (!file.getName().toLowerCase().endsWith(".txt"))
                file = new File(file.getParentFile(), file.getName() + ".txt"); 
            
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter buff = new BufferedWriter(fw);

                buff.write("Full name: "+g_student.getText());
                buff.newLine();
                buff.newLine();


                buff.write(String.format("%-30s%4s%4s%4s",grade_jTable.getColumnName(0),
                        grade_jTable.getColumnName(1),grade_jTable.getColumnName(2),grade_jTable.getColumnName(3)));
                buff.newLine();

                for (int row = 0; row < grade_jTable.getRowCount(); row++) {
                    for (int col = 0; col < 4; col++) {
                        if (col == 0)
                            buff.write(String.format("%-30s",grade_jTable.getValueAt(row, col).toString()));
                        else 
                            buff.write(String.format("%4s", grade_jTable.getValueAt(row, col).toString()));
                    }
                    buff.newLine();
                }

                buff.newLine();
                buff.write("Average Grade: "+averageNumber.getText());

                buff.close();
                fw.close();
                
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                System.err.println("JTable Grade data Error --- "+e.toString());
            }
        }
    }//GEN-LAST:event_exportJLabelMousePressed

    private boolean gradeEmpty(){
        if(course_jComboBox1.getSelectedItem().equals("") || g_student.getText().isEmpty() || grade_TF.getText().equals(""))
            return true;
        return false;
    }
    
    private void gradeAction(){
        int response = JOptionPane.showConfirmDialog(null, "Do you want to set this Grade?", 
                    "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        switch(response){
                case JOptionPane.YES_OPTION:
                    setGrade();
                    grade.manage_grades();
                    grade.avg_grade(Integer.valueOf(sid_grade), averageNumber);
                    resetErrors("grade");
                    break;
                case JOptionPane.NO_OPTION:
                    System.out.println("[OPTION=NO]: SET action was cancelled.");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    System.out.println("[OPTION=CLOSED]: Box is closed. SET action was cancelled.");
                default:
                    break;
        }    
        
        DefaultTableModel grade_model = (DefaultTableModel) grade_jTable.getModel();
        grade_model.setRowCount(0);
        grade.gradesTable(grade_jTable, Integer.valueOf(sid_grade));
    }
    
    private void setGrade(){
        // Get value of groupbutton                 
        if (semester_a.isSelected())
            semesters = semester_a.getText();
        else if (semester_b.isSelected())
            semesters = semester_b.getText();
        else if (semester_c.isSelected())
            semesters = semester_c.getText();
        
        grade.setCourseName(String.valueOf(course_jComboBox1.getSelectedItem()));
        grade.setStudentID(Integer.valueOf(sid_grade));
        grade.setSemester(semesters);
        grade.setGrades(Integer.valueOf(grade_TF.getText()));
    }
    
    
    private void setActivePanel(JPanel panel) {
        for (int i = 0; i < menuPanels().size(); i++) {
            JPanel currentPanel = (JPanel) menuPanels().elementAt(i);
            if (panel.equals(currentPanel))
                setColor(currentPanel);
            else 
                resetColor(currentPanel);
        }
    }
    private Vector menuPanels() {
        Vector vector = new Vector(5, 1);

        vector.add(studentPanel);
        vector.add(teacherPanel);
        vector.add(classPanel);
        vector.add(coursePanel);
        vector.add(gradesPanel);

        return vector;
    } 
    
    // Change UI when error occurs
    private void handleErrors(String type){
        if(type.equals("student")){
            changeGUI.errorColors(s_amLabel, s_amTF);
            changeGUI.errorColors(s_firstNameLabel, s_firstNameTF);
            changeGUI.errorColors(s_lastNameLabel, s_lastNameTF);
            changeGUI.errorColors(s_genderLabel);
            changeGUI.errorColors(s_fatherLabel, s_fatherNameTF);
            changeGUI.errorColors(s_motherLabel, s_motherNameTF);
            changeGUI.errorColors(s_addressLabel, s_addressTF);
            changeGUI.errorColors(s_phoneNumberLabel, s_phoneTF);
            changeGUI.errorColors(s_birthdateLabel);
            s_jDateChooser.setBorder(BorderFactory.createEtchedBorder(null, Color.red));
      
            JOptionPane.showMessageDialog(null, "All required fields must be filled out.");
            System.err.println("[WARNING]: All required fields must be filled out.");
        } else if(type.equals("teacher")){
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
            System.err.println("[WARNING]: All required fields must be filled out.");
        } else if(type.equals("classroom")){
            changeGUI.errorColors(c_student, c_studentTF);
            changeGUI.errorColors(choose);

            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        } else if(type.equals("assignment")){
            changeGUI.errorColors(course_teacher, course_teacherTF);
            changeGUI.errorColors(choose_course);

            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        } else if(type.equals("course")){
            changeGUI.errorColors(course_name, course_nameTF);
            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        } else if(type.equals("grade")){
            changeGUI.errorColors(studentJLabel, g_student);
            changeGUI.errorColors(gradeJLabel, grade_TF);
            changeGUI.errorColors(courseJLabel);
            
            JOptionPane.showMessageDialog(this, "All required fields must be filled out.");
        }
    } 
    private void resetErrors(String type){
        if(type.equals("student")){
            changeGUI.resetColors(s_amLabel, s_amTF);
            changeGUI.resetColors(s_firstNameLabel, s_firstNameTF);
            changeGUI.resetColors(s_lastNameLabel, s_lastNameTF);
            changeGUI.resetColors(s_genderLabel);
            changeGUI.resetColors(s_fatherLabel, s_fatherNameTF);
            changeGUI.resetColors(s_motherLabel, s_motherNameTF);
            changeGUI.resetColors(s_addressLabel, s_addressTF);
            changeGUI.resetColors(s_phoneNumberLabel, s_phoneTF);
            changeGUI.resetColors(s_birthdateLabel);
            s_jDateChooser.setBorder(null);
        } else if(type.equals("teacher")){
            changeGUI.resetColors(t_idLabel, t_idTF);
            changeGUI.resetColors(t_firstNameLabel, t_firstNameTF);
            changeGUI.resetColors(t_lastNameLabel, t_lastNameTF);
            changeGUI.resetColors(t_username, t_usernameTF);
            changeGUI.resetColors(t_passwd, t_jPassword);
            changeGUI.resetColors(t_passwd2, t_jPassword2);
            changeGUI.resetColors(t_email, t_emailTF);
            changeGUI.resetColors(t_phoneNumber, t_phoneTF);
            changeGUI.resetColors(t_addressLabel, t_addressTF);
        } else if(type.equals("classroom")){
            c_name.setText("");c_nameTF.setText("");
            changeGUI.resetColors(c_name, c_nameTF);     
        } else if(type.equals("assignment")){
            course_teacherTF.setText("");
            changeGUI.resetColors(course_teacher, course_teacherTF);    
            changeGUI.resetColors(choose_course);
        } else if(type.equals("course")){
            course_nameTF.setText("");
            changeGUI.resetColors(course_name, course_nameTF);
        } else if(type.equals("grade")){
            grade_TF.setText("");
            changeGUI.resetColors(studentJLabel, g_student);
            changeGUI.resetColors(gradeJLabel, grade_TF);
            changeGUI.resetColors(courseJLabel);
        }
    }
    
    // Initialize elements
    private void initialize(){
        // Table initialization 
        student.studentTable(s_jTable, "");
        student.studentTable(s_jTable2, "");
        teacher.teacherTable(t_jTable, "");
        mclass.classTable(c_jTable, "");   
        course.courseTable(course_jTable, "");
        grade.gradesTable(grade_jTable, 0);  
        grade.avg_grade(0, averageNumber);
        
        // ComboBox initialization 
        mclass.classList(jComboBox); 
        course.courseList(course_jComboBox);
        course.courseList(course_jComboBox1);
        
        cardLayout = (CardLayout) (mainPanel.getLayout());
        
        s_jDateChooser.setBorder(null);
   
        exportJLabel.setVisible(false);
        
        setColor(studentPanel); // Make background color look lighter | Beeing selected effect

        // Replacing the password asterisks to dots [TEACHER PANEL]
        t_jPassword.setEchoChar('\u25CF');
        t_jPassword2.setEchoChar('\u25CF');
    }
    
    public Vector studentTextFields(){
        Vector vector = new Vector(7, 1); 
        
        vector.add(s_amTF);
        vector.add(s_firstNameTF);
        vector.add(s_lastNameTF);
        vector.add(s_fatherNameTF);
        vector.add(s_motherNameTF);
        vector.add(s_addressTF);
        vector.add(s_phoneTF);
        
        return vector;
    }
    private Vector teacherTextFields(){
        Vector vector = new Vector(9, 1);
        
        vector.add(t_idTF);
        vector.add(t_firstNameTF);
        vector.add(t_lastNameTF);
        vector.add(t_usernameTF);
        vector.add(t_jPassword);
        vector.add(t_jPassword2);
        vector.add(t_emailTF);
        vector.add(t_addressTF);
        vector.add(t_phoneTF);
        
        return vector;
    }
     
    // MouseOver Effects
    private void mouseoverFX(JLabel button) {
        if (button.equals(exitButton)) {
            button.setOpaque(true);
            button.setBackground(new Color(255, 51, 51));
            button.setForeground(new Color(249, 249, 249));
            button.setToolTipText("Close");
        } else if (button.equals(minimizeButton)) {
            button.setOpaque(true);
            button.setBackground(new Color(29, 40, 56));
            button.setForeground(new Color(249, 249, 249));
            button.setToolTipText("Minimize");
        }
    }
    // MouseOut Effects
    private void mouseoutFX(JLabel button) {
        if (button.equals(exitButton)) {
            button.setOpaque(false);
            button.setBackground(new Color(0, 0, 0, 0));
            button.setForeground(new Color(22, 30, 42));
            button.setToolTipText("");
        } else if (button.equals(minimizeButton)) {
            button.setOpaque(false);
            button.setBackground(new Color(0, 0, 0, 0));
            button.setForeground(new Color(22, 30, 42));
            button.setToolTipText("");
        }
    }
    
    private void getStudentSexSelectedRB(){
        // Get selected value of the Gender groupbutton        
        if (s_maleRadioBtn.isSelected())
            choice = s_maleRadioBtn.getText();
        else if (s_femaleRadioBtn.isSelected())
            choice = s_femaleRadioBtn.getText();
    }
    
    // setColor and resetColor methods to change JPANELs' [under left panel] appearance
    private void setColor(JPanel panel) { panel.setBackground(new Color(43, 60, 84)); }
    private void resetColor(JPanel panel) { panel.setBackground(new Color(29, 40, 56)); }

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
    private javax.swing.JPanel Background;
    private javax.swing.JButton assign_addButton;
    private javax.swing.JLabel assign_course;
    private javax.swing.JButton assign_deleteButton;
    private javax.swing.JLabel averageLabel;
    private javax.swing.JLabel averageNumber;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel best_student;
    private javax.swing.JScrollPane c_jScrollPane;
    private javax.swing.JTable c_jTable;
    private javax.swing.JPanel c_labelBackground;
    private javax.swing.JLabel c_name;
    private javax.swing.JTextField c_nameTF;
    private javax.swing.JLabel c_student;
    private javax.swing.JTextField c_studentTF;
    private javax.swing.JLabel choose;
    private javax.swing.JLabel choose_course;
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel classPanel;
    private javax.swing.JButton class_addButton;
    private javax.swing.JButton class_deleteButton;
    private javax.swing.JButton class_updateButton;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JLabel counter;
    private javax.swing.JLabel courseJLabel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JButton course_addButton;
    private javax.swing.JPanel course_background;
    private javax.swing.JButton course_deleteButton;
    private javax.swing.JComboBox<String> course_jComboBox;
    private javax.swing.JComboBox<String> course_jComboBox1;
    private javax.swing.JScrollPane course_jScrollPane;
    private javax.swing.JScrollPane course_jScrollPane1;
    private javax.swing.JTable course_jTable;
    private javax.swing.JLabel course_name;
    private javax.swing.JTextField course_nameTF;
    private javax.swing.JLabel course_teacher;
    private javax.swing.JTextField course_teacherTF;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel exportJLabel;
    private javax.swing.JDialog extraDialog;
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
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel labelBackground;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel manageClasses;
    private javax.swing.JPanel manageCourses;
    private javax.swing.JPanel manageGrades;
    private javax.swing.JPanel manageStudent;
    private javax.swing.JPanel manageTeacher;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel newClassTitle;
    private javax.swing.JLabel newCoursesTitle;
    private javax.swing.JLabel populateTitle;
    private javax.swing.JButton room_addButton;
    private javax.swing.JButton room_deleteButton;
    private javax.swing.JButton s_addButton;
    private javax.swing.JLabel s_addressLabel;
    private javax.swing.JTextField s_addressTF;
    private javax.swing.JLabel s_amLabel;
    private javax.swing.JTextField s_amTF;
    private javax.swing.JLabel s_birthdateLabel;
    private javax.swing.JButton s_deleteButton;
    private javax.swing.JLabel s_fatherLabel;
    private javax.swing.JTextField s_fatherNameTF;
    private javax.swing.JRadioButton s_femaleRadioBtn;
    private javax.swing.JLabel s_firstNameLabel;
    private javax.swing.JTextField s_firstNameTF;
    private javax.swing.JLabel s_genderLabel;
    private com.toedter.calendar.JDateChooser s_jDateChooser;
    private javax.swing.JScrollPane s_jScrollPane;
    private javax.swing.JScrollPane s_jScrollPane1;
    private javax.swing.JTable s_jTable;
    private javax.swing.JTable s_jTable2;
    private javax.swing.JLabel s_lastNameLabel;
    private javax.swing.JTextField s_lastNameTF;
    private javax.swing.JRadioButton s_maleRadioBtn;
    private javax.swing.JLabel s_motherLabel;
    private javax.swing.JTextField s_motherNameTF;
    private javax.swing.JLabel s_phoneNumberLabel;
    private javax.swing.JTextField s_phoneTF;
    private javax.swing.JLabel s_resetText;
    private javax.swing.JTextField s_searchBar;
    private javax.swing.JPanel s_searchBarJPanel;
    private javax.swing.JButton s_updateButton;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchIcon1;
    private javax.swing.JLabel semester;
    private javax.swing.JRadioButton semester_a;
    private javax.swing.JRadioButton semester_b;
    private javax.swing.JRadioButton semester_c;
    private javax.swing.JLabel studentJLabel;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JButton t_addButton;
    private javax.swing.JLabel t_addressLabel;
    private javax.swing.JTextField t_addressTF;
    private javax.swing.JButton t_deleteButton;
    private javax.swing.JLabel t_email;
    private javax.swing.JTextField t_emailTF;
    private javax.swing.JLabel t_firstNameLabel;
    private javax.swing.JTextField t_firstNameTF;
    private javax.swing.JLabel t_idLabel;
    private javax.swing.JTextField t_idTF;
    private javax.swing.JPasswordField t_jPassword;
    private javax.swing.JPasswordField t_jPassword2;
    private javax.swing.JScrollPane t_jScrollPane;
    private javax.swing.JTable t_jTable;
    private javax.swing.JPanel t_labelBackground;
    private javax.swing.JLabel t_lastNameLabel;
    private javax.swing.JTextField t_lastNameTF;
    private javax.swing.JLabel t_passwd;
    private javax.swing.JLabel t_passwd2;
    private javax.swing.JLabel t_phoneNumber;
    private javax.swing.JTextField t_phoneTF;
    private javax.swing.JLabel t_resetText;
    private javax.swing.JTextField t_searchBar;
    private javax.swing.JPanel t_searchBarJPanel;
    private javax.swing.JButton t_updateButton;
    private javax.swing.JLabel t_username;
    private javax.swing.JTextField t_usernameTF;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JPanel teacherPanel;
    private javax.swing.JLabel teacher_counter;
    private javax.swing.JLabel titleCourses;
    private javax.swing.JLabel titleMClasses;
    private javax.swing.JLabel titleMGrades;
    private javax.swing.JLabel titleMStudents;
    private javax.swing.JLabel titleMTeachers;
    private javax.swing.JLabel title_Best;
    private javax.swing.JLabel title_Best1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTable topfive;
    // End of variables declaration//GEN-END:variables
}
