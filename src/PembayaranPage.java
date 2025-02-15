import javax.swing.*;
import java.awt.*;

class PembayaranPage extends JFrame {
    public PembayaranPage(String nama, String nik, String noHp, String email, String alamat, String kursi) {
        setTitle("Pembayaran - KeretaKu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Metode Pembayaran");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel atmLabel = new JLabel("Pembayaran via ATM:");
        String[] atmOptions = {"BNI", "BCA", "Mandiri", "BRI"};
        JComboBox<String> atmComboBox = new JComboBox<>(atmOptions);

        JLabel retailLabel = new JLabel("Pembayaran via Gerai Retail:");
        String[] retailOptions = {"Alfamart", "Indomaret"};
        JComboBox<String> retailComboBox = new JComboBox<>(retailOptions);

        JButton confirmButton = new JButton("Konfirmasi Pembayaran");
        confirmButton.setFont(new Font("Arial", Font.BOLD, 24));
        confirmButton.addActionListener(e -> {
            dispose();
            new TransaksiSelesaiPage(nama, nik, noHp, email, alamat, kursi);
        });

        JButton backButton = new JButton("Kembali");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            dispose();
            new RingkasanPemesananPage(nama, nik, noHp, email, alamat, "", "", "", "", "", 0);
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(titleLabel, gbc);

        gbc.gridy++;
        add(atmLabel, gbc);
        gbc.gridy++;
        add(atmComboBox, gbc);

        gbc.gridy++;
        add(retailLabel, gbc);
        gbc.gridy++;
        add(retailComboBox, gbc);

        gbc.gridy++;
        add(confirmButton, gbc);
        gbc.gridy++;
        add(backButton, gbc);

        setVisible(true);
    }
}