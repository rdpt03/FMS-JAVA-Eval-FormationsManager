package fr.fms.daos;

import fr.fms.entities.Training;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO for Training entity.
 * Handles read operations from f_training table.
 * Inherits connection from abstract DAO class.
 */
public class TrainingDAO extends GeneralDAO {

    // Constructor opens the connection via DAO
    public TrainingDAO() {
        super();
    }

    /**
     * Retrieve all trainings from database.
     * @return List of Training objects.
     */
    public List<Training> getAllTrainings() {
        List<Training> trainings = new ArrayList<>();
        String sql = "SELECT * FROM f_training";

        // Try-with-resources ensures Statement and ResultSet are closed automatically
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                trainings.add(mapResultSetToTraining(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace(); // log SQL exceptions
        }

        return trainings;
    }

    public List<Training> getTrainingsByKeyword(String keyword) {
        List<Training> trainings = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM f_training " +
                "WHERE t_name LIKE ? " +
                "   OR t_summary LIKE ? " +
                "   OR t_duration LIKE ? " +
                "   OR t_is_in_person LIKE ? " +
                "   OR t_is_remotely LIKE ? " +
                "   OR t_price LIKE ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // put into 6 params

            for (int i = 1; i <= 6; i++) {
                stmt.setString(i, "%" + keyword + "%");
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                trainings.add(mapResultSetToTraining(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace(); // log SQL exceptions
        }

        return trainings;
    }

    /**
     * Maps a ResultSet row to a Training object
     * @param rs ResultSet from executed query
     * @return Training entity with fields filled
     * @throws SQLException if column retrieval fails
     */
    private Training mapResultSetToTraining(ResultSet rs) throws SQLException {
        Training t = new Training();
        t.setId(rs.getInt("t_id"));
        t.setName(rs.getString("t_name"));
        t.setSummary(rs.getString("t_summary"));
        t.setDuration(rs.getInt("t_duration"));
        t.setInPerson(rs.getBoolean("t_is_in_person"));
        t.setRemotely(rs.getBoolean("t_is_remotely"));
        t.setPrice(rs.getDouble("t_price"));
        return t;
    }
}
