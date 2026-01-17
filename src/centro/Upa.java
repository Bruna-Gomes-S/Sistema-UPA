package centro;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Upa {
	    
	    private static final String DB_URL = "jdbc:mysql://localhost:3306/UPA_SP";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "Senjuhashir4ama.";

	    public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	          
	            System.out.println("Tentando conectar em: " + DB_URL + " com usuario: " + DB_USER);
	            
	            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	            return conn;
	        } catch (ClassNotFoundException e) {
	            System.err.println("ERRO: Driver JDBC não encontrado no Build Path!");
	        } catch (SQLException e) {
	            System.err.println("ERRO DE SQL: " + e.getMessage());
	            System.err.println("Código do erro: " + e.getErrorCode());
	        } catch (Exception e) {
	            System.err.println("ERRO DESCONHECIDO: " + e.getMessage());
	        }
	        return null;
	    }

	    public static void createTables() {
	        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
	          String zonaNorte = "CREATE TABLE IF NOT EXISTS Zona_Norte (" +
	                               "Cidade VARCHAR(255) PRIMARY KEY," +
	                               "CEP VARCHAR(10)," +
	                               "Bairros TEXT);";
	            
	          String paciente = "CREATE TABLE IF NOT EXISTS Paciente (" +
	                              "ID_Paciente INT PRIMARY KEY AUTO_INCREMENT," +
	                              "CPF VARCHAR(14) UNIQUE NOT NULL," +
	                              "Nome VARCHAR(255) NOT NULL," +
	                              "Data_Nascimento DATE," +
	                              "Nivel_Escolaridade VARCHAR(100)," +
	                              "Endereco VARCHAR(255)," +
	                              "Cidade_Zona_Norte VARCHAR(255)," +
	                              "FOREIGN KEY (Cidade_Zona_Norte) REFERENCES Zona_Norte(Cidade));";
	            
	            stmt.execute(zonaNorte);
	            stmt.execute(paciente);
	            
	            stmt.execute("INSERT IGNORE INTO Zona_Norte (Cidade) VALUES ('Natal')");
	            
	            System.out.println("Tabelas prontas!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void insertPaciente(Paciente p) throws SQLException {
	        String sql = "INSERT INTO Paciente (CPF, Nome, Data_Nascimento, Nivel_Escolaridade, Endereco, Cidade_Zona_Norte) VALUES (?, ?, ?, ?, ?, ?)";
	        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, p.getCpf());
	            pstmt.setString(2, p.getNome());
	            pstmt.setDate(3, p.getDataNascimento());
	            pstmt.setString(4, p.getNivelEscolaridade());
	            pstmt.setString(5, p.getEndereco());
	            pstmt.setString(6, p.getCidadeZonaNorte());
	            pstmt.executeUpdate();
	        }
	    }

	    public static void main(String[] args) {
	        createTables();

	        JFrame frame = new JFrame("UPA - Cadastro de Paciente");
	        frame.setSize(350, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);
	        frame.setLocationRelativeTo(null); 

	        
	        JLabel lblCpf = new JLabel("CPF:");
	        lblCpf.setBounds(20, 20, 80, 25);
	        JTextField txtCpf = new JTextField();
	        txtCpf.setBounds(120, 20, 180, 25);

	        JLabel lblNome = new JLabel("Nome:");
	        lblNome.setBounds(20, 60, 80, 25);
	        JTextField txtNome = new JTextField();
	        txtNome.setBounds(120, 60, 180, 25);

	        JLabel lblData = new JLabel("Data (AAAA-MM-DD):");
	        lblData.setBounds(20, 100, 150, 25);
	        JTextField txtData = new JTextField();
	        txtData.setBounds(120, 100, 180, 25);

	        JLabel lblCidade = new JLabel("Cidade:");
	        lblCidade.setBounds(20, 140, 80, 25);
	        JTextField txtCidade = new JTextField("Natal"); 
	        txtCidade.setBounds(120, 140, 180, 25);

	        JButton btnSalvar = new JButton("Salvar Cadastro");
	        btnSalvar.setBounds(100, 200, 150, 35);

	        
	        frame.add(lblCpf); frame.add(txtCpf);
	        frame.add(lblNome); frame.add(txtNome);
	        frame.add(lblData); frame.add(txtData);
	        frame.add(lblCidade); frame.add(txtCidade);
	        frame.add(btnSalvar);

	        
	        btnSalvar.addActionListener(e -> {
	            try {
	                Paciente p = new Paciente(
	                    txtCpf.getText(),
	                    txtNome.getText(),
	                    Date.valueOf(txtData.getText()), 
	                    "Médio", "Rua Exemplo", txtCidade.getText()
	                );
	                insertPaciente(p);
	                JOptionPane.showMessageDialog(frame, "Paciente " + p.getNome() + " salvo com sucesso!");
	            } catch (IllegalArgumentException ex) {
	                JOptionPane.showMessageDialog(frame, "Formato de data inválido! Use AAAA-MM-DD");
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(frame, "Erro: " + ex.getMessage());
	            }
	        });

	        frame.setVisible(true);
	    }
	}
