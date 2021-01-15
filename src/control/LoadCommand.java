package control;

//import apps.mockapp.MockImageLoader;
import model.Image;
import view.ImageDisplay;
import view.ImageLoader;
import java.util.List;

public class LoadCommand implements Command {
    private final List<Image> imageList;
    private final ImageDisplay imageDisplay;
    private final ImageLoader imageLoader;
    
    public LoadCommand(ImageLoader imageLoader, List<Image> imageList, ImageDisplay imageDisplay) {
        this.imageList = imageList;
        this.imageDisplay = imageDisplay;
        this.imageLoader = imageLoader;
    }
    
    @Override
    public void execute(){
        this.imageList.clear();
        this.imageList.addAll(this.imageLoader.load());
        imageDisplay.display(this.imageList.get(0));
    }
}
