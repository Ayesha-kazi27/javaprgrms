import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Base64;

public class base64app extends JFrame {
    private JTextArea in = new JTextArea(), out = new JTextArea();
    private Color ONYX = new Color(24, 26, 27), CHAR = new Color(35, 39, 42), ELEC = new Color(0, 150, 255);

    public base64app() {
        setTitle("Base 64 encoder/decoder");
        setSize(700, 550);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        getContentPane().setBackground(ONYX);
        setLayout(new BorderLayout(20, 20));
        ((JPanel)getContentPane()).setBorder(new EmptyBorder(30, 30, 30, 30));

        JLabel h = new JLabel("BASE64 CONVERTER");
        h.setFont(new Font("Inter", 1, 18));
        h.setForeground(Color.WHITE);
        add(h, "North");

        JPanel w = new JPanel(new GridLayout(2, 1, 20, 20));
        w.setOpaque(false);
        for (JTextArea a : new JTextArea[]{in, out}) {
            a.setBackground(CHAR); a.setForeground(a == in ? Color.WHITE : ELEC);
            a.setFont(new Font("Consolas", 0, 15)); a.setLineWrap(true);
            a.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(80,80,80)), 
                a == in ? "INPUT SOURCE" : "RESULT", 0, 0, new Font("SansSerif", 1, 10), new Color(180,180,180)));
            w.add(new JScrollPane(a));
        }
        out.setEditable(false);
        add(w, "Center");

        JPanel t = new JPanel(new FlowLayout(2, 12, 0));
        t.setOpaque(false);
        String[] b = {"Clear", "Copy Result", "Encode →", "Decode ←"};
        for (String s : b) {
            JButton btn = new JButton(s);
            btn.setBackground(s.contains("→") || s.contains("←") ? ELEC : CHAR);
            btn.setForeground(Color.BLACK);
            btn.setFocusPainted(false);
            btn.setBorder(new EmptyBorder(10, 20, 10, 20));
            t.add(btn);
            if (s.equals("Clear")) btn.addActionListener(e -> { in.setText(""); out.setText(""); });
            if (s.equals("Copy Result")) btn.addActionListener(e -> {
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(out.getText()), null);
                btn.setText("Copied!");
                new Timer(1000, x -> btn.setText("Copy Result")).start();
            });
            if (s.contains("→")) btn.addActionListener(e -> out.setText(Base64.getEncoder().encodeToString(in.getText().getBytes())));
            if (s.contains("←")) btn.addActionListener(e -> {
                try { out.setText(new String(Base64.getDecoder().decode(in.getText().trim()))); }
                catch (Exception ex) { JOptionPane.showMessageDialog(this, "Invalid Base64"); }
            });
        }
        add(t, "South");
    }

    public static void main(String[] args) {
        new base64app().setVisible(true);
    }
}