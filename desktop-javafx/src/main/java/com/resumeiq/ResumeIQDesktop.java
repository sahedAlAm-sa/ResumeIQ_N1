package com.resumeiq;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ResumeIQDesktop extends Application {

    private final String BG = "#050816";
    private final String CARD = "#0b1224";
    private final String CYAN = "#22d3ee";
    private final String PURPLE = "#8b5cf6";
    private final String TEXT = "#e6f7ff";
    private final String MUTED = "#91a4b7";

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color:" + BG + ";");

        VBox sidebar = new VBox(16);
        sidebar.setPadding(new Insets(28, 18, 28, 18));
        sidebar.setPrefWidth(210);
        sidebar.setStyle("-fx-background-color:#070d1c; -fx-border-color:#18243d; -fx-border-width:0 1 0 0;");

        Label logo = new Label("RESUMEIQ");
        logo.setTextFill(Color.web(CYAN));
        logo.setFont(Font.font("Arial", 22));
        logo.setStyle("-fx-font-weight:bold;");

        Label role = new Label("AI CAREER PLATFORM");
        role.setTextFill(Color.web(MUTED));
        role.setStyle("-fx-font-size:10px; -fx-letter-spacing:1px;");

        sidebar.getChildren().addAll(logo, role);
        sidebar.getChildren().addAll(
                navButton("Dashboard"),
                navButton("Users"),
                navButton("Jobs"),
                navButton("Applications")
        );

        VBox top = new VBox(4);
        top.setPadding(new Insets(25, 30, 20, 30));
        Label title = new Label("Admin Command Center");
        title.setTextFill(Color.web(TEXT));
        title.setFont(Font.font("Arial", 28));
        title.setStyle("-fx-font-weight:bold;");
        Label subtitle = new Label("ResumeIQ desktop administration");
        subtitle.setTextFill(Color.web(MUTED));
        top.getChildren().addAll(title, subtitle);

        HBox stats = new HBox(18);
        stats.setPadding(new Insets(0, 30, 25, 30));
        stats.getChildren().addAll(
                statCard("USERS", "120", CYAN),
                statCard("JOBS", "35", PURPLE),
                statCard("APPLICATIONS", "87", CYAN),
                statCard("RESUME AVG.", "78%", PURPLE)
        );

        VBox content = new VBox(0, top, stats);
        content.setFillWidth(true);

        root.setLeft(sidebar);
        root.setCenter(content);

        Scene scene = new Scene(root, 1120, 680);
        stage.setTitle("ResumeIQ — JavaFX Desktop Application");
        stage.setScene(scene);
        stage.show();
    }

    private Button navButton(String text) {
        Button b = new Button(text);
        b.setMaxWidth(Double.MAX_VALUE);
        b.setAlignment(Pos.CENTER_LEFT);
        b.setPadding(new Insets(12, 14, 12, 14));
        b.setTextFill(Color.web(TEXT));
        b.setStyle("-fx-background-color:#0d1830; -fx-background-radius:10; -fx-border-color:#1b2b48; -fx-border-radius:10;");
        b.setOnMouseEntered(e -> b.setStyle(
                "-fx-background-color:#102a3b; -fx-text-fill:" + CYAN +
                "; -fx-border-color:" + CYAN + "; -fx-border-radius:10; -fx-background-radius:10;"
        ));
        b.setOnMouseExited(e -> b.setStyle(
                "-fx-background-color:#0d1830; -fx-text-fill:" + TEXT +
                "; -fx-border-color:#1b2b48; -fx-border-radius:10; -fx-background-radius:10;"
        ));
        return b;
    }

    private VBox statCard(String label, String value, String accent) {
        VBox box = new VBox(7);
        box.setPrefWidth(190);
        box.setPadding(new Insets(20));
        box.setStyle("-fx-background-color:" + CARD + "; -fx-background-radius:16; -fx-border-color:#1b2b48; -fx-border-radius:16;");
        Label l = new Label(label);
        l.setTextFill(Color.web(MUTED));
        l.setStyle("-fx-font-size:10px; -fx-font-weight:bold;");
        Label v = new Label(value);
        v.setTextFill(Color.web(accent));
        v.setFont(Font.font("Arial", 30));
        v.setStyle("-fx-font-weight:bold;");
        box.getChildren().addAll(l, v);
        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
