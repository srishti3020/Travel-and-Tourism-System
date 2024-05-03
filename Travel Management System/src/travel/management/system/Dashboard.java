
package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addpersonaldetails, viewpersonaldetails, updatepersonaldetails, checkpackages, bookpackages, viewpackages, viewhotels, destinations, bookhotels;
       JButton      viewbookhotels, payments, calculator, notepad, about, deletepersonaldetails;
    Dashboard(String username) {
        this.username = username;
       // setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 70, 70);
        p1.add(image);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addpersonaldetails = new JButton("Add Personal Details");
        addpersonaldetails.setBounds(0, 0, 300, 50);
        addpersonaldetails.setBackground(new Color(0, 0, 102));
        addpersonaldetails.setForeground(Color.white);
        addpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addpersonaldetails.setMargin(new Insets(0, 0, 0, 60));
        addpersonaldetails.addActionListener(this);
        p2.add(addpersonaldetails);
        
        updatepersonaldetails = new JButton("Update Personal Details");
        updatepersonaldetails.setBounds(0, 50, 300, 50);
        updatepersonaldetails.setBackground(new Color(0, 0, 102));
        updatepersonaldetails.setForeground(Color.white);
        updatepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatepersonaldetails.setMargin(new Insets(0, 0, 0, 30));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);
        
        viewpersonaldetails = new JButton("View Details");
        viewpersonaldetails.setBounds(0, 100, 300, 50);
        viewpersonaldetails.setBackground(new Color(0, 0, 102));
        viewpersonaldetails.setForeground(Color.white);
        viewpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpersonaldetails.setMargin(new Insets(0, 0, 0, 130));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);
        
        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0, 150, 300, 50);
        deletepersonaldetails.setBackground(new Color(0, 0, 102));
        deletepersonaldetails.setForeground(Color.white);
        deletepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletepersonaldetails.setMargin(new Insets(0, 0, 0, 40));
        deletepersonaldetails.addActionListener(this);
        p2.add(deletepersonaldetails);
        
        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.white);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackages = new JButton("Book Packages");
        bookpackages.setBounds(0, 250, 300, 50);
        bookpackages.setBackground(new Color(0, 0, 102));
        bookpackages.setForeground(Color.white);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0, 0, 0, 120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);
        
        viewpackages = new JButton("View Packages");
        viewpackages.setBounds(0, 300, 300, 50);
        viewpackages.setBackground(new Color(0, 0, 102));
        viewpackages.setForeground(Color.white);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0, 0, 0, 120));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels = new JButton("Book Hotel");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(new Color(0, 0, 102));
        bookhotels.setForeground(Color.white);
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0, 0, 140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookhotels = new JButton("View Booked Hotel");
        viewbookhotels.setBounds(0, 450, 300, 50);
        viewbookhotels.setBackground(new Color(0, 0, 102));
        viewbookhotels.setForeground(Color.white);
        viewbookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookhotels.setMargin(new Insets(0, 0, 0, 70));
        viewbookhotels.addActionListener(this);
        p2.add(viewbookhotels);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad  = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about  = new JButton("About");
        about.setBounds(0, 690, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel photo = new JLabel(i6);
        photo.setBounds(0, 0, 1600, 1000);
        add(photo);
        
        JLabel text = new JLabel("Travel And Tourism Management System");
        text.setBounds(400, 70, 1000, 70);
        //text.setBackground(new Color(0, 0, 102));
        text.setForeground(Color.white);
        text.setFont(new Font("Tahoma", Font.PLAIN, 55));
        photo.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() ==  addpersonaldetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewpersonaldetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatepersonaldetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        } else if (ae.getSource() == bookpackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackages) {
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        }else if (ae.getSource() == destinations ) {
            new Destinations();
        } else if (ae.getSource() == bookhotels ) {
            new BookHotel(username);
        }
        else if (ae.getSource() == viewbookhotels ) {
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments ) {
            new Payment();
        } else if (ae.getSource() == calculator ) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e) {
                System.out.println();
            }
        } else if (ae.getSource() == notepad ) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e) {
                System.out.println();
            }
        }  else if (ae.getSource() == about ) {
            new About();
        } else if (ae.getSource() == deletepersonaldetails ) {
            new DeleteDetails(username);
        }
    }
    public static void main(String[] args) {
        new Dashboard("");
    } 
}
