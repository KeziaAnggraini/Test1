import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PemesananTiketPage extends JFrame {
    private JComboBox<String> kelasComboBox, jenisKeretaComboBox, waktuComboBox, stasiunAwalComboBox, stasiunTujuanComboBox;
    private JLabel hargaLabel;

    public PemesananTiketPage() {
        setTitle("Pemesanan Tiket - KeretaKu");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Pemesanan Tiket");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel kelasLabel = new JLabel("Kelas:");
        kelasComboBox = new JComboBox<>(new String[]{"Ekonomi", "Bisnis"});
        kelasComboBox.setPreferredSize(new Dimension(200, 30));

        JLabel jenisKeretaLabel = new JLabel("Jenis Kereta:");
        jenisKeretaComboBox = new JComboBox<>(new String[]{"Argo Bromo", "Gajayana", "Taksaka"});
        jenisKeretaComboBox.setPreferredSize(new Dimension(200, 30));

        JLabel stasiunAwalLabel = new JLabel("Stasiun Awal:");
        stasiunAwalComboBox = new JComboBox<>(new String[]{"Surabaya", "Bandung", "Yogyakarta"});

        JLabel stasiunTujuanLabel = new JLabel("Stasiun Tujuan:");
        stasiunTujuanComboBox = new JComboBox<>(new String[]{"Jakarta", "Bandung", "Yogyakarta"});

        JLabel waktuLabel = new JLabel("Waktu Keberangkatan:");
        waktuComboBox = new JComboBox<>(new String[]{"Pagi (07:00)", "Siang (12:00)", "Malam (18:00)"});
        waktuComboBox.setPreferredSize(new Dimension(200, 30));

        hargaLabel = new JLabel("Harga: -");

        JButton pesanButton = new JButton("Pesan");
        pesanButton.setFont(new Font("Arial", Font.BOLD, 24));

        pesanButton.addActionListener(e -> {
            dispose();
            new PemesananDataDiriPage();
        });

        JButton backButton = new JButton("Kembali");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));

        backButton.addActionListener(e -> {
            dispose();
            new HomePage();
        });

        ActionListener updateHargaListener = e -> updateHarga();
        kelasComboBox.addActionListener(updateHargaListener);
        jenisKeretaComboBox.addActionListener(updateHargaListener);
        stasiunAwalComboBox.addActionListener(updateHargaListener);
        stasiunTujuanComboBox.addActionListener(updateHargaListener);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(titleLabel, gbc);

        gbc.gridy++;
        add(kelasLabel, gbc);
        gbc.gridx = 1;
        add(kelasComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(jenisKeretaLabel, gbc);
        gbc.gridx = 1;
        add(jenisKeretaComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(stasiunAwalLabel, gbc);
        gbc.gridx = 1;
        add(stasiunAwalComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(stasiunTujuanLabel, gbc);
        gbc.gridx = 1;
        add(stasiunTujuanComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(waktuLabel, gbc);
        gbc.gridx = 1;
        add(waktuComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(hargaLabel, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(pesanButton, gbc);

        gbc.gridx = 1;
        add(backButton, gbc);

        setVisible(true);
    }

    private void updateHarga() {
        String kelas = (String) kelasComboBox.getSelectedItem();
        String jenisKereta = (String) jenisKeretaComboBox.getSelectedItem();
        String stasiunAwal = (String) stasiunAwalComboBox.getSelectedItem();
        String stasiunTujuan = (String) stasiunTujuanComboBox.getSelectedItem();

        if (stasiunAwal.equals(stasiunTujuan)) {
            hargaLabel.setText("Harga: -");
            return;
        }

        int hargaDasarKereta = 0;
        if (kelas.equals("Ekonomi")) {
            if (jenisKereta.equals("Argo Bromo")) hargaDasarKereta = 100000;
            else if (jenisKereta.equals("Gajayana")) hargaDasarKereta = 120000;
            else if (jenisKereta.equals("Taksaka")) hargaDasarKereta = 110000;
        } else if (kelas.equals("Bisnis")) {
            if (jenisKereta.equals("Argo Bromo")) hargaDasarKereta = 200000;
            else if (jenisKereta.equals("Gajayana")) hargaDasarKereta = 220000;
            else if (jenisKereta.equals("Taksaka")) hargaDasarKereta = 210000;
        }

        int jarak = 0;
        if (stasiunAwal.equals("Surabaya") && stasiunTujuan.equals("Jakarta")) jarak = 500;
        else if (stasiunAwal.equals("Surabaya") && stasiunTujuan.equals("Bandung")) jarak = 450;
        else if (stasiunAwal.equals("Surabaya") && stasiunTujuan.equals("Yogyakarta")) jarak = 300;
        else if (stasiunAwal.equals("Bandung") && stasiunTujuan.equals("Jakarta")) jarak = 150;
        else if (stasiunAwal.equals("Yogyakarta") && stasiunTujuan.equals("Jakarta")) jarak = 350;

        int hargaTotal = hargaDasarKereta + (jarak * 200);
        hargaLabel.setText("Harga: Rp " + hargaTotal);
    }
}