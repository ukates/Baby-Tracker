package BabyJournal;
import javax.swing.*;
import java.sql.*;

import static javax.swing.UIManager.*;

public class Main {

    public static void main(String[] args) throws SQLException{

        Journal bbJournal = new Journal();

        put("OptionPane.okButtonText", "Next");

        bbJournal.setDate(JOptionPane.showInputDialog("What is today's date?"));
        bbJournal.setMood(JOptionPane.showInputDialog("What is your mood today?"));
        bbJournal.setCraving(JOptionPane.showInputDialog("What cravings do you have?"));
        bbJournal.setMilestones(JOptionPane.showInputDialog("What are some milestones you have today?"));
        bbJournal.setSleep(Integer.parseInt(JOptionPane.showInputDialog("How many hours of sleep have you gotten?")));

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "Dce1881291")) {

            String sql = "INSERT INTO JOURNALS.BABYJOURNALS (JOURNAL_DATE, MOOD, CRAVING, MILESTONES, SLEEP)" + "VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStmt = con.prepareStatement(sql)) {
                preparedStmt.setString(1, bbJournal.getDate());
                preparedStmt.setString(2, bbJournal.getMood());
                preparedStmt.setString(3, bbJournal.getCraving());
                preparedStmt.setString(4, bbJournal.getMilestones());
                preparedStmt.setDouble(5, bbJournal.getSleep());
                preparedStmt.execute();
            }
        }
    }
}
