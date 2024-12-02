package demo.jdbc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private TextField tag, firstName, lastName, address, postal, province, phone, score, tag2;
    @FXML
    private ComboBox<String> games;
    @FXML
    private DatePicker date;
    @FXML
    private TextArea display;
    @FXML
    private Button submit, updatePlayer;


    String[] gamesSelection = {"Black ops 6", "Left 4 Dead 2", "Hell Let Loose", "Dead Island 2", "Dead By DayLight"};

    String playerId, playerFirstName, playerLastName, playerAddress, playerPostal, playerProvince, gamerTag;
    int playerScore;
    long playerPhone;
    Date playingDate;

    public void connectToDatabase() {
        try (Connection conn = JDBC.getConnection()){
            System.out.println("Database connection established");
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            throw new RuntimeException(e);
        }
    }
    private void InsertPlayerData(String PlayerId, String FirstName, String LastName, String Address, String Postal, String Province, long Phone ) {
        String insertQuery = "INSERT INTO Anthony_Aleman_player VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = JDBC.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(insertQuery);
            stmt.setString(1, PlayerId);
            stmt.setString(2, FirstName);
            stmt.setString(3, LastName);
            stmt.setString(4, Address);
            stmt.setString(5, Postal);
            stmt.setString(6, Province);
            stmt.setLong(7, Phone);

            stmt.executeUpdate();
            System.out.println("Successfully inserted player data");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void InsertPlayerAndGameData(int gameId, String PlayerId, Date playingDate, int playerScore ) {
        String insertQuery = "INSERT INTO Anthony_Aleman_player_and_game VALUES(?,?,?,?,?)";

        try (Connection conn = JDBC.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(insertQuery);
            int PlayerAndGameId = (int) (Math.random() * 1000);
            stmt.setInt(1, PlayerAndGameId);
            stmt.setInt(2, gameId);
            stmt.setString(3, PlayerId);
            stmt.setDate(4, playingDate);
            stmt.setInt(5, playerScore);
            stmt.executeUpdate();
            System.out.println("Successfully inserted player and game data");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int getGameId(String gameName){
        String query = "Select * FROM Anthony_Aleman_game WHERE game_title = ?";

        try(Connection conn = JDBC.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, gameName);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                return rs.getInt("game_id");
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return -1;
    }

    public void InsertComboBox() {
        String query = "SELECT game_title FROM Anthony_Aleman_game";
        try (Connection conn = JDBC.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Attempting to add to comboBox");

            while (rs.next()) {
                System.out.println("Adding");
                String gameName = rs.getString("game_title");
                System.out.println("Adding game to ComboBox: " + gameName); // Debug output
                games.getItems().add(gameName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error retrieving game data", e);
        }
    }

    public void UpdatePlayer(String PlayerId, String FirstName, String LastName, String Address, String Postal, String Province, long Phone ){
        String query = "UPDATE Anthony_Aleman_player SET first_name = ?," + "last_name = ?," + "address = ?," + "postal_code = ?," + "province = ?," + "phone_number = ? WHERE player_id = ?";

        try(Connection conn = JDBC.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, FirstName);
            stmt.setString(2, LastName);
            stmt.setString(3, Address);
            stmt.setString(4, Postal);
            stmt.setString(5, Province);
            stmt.setLong(6, Phone);
            stmt.setString(7, PlayerId);
            stmt.executeUpdate();
            System.out.println("Successfully updated player data");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Display(String playerId) {
        String Query = "SELECT * FROM Anthony_Aleman_player_and_game WHERE player_id = ?";
        String GamerTag;
        Date PlayingDate;
        int GameId, Score, PlayerGameId;
        try (Connection conn = JDBC.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setString(1, playerId);
            ResultSet rs = stmt.executeQuery();  // Corrected: Don't pass the query to executeQuery() again.

            // Loop through the result set
            while (rs.next()) {
                PlayerGameId = rs.getInt("player_game_id");
                GameId = rs.getInt("game_id");
                GamerTag = rs.getString("player_id");
                PlayingDate = rs.getDate("playing_date");
                Score = rs.getInt("score");

                // Append data to the display for each row
                display.appendText("Player and Game ID: " + PlayerGameId);
                display.appendText(" ");
                display.appendText("Game ID: " + GameId);
                display.appendText(" ");
                display.appendText("GamerTag: " + GamerTag);
                display.appendText(" ");
                display.appendText("PlayingDate: " + PlayingDate);
                display.appendText(" ");
                display.appendText("Score: " + Score);
                display.appendText(" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    protected void submit(ActionEvent event) {
        playerId = tag.getText();
        playerFirstName = firstName.getText();
        playerLastName = lastName.getText();
        playerAddress = address.getText();
        playerPostal = postal.getText();
        playerProvince = province.getText();
        playerPhone = Long.parseLong(phone.getText());
        playerScore = Integer.parseInt(score.getText());
        playingDate = Date.valueOf(date.getValue());

        InsertPlayerData(playerId,playerFirstName,playerLastName,playerAddress,playerPostal,playerProvince,playerPhone);

        String selectedGameTitle = games.getSelectionModel().getSelectedItem();
        int selectedGameId = getGameId(selectedGameTitle);

        InsertPlayerAndGameData(selectedGameId,playerId,playingDate,playerScore);


    }

    @FXML
    protected void display(ActionEvent event) {
        gamerTag = tag2.getText();

        Display(gamerTag);
    }
    @FXML
    protected void updatePlayer(ActionEvent event) {
        playerId = tag.getText();
        playerFirstName = firstName.getText();
        playerLastName = lastName.getText();
        playerAddress = address.getText();
        playerPostal = postal.getText();
        playerProvince = province.getText();
        playerPhone = Long.parseLong(phone.getText());

        UpdatePlayer(playerId,playerFirstName,playerLastName,playerAddress,playerPostal,playerProvince,playerPhone);


    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initializing");
        InsertComboBox();
    }
}