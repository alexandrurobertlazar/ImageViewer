package control;

import model.Image;
import view.ImageDisplay;
import java.util.List;

public class PrevImageCommand implements Command {
    private final List<Image> imageList;
    private final ImageDisplay imageDisplay;

    public PrevImageCommand(List<Image> imageList, ImageDisplay imageDisplay) {
        this.imageList = imageList;
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute(){
        imageDisplay.display(imageList.get(next()));
    }

    private int next() {
        int index = imageList.indexOf(imageDisplay.image());
        return (index-1 + imageList.size()) % imageList.size();
    }
}
