package Editor3d.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Editor3d.ModelElements.Camera;
import Editor3d.ModelElements.Flash;
import Editor3d.ModelElements.PoligonalModel;
import Editor3d.ModelElements.Scene;
import Editor3d.ModelElements.Texture;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) throws Exception{
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.changeObservers = changeObservers;

        models.add(new PoligonalModel( new ArrayList<Texture>()));
        scenes.add(new Scene(22, models, flashes, cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }

    public Scene getScene (Integer id){
        return null;
    }
    
}
