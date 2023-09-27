package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.HelmetReward;

public class HelmetGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new HelmetReward();
    }
}
