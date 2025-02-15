import javax.swing.*;
import java.awt.*;

class PemesananDataDiriPage extends JFrame {
    public PemesananDataDiriPage() {
        setTitle("Pemesanan Data Diri - KeretaKu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Data Penumpang");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel nameLabel = new JLabel("Nama Penumpang:");
        JTextField nameField = new JTextField(20);

        JLabel nikLabel = new JLabel("NIK:");
        JTextField nikField = new JTextField(20);

        JLabel phoneLabel = new JLabel("No HP:");
        JTextField phoneField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel addressLabel = new JLabel("Alamat:");
        JTextField addressField = new JTextField(20);

        JButton orderButton = new JButton("Pesan");
        orderButton.setFont(new Font("Arial", Font.BOLD, 24));
        orderButton.addActionListener(e -> {
            String nama = nameField.getText();
            String nik = nikField.getText();
            String noHp = phoneField.getText();
            String email = emailField.getText();
            String alamat = addressField.getText();

            String stasiunAwal = "Gambir";
            String stasiunTujuan = "Surabaya";
            String kelas = "Eksekutif";
            String kereta = "Argo Bromo";
            String waktu = "10:00";
            double harga = 350000.0;

            dispose();
            new RingkasanPemesananPage(nama, nik, noHp, email, alamat, stasiunAwal, stasiunTujuan, kelas, kereta, waktu, harga);
        });

        JButton backButton = new JButton("Kembali");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            dispose();
            new PemesananTiketPage();
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        add(titleLabel, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(nameLabel, gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(nikLabel, gbc);
        gbc.gridx = 1;
        add(nikField, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(phoneLabel, gbc);
        gbc.gridx = 1;
        add(phoneField, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(emailLabel, gbc);
        gbc.gridx = 1;
        add(emailField, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(addressLabel, gbc);
        gbc.gridx = 1;
        add(addressField, gbc);

        gbc.gridy++; gbc.gridx = 0;
        add(orderButton, gbc);

        gbc.gridy++;
        add(backButton, gbc);

        setVisible(true);
    }
}