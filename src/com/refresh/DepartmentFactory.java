package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
public class DepartmentFactory {

    private Department getCheeseDepartment(){
        return new Department("Cheese", new CheeseDeptPriceCalculator());
    }

    private Department getMuttonDepartment(){
        return new Department("Mutton", new MuttonDeptPriceCalculator());
    }

    public Department getInstance(String departmentName){
        switch(departmentName){
            case "CHEESE":
                return getCheeseDepartment();
            case "MUTTON":
                return getMuttonDepartment();
            default:
                return null;
        }
    }
}
