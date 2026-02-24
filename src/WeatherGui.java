import constants.WeatherConstants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class WeatherGui extends JFrame{
    public WeatherGui(){
        super("Weather App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WeatherConstants.APPGUI_WIDTH, WeatherConstants.APPGUI_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        addGuiComponents();
    }

    private void addGuiComponents(){
        JTextField searchField = new JTextField();
        searchField.setBounds(15, 15, 351, 45);
        add(searchField);

        JButton searchButton = new JButton(loadImage("src/assets/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);
    }

    private ImageIcon loadImage(String resourcePath){
        try{
            BufferedImage image = ImageIO.read(new File(resourcePath));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Could not find resource");
        return null;
    }
}
