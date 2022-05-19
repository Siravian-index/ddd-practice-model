package com.zen.dddpracticemodel.store.entities;

import co.com.sofka.domain.generic.Entity;
import com.zen.dddpracticemodel.order.Order;
import com.zen.dddpracticemodel.order.values.Status;
import com.zen.dddpracticemodel.order.values.StatusEnum;
import com.zen.dddpracticemodel.store.values.Equipment;
import com.zen.dddpracticemodel.store.values.Ingredient;
import com.zen.dddpracticemodel.store.values.IsClean;
import com.zen.dddpracticemodel.store.values.KitchenID;

import java.util.Objects;
import java.util.Set;

public class Kitchen extends Entity<KitchenID> {

    protected Set<Ingredient> ingredientSet;
    protected Set<Equipment> equipmentSet;
    protected Set<Employee> employeeSet;

    protected IsClean isClean;

    public Kitchen(KitchenID entityId, Set<Equipment> equipmentSet, Set<Ingredient> ingredientSet, Set<Employee> employeeSet, IsClean isClean) {
        super(entityId);
        this.equipmentSet = equipmentSet;
        this.ingredientSet = ingredientSet;
        this.employeeSet = employeeSet;
        this.isClean = isClean;

    }

    private Kitchen(KitchenID entityId) {
        super(entityId);
    }

    public static Kitchen from(KitchenID entityId, Set<Equipment> equipmentSet, Set<Ingredient> ingredientSet, Set<Employee> employeeSet, IsClean isClean) {
        Kitchen kitchen = new Kitchen(entityId);
        kitchen.equipmentSet = equipmentSet;
        kitchen.ingredientSet = ingredientSet;
        kitchen.employeeSet = employeeSet;
        kitchen.isClean = isClean;
        return kitchen;
    }

    public void cleanKitchen() {
        if (!this.isClean.value()) {
            this.isClean = new IsClean(true);
        }

    }

    public void prepareOrder(Order order) {
        order.setStatus(new Status(StatusEnum.READY));
    }

    void reStock() {
    }


    public Set<Ingredient> getIngredientSet() {
        return ingredientSet;
    }

    public void setIngredientSet(Set<Ingredient> ingredientSet) {
        this.ingredientSet = ingredientSet;
    }

    public Set<Equipment> getEquipmentSet() {
        return equipmentSet;
    }

    public void setEquipmentSet(Set<Equipment> equipmentSet) {
        this.equipmentSet = equipmentSet;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kitchen kitchen = (Kitchen) o;
        return Objects.equals(ingredientSet, kitchen.ingredientSet) && Objects.equals(equipmentSet, kitchen.equipmentSet) && Objects.equals(employeeSet, kitchen.employeeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ingredientSet, equipmentSet, employeeSet);
    }
}
