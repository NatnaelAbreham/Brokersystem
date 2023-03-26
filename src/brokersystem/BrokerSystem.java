 
package brokersystem;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BrokerSystem extends JFrame{

    
    JButton sendcomment, backcomment, backlog, backinfo, nextfill, cancelfill, createemployeeaccount, createemployeraccount, manager, employee, employer, createaccount, forgetpassword, login;
    JTextField ufname, umname, ulname, uage, uworkexperiance, uid, uphonenumber, uemail, uaddress, uenrollmentdate;
    JRadioButton umale, ufemale, male, female, accountforemployee, accountforemployer;
    JButton unext, udegree, udiploma, uphd, umasters, uhighschool, unoeducation, uother, ucancel;
    JPasswordField passwordlog, passwordmenu;
    JTextField fieldlog, fieldmenu, fname, mname, lname, age, workexperiance, id, phonenumber, email, address, enrollmentdate;
    JButton next, degree, diploma, phd, masters, highschool, noeducation, other, cancel, employeeinformation, employeeupdate, changepassword, checkvacancy, commentbutton, backmenu;
    JTextArea employeecomment, employercomment1;
    ButtonGroup group, edugroup;
    JLabel sex, educationstatus;
    JTextField[] fieldarray = new JTextField[10];
    
    private static String ENROLLMENTDATE, educationalstatus = "", stringsex = "";
    String[] departmentname = {"Null", "Computer Science", "Information Technology", "Information System", "Computer Engineering",
        "Bussiness Management", "Markrting", "Accounting", "Finance", "Software Enginnering", "Civil Enginnering", "Electrical Enginnering", "Other"};
    JComboBox departmentchoice, updatedepartmentchoice, employerdepartmentchoice, employerupdatedepartmentchoice;
    static String[] fieldname = new String[10];
    static String[][] fieldname1 = new String[20][20];
    static int numberoffield = 0, comboboxcounter = 0, y = 0, z = 0, z2 = 0, ID;
    Date date = new Date();
    public static int i = 0, i1 = 1, i2 = 0, i3 = 9, i4 = 0, i5 = 9, i6 = 0, zy, i7 = 0;
    public static int x = 9, x1 = 0, x2 = 2, x3 = 0;
    private JFrame CreateEmployeeAccount;
    private JFrame EmployeeInformation;
    private JFrame EmployeeUpdate;
    private JFrame EmployeeMenu;
    private static JFrame MainMenu;

    static Employee[] employeeobject = new Employee[100];
    static Employer[] object = new Employer[100];
     
    String snumber;

    JFrame EmployerUpdate, EmployerMenu, EmployerInformation, CreateEmployerAccount, EmployerJobSpecification;
    JLabel labelname;
    JTextField companyname, createphonenumber, createemail, createaddress, createenrollmentdate;
    JTextField ucompanyname, ucreatephonenumber, ucreateemail, ucreateaddress, updateenrollmentdate, updateid;
    JPasswordField createid;
    JButton createcancel, createnext, createjobspecification, create, accountcancel;
    JButton createdegree, creatediploma, createother, createphd, createhighschool, createnoeducation, createmasters, createsave, deletecancel, deletenext1;
    JCheckBox createmale, createfemale, updatemale, updatefemale;
    JTextField createnumberofemployee, createworkexperiance, createjobname;
    JComboBox createwage, updatewage;
    String createwagestring[] = {"null", "Not Spacify", "Specify"}, updatewagestring[] = {"Not Spacify", "Specify"};
    public static int jobspecificationcounter = 0, combowagecounter = 0, k = 0, z1 = 0, IMP;
    int[] numberofemployees = new int[20];
    int[] workexperiances = new int[20];
    int[] numberoffields = new int[20];
    String[] jobnames = new String[20];
    String[] sexs = new String[20];
    String[] wages = new String[20];
    static String[] educationalqualifications = new String[20];
    JButton employerinformation, employerupdate, employerchangepassword, employercheckvacancy, employercomment, loginmenu, employerbackmenu, updateback, updatesave, updateadd, updateremove;
    JRadioButton[] deletebutton = new JRadioButton[20];
    boolean foundtrue = false;
    JTextField[] ujobname = new JTextField[20];
    JTextField[] updateexperiance = new JTextField[20];
    JTextField[] employees = new JTextField[20];
    JTextField[][] department = new JTextField[20][20];
    JTextField[] educationalqualification = new JTextField[20];

    public BrokerSystem() {

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 20));
        p1.setBackground(Color.GRAY);
        p1.setBorder(new TitledBorder("Main Menu"));

        createemployeeaccount = new JButton("Create Account for Employee");
        createemployeraccount = new JButton("Create Account for Employer");

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        p2.setBackground(Color.LIGHT_GRAY);
        manager = new JButton("Manager");
        employee = new JButton("Employee");
        employer = new JButton("Employer");

        manager.setCursor(new Cursor(Cursor.HAND_CURSOR));
        employee.setCursor(new Cursor(Cursor.HAND_CURSOR));
        employer.setCursor(new Cursor(Cursor.HAND_CURSOR));

        p1.add(employee);
        p1.add(employer);
        p2.add(createemployeeaccount);
        p2.add(createemployeraccount);
        p2.add(manager);

        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 15));
        p3.setBorder(new TitledBorder("only for employee & employer"));

        passwordmenu = new JPasswordField(15);
        fieldmenu = new JTextField(15);
        createaccount = new JButton("Create New Account");
        forgetpassword = new JButton("Forget Password");
        loginmenu = new JButton("Login    ");
        createaccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
        forgetpassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginmenu.setCursor(new Cursor(Cursor.HAND_CURSOR));

        p3.add(new JLabel("Email or Phone"));
        p3.add(fieldmenu);
        p3.add(new JLabel("Password          "));
        p3.add(passwordmenu);
        p3.add(loginmenu);
        p3.add(forgetpassword);
        p3.add(createaccount);
        JPanel p33 = new JPanel(new FlowLayout());
        JPanel p333 = new JPanel(new FlowLayout());
        JPanel p4 = new JPanel(new GridLayout(1, 3));

        p4.add(p3);
        p4.add(p33);
        p4.add(p333);

        JPanel p5 = new JPanel(new BorderLayout());
        p5.setBorder(new LineBorder(Color.DARK_GRAY, 1));
        p5.add(p2, BorderLayout.NORTH);
        p5.add(p4, BorderLayout.CENTER);

        employeecomment = new JTextArea("enter text here", 5, 1);
        employeecomment.setLineWrap(true);
        employeecomment.setWrapStyleWord(true);
        employeecomment.setForeground(Color.BLUE);
        JScrollPane pane = new JScrollPane(employeecomment);

        JPanel p6 = new JPanel(new BorderLayout());
        p6.setBackground(Color.DARK_GRAY);

        JButton send = new JButton("Send");
        send.setFont(new Font("Plain", Font.BOLD, 20));
        JLabel label = new JLabel("comment");
        label.setFont(new Font("Plain", Font.BOLD, 20));
        label.setForeground(Color.WHITE);

        p6.add(label, BorderLayout.WEST);
        p6.add(pane, BorderLayout.CENTER);
        p6.add(send, BorderLayout.EAST);
