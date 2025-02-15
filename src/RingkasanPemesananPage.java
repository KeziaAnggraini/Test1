import javax.swing.*;
import java.awt.*;

class RingkasanPemesananPage extends JFrame {
    public RingkasanPemesananPage(String nama, String nik, String noHp, String email, String alamat,
                                  String stasiunAwal, String stasiunTujuan, String kelas,
                                  String kereta, String waktu, double harga) {
        setTitle("Ringkasan Pemesanan - KeretaKu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Ringkasan Pemesanan");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel nameLabel = new JLabel("Nama Penumpang: " + nama);
        JLabel nikLabel = new JLabel("NIK: " + nik);
        JLabel phoneLabel = new JLabel("No HP: " + noHp);
        JLabel emailLabel = new JLabel("Email: " + email);
        JLabel addressLabel = new JLabel("Alamat: " + alamat);
        JLabel routeLabel = new JLabel("Perjalanan: " + stasiunAwal + " → " + stasiunTujuan);
        JLabel classLabel = new JLabel("Kelas: " + kelas);
        JLabel trainLabel = new JLabel("Kereta: " + kereta);
        JLabel timeLabel = new JLabel("Waktu Keberangkatan: " + waktu);
        JLabel priceLabel = new JLabel("Total Harga: Rp " + harga);

        JLabel seatLabel = new JLabel("Pilih Kursi:");
        String[] seats = {"A1", "A2", "A3", "B1", "B2", "B3"};
        JComboBox<String> seatComboBox = new JComboBox<>(seats);

        JButton payButton = new JButton("Lanjut ke Pembayaran");
        payButton.setFont(new Font("Arial", Font.BOLD, 24));

        payButton.addActionListener(e -> {
            String selectedSeat = (String) seatComboBox.getSelectedItem();
            dispose();
            new PembayaranPage(nama, nik, noHp, email, alamat, selectedSeat);
        });

        JButton cancelButton = new JButton("Batalkan Pesanan");
        cancelButton.setFont(new Font("Arial", Font.BOLD, 24));

        cancelButton.addActionListener(e -> {
            dispose();
            new PemesananDataDiriPage();
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
        add(routeLabel, gbc);
        gbc.gridy++;
        add(classLabel, gbc);
        gbc.gridy++;
        add(trainLabel, gbc);
        gbc.gridy++;
        add(timeLabel, gbc);
        gbc.gridy++;
        add(priceLabel, gbc);

        gbc.gridy++;
        add(seatLabel, gbc);
        gbc.gridy++;
        add(seatComboBox, gbc);

        gbc.gridy++;
        add(payButton, gbc);
        gbc.gridy++;
        add(cancelButton, gbc);

        setVisible(true);
    }
}