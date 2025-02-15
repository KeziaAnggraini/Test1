import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class HomePage extends JFrame {
    public HomePage() {
        setTitle("KeretaKu - Home");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        JLabel titleLabel = new JLabel("Welcome to KeretaKu!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));

        JLabel stationFromLabel = new JLabel("Stasiun Awal:");
        JComboBox<String> stationFromBox = new JComboBox<>(new String[]{"Surabaya", "Bandung", "Yogyakarta"});
        stationFromBox.setPreferredSize(new Dimension(200, 30));

        JLabel stationToLabel = new JLabel("Stasiun Tujuan:");
        JComboBox<String> stationToBox = new JComboBox<>(new String[]{"Jakarta", "Bandung", "Yogyakarta"});
        stationToBox.setPreferredSize(new Dimension(200, 30));

        JLabel dateLabel = new JLabel("Tanggal Keberangkatan:");
        JComboBox<String> dateBox = new JComboBox<>(generateDateOptions());
        dateBox.setPreferredSize(new Dimension(200, 30));

        JLabel passengerLabel = new JLabel("Jumlah Penumpang:");
        JComboBox<String> passengerBox = new JComboBox<>(new String[]{"1", "2", "3"});
        passengerBox.setPreferredSize(new Dimension(200, 30));

        JButton searchButton = new JButton("Cari");
        searchButton.setFont(new Font("Arial", Font.BOLD, 24));
        searchButton.addActionListener(e -> {
            dispose();
            new PemesananTiketPage();
        });

        JButton backButton = new JButton("Logout");
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        add(titleLabel, gbc);

        gbc.gridy++;
        add(stationFromLabel, gbc);
        gbc.gridx = 1;
        add(stationFromBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(stationToLabel, gbc);
        gbc.gridx = 1;
        add(stationToBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(dateLabel, gbc);
        gbc.gridx = 1;
        add(dateBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(passengerLabel, gbc);
        gbc.gridx = 1;
        add(passengerBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(searchButton, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(backButton, gbc);

        setVisible(true);
    }

    private String[] generateDateOptions() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String[] dates = new String[11];

        for (int i = 0; i < 11; i++) {
            dates[i] = today.plusDays(i).format(formatter);
        }

        return dates;
    }
}