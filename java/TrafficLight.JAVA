import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
class TrafficLight extends JFrame implements ActionListener { 
    String msg = ""; 
    private JLabel label; 
    private JTextField display; 
    private JRadioButton r1, r2, r3; 
    private ButtonGroup bg; // Corrected variable name 
    private Container c; 
 
    public TrafficLight() { 
        setLayout(new FlowLayout()); 
        c = getContentPane(); 
        label = new JLabel(); 
        display = new JTextField(10); 
        r1 = new JRadioButton("RED"); 
        r2 = new JRadioButton("GREEN"); 
        r3 = new JRadioButton("ORANGE"); 
        bg = new ButtonGroup(); // Corrected variable name 
        c.add(r1); 
        c.add(r2); 
        c.add(r3); 
        c.add(display); 
        bg.add(r1); 
        bg.add(r2); 
        bg.add(r3); 
        r1.addActionListener(this); 
        r2.addActionListener(this); 
        r3.addActionListener(this); 
        setSize(400, 400); 
        setVisible(true); 
        c.setBackground(Color.PINK); 
    } 
 
    public void actionPerformed(ActionEvent ie) { // Corrected 
method name 
        msg = ie.getActionCommand(); 
        if (msg.equals("RED")) { 
            c.setBackground(Color.RED); 
            display.setText(msg + ": TURN ON"); 
        } else if (msg.equals("GREEN")) { 
            c.setBackground(Color.GREEN); 
            display.setText(msg + ": TURN ON"); 
        } else if (msg.equals("ORANGE")) { 
            c.setBackground(Color.orange); 
            display.setText(msg + ": TURN ON"); 
        } 
    } 
 
    public static void main(String[] args) { 
        TrafficLight light = new TrafficLight(); 
        light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
} 
 
class Signal extends JPanel { 
    int radius = 40; 
    int border = 10; 
    Color on; 
    boolean change;  
 
    Signal(Color color) { 
        on = color; 
        change = true; 
    } 
 
    public void turnOn(boolean a) { 
        change = a; 
        repaint(); 
    } 
 
    public Dimension getPreferredSize() { 
        int size = (radius + border) * 2; 
        return new Dimension(size, size); 
    } 
 
    public void paintComponent(Graphics graphics) { 
        graphics.setColor(Color.BLACK); 
        graphics.fillRect(0, 0, getWidth(), getHeight()); // 
Corrected method name 
        if (change) { 
            graphics.setColor(on); 
        } else { 
            graphics.setColor(on.darker().darker().darker()); 
        } 
        graphics.fillOval(border, border, 2 * radius, 2 * radius); 
    } 
}