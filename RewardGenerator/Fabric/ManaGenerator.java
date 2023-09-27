package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.ManaReward;

public class ManaGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new ManaReward();
    }
}
