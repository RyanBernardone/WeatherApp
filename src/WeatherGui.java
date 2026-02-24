import constants.WeatherConstants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class WeatherGui extends JFrame{
    public WeatherGui() {
        super("Weather App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WeatherConstants.APPGUI_WIDTH, WeatherConstants.APPGUI_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

    }
}
