package bossmod.bossmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

public class TestEntity extends Monster implements RangedAttackMob {
    protected TestEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void performRangedAttack(LivingEntity livingEntity, float p_33318_) {

    }

}

