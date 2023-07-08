package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import objetos.Anotador;

public final class AnotadorDAO extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void anotar(Anotador anotador) {

        try {
            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese el título de la anotación:");
            String titulo = leer.nextLine();

            System.out.println("Ingrese la nota (hasta 2000 caracteres):");
            String nota = leer.nextLine();

            String sql = "INSERT INTO anotaciones (titulo, anotacion, user) VALUES (?, ?, ?)";

            try (Connection conn = super.conectarBase(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, nota);
                stmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