p5.setBackground(new Color(212,225,236));
        add(p1, BorderLayout.NORTH);
        add(p5, BorderLayout.CENTER);
        add(p6, BorderLayout.SOUTH);

        forgetpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == forgetpassword) {
                    final JFrame frame = new JFrame();

                    frame.setSize(520, 400);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());

                    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
                    p1.setBorder(new TitledBorder(""));
                    JLabel label = new JLabel("Backup Password");
                    label.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
                    p1.add(label);

                    JPanel p2 = new JPanel(new GridLayout(13, 1));
                    JScrollPane pane = new JScrollPane(p2);

                    p2.add(new JLabel("Dr.Reader inorder to Backup Account"));
                    p2.add(new JLabel(" you need to enter previously stored information"));
                    p2.add(new JLabel("to the program,"));
                    p2.add(new JLabel("The program compaire with the stored Data"));
                    p2.add(new JLabel("Spelled Error Lead to invalid input"));
                    p2.add(new JLabel("becarefull when you enter your information"));
                    p2.add(new JLabel(" in the input field. "));
                    p2.add(new JLabel("If all information you entered"));
                    p2.add(new JLabel("match with your Account information"));
                    p2.add(new JLabel("you will receive Authentication code"));
                    p2.add(new JLabel("otherwise you get invalid message "));

                    lname = new JTextField(10);
                    email = new JTextField(10);
                    workexperiance = new JTextField(10);
                    phonenumber = new JTextField(10);

                    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
                    JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
                    p6.setBackground(Color.LIGHT_GRAY);
                    p3.setBorder(new LineBorder(Color.GRAY, 1));
                    JLabel label1 = new JLabel("Eenter the Required information");
                    label1.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 15));
                    p6.add(label1);
                    p3.add(p6);
                    p3.add(new JLabel("Phone Number    "));
                    p3.add(phonenumber);
                    p3.add(new JLabel("Last Name    "));
                    p3.add(lname);
                    p3.add(new JLabel("Email             "));
                    p3.add(email);
                    p3.add(new JLabel("Work Experiencee"));
                    p3.add(workexperiance);

                    JPanel p4 = new JPanel(new BorderLayout());

                    p4.add(pane, BorderLayout.WEST);
                    p4.add(p3, BorderLayout.CENTER);

                    cancel = new JButton("Cancel");
                    next = new JButton("Backup");
                    next.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 110, 20));

                    p5.add(cancel);
                    p5.add(next);

                    frame.add(p1, BorderLayout.NORTH);
                    frame.add(p4, BorderLayout.CENTER);
                    frame.add(p5, BorderLayout.SOUTH);

                    cancel.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == cancel) {
                                frame.setVisible(false);
                            }
                        }
                    });
                }
            }
        });
        loginmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginmenu) {
                    if (searchingEmployee(String.format(fieldmenu.getText())) != -1) {
                        if (Integer.parseInt(passwordmenu.getText()) == employeeobject[searchingEmployee(String.format(fieldmenu.getText()))].id) {
                            MainMenu.setVisible(false);
                            y = searchingEmployee(String.format(fieldmenu.getText()));
                            employeeMenu();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Password", "Warnning", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (searchingEmployer(String.format(fieldmenu.getText())) != -1) {
                        if (Integer.parseInt(passwordmenu.getText()) == object[searchingEmployer(String.format(fieldmenu.getText()))].id) {
                            MainMenu.setVisible(false);
                            y = searchingEmployer(String.format(fieldmenu.getText()));
                            employerMenu();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Password", "Warnning", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username", "Warnning", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        createaccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == createaccount) {
                    final JFrame frame = new JFrame("Create Acount ");

                    frame.setSize(550, 450);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);

                    Color c = new Color(214, 214, 214);
                    JLabel label = new JLabel("Create Account");
                    label.setFont(new Font("Plain", Font.BOLD, 20));
                    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 30));
                    p1.setBackground(Color.LIGHT_GRAY);
                    p1.setBorder(new LineBorder(Color.GRAY, 1));
                    p1.add(label);

                    accountforemployee = new JRadioButton("Create Account for Employee");
                    accountforemployer = new JRadioButton("Create Account for Employer");

                    accountforemployee.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    accountforemployer.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    group = new ButtonGroup();
                    group.add(accountforemployer);
                    group.add(accountforemployee);

                    JPanel p2 = new JPanel(new GridLayout(3, 1));
                    JPanel p22 = new JPanel(new GridLayout(2, 1));
                    JPanel p222 = new JPanel(new GridLayout(2, 1));

                    p222.add(p2);
                    p222.add(p22);

                    p2.add(accountforemployee);
                    p2.add(accountforemployer);

                    create = new JButton("  Create  ");
                    createcancel = new JButton("  Cancel  ");
                    create.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    createcancel.setCursor(new Cursor(Cursor.HAND_CURSOR));

                    create.setFont(new Font("Plain", Font.BOLD, 15));
                    createcancel.setFont(new Font("Plain", Font.BOLD, 15));

                    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 130, 30));
                    p3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                    p3.add(createcancel);
                    p3.add(create);

                    frame.add(p1, BorderLayout.NORTH);
                    frame.add(p222, BorderLayout.CENTER);
                    frame.add(p3, BorderLayout.SOUTH);

                    accountforemployee.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent event) {
                            if (accountforemployee.isSelected()) {
                                IMP = 1;
                                foundtrue = true;
                            }
                        }
                    });
                    accountforemployer.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent event) {
                            if (accountforemployer.isSelected()) {
                                IMP = 2;
                                foundtrue = true;
                            }
                        }
                    });
                    createcancel.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == createcancel) {
                                frame.setVisible(false);
                            }
                        }
                    });
                    create.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            if (event.getSource() == create) {

                                switch (IMP) {
                                    case 1:
                                        frame.setVisible(false);
                                        MainMenu.setVisible(false);
                                        createEmployee();
                                        break;
                                    case 2:
                                        frame.setVisible(false);
                                        MainMenu.setVisible(false);
                                        createEmployer();
                                        break;
                                    case 0:
                                        JOptionPane.showMessageDialog(null, "please Select the Button", "", JOptionPane.ERROR_MESSAGE);
                                        break;
                                    default:
                                        break;
                                }

                            }
                        }
                    });
                }
            }
        });
        createemployeeaccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createemployeeaccount) {
                    MainMenu.setVisible(false);
                    createEmployee();
                }
            }
        });
        createemployeraccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createemployeraccount) {
                    MainMenu.setVisible(false);
                    createEmployer();
                }
            }
        });
        employee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employee) {
                    final JFrame frame = new JFrame();

                    frame.setSize(400, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());

                    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 70, 15));
                    p1.setBorder(new TitledBorder("Account login"));

                    fieldlog = new JTextField(15);
                    passwordlog = new JPasswordField(15);
                    login = new JButton("  Login ");
                    backlog = new JButton("  Back ");

                    p1.add(new JLabel("  Phone or Email"));
                    p1.add(fieldlog);
                    p1.add(new JLabel("   Password"));
                    p1.add(passwordlog);
                    JPanel p2 = new JPanel( );
                    p2.setBorder(new LineBorder(Color.BLACK));
                    p2.setBackground(Color.WHITE);
                    p2.add(backlog );
                    p2.add(login );

                    frame.add(p1, BorderLayout.CENTER);
                    frame.add(p2, BorderLayout.SOUTH);

                    backlog.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == backlog) {
                                frame.setVisible(false);
                            }
                        }
                    });
                    login.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == login) {

                                if (searchingEmployee(String.format(fieldlog.getText())) != -1) {
                                    if (Integer.parseInt(passwordlog.getText()) == employeeobject[searchingEmployee(String.format(fieldlog.getText()))].id) {
                                        MainMenu.setVisible(false);
                                        y = searchingEmployee(String.format(fieldlog.getText()));
                                        employeeMenu();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid Password", "Warnning", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    frame.setVisible(false);
                                    JOptionPane.showMessageDialog(null, "Invalid Username", "Warnning", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    });

                }
            }
        });

        employer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == employer) {
                    final JFrame frame = new JFrame();

                    frame.setSize(400, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());

                    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 70, 15));
                    p1.setBorder(new TitledBorder("Account login"));

                    fieldlog = new JTextField(15);
                    passwordlog = new JPasswordField(15);
                    login = new JButton("  Login ");
                    backlog = new JButton("  Back ");

                    p1.add(new JLabel("  Phone or Email"));
                    p1.add(fieldlog);
                    p1.add(new JLabel("   Password"));
                    p1.add(passwordlog);
                    JPanel p2 = new JPanel();
                    p2.setBorder(new LineBorder(Color.BLACK));
                    p2.setBackground(Color.WHITE);
                    p2.add(backlog);
                    p2.add(login);

                    frame.add(p1, BorderLayout.CENTER);
                    frame.add(p2, BorderLayout.SOUTH);

                    backlog.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == backlog) {
                                frame.setVisible(false);
                            }
                        }
                    });

                    login.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == login) {

                                if (searchingEmployer(String.format(fieldlog.getText())) != -1) {
                                    if (Integer.parseInt(passwordlog.getText()) == object[searchingEmployer(String.format(fieldlog.getText()))].id) {
                                        MainMenu.setVisible(false);
                                        y = searchingEmployer(String.format(fieldlog.getText()));
                                        employerMenu();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Invalid Password", "Warnning", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    frame.setVisible(false);
                                    JOptionPane.showMessageDialog(null, "Invalid Username", "Warnning", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    });
                }
            }
        });

    }

    void createEmployee() {

        CreateEmployeeAccount = new JFrame();
        CreateEmployeeAccount.setTitle("Create account");
        CreateEmployeeAccount.setSize(880, 670);
        CreateEmployeeAccount.setLocationRelativeTo(null);
        CreateEmployeeAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateEmployeeAccount.setVisible(true);
        CreateEmployeeAccount.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
        p1.setBorder(new TitledBorder("Name"));

        fname = new JTextField(13);
        mname = new JTextField(13);
        lname = new JTextField(13);

        p1.add(new JLabel("First Name"));
        p1.add(fname);
        p1.add(new JLabel("Middle Name"));
        p1.add(mname);
        p1.add(new JLabel("Last Name"));
        p1.add(lname);

        male = new JRadioButton("Male", false);
        female = new JRadioButton("Female", false);
        male.setCursor(new Cursor(Cursor.HAND_CURSOR));
        female.setCursor(new Cursor(Cursor.HAND_CURSOR));
        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JPanel p3 = new JPanel(new GridLayout(3, 1));
        p3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        p3.setBackground(Color.LIGHT_GRAY);
        sex = new JLabel("            Sex");
        sex.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        //sex.setForeground(Color.BLUE);
        p3.add(sex);
        p3.add(male);
        p3.add(female);
        JPanel p33 = new JPanel(new GridLayout(6, 2));
        p33.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        address = new JTextField(10);
        phonenumber = new JTextField("+251_", 10);
        age = new JTextField(10);
        workexperiance = new JTextField(10);
        id = new JTextField("uneditable", 10);
        id.setBackground(Color.WHITE);
        id.setEditable(false);
        id.setToolTipText("---> enter next Button to get your Password");
        email = new JTextField(10);
        p33.add(new JLabel("Age"));
        p33.add(age);
        p33.add(new JLabel("Phone"));
        p33.add(phonenumber);
        p33.add(new JLabel("Work Experiance"));
        p33.add(workexperiance);
        p33.add(new JLabel("Address"));
        p33.add(address);
        p33.add(new JLabel("Email"));
        p33.add(email);

        JPanel p4 = new JPanel(new GridLayout(3, 1));
        p4.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        p4.add(p3);
        p4.add(p33);

        JPanel p5 = new JPanel(new GridLayout(8, 1));
        p5.setBorder(new LineBorder(Color.WHITE, 1));
        p5.setBackground(Color.WHITE);

        educationstatus = new JLabel("Educational Qualification");
        educationstatus.setFont(new Font("Plain", Font.BOLD, 15));

        degree = new JButton("Degree");
        diploma = new JButton("Diploma");
        phd = new JButton("PHD");
        masters = new JButton("Msters");
        other = new JButton("Other");
        noeducation = new JButton("No Education");
        highschool = new JButton("High School");

        degree.setCursor(new Cursor(Cursor.HAND_CURSOR));
        diploma.setCursor(new Cursor(Cursor.HAND_CURSOR));
        phd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        masters.setCursor(new Cursor(Cursor.HAND_CURSOR));
        other.setCursor(new Cursor(Cursor.HAND_CURSOR));
        noeducation.setCursor(new Cursor(Cursor.HAND_CURSOR));
        highschool.setCursor(new Cursor(Cursor.HAND_CURSOR));

        p5.add(educationstatus);
        p5.add(highschool);
        p5.add(diploma);
        p5.add(degree);
        p5.add(masters);
        p5.add(phd);
        p5.add(other);
        p5.add(noeducation);

        JPanel p2 = new JPanel(new GridLayout(2, 2));
        p2.setBorder(new LineBorder(Color.RED, 1));
        p2.setBackground(Color.WHITE);
        enrollmentdate = new JTextField(10);
        ENROLLMENTDATE = date.toString();
        enrollmentdate.setText(ENROLLMENTDATE);
        enrollmentdate.setEditable(false);
        enrollmentdate.setFont(new Font("Srif", Font.ITALIC, 14));
        enrollmentdate.setToolTipText("uneditable");

        p2.add(new JLabel("Enrollment date"));
        p2.add(enrollmentdate);
        p2.add(new JLabel("Password"));
        p2.add(id);

        JPanel p21 = new JPanel(new BorderLayout());

        p21.add(p5, BorderLayout.CENTER);
        p21.add(p2, BorderLayout.SOUTH);

        JPanel p6 = new JPanel(new GridLayout(1, 2));
        p6.setBorder(new LineBorder(Color.GRAY, 1));
        p6.add(p4);
        p6.add(p21);

        next = new JButton("Next");
        cancel = new JButton("cancel");
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.setFont(new Font("Dialog", Font.BOLD, 18));
        cancel.setFont(new Font("Dialog", Font.BOLD, 18));
        next.setBorder(new LineBorder(Color.BLACK, 1));
        JPanel p7 = new JPanel(new GridLayout(1, 2));
        p7.add(cancel);
        p7.add(next);

        CreateEmployeeAccount.add(p1, BorderLayout.NORTH);
        CreateEmployeeAccount.add(p6, BorderLayout.CENTER);
        CreateEmployeeAccount.add(p7, BorderLayout.SOUTH);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == next) {
                    String phonepass = "", pass;
                    pass = String.format(phonenumber.getText());

                    if (pass.length() != 14) {
                        JOptionPane.showMessageDialog(null, "Invalid phone number", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {

                        phonepass = "0" + pass.substring(5, 14);
                        char[] ch = phonepass.toCharArray();
                        boolean truevalue = true;

                        for (int a = 0; a < phonepass.length(); a++) {
                            if ((int) ch[a] < 48 || (int) ch[a] > 57) {

                                truevalue = false;
                                break;
                            }

                        }
                        if (truevalue) {
                            ID = idSetter();
                            employeeobject[i] = new Employee(String.format(fname.getText()), String.format(mname.getText()), String.format(lname.getText()), String.format(address.getText()), String.format(email.getText()), educationalstatus, stringsex, ENROLLMENTDATE,
                                    Byte.parseByte(age.getText()),
                                    Byte.parseByte(workexperiance.getText()), numberoffield, fieldname, phonepass, ID);
                            JOptionPane.showMessageDialog(null, ID + " is your password");

                            CreateEmployeeAccount.setVisible(false);
                            y = i;
                            employeeMenu();
                            i++;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid phone number", "warnning", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                }
            }
        });
        highschool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == highschool) {

                    educationalstatus = String.format(highschool.getText());
                    educationalstatus = educationalstatus.toUpperCase();
                    JOptionPane.showMessageDialog(null, educationalstatus + " was saved");
                    numberoffield = 0;
                }
            }
        });
        degree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == degree) {

                    educationalstatus = String.format(degree.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        diploma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == diploma) {

                    educationalstatus = String.format(diploma.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        masters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == masters) {

                    educationalstatus = String.format(masters.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        phd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == phd) {

                    educationalstatus = String.format(phd.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        other.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == other) {

                    educationalstatus = String.format(other.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        noeducation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == noeducation) {

                    educationalstatus = String.format(noeducation.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, "any job experiance in number");
                    numberoffield = Integer.parseInt(snumber);

                    departmentFill();
                }
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cancel) {

                    CreateEmployeeAccount.setVisible(false);
                    MainMenu.setVisible(true);
                }
            }
        });
        male.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (male.isSelected()) {
                    stringsex = "Male";
                }
            }
        });
        female.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (female.isSelected()) {
                    stringsex = "Female";
                }
            }
        });

    }

    void employeeMenu() {

        EmployeeMenu = new JFrame();
        EmployeeMenu.setSize(750, 650);
        EmployeeMenu.setLocationRelativeTo(null);
        EmployeeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployeeMenu.setVisible(true);
        EmployeeMenu.setLayout(new BorderLayout());

        employeeinformation = new JButton("Employee Information");
        employeeupdate = new JButton("Update");
        changepassword = new JButton("Change Password");
        checkvacancy = new JButton("Check Vacancy");
        commentbutton = new JButton("Comment");
        backmenu = new JButton("Back");
        backmenu.setFont(new Font("Plain", Font.BOLD, 20));

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 36));
        p1.setBorder(new TitledBorder("main menu"));
        p1.setBackground(Color.LIGHT_GRAY);
        p1.add(employeeinformation);
        p1.add(employeeupdate);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        p2.setBorder(new LineBorder(Color.BLACK, 1));

        p2.add(changepassword);
        p2.add(checkvacancy);
        p2.add(commentbutton);

        EmployeeMenu.add(p1, BorderLayout.NORTH);
        EmployeeMenu.add(p2, BorderLayout.CENTER);
        EmployeeMenu.add(backmenu, BorderLayout.SOUTH);

        backmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backmenu) {
                    EmployeeMenu.setVisible(false);
                    MainMenu.setVisible(true);
                }
            }
        });
        employeeinformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employeeinformation) {
                    EmployeeMenu.setVisible(false);
                    employeeInformation();
                }
            }
        });
        employeeupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employeeupdate) {
                    EmployeeMenu.setVisible(false);
                    employeeUpdate();
                }
            }
        });
        changepassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String password = "";
                int pass;
                password = JOptionPane.showInputDialog(null, "enter your old password");
                pass = Integer.parseInt(password);
                if (pass == employeeobject[y].id) {

                    password = JOptionPane.showInputDialog(null, "enter your new Password");
                    pass = Integer.parseInt(password);
                    if (pass < 1000) {
                        JOptionPane.showMessageDialog(null, "Password must be at least 4 digit", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        employeeobject[y].id = pass;
                        JOptionPane.showMessageDialog(null, " password  changed  ");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "invalid password");
                }
            }
        });

        commentbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == commentbutton) {

                    final JFrame frame = new JFrame("Comment");
                    frame.setSize(400, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());

                    employeecomment = new JTextArea("enter text here", 5, 5);
                    employeecomment.setLineWrap(true);
                    employeecomment.setWrapStyleWord(true);
                    employeecomment.setForeground(Color.BLUE);

                    JScrollPane pane = new JScrollPane(employeecomment);
                    backcomment = new JButton("back");
                    sendcomment = new JButton("Send");

                    JPanel p1 = new JPanel(new GridLayout(1, 2));
                    p1.add(backcomment);
                    p1.add(sendcomment);

                    frame.add(pane, BorderLayout.CENTER);
                    frame.add(p1, BorderLayout.SOUTH);

                    backcomment.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == backcomment) {
                                frame.setVisible(false);
                            }

                        }
                    });
                    sendcomment.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == sendcomment) {
                                String stringcomment = "";
                                stringcomment = String.format(employeecomment.getText());
                                if (stringcomment.equals("enter text here")) {
                                    stringcomment = "";
                                }

                                employeeobject[y].comment = stringcomment;
                                frame.setVisible(false);
                                JOptionPane.showMessageDialog(null, "Comment was sent");
                            }

                        }
                    });
                }
            }
        });

    }

    void employeeInformation() {

        EmployeeInformation = new JFrame();
        EmployeeInformation.setSize(700, 700);
        EmployeeInformation.setLocationRelativeTo(null);
        EmployeeInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployeeInformation.setVisible(true);
        EmployeeInformation.setLayout(new BorderLayout());

        JLabel title = new JLabel("Employee Information");
        JPanel p1 = new JPanel(new FlowLayout());
        title.setFont(new Font("SansSerif", Font.ITALIC, 20));
        p1.add(title);
        JPanel p2 = new JPanel(new GridLayout(13, 1));
        p2.setBackground(Color.WHITE);
        JScrollPane pane = new JScrollPane(p2);

        p2.add(p1);
        p2.add(new JLabel("Name :   " + employeeobject[y].fname + "   " + employeeobject[y].mname + "   " + employeeobject[y].lname));
        p2.add(new JLabel("Sex :   " + employeeobject[y].sex));
        p2.add(new JLabel("Age :   " + employeeobject[y].age));
        p2.add(new JLabel("Enrollment Date :   " + employeeobject[y].enrollmentdate));
        p2.add(new JLabel("Address :   " + employeeobject[y].address));
        p2.add(new JLabel("Educational Qualification :   " + employeeobject[y].educationalqualification));

        JPanel p3 = new JPanel(new GridLayout(employeeobject[y].fieldcounter, 1));
        for (int j = 0; j < employeeobject[y].fieldcounter; j++) {
            p3.add(new JLabel(" " + (j + 1) + ". " + employeeobject[y].department[j]));
        }
        p2.add(p3);
        if (employeeobject[y].workexperiance == 0) {
            p2.add(new JLabel("Work Experiance :   No Work Experiance"));
        } else {
            p2.add(new JLabel("Work Experiance :   " + employeeobject[y].workexperiance));
        }

        p2.add(new JLabel("Phone number :    " + employeeobject[y].phonenumber));
        p2.add(new JLabel("ID :   " + employeeobject[y].id));
        p2.add(new JLabel("Email :   " + employeeobject[y].email));
        p2.add(new JLabel("================================================================ "));

        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        p4.setBackground(Color.GRAY);

        backinfo = new JButton("Back");
        backinfo.setFont(new Font("SansSerif", Font.ITALIC, 20));
        p4.add(backinfo);

        EmployeeInformation.add(pane, BorderLayout.CENTER);
        EmployeeInformation.add(p4, BorderLayout.SOUTH);

        backinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backinfo) {
                    EmployeeInformation.setVisible(false);
                    employeeMenu();
                }
            }
        });
    }

    void employeeUpdate() {

        EmployeeUpdate = new JFrame();
        EmployeeUpdate.setTitle("Update Information");
        EmployeeUpdate.setSize(880, 670);
        EmployeeUpdate.setLocationRelativeTo(null);
        EmployeeUpdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployeeUpdate.setVisible(true);
        EmployeeUpdate.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
        p1.setBorder(new TitledBorder("Update Name"));

        ufname = new JTextField(13);
        umname = new JTextField(13);
        ulname = new JTextField(13);

        ufname.setText(employeeobject[y].fname);
        umname.setText(employeeobject[y].mname);
        ulname.setText(employeeobject[y].lname);

        p1.add(new JLabel("First Name"));
        p1.add(ufname);
        p1.add(new JLabel("Middle Name"));
        p1.add(umname);
        p1.add(new JLabel("Last Name"));
        p1.add(ulname);
        if ("Male".equals(employeeobject[y].sex)) {
            umale = new JRadioButton("Male", true);
            ufemale = new JRadioButton("Female", false);
        } else {
            umale = new JRadioButton("Male", false);
            ufemale = new JRadioButton("Female", true);
        }
        umale.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ufemale.setCursor(new Cursor(Cursor.HAND_CURSOR));
        group = new ButtonGroup();
        group.add(umale);
        group.add(ufemale);

        JPanel p3 = new JPanel(new GridLayout(3, 1));
        p3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        p3.setBackground(Color.LIGHT_GRAY);
        sex = new JLabel("            Sex");
        sex.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        sex.setForeground(Color.BLUE);
        p3.add(sex);
        p3.add(umale);
        p3.add(ufemale);
        JPanel p33 = new JPanel(new GridLayout(6, 2));
        p33.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        uaddress = new JTextField(10);
        uphonenumber = new JTextField("+251_", 10);
        uage = new JTextField(10);
        uworkexperiance = new JTextField(10);
        uid = new JTextField(10);
        uid.setBackground(Color.WHITE);
        uid.setEditable(false);
        uid.setToolTipText("---> enter next Button to get your Password");
        uemail = new JTextField(10);

        uaddress.setText(employeeobject[y].address);
        uphonenumber.setText(employeeobject[y].phonenumber);
        uage.setText(String.valueOf(employeeobject[y].age));
        uemail.setText(employeeobject[y].email);
        uid.setText(String.valueOf(employeeobject[y].id));
        uworkexperiance.setText(String.valueOf(employeeobject[y].workexperiance));

        p33.add(new JLabel("Age"));
        p33.add(uage);
        p33.add(new JLabel("Phone"));
        p33.add(uphonenumber);
        p33.add(new JLabel("Work Experiance"));
        p33.add(uworkexperiance);
        p33.add(new JLabel("Address"));
        p33.add(uaddress);
        p33.add(new JLabel("Email"));
        p33.add(uemail);

        JPanel p4 = new JPanel(new GridLayout(3, 1));
        p4.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        p4.add(p3);
        p4.add(p33);

        JPanel p5 = new JPanel(new GridLayout(8, 1));
        p5.setBorder(new LineBorder(Color.WHITE, 1));
        p5.setBackground(Color.WHITE);

        educationstatus = new JLabel("Educational Qualification");
        educationstatus.setFont(new Font("Plain", Font.BOLD, 15));

        udegree = new JButton("Degree");
        udiploma = new JButton("Diploma");
        uphd = new JButton("PHD");
        umasters = new JButton("Msters");
        uother = new JButton("Other");
        unoeducation = new JButton("No Education");
        uhighschool = new JButton("High School");

        udegree.setCursor(new Cursor(Cursor.HAND_CURSOR));
        udiploma.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uphd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        umasters.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uother.setCursor(new Cursor(Cursor.HAND_CURSOR));
        unoeducation.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uhighschool.setCursor(new Cursor(Cursor.HAND_CURSOR));

        p5.add(educationstatus);
        p5.add(uhighschool);
        p5.add(udiploma);
        p5.add(udegree);
        p5.add(umasters);
        p5.add(uphd);
        p5.add(uother);
        p5.add(unoeducation);

        JPanel p2 = new JPanel(new GridLayout(2, 2));
        p2.setBorder(new LineBorder(Color.RED, 1));
        p2.setBackground(Color.WHITE);
        uenrollmentdate = new JTextField(10);
        uenrollmentdate.setText(employeeobject[0].enrollmentdate);
        uenrollmentdate.setEditable(false);
        uenrollmentdate.setFont(new Font("Srif", Font.ITALIC, 14));
        uenrollmentdate.setToolTipText("uneditable");

        p2.add(new JLabel("Enrollment date"));
        p2.add(uenrollmentdate);
        p2.add(new JLabel("Password"));
        p2.add(uid);

        JPanel p21 = new JPanel(new BorderLayout());

        p21.add(p5, BorderLayout.CENTER);
        p21.add(p2, BorderLayout.SOUTH);

        JPanel p6 = new JPanel(new GridLayout(1, 2));
        p6.setBorder(new LineBorder(Color.GRAY, 1));
        p6.add(p4);
        p6.add(p21);

        unext = new JButton("Next");
        ucancel = new JButton("cancel");
        unext.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ucancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        unext.setFont(new Font("Dialog", Font.BOLD, 18));
        ucancel.setFont(new Font("Dialog", Font.BOLD, 18));
        unext.setBorder(new LineBorder(Color.BLACK, 1));
        JPanel p7 = new JPanel(new GridLayout(1, 2));
        p7.add(ucancel);
        p7.add(unext);

        EmployeeUpdate.add(p1, BorderLayout.NORTH);
        EmployeeUpdate.add(p6, BorderLayout.CENTER);
        EmployeeUpdate.add(p7, BorderLayout.SOUTH);

        unext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == unext) {
                    String phonepass = "", pass;
                    pass = String.format(uphonenumber.getText());

                    if (pass.length() != 10) {
                        JOptionPane.showMessageDialog(null, "Invalid phone number", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {

                        char[] ch = pass.toCharArray();
                        boolean truevalue = true;

                        for (int a = 0; a < pass.length(); a++) {
                            if ((int) ch[a] < 48 || (int) ch[a] > 57 || ch[0] != '0' || ch[1] != '9') {

                                truevalue = false;
                                break;
                            }

                        }
                        if (truevalue) {
                            employeeobject[y] = new Employee(String.format(ufname.getText()), String.format(umname.getText()), String.format(ulname.getText()), String.format(uaddress.getText()), String.format(uemail.getText()), educationalstatus, stringsex, ENROLLMENTDATE,
                                    Byte.parseByte(uage.getText()),
                                    Byte.parseByte(uworkexperiance.getText()), numberoffield, fieldname, pass, ID);
                            JOptionPane.showMessageDialog(null, "   Successfully Updated");
                            EmployeeUpdate.setVisible(false);
                            employeeMenu();

                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid phone number", "warning", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                }
            }
        });
        ucancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ucancel) {
                    EmployeeUpdate.setVisible(false);
                    employeeMenu();
                }
            }
        });

        umale.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (umale.isSelected()) {
                    stringsex = "Male";
                }
            }
        });
        ufemale.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (ufemale.isSelected()) {
                    stringsex = "Female";
                }
            }
        });

        uhighschool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == uhighschool) {

                    educationalstatus = String.format(uhighschool.getText());
                    educationalstatus = educationalstatus.toUpperCase();
                    JOptionPane.showMessageDialog(null, educationalstatus + " was saved");
                    numberoffield = 0;
                }
            }
        });
        udegree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == udegree) {

                    educationalstatus = String.format(udegree.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });
        udiploma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == udiploma) {

                    educationalstatus = String.format(udiploma.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });
        umasters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == umasters) {

                    educationalstatus = String.format(umasters.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });
        uphd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == uphd) {

                    educationalstatus = String.format(uphd.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });
        uother.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == uother) {

                    educationalstatus = String.format(uother.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalstatus + " in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });
        unoeducation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == unoeducation) {

                    educationalstatus = String.format(unoeducation.getText());
                    educationalstatus = educationalstatus.toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, "any job experiance in number");
                    numberoffield = Integer.parseInt(snumber);

                    updateDepartmentFill();
                }
            }
        });

    }

    void departmentFill() {

        if (numberoffield < 1) {
            return;
        }
        final JFrame frame = new JFrame("Field");

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        departmentchoice = new JComboBox(departmentname);

        JPanel p1 = new JPanel(new GridLayout(numberoffield, 2));
        p1.setBackground(Color.WHITE);
        p1.setBorder(new TitledBorder("Select or Fill"));

        for (int a = 0; a < numberoffield; a++) {

            p1.add(new JLabel("Num " + (a + 1)));
            if (a == (numberoffield - 1)) {
                continue;
            }
            fieldarray[a] = new JTextField(10);
            p1.add(fieldarray[a]);

        }
        nextfill = new JButton("Save");
        cancelfill = new JButton("cancel");
        p1.add(departmentchoice);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 10));
        p2.add(cancelfill);
        p2.add(nextfill);
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);

        departmentchoice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String fn;
                comboboxcounter++;
                if (comboboxcounter == 2) {
                    comboboxcounter = 0;
                    if (departmentchoice.getSelectedItem() == "Other") {
                        fn = JOptionPane.showInputDialog(null, "Enter name");
                        fieldname[numberoffield - 1] = fn;

                    } else {
                        fieldname[numberoffield - 1] = String.format(departmentchoice.getSelectedItem().toString());

                    }
                }
            }
        });
        nextfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == nextfill) {

                    for (int a = 0; a < (numberoffield - 1); a++) {
                        fieldname[a] = String.format(fieldarray[a].getText());
                    }
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "saved was made Successfully");

                }
            }
        });
        cancelfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cancelfill) {
                    frame.setVisible(false);
                }
            }
        });
    }

    void updateDepartmentFill() {

        if (numberoffield < 1) {
            return;
        }
        final JFrame frame = new JFrame("Field");

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        updatedepartmentchoice = new JComboBox(departmentname);

        JPanel p1 = new JPanel(new GridLayout(numberoffield, 2));
        p1.setBackground(Color.WHITE);
        p1.setBorder(new TitledBorder("Select or Fill"));

        for (int a = 0; a < numberoffield; a++) {

            p1.add(new JLabel("Field " + (a + 1)));
            if (a == (numberoffield - 1)) {
                continue;
            }
            fieldarray[a] = new JTextField(10);
            p1.add(fieldarray[a]);

        }
        nextfill = new JButton("Save");
        cancelfill = new JButton("cancel");
        p1.add(updatedepartmentchoice);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 10));
        p2.add(cancelfill);
        p2.add(nextfill);
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);

        updatedepartmentchoice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String fn;
                comboboxcounter++;
                if (comboboxcounter == 2) {
                    comboboxcounter = 0;
                    if (updatedepartmentchoice.getSelectedItem() == "Other") {
                        fn = JOptionPane.showInputDialog(null, "Enter name");
                        fieldname[numberoffield - 1] = fn;

                    } else {
                        fieldname[numberoffield - 1] = String.format(updatedepartmentchoice.getSelectedItem().toString());

                    }
                }
            }
        });
        nextfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == nextfill) {

                    for (int a = 0; a < (numberoffield - 1); a++) {
                        fieldname[a] = String.format(fieldarray[a].getText());
                    }
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "saved was made Successfully");

                }
            }
        });
        cancelfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cancelfill) {
                    frame.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {

        MainMenu = new BrokerSystem();

        MainMenu.setTitle("Main Menu");
        MainMenu.setSize(900, 600);
        MainMenu.setLocationRelativeTo(null);
        MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.setVisible(true);

    }

    int idSetter() {
        int idd = 0;
        for (; x > 0; x++) {
            for (; x1 < 10; x1++) {
                for (; x2 < 10; x2++) {
                    int ct = 0;
                    for (; x3 < 10; x3++) {
                        if (ct != 0) {
                            idd = ((x * 1000) + (x1 * 100) + (x2 * 10) + (x3));
                            return idd;
                        }
                        ct++;
                    }
                }
            }
        }
        return idd;
    }

    int searchingEmployee(String key) {
        int index = 0;
        int found = 0;

        do {
            if (key.equals(employeeobject[index].phonenumber) || key.equals(employeeobject[index].email)) {
                found = 1;
            } else {
                index++;
            }
        } while (found == 0 && index < i);
        if (found == 0) {
            index = -1;
        }
        return index;
    }

    void createEmployer() {

        CreateEmployerAccount = new JFrame();
        CreateEmployerAccount.setTitle("Create account");
        CreateEmployerAccount.setSize(770, 470);
        CreateEmployerAccount.setLocationRelativeTo(null);
        CreateEmployerAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreateEmployerAccount.setVisible(true);
        CreateEmployerAccount.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new GridLayout(1, 2));

        p1.setBackground(Color.LIGHT_GRAY);
        p1.setBorder(new TitledBorder("Name"));

        labelname = new JLabel("                   Company Name");
        labelname.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 20));
        labelname.setForeground(Color.BLUE);

        companyname = new JTextField(15);
        createaddress = new JTextField(15);
        createemail = new JTextField(15);
        createphonenumber = new JTextField(15);
        createjobspecification = new JButton("Job Specification");
        createjobspecification.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createjobspecification.setToolTipText("it specify job qualification by number");
        createnext = new JButton("Next");
        createcancel = new JButton("Cancel");

        p1.add(labelname);
        p1.add(companyname);

        ENROLLMENTDATE = date.toString();
        createenrollmentdate = new JTextField(ENROLLMENTDATE, 15);

        createenrollmentdate = new JTextField(15);
        createenrollmentdate.setText(ENROLLMENTDATE);
        createenrollmentdate.setEditable(false);

        createid = new JPasswordField("Uneditable", 15);
        createid.setEditable(false);
        createid.setToolTipText("press next button to get the password");

        JPanel p2 = new JPanel(new GridLayout(6, 2));
        JPanel p3 = new JPanel(new GridLayout(1, 2));

        p2.setBackground(Color.WHITE);
        p2.setBorder(new LineBorder(Color.GRAY, 1));

        p2.add(new JLabel("Address"));
        p2.add(createaddress);
        p2.add(new JLabel("Phone Number"));
        p2.add(createphonenumber);
        p2.add(new JLabel("Email"));
        p2.add(createemail);
        p2.add(new JLabel("Enrollment Date"));
        p2.add(createenrollmentdate);
        p2.add(new JLabel("Password"));
        p2.add(createid);
        p2.add(createjobspecification);
        p2.add(p3);

        JPanel p7 = new JPanel(new GridLayout(1, 2));

        p7.setBorder(new LineBorder(Color.BLACK, 1));
        p7.add(createcancel);
        p7.add(createnext);

        CreateEmployerAccount.add(p1, BorderLayout.NORTH);
        CreateEmployerAccount.add(p2, BorderLayout.CENTER);
        CreateEmployerAccount.add(p7, BorderLayout.SOUTH);

        createcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createcancel) {
                    CreateEmployerAccount.setVisible(false);
                    MainMenu.setVisible(true);
                }
            }
        });
        createnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createnext) {

                    String pass;
                    pass = String.format(createphonenumber.getText());

                    if (pass.length() != 10) {
                        JOptionPane.showMessageDialog(null, "Invalid phone number", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {

                        char[] ch = pass.toCharArray();
                        boolean truevalue = true;

                        for (int a = 0; a < pass.length(); a++) {
                            if ((int) ch[a] < 48 || (int) ch[a] > 57 || ch[0] != '0' || ch[1] != '9') {

                                truevalue = false;
                                break;
                            }

                        }
                        if (truevalue) {

                            ID = idSetter();
                            object[k] = new Employer(String.format(companyname.getText()), ENROLLMENTDATE, String.format(createemail.getText()), String.format(createaddress.getText()),
                                    pass, educationalqualifications, ID, numberofemployees, workexperiances, jobnames, sexs, wages, fieldname1, numberoffields, jobspecificationcounter);

                            JOptionPane.showMessageDialog(null, ID + " is your password");
                            y = k;
                            zy = object[y].numberofjobcounter;
                            k++;
                            jobspecificationcounter = 0;
                            CreateEmployerAccount.setVisible(false);

                            employerMenu();

                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid phone number", "warning", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                }
            }
        });
        createjobspecification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createjobspecification) {

                    jobSpecificationFill();

                }
            }
        });

    }

    void employerMenu() {

        EmployerMenu = new JFrame();
        EmployerMenu.setSize(750, 650);
        EmployerMenu.setLocationRelativeTo(null);
        EmployerMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployerMenu.setVisible(true);
        EmployerMenu.setLayout(new BorderLayout());

        employerinformation = new JButton("Employer Information");
        employerupdate = new JButton("Update");
        employerchangepassword = new JButton("Change Password");
        employercheckvacancy = new JButton("Check for Employee");
        employercomment = new JButton("Comment");
        employerbackmenu = new JButton("Back");
        employerbackmenu.setFont(new Font("Plain", Font.BOLD, 20));

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 36));
        p1.setBorder(new TitledBorder("Main Menu"));
        p1.setBackground(Color.LIGHT_GRAY);
        p1.add(employerinformation);
        p1.add(employerupdate);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        p2.setBorder(new LineBorder(Color.BLACK, 1));

        p2.add(employerchangepassword);
        p2.add(employercheckvacancy);
        p2.add(employercomment);

        EmployerMenu.add(p1, BorderLayout.NORTH);
        EmployerMenu.add(p2, BorderLayout.CENTER);
        EmployerMenu.add(employerbackmenu, BorderLayout.SOUTH);

        employerbackmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employerbackmenu) {
                    EmployerMenu.setVisible(false);
                    MainMenu.setVisible(true);
                }
            }
        });
        employerinformation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employerinformation) {
                    EmployerMenu.setVisible(false);
                    employerInformation();
                }
            }
        });
        employerupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employerupdate) {
                    EmployerMenu.setVisible(false);
                    employerUpdate();
                }
            }
        });
        employerchangepassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String password = "";
                int pass;
                password = JOptionPane.showInputDialog(null, "enter your old password");
                pass = Integer.parseInt(password);
                if (pass == object[y].id) {

                    password = JOptionPane.showInputDialog(null, "enter your new Password");
                    pass = Integer.parseInt(password);
                    if (pass < 1000) {
                        JOptionPane.showMessageDialog(null, "Password must be at least 4 digit", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {
                        object[y].id = pass;
                        JOptionPane.showMessageDialog(null, "Your password was changed cussessfully");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "invalid password");
                }
            }
        });

        employercomment.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == employercomment) {

                    final JFrame frame = new JFrame("Comment");
                    frame.setSize(400, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    frame.setLayout(new BorderLayout());

                    employercomment1 = new JTextArea("enter text here", 5, 5);
                    employercomment1.setLineWrap(true);
                    employercomment1.setWrapStyleWord(true);
                    employercomment1.setForeground(Color.BLUE);

                    JScrollPane pane = new JScrollPane(employeecomment);
                    backcomment = new JButton("back");
                    sendcomment = new JButton("Send");

                    JPanel p1 = new JPanel(new GridLayout(1, 2));
                    p1.add(backcomment);
                    p1.add(sendcomment);

                    frame.add(pane, BorderLayout.CENTER);
                    frame.add(p1, BorderLayout.SOUTH);

                    backcomment.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == backcomment) {
                                frame.setVisible(false);
                            }

                        }
                    });
                    sendcomment.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == sendcomment) {
                                String stringcomment = "";
                                stringcomment = String.format(employercomment1.getText());
                                if (stringcomment.equals("enter text here")) {
                                    stringcomment = "";
                                }

                                object[y].comment = stringcomment;
                                frame.setVisible(false);
                                JOptionPane.showMessageDialog(null, "Comment was sent");

                            }

                        }
                    });
                }
            }
        });

    }

    void employerInformation() {

        EmployerInformation = new JFrame();
        EmployerInformation.setSize(700, 700);
        EmployerInformation.setLocationRelativeTo(null);
        EmployerInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployerInformation.setVisible(true);
        EmployerInformation.setLayout(new BorderLayout());

        JLabel title = new JLabel("Employer Information");
        JPanel p1 = new JPanel(new FlowLayout());
        title.setFont(new Font("SansSerif", Font.ITALIC, 20));
        p1.add(title);
        JPanel p2 = new JPanel(new GridLayout(8, 1, 0, 0));
        p2.setBackground(Color.WHITE);

        p2.add(p1);
        p2.add(new JLabel("Company Name :   " + object[y].companyname));
        p2.add(new JLabel("Enrollment Date :   " + object[y].enrollmentdate));
        p2.add(new JLabel("Address :   " + object[y].address));
        p2.add(new JLabel("Phone number :    " + object[y].phonenumber));
        p2.add(new JLabel("ID :   " + object[y].id));
        p2.add(new JLabel("Email :   " + object[y].email));

        JPanel p3 = new JPanel();
        JScrollPane pane = new JScrollPane(p3);

        p3.setLayout(new GridLayout(1, object[y].numberofjobcounter));
        for (int j = 0; j < object[y].numberofjobcounter; j++) {
            JPanel p7 = new JPanel();
            p7.setLayout(new GridLayout(9, 1));
            p7.setBorder(new LineBorder(Color.BLACK, 1));
            // if(j%2==1)
            //    p7.setBackground(Color.LIGHT_GRAY);
            p7.add(new JLabel("  Job :   " + (j + 1)));
            p7.add(new JLabel("  Name :   " + object[y].jobnames[j]));
            p7.add(new JLabel("  Sex " + ":   " + object[y].sexs[j]));
            p7.add(new JLabel("  Number of Employee " + ":   " + object[y].numberofemployees[j]));
            p7.add(new JLabel("  Salary   " + ": " + object[y].wages[j]));

            if (object[y].workexperiances[j] == 0) {
                p7.add(new JLabel("  Work Experiance :     No Work Experiance"));
            } else {
                p7.add(new JLabel("  Work Experiance :     " + object[y].workexperiances[j]));
            }
            p7.add(new JLabel("  Educational Qaulification  " + ": " + object[y].educationalqualifications[j]));

            JPanel p6 = new JPanel();
            p6.setLayout(new GridLayout(object[y].fieldcounter[j], 1));
            p6.setBackground(Color.WHITE);
            for (int j1 = 0; j1 < object[y].fieldcounter[j]; j1++) {
                p6.add(new JLabel((j1 + 1) + ":   " + object[y].departments[j][j1]));
            }
            p7.add(p6);
            p7.add(new JLabel("================================== "));
            p3.add(p7);
        }

        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        p4.setBackground(Color.GRAY);
        backinfo = new JButton("Back");
        backinfo.setFont(new Font("SansSerif", Font.ITALIC, 20));
        p4.add(backinfo);

        EmployerInformation.add(p2, BorderLayout.NORTH);
        EmployerInformation.add(pane, BorderLayout.CENTER);
        EmployerInformation.add(p4, BorderLayout.SOUTH);

        backinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backinfo) {
                    EmployerInformation.setVisible(false);
                    employerMenu();
                }
            }
        });
    }

    void employerUpdate() {

        EmployerUpdate = new JFrame();
        EmployerUpdate.setSize(900, 700);
        EmployerUpdate.setLocationRelativeTo(null);
        EmployerUpdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployerUpdate.setVisible(true);
        EmployerUpdate.setLayout(new BorderLayout());

        ucompanyname = new JTextField(30);
        ucreateaddress = new JTextField(10);
        ucreatephonenumber = new JTextField(10);
        updateid = new JTextField(10);
        updateenrollmentdate = new JTextField(10);
        ucreateemail = new JTextField(10);

        ucompanyname.setText(object[y].companyname);
        ucreateaddress.setText(object[y].address);
        ucreatephonenumber.setText(object[y].phonenumber);
        updateid.setText(String.valueOf(object[y].id));
        updateid.setEditable(false);
        updateenrollmentdate.setText(object[y].enrollmentdate);
        updateenrollmentdate.setEditable(false);
        ucreateemail.setText(object[y].email);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 30));
        p1.setBorder(new TitledBorder("Company Name"));
        JLabel label = new JLabel("      Company Name");

        label.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 25));

        p1.add(label);
        p1.add(ucompanyname);

        JPanel p2 = new JPanel(new GridLayout(5, 2));
        p2.setBorder(new TitledBorder("Main Menu"));
        p2.add(new JLabel("Address"));
        p2.add(ucreateaddress);
        p2.add(new JLabel("Enrollment Date"));
        p2.add(updateenrollmentdate);
        p2.add(new JLabel("Phone Number"));
        p2.add(ucreatephonenumber);
        p2.add(new JLabel("Email"));
        p2.add(ucreateemail);
        p2.add(new JLabel("ID"));
        p2.add(updateid);

        JPanel p22 = new JPanel(new GridLayout(5, 2));
        JPanel p222 = new JPanel(new GridLayout(2, 1));

        p222.add(p2);
        p222.add(p22);

        updatemale = new JCheckBox("Male", true);
        updatefemale = new JCheckBox("Female", true);

        JPanel p6 = new JPanel(new GridLayout(object[y].numberofjobcounter, 1));
        JScrollPane pane = new JScrollPane(p6);

        for (int j = 0; j < object[y].numberofjobcounter; j++) {

            JPanel p3 = new JPanel(new GridLayout(8, 2));
            p3.setBorder(new LineBorder(Color.BLACK, 1));
            JLabel lable = new JLabel(("JOb " + (j + 1)));
            //lable.setForeground(Color.BLUE);
            lable.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 20));

            p3.add(lable);
            p3.add(new JLabel(" "));
            p3.add(new JLabel("Company Name"));
            ujobname[j] = new JTextField();
            ujobname[j].setText(object[y].jobnames[j]);
            p3.add(ujobname[j]);
            p3.add(new JLabel("Number of Employee"));
            employees[j] = new JTextField();
            employees[j].setText(String.valueOf(object[y].numberofemployees[j]));
            p3.add(employees[j]);
            p3.add(new JLabel("Work Experience"));
            updateexperiance[j] = new JTextField();
            updateexperiance[j].setText(String.valueOf(object[y].workexperiances[j]));
            p3.add(updateexperiance[j]);
            z = j;

            JPanel p4 = new JPanel(new GridLayout(1, 2));

            switch (object[y].sexs[j]) {
                case "Male":
                    p4.add(updatemale = new JCheckBox("Male", true));
                    p4.add(updatefemale = new JCheckBox("Female", false));
                    break;
                case "Female":
                    p4.add(updatemale = new JCheckBox("Male", false));
                    p4.add(updatefemale = new JCheckBox("Female", true));
                    break;
                case "Both Male and Female":
                    p4.add(updatemale = new JCheckBox("Male", true));
                    p4.add(updatefemale = new JCheckBox("Female", true));
                    break;
            }

            SexHandler1 handler1 = new SexHandler1();
            updatemale.addItemListener(handler1);
            updatefemale.addItemListener(handler1);

            p3.add(new JLabel("Sex "));
            p3.add(p4);

            updatewage = new JComboBox(updatewagestring);
            if (object[y].wages[j].equals("Not Spacify")) {
                updatewage.setSelectedIndex(0);
            } else {
                updatewage.setSelectedIndex(1);
            }

            p3.add(new JLabel("Salary "));
            p3.add(updatewage);

            updatewage.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    combowagecounter++;
                    String fn = "";
                    if (combowagecounter == 2) {
                        combowagecounter = 0;
                        if (updatewage.getSelectedItem() == "Not Spacify") {
                            wages[z] = String.format(updatewage.getSelectedItem().toString());
                        } else if (updatewage.getSelectedItem() == "Specify") {
                            fn = JOptionPane.showInputDialog(null, "Enter Amount");
                            wages[z] = fn;
                        }
                    }
                }
            });
            p3.add(new JLabel("Educational qualification"));
            educationalqualification[j] = new JTextField();
            educationalqualification[j].setText(object[y].educationalqualifications[j]);
            p3.add(educationalqualification[j]);

            JPanel p5 = new JPanel(new GridLayout(object[y].fieldcounter[j], 2));
            JPanel p55 = new JPanel(new GridLayout(object[y].fieldcounter[j], 2));
            for (int j1 = 0; j1 < object[y].fieldcounter[j]; j1++) {
                p55.add(new JLabel(" " + (j1 + 1)));
                department[j][j1] = new JTextField();
                department[j][j1].setText(object[y].departments[j][j1]);
                p5.add(department[j][j1]);
            }
            p3.add(p55);
            p3.add(p5);

            p6.add(p3);
        }
        JPanel p9 = new JPanel(new GridLayout(1, 2));
        updateadd = new JButton("Add Job");
        updateadd.setBackground(Color.BLACK);
        updateadd.setForeground(Color.GREEN);
        updateadd.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 15));

        updateremove = new JButton("Remove Job");
        updateremove.setBackground(Color.BLACK);
        updateremove.setForeground(Color.RED);
        updateremove.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 15));

        p9.add(updateadd);
        p9.add(updateremove);

        JPanel p10 = new JPanel(new BorderLayout());
        p10.add(pane, BorderLayout.CENTER);
        p10.add(p9, BorderLayout.SOUTH);
        JPanel p7 = new JPanel(new GridLayout(1, 2));
        p7.add(p222);
        p7.add(p10);

        updateback = new JButton("Back");
        updatesave = new JButton("Save");
        updateback.setFont(new Font("Plain", Font.BOLD, 20));
        updatesave.setFont(new Font("Plain", Font.BOLD, 20));

        JPanel p8 = new JPanel(new GridLayout(1, 2));

        p8.add(updateback);
        p8.add(updatesave);

        EmployerUpdate.add(p1, BorderLayout.NORTH);
        EmployerUpdate.add(p7, BorderLayout.CENTER);
        EmployerUpdate.add(p8, BorderLayout.SOUTH);

        updateback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == updateback) {
                    EmployerUpdate.setVisible(false);
                    employerMenu();
                }
            }
        });
        updatesave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == updatesave) {
                    String pass;
                    pass = String.format(ucreatephonenumber.getText());

                    if (pass.length() != 10) {
                        JOptionPane.showMessageDialog(null, "Invalid phone number", "warnning", JOptionPane.ERROR_MESSAGE);
                    } else {

                        char[] ch = pass.toCharArray();
                        boolean truevalue = true;

                        for (int a = 0; a < pass.length(); a++) {
                            if ((int) ch[a] < 48 || (int) ch[a] > 57 || ch[0] != '0' || ch[1] != '9') {

                                truevalue = false;
                                break;
                            }

                        }
                        if (truevalue) {

                            for (int g = 0; g < object[y].numberofjobcounter; g++) {
                                jobnames[g] = String.format(ujobname[g].getText());
                                educationalqualifications[g] = String.format(educationalqualification[g].getText());
                                workexperiances[g] = Integer.parseInt(updateexperiance[g].getText());
                                numberofemployees[g] = Integer.parseInt(employees[g].getText());
                                for (int j = 0; j < object[y].fieldcounter[g]; j++) {
                                    fieldname1[g][j] = String.format(department[g][j].getText());
                                }
                            }

                            zy = object[y].numberofjobcounter;
                            object[y] = new Employer(String.format(ucompanyname.getText()), ENROLLMENTDATE, String.format(ucreateemail.getText()), String.format(ucreateaddress.getText()),
                                    pass, educationalqualifications, ID, numberofemployees, workexperiances, jobnames, sexs, wages, fieldname1, numberoffields, (object[y].numberofjobcounter));

                            JOptionPane.showMessageDialog(null, "updated successfully");
                            System.out.println();

                            jobspecificationcounter = 0;
                            EmployerUpdate.setVisible(false);
                            employerMenu();

                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid phone number", "warning", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                }
            }
        });
        updateremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == updateremove) {

                    final JFrame frame = new JFrame();

                    frame.setSize(700, 600);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.red));
                    frame.setVisible(true);

                    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 30));
                    p3.setBackground(Color.BLACK);

                    JLabel label = new JLabel("Select Job Name");
                    label.setFont(new Font("Plain", Font.BOLD, 20));
                    label.setForeground(Color.RED);
                    p3.add(label);
                    JPanel p1 = new JPanel(new GridLayout(object[y].numberofjobcounter * 2, 1));
                    p1.setBackground(Color.BLACK);

                    group = new ButtonGroup();

                    DeleteListener listener = new DeleteListener();

                    for (int j = 0; j < object[y].numberofjobcounter; j++) {

                        JRadioButton bb;
                        bb = new JRadioButton(object[y].jobnames[j]);
                        bb.addActionListener(listener);
                        bb.setForeground(Color.WHITE);
                        bb.setBackground(Color.BLACK);
                        group.add(bb);
                        p1.add(bb);
                        z2 = j;
                        deletebutton[j] = bb;

                    }

                    JPanel p2 = new JPanel(new GridLayout(1, 2));
                    p2.setBackground(Color.BLACK);

                    deletecancel = new JButton("Cancel");
                    deletecancel.setBackground(Color.BLACK);
                    deletecancel.setForeground(Color.WHITE);
                    deletecancel.setFont(new Font("Plain", Font.BOLD, 15));

                    deletenext1 = new JButton("Delete");
                    deletenext1.setBackground(Color.BLACK);
                    deletenext1.setForeground(Color.RED);
                    deletenext1.setFont(new Font("Plain", Font.BOLD, 15));

                    p2.add(deletecancel);
                    p2.add(deletenext1);

                    frame.add(p3, BorderLayout.NORTH);
                    frame.add(p1, BorderLayout.CENTER);
                    frame.add(p2, BorderLayout.SOUTH);

                    deletecancel.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == deletecancel) {
                                frame.setVisible(false);

                            }
                        }
                    });
                    deletenext1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == deletenext1) {
                                if (foundtrue) {
                                    int answer = JOptionPane.showConfirmDialog(null, "are you sure do you went to delete Job name " + object[y].jobnames[z1], "warning", JOptionPane.ERROR_MESSAGE);
                                    if (answer == JOptionPane.YES_OPTION) {
                                        for (; z1 < object[y].numberofjobcounter; z1++) {
                                            object[y].fieldcounter[z1] = object[y].fieldcounter[z1 + 1];
                                            object[y].jobnames[z1] = object[y].jobnames[z1 + 1];
                                            object[y].educationalqualifications[z1] = object[y].educationalqualifications[z1 + 1];
                                            object[y].wages[z1] = object[y].wages[z1 + 1];
                                            object[y].sexs[z1] = object[y].sexs[z1 + 1];
                                            object[y].workexperiances[z1] = object[y].workexperiances[z1 + 1];
                                            object[y].numberofemployees[z1] = object[y].numberofemployees[z1 + 1];
                                            System.arraycopy(object[y].departments[z1 + 1], 0, object[y].departments[z1], 0, object[y].fieldcounter[z1]); // object[y].fieldcounter[z1] = object[y].fieldcounter[z1+1];
                                        }
                                        object[y].numberofjobcounter -= 1;
                                        JOptionPane.showMessageDialog(null, "job was deleted");
                                        EmployerUpdate.setVisible(false);
                                        frame.setVisible(false);
                                        foundtrue = false;
                                        employerMenu();
                                    } else if (answer == JOptionPane.NO_OPTION) {
                                        frame.setVisible(false);
                                        EmployerUpdate.setVisible(true);
                                        foundtrue = false;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "please select  Job");
                                }
                            }
                        }
                    });
                }
            }
        });
        updateadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == updateadd) {
                    jobspecificationcounter = zy;
                    System.out.println(zy + " " + jobspecificationcounter);
                    jobSpecificationFill();

                }
            }
        });

    }

    void jobSpecificationFill() {

        EmployerJobSpecification = new JFrame();
        EmployerJobSpecification.setTitle("JOB " + (jobspecificationcounter + 1));
        EmployerJobSpecification.setSize(800, 400);
        EmployerJobSpecification.setLocationRelativeTo(null);
        EmployerJobSpecification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EmployerJobSpecification.setVisible(true);
        EmployerJobSpecification.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 25));

        p1.setBackground(Color.LIGHT_GRAY);
        p1.setBorder(new TitledBorder("Educational Qaulification"));

        createdegree = new JButton("Degree");
        creatediploma = new JButton("Diploma");
        createphd = new JButton("PHD");
        createmasters = new JButton("Msters");
        createother = new JButton("Other");
        createnoeducation = new JButton("No Education");
        createhighschool = new JButton("High School");

        createdegree.setCursor(new Cursor(Cursor.HAND_CURSOR));
        creatediploma.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createphd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createmasters.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createother.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createnoeducation.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createhighschool.setCursor(new Cursor(Cursor.HAND_CURSOR));

        p1.add(createhighschool);
        p1.add(creatediploma);
        p1.add(createdegree);
        p1.add(createmasters);
        p1.add(createphd);
        p1.add(createother);
        p1.add(createnoeducation);

        JPanel p2 = new JPanel(new GridLayout(5, 2));

        createmale = new JCheckBox("Male");
        createfemale = new JCheckBox("Female");

        createwage = new JComboBox(createwagestring);
        createnumberofemployee = new JTextField(10);
        createworkexperiance = new JTextField(10);
        createsave = new JButton("Save");
        createsave.setFont(new Font("Plane", Font.BOLD, 20));
        createjobname = new JTextField("Name....", 10);

        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        p3.setBorder(new LineBorder(Color.GRAY, 1));
        p3.add(createmale);
        p3.add(createfemale);

        p2.add(new JLabel("Job Name"));
        p2.add(createjobname);
        p2.add(new JLabel("Sex"));
        p2.add(p3);
        p2.add(new JLabel("Wage"));
        p2.add(createwage);
        p2.add(new JLabel("Number ofEmployee"));
        p2.add(createnumberofemployee);
        p2.add(new JLabel("Work Experiance"));
        p2.add(createworkexperiance);

        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        p4.setBorder(new LineBorder(Color.GRAY, 1));
        p4.add(createsave);

        EmployerJobSpecification.add(p1, BorderLayout.NORTH);
        EmployerJobSpecification.add(p2, BorderLayout.WEST);
        EmployerJobSpecification.add(p4, BorderLayout.SOUTH);

        SexHandler handler = new SexHandler();

        createmale.addItemListener(handler);
        createfemale.addItemListener(handler);

        createwage.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                combowagecounter++;
                String fn = "";
                if (combowagecounter == 2) {
                    combowagecounter = 0;
                    if (createwage.getSelectedItem() == "Not Spacify") {
                        wages[jobspecificationcounter] = String.format(createwage.getSelectedItem().toString());
                    } else if (createwage.getSelectedItem() == "Specify") {
                        fn = JOptionPane.showInputDialog(null, "Enter Amount");
                        wages[jobspecificationcounter] = fn;
                    }
                }
            }
        });

        createhighschool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createhighschool) {

                    educationalqualifications[jobspecificationcounter] = String.format(createhighschool.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();
                    JOptionPane.showMessageDialog(null, educationalqualifications[jobspecificationcounter] + " was saved");
                    numberoffields[jobspecificationcounter] = 0;
                }
            }
        });
        createdegree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createdegree) {

                    educationalqualifications[jobspecificationcounter] = String.format(createdegree.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalqualifications[jobspecificationcounter] + " in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        creatediploma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == creatediploma) {

                    educationalqualifications[jobspecificationcounter] = String.format(creatediploma.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalqualifications[jobspecificationcounter] + " in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        createmasters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createmasters) {

                    educationalqualifications[jobspecificationcounter] = String.format(createmasters.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalqualifications[jobspecificationcounter] + " in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        createphd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createphd) {

                    educationalqualifications[jobspecificationcounter] = String.format(createphd.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalqualifications[jobspecificationcounter] + " in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        createother.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createother) {

                    educationalqualifications[jobspecificationcounter] = String.format(createother.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, educationalqualifications[jobspecificationcounter] + " in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        createnoeducation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createnoeducation) {

                    educationalqualifications[jobspecificationcounter] = String.format(createnoeducation.getText());
                    educationalqualifications[jobspecificationcounter] = educationalqualifications[jobspecificationcounter].toUpperCase();

                    snumber = JOptionPane.showInputDialog(null, "any job experiance in number");
                    numberoffields[jobspecificationcounter] = Integer.parseInt(snumber);

                    employerDepartmentFill();
                }
            }
        });
        createsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == createsave) {

                    numberofemployees[jobspecificationcounter] = Integer.parseInt(createnumberofemployee.getText());
                    jobnames[jobspecificationcounter] = String.format(createjobname.getText());
                    workexperiances[jobspecificationcounter] = Integer.parseInt(createworkexperiance.getText());
                    JOptionPane.showMessageDialog(null, "Job Name " + jobnames[jobspecificationcounter] + " was saved Successfully");
                     
                    jobspecificationcounter++;
                    zy = jobspecificationcounter;
                    EmployerJobSpecification.setVisible(false);

                    int answer = JOptionPane.showConfirmDialog(null, "Do You went to add a new Job");

                    if (answer == JOptionPane.YES_OPTION) {
                        jobSpecificationFill();
                    }
                }
            }
        });
    }

    void employerDepartmentFill() {

        if (numberoffields[jobspecificationcounter] < 1) {
            return;
        }
        final JFrame frame = new JFrame("Field");

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        employerdepartmentchoice = new JComboBox(departmentname);

        JPanel p1 = new JPanel(new GridLayout(numberoffields[jobspecificationcounter], 2));
        p1.setBackground(Color.WHITE);
        p1.setBorder(new TitledBorder("Select or Fill"));

        for (int a = 0; a < numberoffields[jobspecificationcounter]; a++) {

            p1.add(new JLabel("Num " + (a + 1)));
            if (a == (numberoffields[jobspecificationcounter] - 1)) {
                continue;
            }
            fieldarray[a] = new JTextField(10);
            p1.add(fieldarray[a]);

        }
        nextfill = new JButton("Save");
        cancelfill = new JButton("cancel");
        p1.add(employerdepartmentchoice);
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 10));
        p2.add(cancelfill);
        p2.add(nextfill);
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);

        employerdepartmentchoice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                String fn;
                comboboxcounter++;
                if (comboboxcounter == 2) {
                    comboboxcounter = 0;
                    if (employerdepartmentchoice.getSelectedItem() == "Other") {
                        fn = JOptionPane.showInputDialog(null, "Enter Name");
                        fieldname1[jobspecificationcounter][numberoffields[jobspecificationcounter] - 1] = fn;
                    } else {
                        fieldname1[jobspecificationcounter][numberoffields[jobspecificationcounter] - 1] = String.format(employerdepartmentchoice.getSelectedItem().toString());

                    }

                }
            }
        });
        nextfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == nextfill) {

                    for (int a = 0; a < (numberoffields[jobspecificationcounter] - 1); a++) {
                        fieldname1[jobspecificationcounter][a] = String.format(fieldarray[a].getText());
                        // System.out.println(fieldname1[jobspecificationcounter][a]);
                    }
                    frame.setVisible(false);
                    JOptionPane.showMessageDialog(null, "saved was made successfully");

                }
            }
        });
        cancelfill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cancelfill) {
                    frame.setVisible(false);
                }
            }
        });
    }

    int searchingEmployer(String key) {
        int index = 0;
        int found = 0;

        do {
            if (key.equals(object[index].phonenumber) || key.equals(object[index].email)) {
                found = 1;
            } else {
                index++;
            }
        } while (found == 0 && index < k);
        if (found == 0) {
            index = -1;
        }
        return index;
    }

    class SexHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            if (createmale.isSelected() && createfemale.isSelected()) {
                sexs[jobspecificationcounter] = "Both Male and Female";
            } else if (createmale.isSelected()) {
                sexs[jobspecificationcounter] = "Male";
            } else if (createfemale.isSelected()) {
                sexs[jobspecificationcounter] = "Female";
            }

        }
    }

    class SexHandler1 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            if (updatemale.isSelected() && updatefemale.isSelected()) {
                sexs[z] = "Both Male and Female";
            } else if (updatemale.isSelected()) {
                sexs[z] = "Male";
            } else if (updatefemale.isSelected()) {
                sexs[z] = "Female";
            }

        }
    }

    class DeleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton bb = (JRadioButton) e.getSource();
            for (int j = 0; j < object[y].numberofjobcounter; j++) {
                if (bb.getText().equals(object[y].jobnames[j])) {
                    z1 = j;
                    break;
                }
            }

            foundtrue = true;

        }
    }

    public class Employee  {

        byte age = 0, workexperiance = 0;
        int id = 0, fieldcounter = 0;
        String fname = "", mname = "", lname, sex, address, phonenumber, comment, email;
        String educationalqualification, enrollmentdate;
        String[] department = new String[10];

        Employee() {

        }

        Employee(String f, String m, String l, String address, String email, String edu, String sex, String date, byte age, byte experiance, int caunter, String dept[], String phone, int id) {
            fname = f.toUpperCase();
            lname = l.toUpperCase();
            mname = m.toUpperCase();
            this.address = address.toUpperCase();
            this.email = email;
            educationalqualification = edu;
            this.sex = sex;
            enrollmentdate = date;
            fieldcounter = caunter;
            System.arraycopy(dept, 0, department, 0, fieldcounter);
            this.age = age;
            workexperiance = experiance;
            phonenumber = phone;
            this.id = id;
        }

        void setPhoneNumber(String phone) {
            phonenumber = phone;
        }

        String getPhoneNumber() {
            return phonenumber;
        }

        void setId(int phone) {
            id = phone;
        }

        int getId() {
            return id;
        }

        void setEmail(String phone) {
            email = phone;
        }

        String getEmail() {
            return email;
        }

        void setComment(String comment) {
            this.comment = comment;
        }

        String getComment() {
            return comment;
        }
    }

    public class Employer {

        int[] numberofemployees = new int[20];
        int[] fieldcounter = new int[20];
        int[] workexperiances = new int[20];
        String[] jobnames = new String[20];
        String[] sexs = new String[20];
        String[] wages = new String[20];
        String[][] departments = new String[20][20];
        String[] educationalqualifications = new String[20];
        int id, numberofjobcounter = 0;
        String address = "a", phonenumber = "a", comment = "a", email = "a";
        public String companyname = "a", enrollmentdate = "q";

        Employer() {
            for (int j = 0; j < 20; j++) {

                numberofemployees[j] = 0;
                workexperiances[j] = 0;
                jobnames[j] = "a";
                sexs[j] = "a";
                wages[j] = "a";
                educationalqualifications[j] = "a";
                for (int i = 0; i < 20; i++) {
                    departments[j][j] = "a";
                }

            }

        }

        Employer(String f, String date, String email, String adress, String phone, String edu[], int id, int numberofemployee[], int workexperiances[], String jobnames[], String sexs[], String wages[], String departments[][], int counter[], int numofjobcounter) {
            companyname = f.toUpperCase();
            this.address = address.toUpperCase();
            this.email = email;
            enrollmentdate = date;
            phonenumber = phone;
            this.id = id;
            numberofjobcounter = numofjobcounter;

            for (int i = 0; i < numberofjobcounter; i++) {
                fieldcounter[i] = counter[i];
                this.jobnames[i] = jobnames[i].toUpperCase();
                educationalqualifications[i] = edu[i].toUpperCase();
                this.wages[i] = wages[i];
                this.sexs[i] = sexs[i];
                this.workexperiances[i] = workexperiances[i];
                numberofemployees[i] = numberofemployee[i];
            }

            for (int i = 0; i < numberofjobcounter; i++) {
                for (int j = 0; j < counter[i]; j++) {
                    this.departments[i][j] = departments[i][j].toUpperCase();
                }
            }

        }

        void setPhoneNumber(String phone) {
            phonenumber = phone;
        }

        String getPhoneNumber() {
            return phonenumber;
        }

        void setId(int phone) {
            id = phone;
        }

        int getId() {
            return id;
        }

        void setEmail(String phone) {
            email = phone;
        }

        String getEmail() {
            return email;
        }

        void setComment(String comment) {
            this.comment = comment;
        }

        String getComment() {
            return comment;
        }
    }

    
}
