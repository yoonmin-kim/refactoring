package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

public abstract class Employee {

    private String name;

    private String type;

    protected Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name, type);
            case "manager" -> new Manager(name, type);
            case "salesman" -> new Salesman(name, type);
            default -> throw new IllegalArgumentException("The type is wrong.");
        };
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
