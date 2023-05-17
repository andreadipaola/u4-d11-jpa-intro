package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	static Connection connection = null;

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/StudentsDB?useSSl=false";
		String username = "postgres";
		String password = "1234";
		try {
			System.out.println("Connecting to DB...");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful ✅");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		public static void insertStudent(Student s) {
			String query = "INSERT INTO student(name, lastname, gender, birthdate, avg, min_vote, max_vote) VALUES (?,?,?,?,?,?,?)";
			try {
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, s.nome);
				statement.setString(2, s.lastname);
				statement.setString(3, s.gender);
				statement.setString(4, s.birthdate);
				statement.setString(5, s.avg);
				statement.setString(6, s.min_vote);
				statement.setString(7, s.max_vote);
				statement.execute();
				System.out.println("Studente inserito correttamente!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
