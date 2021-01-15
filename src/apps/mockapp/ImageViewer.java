/**
 * Incompatible con MVP.
 */
/**
package apps.mockapp;

import control.LoadCommand;
import control.Command;
import control.PrevImageCommand;
import control.ExitCommand;
import control.NextImageCommand;
import control.NullCommand;
import model.Image;
import view.ImageDisplay;
import view.ImageLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ImageViewer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> commands = initCommands(createImageDisplay());
        while (true) {
            commands.getOrDefault(scanner.next(), new NullCommand()).execute();
        }
    }

    private static Map<String, Command> initCommands(ImageDisplay imageDisplay) {
        List<Image> imageList = new ArrayList<Image>();
        Map<String, Command> commands = new HashMap<>();
        ImageLoader imageLoader = new MockImageLoader();
        commands.put("q", new ExitCommand());
        commands.put("n", new NextImageCommand(imageList, imageDisplay));
        commands.put("p", new PrevImageCommand(imageList, imageDisplay));
        commands.put("l", new LoadCommand(imageLoader, imageList, imageDisplay));
        return commands;
    }

    private static List<Image> createImageList() {
        ImageLoader loader = new MockImageLoader();
        List<Image> imageList = loader.load();
        return imageList;
    }

    private static ImageDisplay createImageDisplay() {
        ImageDisplay imageDisplay = new MockImageDisplay();
        return imageDisplay;
    }
    
}
**/