import javax.swing.*;
import java.awt.*;

class TransaksiSelesaiPage extends JFrame {
    public TransaksiSelesaiPage(String nama, String nik, String noHp, String email, String alamat, String kursi) {
        setTitle("Transaksi Selesai - KeretaKu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Transaksi Berhasil");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel nameLabel = new JLabel("Nama Penumpang: " + nama);
        JLabel nikLabel = new JLabel("NIK: " + nik);
        JLabel phoneLabel = new JLabel("No HP: " + noHp);
        JLabel emailLabel = new JLabel("Email: " + email);
        JLabel addressLabel = new JLabel("Alamat: " + alamat);
        JLabel seatLabel = new JLabel("Nomor Kursi: " + kursi);

        JButton backButton = new JButton("Kembali ke Menu");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            dispose();
            new HomePage();
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(titleLabel, gbc);

        gbc.gridy++;
        add(nameLabel, gbc);
        gbc.gridy++;
        add(nikLabel, gbc);
        gbc.gridy++;
        add(phoneLabel, gbc);
        gbc.gridy++;
        add(emailLabel, gbc);
        gbc.gridy++;
        add(addressLabel, gbc);
        gbc.gridy++;
        add(seatLabel, gbc);

        gbc.gridy++;
        add(backButton, gbc);

        setVisible(true);
    }
}