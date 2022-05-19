package com.zen.dddpracticemodel.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.zen.dddpracticemodel.store.entities.Employee;
import com.zen.dddpracticemodel.store.values.Equipment;
import com.zen.dddpracticemodel.store.values.Ingredient;
import com.zen.dddpracticemodel.store.values.IsClean;
import com.zen.dddpracticemodel.store.values.KitchenID;

import java.util.Set;

public class KitchenCreated extends DomainEvent {
    private final KitchenID entityId;
    private final Set<Equipment> equipmentSet;
    private final Set<Ingredient> ingredientSet;
    private final Set<Employee> employeeSet;
    private final IsClean isClean;

    public KitchenCreated(KitchenID entityId, Set<Equipment> equipmentSet, Set<Ingredient> ingredientSet, Set<Employee> employeeSet, IsClean isClean) {
        super("com.zen.dddpracticalmodel.store.kitchencreated");
        this.entityId = entityId;
        this.equipmentSet = equipmentSet;
        this.ingredientSet = ingredientSet;
        this.employeeSet = employeeSet;
        this.isClean = isClean;
    }

    public KitchenID getEntityId() {
        return entityId;
    }

    public Set<Equipment> getEquipmentSet() {
        return equipmentSet;
    }

    public Set<Ingredient> getIngredientSet() {
        return ingredientSet;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public IsClean getIsClean() {
        return isClean;
    }
}
