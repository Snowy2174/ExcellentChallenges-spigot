package su.nightexpress.excellentchallenges.challenge.handler.impl;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.jetbrains.annotations.NotNull;
import net.momirealms.customcrops.api.CropBreakEvent;
import su.nightexpress.excellentchallenges.ExcellentChallenges;
import su.nightexpress.excellentchallenges.challenge.handler.ChallengeHandler;
import su.nightexpress.excellentchallenges.challenge.type.ChallengeJobType;

public class BlockCustomHarvestHandler extends ChallengeHandler {

    public BlockCustomHarvestHandler(@NotNull ExcellentChallenges plugin) {
        super(plugin, ChallengeJobType.BLOCK_CUSTOMHARVEST);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockCustomPlant(CropBreakEvent e) {
        Player player = e.getEntity();
        if (player == null) return;
        this.progressChallenge(player, e.getCropKey(), 1);
    }
}
