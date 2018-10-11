package application;
	
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.stage.Stage;
import javazoom.jl.player.Player;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage)throws Exception {
		
		File file = new File ("C:\\Users\\Alexander Graham\\Desktop\\client\\Post - Scriptum.mp3");
		FileInputStream fis= new FileInputStream(file);
		BufferedInputStream bis= new BufferedInputStream(fis);
		Player player = new Player (bis);
		player.play();
		
		/*
		
		Media pick = new Media("C:\\Users\\Alexander Graham\\Documents\\CIT-Year3\\Distributive_System_Programming\\FileServer\\src\\client"); // replace this with your own audio file
        MediaPlayer player = new MediaPlayer(pick);

        // Add a mediaView, to display the media. Its necessary !
        // This mediaView is added to a Pane
        MediaView mediaView = new MediaView(player);

        // Add to scene
        Group root = new Group(mediaView);
        Scene scene = new Scene(root, 500, 200);

        // Show the stage
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Play the media once the stage is shown
        player.play();*/
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
